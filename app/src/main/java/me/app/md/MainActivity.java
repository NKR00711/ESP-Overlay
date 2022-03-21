package me.app.md;

import static android.provider.Settings.ACTION_MANAGE_ALL_FILES_ACCESS_PERMISSION;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RadioGroup;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    public static String gameName="com.tencent.ig";
    public static int gameType=1;
    public static int bit=2;
    static {
        System.loadLibrary("native-lib");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setAppLocale(Locale.getDefault().getLanguage());
        setContentView(R.layout.activity_main);
        permission();
        if(!isConfigExist())
            Init();
        RadioGroup epubgver=findViewById(R.id.dt);
        RadioGroup epubgbit=findViewById(R.id.dt2);
        epubgver.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                switch (checkedId) {

                    case R.id.Global:
                        gameName = "com.tencent.ig";
                        gameType=1;
                        break;

                    case R.id.Korea:
                        gameName = "com.pubg.krmobile";
                        gameType=2;
                        break;

                    case R.id.Vietnam:
                        gameName = "com.vng.pubgmobile";
                        gameType=3;
                        break;

                    case R.id.Taiwan:
                        gameName = "com.rekoo.pubgm";
                        gameType=4;
                        break;
                    case R.id.Indian:
                        gameName = "com.pubg.imobile";
                        gameType=5;
                        break;
                }
            }
        });
        ExecuteElf("su");
        epubgbit.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // checkedId is the RadioButton selected
                switch (checkedId) {

                    case R.id.bit32:
                        bit=1;
                        break;

                    case R.id.bit64:
                        bit=2;
                        break;
                }
            }
        });
        findViewById(R.id.launch).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   mProgressDialog.show();
                if(Overlay.isRunning())
                    Overlay.Stop(getApplicationContext());
                //Shell.su("am start -n " + gameName + "/com.epicgames.ue4.SplashActivity").exec();
                Intent floatLogo = new Intent(getApplicationContext(), FloatWin.class);
                getApplicationContext().startService(floatLogo);
                Overlay.Start(getApplicationContext(), gameType, bit);
              //  mProgressDialog.dismiss();
            }
        });
        findViewById(R.id.kill).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  mProgressDialog.show();
                Overlay.Stop(getApplicationContext());
                Intent floatLogo2 = new Intent(getApplicationContext(), FloatWin.class);
                getApplicationContext().stopService(floatLogo2);
              //  mProgressDialog.dismiss();
            }
        });
    }
    private void setAppLocale(String localeCode){
        Resources resources = getResources();
        DisplayMetrics dm = resources.getDisplayMetrics();
        Configuration config = resources.getConfiguration();
        config.setLocale(new Locale(localeCode.toLowerCase()));
        resources.updateConfiguration(config, dm);
    }

    void permission(){
        if (android.os.Build.VERSION.SDK_INT >= 23 && !Settings.canDrawOverlays(getApplicationContext())) {   //Android M Or Over
            Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:" + getPackageName()));
            startActivity(intent);
        }
    }
    void Init(){
        SharedPreferences sp=getApplicationContext().getSharedPreferences("espValue", Context.MODE_PRIVATE);
        SharedPreferences.Editor ed= sp.edit();
        ed.putInt("fps",30);
        ed.putBoolean("Box",true);
        ed.putBoolean("Line",true);
        ed.putBoolean("Distance",true);
        ed.putBoolean("Health",true);
        ed.putBoolean("Name",true);
        ed.putBoolean("Head Position",true);
        ed.putBoolean("Back Mark",true);
        ed.putBoolean("Skelton",true);
        ed.putBoolean("Grenade Warning",true);
        ed.putBoolean("Enemy Weapon",true);
        ed.apply();
    }
    boolean isConfigExist(){
        SharedPreferences sp=getApplicationContext().getSharedPreferences("espValue", Context.MODE_PRIVATE);
        return sp.contains("fps");
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
}