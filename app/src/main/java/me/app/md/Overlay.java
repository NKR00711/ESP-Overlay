package me.app.md;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.PixelFormat;
import android.os.Build;
import android.os.IBinder;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//@StringFogIgnore
public class Overlay extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    WindowManager windowManager;
    View mFloatingView;
    ESPSyncView overlayView;
    @SuppressLint("StaticFieldLeak")
    private static Overlay Instance;
    private static boolean isRunning = false;
    static Process process;
static Context ctx;
    @SuppressLint("InflateParams")
    @Override
    public void onCreate() {
        super.onCreate();
        ctx=this;
        windowManager = (WindowManager) ctx.getSystemService(Context.WINDOW_SERVICE);
        overlayView = new ESPSyncView(ctx);
        mFloatingView = LayoutInflater.from(ctx).inflate(R.layout.float_view, null);
        DrawCanvas();
    }

    @Override
    public void onDestroy() {
            super.onDestroy();
            Close();
            this.stopSelf();
        if (process != null) {
            process.destroy();
        }
     //   Shell.EXECUTOR.shutdown();
        if(overlayView != null)
        {
            ((WindowManager)ctx.getSystemService(Context.WINDOW_SERVICE)).removeView(overlayView);
            overlayView = null;
        }
    }

    public static void Start(Context context,int gametype,int bit) {

        if (Instance == null) {
            isRunning = true;
            Intent intent = new Intent(context, Overlay.class);

            Thread t=new Thread(() -> {

                getReady(gametype);

            });
            t.start();

            context.startService(intent);
            Thread t2=new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    StartDaemon(context,bit);

                }
            });
            t2.start();




        }
    }
    static native boolean getReady(int nameofgame);

   static void StartDaemon(Context context,int bit){
        File del= new File(context.getFilesDir() + "/bitmap.so");
        del.delete();

        InputStream in=context.getResources().openRawResource(R.raw.walker);
        if(bit==1)
            in=context.getResources().openRawResource(R.raw.esp32);
       FileOutputStream out ;

        try {
            out = new FileOutputStream(context.getFilesDir()+"/bitmap.so");
            byte[] buff = new byte[1024];
            int read ;

            try {
                while ((read = in.read(buff)) > 0) {
                    out.write(buff, 0, read);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                in.close();
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

           del.setExecutable(true);
           ExecuteElf("su -c "+context.getFilesDir()+"/bitmap.so");

   }

    private static void ExecuteElf(String shell)
    {
        String s=shell;

        try
        {
            Runtime.getRuntime().exec(s,null,null);//执行
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static String shellOut(String shell) {
        try {
            // Executes the command.
            process = Runtime.getRuntime().exec(shell,null,null);

            // Reads stdout.
            // NOTE: You can write to stdin of the command using
            //       process.getOutputStream().
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            int read;
            char[] buffer = new char[4096];
            StringBuffer output = new StringBuffer();
            while ((read = reader.read(buffer)) > 0) {
                output.append(buffer, 0, read);
            }
            reader.close();

            // Waits for the command to finish.
            process.waitFor();

            return output.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static void Stop(Context context) {

        Intent intent = new Intent(context, Overlay.class);
        context.stopService(intent);
        isRunning = false;
        /*Intent floatLogo = new Intent(context, FloatLogo.class);
        context.stopService(floatLogo);*/

    }

    private native void Close();
   static boolean getConfig(String key){
        SharedPreferences sp=ctx.getSharedPreferences("espValue",Context.MODE_PRIVATE);
        return  sp.getBoolean(key,false);
        // return !key.equals("");
    }
    public static boolean isRunning() {

        return isRunning;
    }
    private void DrawCanvas() {
        //mFloatingView = LayoutInflater.from(this).inflate(R.layout.float_view, null);
        int LAYOUT_FLAG;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            LAYOUT_FLAG = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
        } else {
            LAYOUT_FLAG = WindowManager.LayoutParams.TYPE_SYSTEM_OVERLAY;
        }
        final WindowManager.LayoutParams params = new WindowManager.LayoutParams(
                WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT, 0, getNavigationBarHeight(),
                LAYOUT_FLAG,
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
                        | WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE | WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN | WindowManager.LayoutParams.FLAG_FULLSCREEN,
                PixelFormat.RGBA_8888);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P)
            params.layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;

        params.gravity = Gravity.TOP | Gravity.START;        //Initially view will be added to top-left corner
        params.x = 0;
        params.y = 0;
        windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        windowManager.addView(overlayView, params);
    }
    public static native void DrawOn(ESPSyncView espView, Canvas canvas);

    private int getNavigationBarHeight() {
        boolean hasMenuKey = ViewConfiguration.get(this).hasPermanentMenuKey();
        int resourceId = getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (resourceId > 0 && !hasMenuKey) {
            return getResources().getDimensionPixelSize(resourceId);
        }
        return 0;
    }
}
