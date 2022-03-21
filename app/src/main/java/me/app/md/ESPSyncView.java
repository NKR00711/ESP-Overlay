package me.app.md;

import static me.app.md.Overlay.DrawOn;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;

import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ESPSyncView extends View implements Runnable {
    private static int ColorAlert;
    private static int ColorAlertText;
    private static int ColorBox;
    private static int ColorBoxbot;
    private static int ColorCross;
    private static int ColorHead;
    private static int ColorHeadbot;
    private static final int[] ColorItemImages = new int[200];
    private static final int[] ColorItemNames = new int[200];
    private static int ColorLine;
    private static int ColorLinebot;
    private static int ColorSkel;
    private static final Integer[] Cross = {Integer.valueOf((int) R.drawable.ic_chr_1), Integer.valueOf((int) R.drawable.ic_chr_2), Integer.valueOf((int) R.drawable.ic_chr_3), Integer.valueOf((int) R.drawable.ic_chr_4), Integer.valueOf((int) R.drawable.ic_chr_5), Integer.valueOf((int) R.drawable.ic_chr_6), Integer.valueOf((int) R.drawable.ic_chr_7), Integer.valueOf((int) R.drawable.ic_chr_8), Integer.valueOf((int) R.drawable.ic_chr_9), Integer.valueOf((int) R.drawable.ic_chr_10), Integer.valueOf((int) R.drawable.ic_chr10)};
    private static int CrossCount;
    private static String EnemyStylestyle;
    private static String Font;
    private static final int[] ITEMVECTOR = {R.drawable.scope8, R.drawable.scope2, R.drawable.scope1red, R.drawable.scope3, R.drawable.holo, R.drawable.scope6, R.drawable.scope4, R.drawable.canted, R.drawable.aug, R.drawable.m762, R.drawable.scarl, R.drawable.m4, R.drawable.m16, R.drawable.mk47, R.drawable.g36c, R.drawable.qbz, R.drawable.akm, R.drawable.groza, R.drawable.bizon, R.drawable.tommygun, R.drawable.mp5k, R.drawable.ump, R.drawable.vector, R.drawable.uzi, R.drawable.dp, R.drawable.m249, R.drawable.awm, R.drawable.qbu, R.drawable.slr, R.drawable.sks, R.drawable.mini14, R.drawable.m24, R.drawable.kar98, R.drawable.vss, R.drawable.win94, R.drawable.mk14, R.drawable.s12k, R.drawable.dbs, R.drawable.s686, R.drawable.s1897, R.drawable.crowbar, R.drawable.machete, R.drawable.sickle, R.drawable.crossbow, R.drawable.pan, R.drawable.sawedoff, R.drawable.r1895, R.drawable.skorpion, R.drawable.p92, R.drawable.p18c, R.drawable.r45, R.drawable.m1911, R.drawable.deagle, R.drawable.mm762, R.drawable.acp, R.drawable.mm556, R.drawable.mm9, R.drawable.magnum300, R.drawable.gauge12, R.drawable.boltx, R.drawable.bak3, R.drawable.bak1, R.drawable.bak2, R.drawable.vests2, R.drawable.vests1, R.drawable.vests3, R.drawable.helmet2, R.drawable.helmet1, R.drawable.helmet3, R.drawable.pkiller, R.drawable.syringe, R.drawable.drink, R.drawable.firstaid, R.drawable.bandage, R.drawable.medkit, R.drawable.stun, R.drawable.frag, R.drawable.smoke, R.drawable.molotov, R.drawable.ic_i79, R.drawable.ic_i80, R.drawable.ic_i81, R.drawable.ic_i82, R.drawable.ic_i83, R.drawable.ic_i84, R.drawable.ic_i85, R.drawable.ic_i86, R.drawable.ic_i87, R.drawable.ic_i88, R.drawable.ic_i89, R.drawable.ic_i90, R.drawable.ic_i91, R.drawable.ic_i92, R.drawable.ic_i93, R.drawable.ic_i94, R.drawable.ic_i95, R.drawable.ic_i96, R.drawable.ic_i97, R.drawable.ic_i98, R.drawable.ic_i99, R.drawable.ic_i100, R.drawable.ic_i101, R.drawable.ic_i102, R.drawable.ic_i103, R.drawable.ic_i104, R.drawable.ic_i105, R.drawable.ic_i106, R.drawable.ic_i107, R.drawable.ic_i108, R.drawable.gas, R.drawable.ic_i110, R.drawable.flaregun, R.drawable.ghillie, R.drawable.ic_i113, R.drawable.death, R.drawable.i115, R.drawable.airdrop};
    private static String Imagetyle;
    private static String Infostyle;
    private static String Linestyle;
    private static final int[] OTH_NAME = {R.drawable.ic_clear_enemy, R.drawable.ic_clear_boot, R.drawable.ic_danger_enemy, R.drawable.ic_danger_boot, R.drawable.ic_grenade_warning};
    private static int Pos;
    private static int Size;
    private static int StrokeCross;
    private static int StrokeCross2;
    private static int Strokebox;
    private static int Strokeline;
    private static int Strokeskel;
    private static final int[] VEH_NAME = {R.drawable.ve1, R.drawable.ve2, R.drawable.ve3, R.drawable.ve4, R.drawable.ve5, R.drawable.ve6, R.drawable.ve7, R.drawable.ve8, R.drawable.ve9, R.drawable.ve10, R.drawable.ve11, R.drawable.ve12, R.drawable.ve13, R.drawable.ve14, R.drawable.ve15, R.drawable.ve16, R.drawable.ve17, R.drawable.ve18};
    private static String alert;
    private static int bgEnWeapon;
    private static int bgdistance;
    private static int bgid;
    private static int bgname;
    private static final int[] infostyle = {R.drawable.parallelogram, R.drawable.parallelogram2, R.drawable.parallelogram3, R.drawable.pdesblue, R.drawable.pdesred, R.drawable.rightalert, R.drawable.leftalert, R.drawable.knok};
    private static int itemPosition;
    private static int itemSize;
    private static String knok;
    private static String namebot;
    private static final Integer[] nou = {29, 25, 23, 26, 24, 28, 27, 22, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 91, 54, 55, 90, 56, 57, 77, 78, 30, 31, 32, 33, 34, 35, 36, 37, 38, 68, 49, 50, 51, 52, 65, 66, 133, 122, 67, 53, 58, 59, 60, 61, 62, 63, 64, 69, 70, 71, 72, 73, 74, 121, 125, 123, 124, 126, 130, 129, 131, 127, 126, 128, 82, 83, 84, 85, 86, 87, 132, 79, 80, 81, 94, 95, 93, 96, 97, 98, 99, 100, 75, 101, 76, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 92, 88, 89, 18, 20, 21, 19};
    static long sleepTime;
    private static int textdistance;
    private static int textenweapon;
    private static int textid;
    private static int textname;
    Bitmap[] CROSSHAIR = new Bitmap[120];
    private final Integer[] Cross2 = {Integer.valueOf((int) R.drawable.chr_1), Integer.valueOf((int) R.drawable.chr_2), Integer.valueOf((int) R.drawable.chr_3), Integer.valueOf((int) R.drawable.chr_4), Integer.valueOf((int) R.drawable.chr_5), Integer.valueOf((int) R.drawable.chr_6), Integer.valueOf((int) R.drawable.chr_7), Integer.valueOf((int) R.drawable.chr_8), Integer.valueOf((int) R.drawable.chr_9), Integer.valueOf((int) R.drawable.chr_10), Integer.valueOf((int) R.drawable.chr10)};
    int FPS = 60;
    Bitmap[] INFOSTYLE = new Bitmap[20];
    Bitmap[] NEWITEM = new Bitmap[120];
    Bitmap[] OTHER = new Bitmap[5];
    Bitmap[] OTHER2 = new Bitmap[5];
    Bitmap[] VEH = new Bitmap[20];
    Bitmap[] WEP = new Bitmap[120];
    Bitmap[] FLAG = new Bitmap[249];
    Bitmap[] FLAG2=new Bitmap[249];
    private static final int[] FLAG_NAME = {R.drawable.ad_16,R.drawable.ae_16,R.drawable.af_16,R.drawable.ag_16,R.drawable.ai_16,R.drawable.al_16,R.drawable.am_16,R.drawable.ao_16,R.drawable.aq_16,R.drawable.ar_16,R.drawable.as_16,R.drawable.at_16,R.drawable.au_16,R.drawable.aw_16,R.drawable.ax_16,R.drawable.az_16,R.drawable.ba_16,R.drawable.bb_16,R.drawable.bd_16,R.drawable.be_16,R.drawable.bf_16,R.drawable.bg_16,R.drawable.bh_16,R.drawable.bi_16,R.drawable.bj_16,R.drawable.bl_16,R.drawable.bm_16,R.drawable.bn_16,R.drawable.bo_16,R.drawable.bq_16,R.drawable.br_16,R.drawable.bs_16,R.drawable.bt_16,R.drawable.bv_16,R.drawable.bw_16,R.drawable.by_16,R.drawable.bz_16,R.drawable.ca_16,R.drawable.cc_16,R.drawable.cd_16,R.drawable.cf_16,R.drawable.cg_16,R.drawable.ch_16,R.drawable.ci_16,R.drawable.ck_16,R.drawable.cl_16,R.drawable.cm_16,R.drawable.cn_16,R.drawable.co_16,R.drawable.cr_16,R.drawable.cu_16,R.drawable.cv_16,R.drawable.cw_16,R.drawable.cx_16,R.drawable.cy_16,R.drawable.cz_16,R.drawable.de_16,R.drawable.dj_16,R.drawable.dk_16,R.drawable.dm_16,R.drawable.do_16,R.drawable.dz_16,R.drawable.ec_16,R.drawable.ee_16,R.drawable.eg_16,R.drawable.eh_16,R.drawable.er_16,R.drawable.es_16,R.drawable.et_16,R.drawable.fi_16,R.drawable.fj_16,R.drawable.fk_16,R.drawable.fm_16,R.drawable.fo_16,R.drawable.fr_16,R.drawable.ga_16,R.drawable.gb_16,R.drawable.gd_16,R.drawable.ge_16,R.drawable.gf_16,R.drawable.gg_16,R.drawable.gh_16,R.drawable.gi_16,R.drawable.gl_16,R.drawable.gm_16,R.drawable.gn_16,R.drawable.gp_16,R.drawable.gq_16,R.drawable.gr_16,R.drawable.gs_16,R.drawable.gt_16,R.drawable.gu_16,R.drawable.gw_16,R.drawable.gy_16,R.drawable.hk_16,R.drawable.hm_16,R.drawable.hn_16,R.drawable.hr_16,R.drawable.ht_16,R.drawable.hu_16,R.drawable.id_16,R.drawable.ie_16,R.drawable.il_16,R.drawable.im_16,R.drawable.in_16,R.drawable.io_16,R.drawable.iq_16,R.drawable.ir_16,R.drawable.is_16,R.drawable.it_16,R.drawable.je_16,R.drawable.jm_16,R.drawable.jo_16,R.drawable.jp_16,R.drawable.ke_16,R.drawable.kg_16,R.drawable.kh_16,R.drawable.ki_16,R.drawable.km_16,R.drawable.kn_16,R.drawable.kp_16,R.drawable.kr_16,R.drawable.kw_16,R.drawable.ky_16,R.drawable.kz_16,R.drawable.la_16,R.drawable.lb_16,R.drawable.lc_16,R.drawable.li_16,R.drawable.lk_16,R.drawable.lr_16,R.drawable.ls_16,R.drawable.lt_16,R.drawable.lu_16,R.drawable.lv_16,R.drawable.ly_16,R.drawable.ma_16,R.drawable.mc_16,R.drawable.md_16,R.drawable.me_16,R.drawable.mf_16,R.drawable.mg_16,R.drawable.mh_16,R.drawable.mk_16,R.drawable.ml_16,R.drawable.mm_16,R.drawable.mn_16,R.drawable.mo_16,R.drawable.mp_16,R.drawable.mq_16,R.drawable.mr_16,R.drawable.ms_16,R.drawable.mt_16,R.drawable.mu_16,R.drawable.mv_16,R.drawable.mw_16,R.drawable.mx_16,R.drawable.my_16,R.drawable.mz_16,R.drawable.na_16,R.drawable.nc_16,R.drawable.ne_16,R.drawable.nf_16,R.drawable.ng_16,R.drawable.ni_16,R.drawable.nl_16,R.drawable.no_16,R.drawable.np_16,R.drawable.nr_16,R.drawable.nu_16,R.drawable.nz_16,R.drawable.om_16,R.drawable.pa_16,R.drawable.pe_16,R.drawable.pf_16,R.drawable.pg_16,R.drawable.ph_16,R.drawable.pk_16,R.drawable.pl_16,R.drawable.pm_16,R.drawable.pn_16,R.drawable.pr_16,R.drawable.ps_16,R.drawable.pt_16,R.drawable.pw_16,R.drawable.py_16,R.drawable.qa_16,R.drawable.re_16,R.drawable.ro_16,R.drawable.rs_16,R.drawable.ru_16,R.drawable.rw_16,R.drawable.sa_16,R.drawable.sb_16,R.drawable.sc_16,R.drawable.sd_16,R.drawable.se_16,R.drawable.sg_16,R.drawable.sh_16,R.drawable.si_16,R.drawable.sj_16,R.drawable.sk_16,R.drawable.sl_16,R.drawable.sm_16,R.drawable.sn_16,R.drawable.so_16,R.drawable.sr_16,R.drawable.ss_16,R.drawable.st_16,R.drawable.sv_16,R.drawable.sx_16,R.drawable.sy_16,R.drawable.sz_16,R.drawable.tc_16,R.drawable.td_16,R.drawable.tf_16,R.drawable.tg_16,R.drawable.th_16,R.drawable.tj_16,R.drawable.tk_16,R.drawable.tl_16,R.drawable.tm_16,R.drawable.tn_16,R.drawable.to_16,R.drawable.tr_16,R.drawable.tt_16,R.drawable.tv_16,R.drawable.tw_16,R.drawable.tz_16,R.drawable.ua_16,R.drawable.ug_16,R.drawable.um_16,R.drawable.us_16,R.drawable.uy_16,R.drawable.uz_16,R.drawable.va_16,R.drawable.vc_16,R.drawable.ve_16,R.drawable.vg_16,R.drawable.vi_16,R.drawable.vn_16,R.drawable.vu_16,R.drawable.wf_16,R.drawable.ws_16,R.drawable.ye_16,R.drawable.yt_16,R.drawable.za_16,R.drawable.zm_16,R.drawable.zw_16};

    Bitmap bitmap;
    Bitmap bitmap2;
    SimpleDateFormat formatter;
    private int mFPS = 0;
    private int mFPSCounter = 0;
    private long mFPSTime = 0;
    Paint mFilledPaint;
    Paint mFilledPaint2;
    Paint mStrokePaint;
    Paint mStrokePaint2;
    Paint mTextPaint;
    Paint mTextPaint2;
    Paint mTextPaint3;
    Thread mThread;

    /* renamed from: no */
    int[] f48no = new int[200];
    Bitmap out;
    Bitmap out2;
    Date time;

    public ESPSyncView(Context context) {
        super(context, null, 0);
        InitializePaints();
        setFocusableInTouchMode(false);
        setBackgroundColor(0);
        this.time = new Date();
        this.formatter = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        sleepTime = (long) (1000 / this.FPS);
        Thread thread = new Thread(this);
        this.mThread = thread;
        thread.start();
    }

    public static void ChangeAlertStyle(String str) {
        alert = str;
    }

    public static void ChangeBgDist(int i) {
        bgdistance = i;
    }

    public static void ChangeBgEnWeapon(int i) {
        bgEnWeapon = i;
    }

    public static void ChangeBgId(int i) {
        bgid = i;
    }

    public static void ChangeBgName(int i) {
        bgname = i;
    }

    public static void ChangeBotName(String str) {
        namebot = str;
    }

    public static void ChangeColorAlert(int i) {
        ColorAlert = i;
    }

    public static void ChangeColorAlertText(int i) {
        ColorAlertText = i;
    }

    public static void ChangeColorBox(int i) {
        ColorBox = i;
    }

    public static void ChangeColorBoxBot(int i) {
        ColorBoxbot = i;
    }

    public static void ChangeColorCross(int i) {
        ColorCross = i;
    }

    public static void ChangeColorHead(int i) {
        ColorHead = i;
    }

    public static void ChangeColorHeadBot(int i) {
        ColorHeadbot = i;
    }

    public static void ChangeColorLine(int i) {
        ColorLine = i;
    }

    public static void ChangeColorLineBot(int i) {
        ColorLinebot = i;
    }

    public static void ChangeColorSkel(int i) {
        ColorSkel = i;
    }

    public static void ChangeCross(int i) {
        CrossCount = i;
    }

    public static void ChangeEnemyStatusStyle(String str) {
        EnemyStylestyle = str;
    }

    public static void ChangeFont(String str) {
        Font = str;
    }

    public static void ChangeFps(int i) {
        sleepTime = (long) (1000 / (i + 20));
    }

    public static void ChangeImageStyle(String str) {
        Imagetyle = str;
    }

    public static void ChangeInfoStyle(String str) {
        Infostyle = str;
    }

    public static void ChangeKnokStyle(String str) {
        knok = str;
    }

    public static void ChangeLineStyle(String str) {
        Linestyle = str;
    }

    public static void ChangePosition(int i) {
        Pos = i;
    }

    public static void ChangeSize(int i) {
        Size = i;
    }

    public static void ChangeStrokeBox(int i) {
        Strokebox = i;
    }

    public static void ChangeStrokeCross(int i) {
        StrokeCross = i;
    }

    public static void ChangeStrokeCross2(int i) {
        StrokeCross2 = i;
    }

    public static void ChangeStrokeLine(int i) {
        Strokeline = i;
    }

    public static void ChangeStrokeSkel(int i) {
        Strokeskel = i;
    }

    public static void ChangeTextDist(int i) {
        textdistance = i;
    }

    public static void ChangeTextEnWeapon(int i) {
        textenweapon = i;
    }

    public static void ChangeTextId(int i) {
        textid = i;
    }

    public static void ChangeTextName(int i) {
        textname = i;
    }

    public static void ChangeitemPosition(int i) {
        itemPosition = i;
        CPosition(i);
    }

    public static void ChangeitemSize(int i) {
        itemSize = i;
        CSize(i);
    }

    public static Bitmap getBitmap(Context context, int i, int i2, int i3) {
        Drawable OooO0Oo2 = ContextCompat.getDrawable(context,i3);
        if (Build.VERSION.SDK_INT < 21) {
            OooO0Oo2 = ContextCompat.getDrawable(context,i3).mutate();
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        OooO0Oo2.setTintMode(PorterDuff.Mode.SRC_IN);
        OooO0Oo2.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        OooO0Oo2.draw(canvas);
        return createBitmap;
    }

    public static Bitmap getBitmap2(Context context, int i, int i2, int i3, Canvas canvas, float f, float f2, int i4) {
        Drawable OooO0Oo2 = ContextCompat.getDrawable(context,i3);
        if (Build.VERSION.SDK_INT < 21) {
            OooO0Oo2 = ContextCompat.getDrawable(context,i3).mutate();
        }
        float f3 = (float) i;
        float f4 = (float) i2;
        if (((float) OooO0Oo2.getIntrinsicWidth()) / f3 >= ((float) OooO0Oo2.getIntrinsicHeight()) / f4) {
            i2 = (int) ((f3 / ((float) OooO0Oo2.getIntrinsicWidth())) * ((float) OooO0Oo2.getIntrinsicHeight()));
        } else {
            i = (int) ((f4 / ((float) OooO0Oo2.getIntrinsicHeight())) * ((float) OooO0Oo2.getIntrinsicWidth()));
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        float f5 = (float) i;
        float f6 = (float) i2;
        Matrix matrix = new Matrix();
        matrix.setScale(f5 / ((float) createBitmap.getWidth()), f6 / ((float) createBitmap.getHeight()), f5 / 2.0f, f6 / 2.0f);
        Canvas canvas2 = new Canvas(createBitmap);
        canvas2.setMatrix(matrix);
        OooO0Oo2.setTintMode(PorterDuff.Mode.SRC_IN);
        OooO0Oo2.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
        OooO0Oo2.setHotspot(f, f2);
        OooO0Oo2.draw(canvas2);
        return createBitmap;
    }

    public static Bitmap getBitmap24(Context context, int i, int i2, int i3, Canvas canvas, float f, float f2) {
        Drawable OooO0Oo2 = ContextCompat.getDrawable(context,i3);
        if (Build.VERSION.SDK_INT < 21) {
            OooO0Oo2 = ContextCompat.getDrawable(context,i3).mutate();
        }
        if (OooO0Oo2.getIntrinsicWidth() / i >= OooO0Oo2.getIntrinsicHeight() / i2) {
            i2 = (int) ((((float) i) / ((float) OooO0Oo2.getIntrinsicWidth())) * ((float) OooO0Oo2.getIntrinsicHeight()));
        } else {
            i = (int) ((((float) i2) / ((float) OooO0Oo2.getIntrinsicHeight())) * ((float) OooO0Oo2.getIntrinsicWidth()));
        }
        new Matrix().setScale((float) (i / OooO0Oo2.getIntrinsicWidth()), (float) (i2 / OooO0Oo2.getIntrinsicHeight()), (float) (i / 2), (float) (i2 / 2));
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap);
        OooO0Oo2.setTintMode(PorterDuff.Mode.SRC_IN);
        OooO0Oo2.setBounds(0, 0, i, i2);
        OooO0Oo2.setHotspot(f, f2);
        OooO0Oo2.draw(canvas2);
        return createBitmap;
    }

    private String getItemName(String str) {
        if (str.contains("MZJ_8X") && Overlay.getConfig("8x")) {
            mTextPaint2.setColor(Color.rgb(0,200,0));
            return "8x";
        }
        if (str.contains("MZJ_2X") && Overlay.getConfig("2x")) {
            mTextPaint2.setColor(Color.rgb(0,200,0));
            return "2x";
        }
        if (str.contains("MZJ_HD") && Overlay.getConfig("RedDot")) {
            mTextPaint2.setColor(Color.rgb(0,200,0));
            return "RedDot";
        }
        if (str.contains("MZJ_3X") && Overlay.getConfig("3x")) {
            mTextPaint2.setColor(Color.rgb(0,200,0));
            return "3X";
        }
        if (str.contains("MZJ_QX") && Overlay.getConfig("Hollow")) {
            mTextPaint2.setColor(Color.rgb(0,200,0));
            return "Hollow Sight";
        }
        if (str.contains("MZJ_6X") && Overlay.getConfig("6x")) {
            mTextPaint2.setColor(Color.rgb(0,200,0));
            return "6x";
        }
        if (str.contains("MZJ_4X") && Overlay.getConfig("4x")) {
            mTextPaint2.setColor(Color.rgb(0,200,0));
            return "4x";
        }
        if (str.contains("MZJ_SideRMR") && Overlay.getConfig("Canted")) {
            mTextPaint2.setColor(Color.rgb(0,200,0));
            return "Canted Sight";
        }
        if (str.contains("AUG") && Overlay.getConfig("AUG")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "AUG";
        }
        if (str.contains("M762") && Overlay.getConfig("M762")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "M762";
        }
        if (str.contains("SCAR") && Overlay.getConfig("SCAR-L")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "SCAR-L";
        }
        if (str.contains("M416") && Overlay.getConfig("M416")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "M416";
        }
        if (str.contains("M16A4") && Overlay.getConfig("M16A4")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "M16A-4";
        }
        if (str.contains("Mk47") && Overlay.getConfig("Mk47 Mutant")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "Mk47 Mutant";
        }
        if (str.contains("G36") && Overlay.getConfig("G36C")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "G36C";
        }
        if (str.contains("QBZ") && Overlay.getConfig("QBZ")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "QBZ";
        }
        if (str.contains("AKM") && Overlay.getConfig("AKM")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "AKM";
        }
        if (str.contains("Groza") && Overlay.getConfig("Groza")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "Groza";
        }
        if (str.contains("PP19") && Overlay.getConfig("Bizon")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "Bizon";
        }
        if (str.contains("TommyGun") && Overlay.getConfig("TommyGun")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "TommyGun";
        }
        if (str.contains("MP5K") && Overlay.getConfig("MP5K")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "MP5K";
        }
        if (str.contains("UMP9") && Overlay.getConfig("UMP")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "UMP";
        }
        if (str.contains("Vector") && Overlay.getConfig("Vector")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "Vector";
        }
        if (str.contains("MachineGun_Uzi") && Overlay.getConfig("Uzi")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "Uzi";
        }
        if (str.contains("DP28") && Overlay.getConfig("DP28")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "DP28";
        }
        if (str.contains("M249") && Overlay.getConfig("M249")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "M249";
        }
        if (str.contains("AWM") && Overlay.getConfig("AWM")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "AWM";
        }
        if (str.contains("QBU") && Overlay.getConfig("QBU")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "QBU";
        }
        if (str.contains("SLR") && Overlay.getConfig("SLR")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "SLR";
        }
        if (str.contains("SKS") && Overlay.getConfig("SKS")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "SKS";
        }
        if (str.contains("Mini14") && Overlay.getConfig("Mini14")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "Mini14";
        }
        if (str.contains("M24") && Overlay.getConfig("M24")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "M24";
        }
        if (str.contains("Kar98k") && Overlay.getConfig("Kar98k")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "Kar98k";
        }
        if (str.contains("VSS") && Overlay.getConfig("VSS")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "VSS";
        }
        if (str.contains("Win94") && Overlay.getConfig("Win94")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "Win94";
        }
        if (str.contains("Mk14") && Overlay.getConfig("Mk14")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "Mk14";
        }
        if (str.contains("S12K") && Overlay.getConfig("S12K")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "S12K";
        }
        if (str.contains("DBS") && Overlay.getConfig("DBS")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "DBS";
        }
        if (str.contains("S686") && Overlay.getConfig("S686")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "S686";
        }
        if (str.contains("S1897") && Overlay.getConfig("S1897")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "S1897";
        }
        if (str.contains("Sickle") && Overlay.getConfig("Sickle")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "Sickle";
        }
        if (str.contains("Machete") && Overlay.getConfig("Machete")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "Machete";
        }
        if (str.contains("Cowbar") && Overlay.getConfig("Cowbar")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "Cowbar";
        }
        if (str.contains("CrossBow") && Overlay.getConfig("CrossBow")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "CrossBow";
        }
        if (str.contains("Pan") && Overlay.getConfig("Pan")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "Pan";
        }
        if (str.contains("SawedOff") && Overlay.getConfig("SawedOff")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "SawedOff";
        }
        if (str.contains("R1895") && Overlay.getConfig("R1895")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "R1895";
        }
        if (str.contains("Vz61") && Overlay.getConfig("Vz61")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "Vz61";
        }
        if (str.contains("P92") && Overlay.getConfig("P92")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "P92";
        }
        if (str.contains("P18C") && Overlay.getConfig("P18C")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "P18C";
        }
        if (str.contains("R45") && Overlay.getConfig("R45")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "R45";
        }
        if (str.contains("P1911") && Overlay.getConfig("P1911")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "P1911";
        }
        if (str.contains("DesertEagle") && Overlay.getConfig("Desert Eagle")) {
            mTextPaint2.setColor(Color.rgb(0,200,200));
            return "DesertEagle";
        }
        if (str.contains("Ammo_762mm") && Overlay.getConfig("7.62")) {

            mTextPaint2.setColor(Color.rgb(255,255,255));
            return "7.62";
        }
        if (str.contains("Ammo_45AC") && Overlay.getConfig("45ACP")) {
            mTextPaint2.setColor(Color.rgb(255,255,255));
            return "45ACP";
        }
        if (str.contains("Ammo_556mm") && Overlay.getConfig("5.56")) {
            mTextPaint2.setColor(Color.rgb(255,255,255));
            return "5.56";
        }
        if (str.contains("Ammo_9mm") && Overlay.getConfig("9mm")) {
            mTextPaint2.setColor(Color.rgb(255,255,255));
            return "9mm";
        }
        if (str.contains("Ammo_300Magnum") && Overlay.getConfig("300Magnum")) {
            mTextPaint2.setColor(Color.rgb(255,255,255));
            return "300Magnum";
        }
        if (str.contains("Ammo_12Guage") && Overlay.getConfig("12 Guage")) {
            mTextPaint2.setColor(Color.rgb(255,255,255));
            return "12 Guage";
        }
        if (str.contains("Ammo_Bolt") && Overlay.getConfig("Arrow")) {
            mTextPaint2.setColor(Color.rgb(255,255,255));
            return "Arrow";
        }
        if (str.contains("Bag_Lv3") && Overlay.getConfig("Bag L 3")) {
            mTextPaint2.setColor(Color.rgb(200,255,100));
            return "Bag lvl 3";
        }
        if (str.contains("Bag_Lv1") && Overlay.getConfig("Bag L 1")) {
            mTextPaint2.setColor(Color.rgb(200,255,100));
            return "Bag lvl 1";
        }
        if (str.contains("Bag_Lv2") && Overlay.getConfig("Bag L 2")) {
            mTextPaint2.setColor(Color.rgb(200,255,100));
            return "Bag lvl 2";
        }
        if (str.contains("Armor_Lv2") && Overlay.getConfig("Vest L 2")) {
            mTextPaint2.setColor(Color.rgb(200,255,100));
            return "Vest lvl 2";
        }
        if (str.contains("Armor_Lv1") && Overlay.getConfig("Vest L 1")) {
            mTextPaint2.setColor(Color.rgb(200,255,100));
            return "Vest lvl 1";
        }
        if (str.contains("Armor_Lv3") && Overlay.getConfig("Vest L 3")) {
            mTextPaint2.setColor(Color.rgb(200,255,100));
            return "Vest lvl 3";
        }
        if (str.contains("Helmet_Lv2") && Overlay.getConfig("Helmet 2")) {
            mTextPaint2.setColor(Color.rgb(200,255,100));
            return "Helmet lvl 2";
        }
        if (str.contains("Helmet_Lv1") && Overlay.getConfig("Helmet 1")) {
            mTextPaint2.setColor(Color.rgb(200,255,100));
            return "Helmet lvl 1";
        }
        if (str.contains("Helmet_Lv3") && Overlay.getConfig("Helmet 3")) {
            mTextPaint2.setColor(Color.rgb(200,255,100));
            return "Helmet lvl 3";
        }
        if (str.contains("Pills") && Overlay.getConfig("PainKiller")) {
            mTextPaint2.setColor(Color.rgb(200,255,100));
            return "Painkiller";
        }
        if (str.contains("Injection") && Overlay.getConfig("Adrenaline")) {
            mTextPaint2.setColor(Color.rgb(200,255,100));
            return "Adrenaline";
        }
        if (str.contains("Drink") && Overlay.getConfig("Energy Drink")) {
            mTextPaint2.setColor(Color.rgb(200,255,100));
            return "Energy Drink";
        }
        if (str.contains("Firstaid") && Overlay.getConfig("FirstAidKit")) {
            mTextPaint2.setColor(Color.rgb(200,255,100));
            return "FirstAidKit";
        }
        if (str.contains("Bandage") && Overlay.getConfig("Bandage")) {
            mTextPaint2.setColor(Color.rgb(200,255,100));
            return "Bandage";
        }
        if (str.contains("FirstAidbox") && Overlay.getConfig("Medkit")) {
            mTextPaint2.setColor(Color.rgb(200,255,100));
            return "Medkit";
        }
        if (str.contains("Grenade_Stun") && Overlay.getConfig("Stung")) {
            mTextPaint2.setColor(Color.rgb(200,0,100));
            return "Stung";
        }
        if (str.contains("Grenade_Shoulei") && Overlay.getConfig("Grenade")) {
            mTextPaint2.setColor(Color.rgb(200,0,100));
            return "Grenade";
        }
        if (str.contains("Grenade_Smoke") && Overlay.getConfig("Smoke")) {
            mTextPaint2.setColor(Color.rgb(200,0,100));
            return "Smoke";
        }
        if (str.contains("Grenade_Burn") && Overlay.getConfig("Molotov")) {
            mTextPaint2.setColor(Color.rgb(200,0,100));
            return "Molotov";
        }
        if (str.contains("Large_FlashHider") && Overlay.getConfig("Flash Hider Ar")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Flash Hider Ar";
        }
        if (str.contains("QK_Large_C") && Overlay.getConfig("Ar Compensator")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Ar Compensator";
        }
        if (str.contains("Mid_FlashHider") && Overlay.getConfig("Flash Hider SMG")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Flash Hider SMG";
        }
        if (str.contains("QT_A_") && Overlay.getConfig("Tactical Stock")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Tactical Stock";
        }
        if (str.contains("DuckBill") && Overlay.getConfig("Duckbill")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "DuckBill";
        }
        if (str.contains("Sniper_FlashHider") && Overlay.getConfig("Flash Hider Snp")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Flash Hider Sniper";
        }
        if (str.contains("Mid_Suppressor") && Overlay.getConfig("Suppressor SMG")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Suppressor SMG";
        }
        if (str.contains("HalfGrip") && Overlay.getConfig("Half Grip")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Half Grip";
        }
        if (str.contains("Choke") && Overlay.getConfig("Choke")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Choke";
        }
        if (str.contains("QT_UZI") && Overlay.getConfig("Stock Micro UZI")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Stock Micro UZI";
        }
        if (str.contains("QK_Sniper") && Overlay.getConfig("SniperCompensator")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Sniper Compensator";
        }
        if (str.contains("Sniper_Suppressor") && Overlay.getConfig("Sup Sniper")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Suppressor Sniper";
        }
        if (str.contains("Large_Suppressor") && Overlay.getConfig("Suppressor Ar")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Suppressor Ar";
        }
        if (str.contains("Sniper_EQ_") && Overlay.getConfig("Ex.Qd.Sniper")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Ex.Qd.Sniper";
        }
        if (str.contains("Mid_Q_") && Overlay.getConfig("Qd.SMG")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Qd.SMG";
        }
        if (str.contains("Mid_E_") && Overlay.getConfig("Ex.SMG")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Ex.SMG";
        }
        if (str.contains("Sniper_Q_") && Overlay.getConfig("Qd.Sniper")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Qd.Sniper";
        }
        if (str.contains("Sniper_E_") && Overlay.getConfig("Ex.Sniper")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Ex.Sniper";
        }
        if (str.contains("Large_E_") && Overlay.getConfig("Ex.Ar")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Ex.Ar";
        }
        if (str.contains("Large_EQ_") && Overlay.getConfig("Ex.Qd.Ar")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Ex.Qd.Ar";
        }
        if (str.contains("Large_Q_") && Overlay.getConfig("Qd.Ar")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Qd.Ar";
        }
        if (str.contains("Mid_EQ_") && Overlay.getConfig("Ex.Qd.SMG")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Ex.Qd.SMG";
        }
        if (str.contains("Crossbow_Q") && Overlay.getConfig("Quiver CrossBow")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Quiver CrossBow";
        }
        if (str.contains("ZDD_Sniper") && Overlay.getConfig("Bullet Loop")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Bullet Loop";
        }
        if (str.contains("ThumbGrip") && Overlay.getConfig("Thumb Grip")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Thumb Grip";
        }
        if (str.contains("Lasersight") && Overlay.getConfig("Laser Sight")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Laser Sight";
        }
        if (str.contains("Angled") && Overlay.getConfig("Angled Grip")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Angled Grip";
        }
        if (str.contains("LightGrip") && Overlay.getConfig("Light Grip")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Light Grip";
        }
        if (str.contains("Vertical") && Overlay.getConfig("Vertical Grip")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Vertical Grip";
        }
        if (str.contains("GasCan") && Overlay.getConfig("Gas Can")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Gas Can";
        }
        if (str.contains("Mid_Compensator") && Overlay.getConfig("Compensator SMG")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Compensator SMG";
        }
        if (str.contains("Flare") && Overlay.getConfig("Flare Gun")) {
            mTextPaint2.setColor(Color.rgb(255,150,0));
            return "Flare Gun";
        }
        if (str.contains("Ghillie") && Overlay.getConfig("Ghillie Suit")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "Ghillie Suit";
        }
        if (str.contains("CheekPad") && Overlay.getConfig("CheekPad")) {
            mTextPaint2.setColor(Color.rgb(100,150,150));
            return "CheekPad";
        }
        if (str.contains("PickUpListWrapperActor") && Overlay.getConfig("Crate")) {
            mTextPaint2.setColor(Color.rgb(200,0,200));
            return "Crate";
        }
        if (str.contains("AirDropPlane") && Overlay.getConfig("DropPlane")) {
            mTextPaint2.setColor(Color.rgb(147,112,219));
            return "DropPlane";
        }
        if (!str.contains("AirDrop") || !Overlay.getConfig("AirDrop")) {
            mTextPaint2.setColor(Color.rgb(147,112,219));
            return null;
        }

        mTextPaint2.setColor(Color.rgb(0,200,200));
        return "AirDrop";
    }

    private int getItemNum(String str) {
        if (str.contains("MZJ_8X") && Overlay.getConfig("8x")) {
            return 0;
        }
        if (str.contains("MZJ_2X") && Overlay.getConfig("2x")) {
            return 1;
        }
        if (str.contains("MZJ_HD") && Overlay.getConfig("RedDot")) {
            return 2;
        }
        if (str.contains("MZJ_3X") && Overlay.getConfig("3x")) {
            return 3;
        }
        if (str.contains("MZJ_QX") && Overlay.getConfig("Hollow")) {
            return 4;
        }
        if (str.contains("MZJ_6X") && Overlay.getConfig("6x")) {
            return 5;
        }
        if (str.contains("MZJ_4X") && Overlay.getConfig("4x")) {
            return 6;
        }
        if (str.contains("MZJ_SideRMR") && Overlay.getConfig("Canted")) {
            return 7;
        }
        if (str.contains("AUG") && Overlay.getConfig("AUG")) {
            return 8;
        }
        if (str.contains("M762") && Overlay.getConfig("M762")) {
            return 9;
        }
        if (str.contains("SCAR") && Overlay.getConfig("SCAR-L")) {
            return 10;
        }
        if (str.contains("M416") && Overlay.getConfig("M416")) {
            return 11;
        }
        if (str.contains("M16A4") && Overlay.getConfig("M16A4")) {
            return 12;
        }
        if (str.contains("Mk47") && Overlay.getConfig("Mk47 Mutant")) {
            return 13;
        }
        if (str.contains("G36") && Overlay.getConfig("G36C")) {
            return 14;
        }
        if (str.contains("QBZ") && Overlay.getConfig("QBZ")) {
            return 15;
        }
        if (str.contains("AKM") && Overlay.getConfig("AKM")) {
            return 16;
        }
        if (str.contains("Groza") && Overlay.getConfig("Groza")) {
            return 17;
        }
        if (str.contains("PP19") && Overlay.getConfig("Bizon")) {
            return 18;
        }
        if (str.contains("TommyGun") && Overlay.getConfig("TommyGun")) {
            return 19;
        }
        if (str.contains("MP5K") && Overlay.getConfig("MP5K")) {
            return 20;
        }
        if (str.contains("UMP9") && Overlay.getConfig("UMP")) {
            return 21;
        }
        if (str.contains("Vector") && Overlay.getConfig("Vector")) {
            return 22;
        }
        if (str.contains("MachineGun_Uzi") && Overlay.getConfig("Uzi")) {
            return 23;
        }
        if (str.contains("DP28") && Overlay.getConfig("DP28")) {
            return 24;
        }
        if (str.contains("M249") && Overlay.getConfig("M249")) {
            return 25;
        }
        if (str.contains("AWM") && Overlay.getConfig("AWM")) {
            return 26;
        }
        if (str.contains("QBU") && Overlay.getConfig("QBU")) {
            return 27;
        }
        if (str.contains("SLR") && Overlay.getConfig("SLR")) {
            return 28;
        }
        if (str.contains("SKS") && Overlay.getConfig("SKS")) {
            return 29;
        }
        if (str.contains("Mini14") && Overlay.getConfig("Mini14")) {
            return 30;
        }
        if (str.contains("M24") && Overlay.getConfig("M24")) {
            return 31;
        }
        if (str.contains("Kar98k") && Overlay.getConfig("Kar98k")) {
            return 32;
        }
        if (str.contains("VSS") && Overlay.getConfig("VSS")) {
            return 33;
        }
        if (str.contains("Win94") && Overlay.getConfig("Win94")) {
            return 34;
        }
        if (str.contains("Mk14") && Overlay.getConfig("Mk14")) {
            return 35;
        }
        if (str.contains("S12K") && Overlay.getConfig("S12K")) {
            return 36;
        }
        if (str.contains("DBS") && Overlay.getConfig("DBS")) {
            return 37;
        }
        if (str.contains("S686") && Overlay.getConfig("S686")) {
            return 38;
        }
        if (str.contains("S1897") && Overlay.getConfig("S1897")) {
            return 39;
        }
        if (str.contains("Sickle") && Overlay.getConfig("Sickle")) {
            return 40;
        }
        if (str.contains("Machete") && Overlay.getConfig("Machete")) {
            return 41;
        }
        if (str.contains("Cowbar") && Overlay.getConfig("Cowbar")) {
            return 42;
        }
        if (str.contains("CrossBow") && Overlay.getConfig("CrossBow")) {
            return 43;
        }
        if (str.contains("Pan") && Overlay.getConfig("Pan")) {
            return 44;
        }
        if (str.contains("SawedOff") && Overlay.getConfig("SawedOff")) {
            return 45;
        }
        if (str.contains("R1895") && Overlay.getConfig("R1895")) {
            return 46;
        }
        if (str.contains("Vz61") && Overlay.getConfig("Vz61")) {
            return 47;
        }
        if (str.contains("P92") && Overlay.getConfig("P92")) {
            return 48;
        }
        if (str.contains("P18C") && Overlay.getConfig("P18C")) {
            return 49;
        }
        if (str.contains("R45") && Overlay.getConfig("R45")) {
            return 50;
        }
        if (str.contains("P1911") && Overlay.getConfig("P1911")) {
            return 51;
        }
        if (str.contains("DesertEagle") && Overlay.getConfig("Desert Eagle")) {
            return 52;
        }
        if (str.contains("Ammo_762mm") && Overlay.getConfig("7.62")) {
            return 53;
        }
        if (str.contains("Ammo_45AC") && Overlay.getConfig("45ACP")) {
            return 54;
        }
        if (str.contains("Ammo_556mm") && Overlay.getConfig("5.56")) {
            return 55;
        }
        if (str.contains("Ammo_9mm") && Overlay.getConfig("9mm")) {
            return 56;
        }
        if (str.contains("Ammo_300Magnum") && Overlay.getConfig("300Magnum")) {
            return 57;
        }
        if (str.contains("Ammo_12Guage") && Overlay.getConfig("12 Guage")) {
            return 58;
        }
        if (str.contains("Ammo_Bolt") && Overlay.getConfig("Arrow")) {
            return 59;
        }
        if (str.contains("Bag_Lv3") && Overlay.getConfig("Bag L 3")) {
            return 60;
        }
        if (str.contains("Bag_Lv1") && Overlay.getConfig("Bag L 1")) {
            return 61;
        }
        if (str.contains("Bag_Lv2") && Overlay.getConfig("Bag L 2")) {
            return 62;
        }
        if (str.contains("Armor_Lv2") && Overlay.getConfig("Vest L 2")) {
            return 63;
        }
        if (str.contains("Armor_Lv1") && Overlay.getConfig("Vest L 1")) {
            return 64;
        }
        if (str.contains("Armor_Lv3") && Overlay.getConfig("Vest L 3")) {
            return 65;
        }
        if (str.contains("Helmet_Lv2") && Overlay.getConfig("Helmet 2")) {
            return 66;
        }
        if (str.contains("Helmet_Lv1") && Overlay.getConfig("Helmet 1")) {
            return 67;
        }
        if (str.contains("Helmet_Lv3") && Overlay.getConfig("Helmet 3")) {
            return 68;
        }
        if (str.contains("Pills") && Overlay.getConfig("PainKiller")) {
            return 69;
        }
        if (str.contains("Injection") && Overlay.getConfig("Adrenaline")) {
            return 70;
        }
        if (str.contains("Drink") && Overlay.getConfig("Energy Drink")) {
            return 71;
        }
        if (str.contains("Firstaid") && Overlay.getConfig("FirstAidKit")) {
            return 72;
        }
        if (str.contains("Bandage") && Overlay.getConfig("Bandage")) {
            return 73;
        }
        if (str.contains("FirstAidbox") && Overlay.getConfig("Medkit")) {
            return 74;
        }
        if (str.contains("Grenade_Stun") && Overlay.getConfig("Stung")) {
            return 75;
        }
        if (str.contains("Grenade_Shoulei") && Overlay.getConfig("Grenade")) {
            return 76;
        }
        if (str.contains("Grenade_Smoke") && Overlay.getConfig("Smoke")) {
            return 77;
        }
        if (str.contains("Grenade_Burn") && Overlay.getConfig("Molotov")) {
            return 78;
        }
        if (str.contains("Large_FlashHider") && Overlay.getConfig("Flash Hider Ar")) {
            return 79;
        }
        if (str.contains("QK_Large_C") && Overlay.getConfig("Ar Compensator")) {
            return 80;
        }
        if (str.contains("Mid_FlashHider") && Overlay.getConfig("Flash Hider SMG")) {
            return 81;
        }
        if (str.contains("QT_A_") && Overlay.getConfig("Tactical Stock")) {
            return 82;
        }
        if (str.contains("DuckBill") && Overlay.getConfig("Duckbill")) {
            return 83;
        }
        if (str.contains("Sniper_FlashHider") && Overlay.getConfig("Flash Hider Snp")) {
            return 84;
        }
        if (str.contains("Mid_Suppressor") && Overlay.getConfig("Suppressor SMG")) {
            return 85;
        }
        if (str.contains("HalfGrip") && Overlay.getConfig("Half Grip")) {
            return 86;
        }
        if (str.contains("Choke") && Overlay.getConfig("Choke")) {
            return 87;
        }
        if (str.contains("QT_UZI") && Overlay.getConfig("Stock Micro UZI")) {
            return 88;
        }
        if (str.contains("QK_Sniper") && Overlay.getConfig("SniperCompensator")) {
            return 89;
        }
        if (str.contains("Sniper_Suppressor") && Overlay.getConfig("Sup Sniper")) {
            return 90;
        }
        if (str.contains("Large_Suppressor") && Overlay.getConfig("Suppressor Ar")) {
            return 91;
        }
        if (str.contains("Sniper_EQ_") && Overlay.getConfig("Ex.Qd.Sniper")) {
            return 92;
        }
        if (str.contains("Mid_Q_") && Overlay.getConfig("Qd.SMG")) {
            return 93;
        }
        if (str.contains("Mid_E_") && Overlay.getConfig("Ex.SMG")) {
            return 94;
        }
        if (str.contains("Sniper_Q_") && Overlay.getConfig("Qd.Sniper")) {
            return 95;
        }
        if (str.contains("Sniper_E_") && Overlay.getConfig("Ex.Sniper")) {
            return 96;
        }
        if (str.contains("Large_E_") && Overlay.getConfig("Ex.Ar")) {
            return 97;
        }
        if (str.contains("Large_EQ_") && Overlay.getConfig("Ex.Qd.Ar")) {
            return 99;
        }
        if (str.contains("Large_Q_") && Overlay.getConfig("Qd.Ar")) {
            return 100;
        }
        if (str.contains("Mid_EQ_") && Overlay.getConfig("Ex.Qd.SMG")) {
            return 101;
        }
        if (str.contains("Crossbow_Q") && Overlay.getConfig("Quiver CrossBow")) {
            return 102;
        }
        if (str.contains("ZDD_Sniper") && Overlay.getConfig("Bullet Loop")) {
            return 103;
        }
        if (str.contains("ThumbGrip") && Overlay.getConfig("Thumb Grip")) {
            return 104;
        }
        if (str.contains("Lasersight") && Overlay.getConfig("Laser Sight")) {
            return 105;
        }
        if (str.contains("Angled") && Overlay.getConfig("Angled Grip")) {
            return 106;
        }
        if (str.contains("LightGrip") && Overlay.getConfig("Light Grip")) {
            return 107;
        }
        if (str.contains("Vertical") && Overlay.getConfig("Vertical Grip")) {
            return 108;
        }
        if (str.contains("GasCan") && Overlay.getConfig("Gas Can")) {
            return 109;
        }
        if (str.contains("Mid_Compensator") && Overlay.getConfig("Compensator SMG")) {
            return 110;
        }
        if (str.contains("Flare") && Overlay.getConfig("Flare Gun")) {
            return 111;
        }
        if (str.contains("Ghillie") && Overlay.getConfig("Ghillie Suit")) {
            return 112;
        }
        if (str.contains("CheekPad") && Overlay.getConfig("CheekPad")) {
            return 113;
        }
        if (str.contains("PickUpListWrapperActor") && Overlay.getConfig("Crate")) {
            return 114;
        }
        if (!str.contains("AirDropPlane") || !Overlay.getConfig("DropPlane")) {
            return (!str.contains("AirDrop") || !Overlay.getConfig("AirDrop")) ? -1 : 116;
        }
        return 115;
    }

    private int getStyleNum(String str) {
        return (!str.contains("Buggy") || !Overlay.getConfig("Buggy")) ? -1 : 0;
    }

    private String getVehicleName(String str) {
        return (!str.contains("Buggy") || !Overlay.getConfig("Buggy")) ? (!str.contains("CoupeRB") || !Overlay.getConfig("CoupeRB")) ? (!str.contains("UAZ") || !Overlay.getConfig("UAZ")) ? (!str.contains("MotorcycleC") || !Overlay.getConfig("Trike")) ? (!str.contains("Motorcycle") || !Overlay.getConfig("Bike")) ? (!str.contains("Dacia") || !Overlay.getConfig("Dacia")) ? (!str.contains("AquaRail") || !Overlay.getConfig("Jet")) ? (!str.contains("PG117") || !Overlay.getConfig("Boat")) ? (!str.contains("MiniBus") || !Overlay.getConfig("Bus")) ? (!str.contains("Mirado") || !Overlay.getConfig("Mirado")) ? (!str.contains("Scooter") || !Overlay.getConfig("Scooter")) ? (!str.contains("Rony") || !Overlay.getConfig("Rony")) ? (!str.contains("Snowbike") || !Overlay.getConfig("Snowbike")) ? (!str.contains("Snowmobile") || !Overlay.getConfig("Snowmobile")) ? (!str.contains("Tuk") || !Overlay.getConfig("Tempo")) ? (!str.contains("PickUp") || !Overlay.getConfig("Truck")) ? (!str.contains("BRDM") || !Overlay.getConfig("BRDM")) ? (!str.contains("LadaNiva") || !Overlay.getConfig("LadaNiva")) ? (!str.contains("Bigfoot") || !Overlay.getConfig("Monster Truck")) ? "" : "Monster Truck" : "LadaNiva" : "BRDM" : "Truck" : "Tempo" : "Snowmobile" : "Snowbike" : "Rony" : "Scooter" : "Mirado" : "Bus" : "Boat" : "Jet" : "Dacia" : "Bike" : "Trike" : "UAZ" : "CoupeRB" :"Buggy";
    }

    private int getVehicleNum(String str) {
        if (str.contains("Buggy") && Overlay.getConfig("Buggy")) {
            return 0;
        }
        if (str.contains("UAZ") && Overlay.getConfig("UAZ")) {
            return 1;
        }
        if (str.contains("MotorcycleC") && Overlay.getConfig("Trike")) {
            return 2;
        }
        if (str.contains("Motorcycle") && Overlay.getConfig("Bike")) {
            return 3;
        }
        if (str.contains("Dacia") && Overlay.getConfig("Dacia")) {
            return 4;
        }
        if (str.contains("AquaRail") && Overlay.getConfig("Jet")) {
            return 5;
        }
        if (str.contains("PG117") && Overlay.getConfig("Boat")) {
            return 6;
        }
        if (str.contains("MiniBus") && Overlay.getConfig("Bus")) {
            return 7;
        }
        if (str.contains("Mirado") && Overlay.getConfig("Mirado")) {
            return 8;
        }
        if (str.contains("Scooter") && Overlay.getConfig("Scooter")) {
            return 9;
        }
        if (str.contains("Rony") && Overlay.getConfig("Rony")) {
            return 10;
        }
        if (str.contains("Snowbike") && Overlay.getConfig("Snowbike")) {
            return 11;
        }
        if (str.contains("Snowmobile") && Overlay.getConfig("Snowmobile")) {
            return 12;
        }
        if (str.contains("Tuk") && Overlay.getConfig("Tempo")) {
            return 13;
        }
        if (str.contains("PickUp") && Overlay.getConfig("Truck")) {
            return 14;
        }
        if (str.contains("BRDM") && Overlay.getConfig("BRDM")) {
            return 15;
        }
        if (!str.contains("LadaNiva") || !Overlay.getConfig("LadaNiva")) {
            return (!str.contains("Bigfoot") || !Overlay.getConfig("Monster Truck")) ? -1 : 17;
        }
        return 16;
    }

    private String getWeapon(int i) {
        if (i == 101006) {
            return "AUG";
        }
        if (i == 101008) {
            return "M762";
        }
        if (i == 101003) {
            return "SCAR-L";
        }
        if (i == 101004) {
            return "M416";
        }
        if (i == 101002) {
            return "M16A-4";
        }
        if (i == 101009) {
            return "Mk47 Mutant";
        }
        if (i == 101010) {
            return "G36C";
        }
        if (i == 101007) {
            return "QBZ";
        }
        if (i == 101001) {
            return "AKM";
        }
        if (i == 101005) {
            return "Groza";
        }
        if (i == 102005) {
            return "Bizon";
        }
        if (i == 102004) {
            return "TommyGun";
        }
        if (i == 102007) {
            return "MP5K";
        }
        if (i == 102002) {
            return "UMP";
        }
        if (i == 102003) {
            return "Vector";
        }
        if (i == 102001) {
            return "Uzi";
        }
        if (i == 105002) {
            return "DP28";
        }
        if (i == 105001) {
            return "M249";
        }
        if (i == 103003) {
            return "AWM";
        }
        if (i == 103010) {
            return "QBU";
        }
        if (i == 103009) {
            return "SLR";
        }
        if (i == 103004) {
            return "SKS";
        }
        if (i == 103006) {
            return "Mini14";
        }
        if (i == 103002) {
            return "M24";
        }
        if (i == 103001) {
            return "Kar98k";
        }
        if (i == 103005) {
            return "VSS";
        }
        if (i == 103008) {
            return "Win94";
        }
        if (i == 103007) {
            return "Mk14";
        }
        if (i == 104003) {
            return "S12K";
        }
        if (i == 104004) {
            return "DBS";
        }
        if (i == 104001) {
            return "S686";
        }
        if (i == 104002) {
            return "S1897";
        }
        if (i == 108003) {
            return "Sickle";
        }
        if (i == 108001) {
            return "Machete";
        }
        if (i == 108002) {
            return "Crowbar";
        }
        if (i == 107001) {
            return "CrossBow";
        }
        if (i == 108004) {
            return "Pan";
        }
        if (i == 106006) {
            return "SawedOff";
        }
        if (i == 106003) {
            return "R1895";
        }
        if (i == 106008) {
            return "Vz61";
        }
        if (i == 106001) {
            return "P92";
        }
        if (i == 106004) {
            return "P18C";
        }
        if (i == 106005) {
            return "R45";
        }
        if (i == 106002) {
            return "P1911";
        }
        if (i == 106010) {
            return "DesertEagle";
        }
        return null;
    }

    public static Bitmap scale(Bitmap bitmap3, int i, int i2) {
        float f = (float) i;
        float f2 = (float) i2;
        if (((float) bitmap3.getWidth()) / f >= ((float) bitmap3.getHeight()) / f2) {
            i2 = (int) ((f / ((float) bitmap3.getWidth())) * ((float) bitmap3.getHeight()));
        } else {
            i = (int) ((f2 / ((float) bitmap3.getHeight())) * ((float) bitmap3.getWidth()));
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        float f3 = (float) i;
        float width = f3 / ((float) bitmap3.getWidth());
        float f4 = (float) i2;
        float height = f4 / ((float) bitmap3.getHeight());
        float f5 = f3 / 2.0f;
        float f6 = f4 / 2.0f;
        Matrix matrix = new Matrix();
        matrix.setScale(width, height, f5, f6);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setMatrix(matrix);
        canvas.drawBitmap(bitmap3, f5 - ((float) (bitmap3.getWidth() / 2)), f6 - ((float) (bitmap3.getHeight() / 2)), new Paint(2));
        bitmap3.recycle();
        return createBitmap;
    }

    public static Bitmap scale2(Bitmap bitmap3, int i, int i2, int i3) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
        float f = (float) i;
        float width = f / ((float) bitmap3.getWidth());
        float f2 = (float) i2;
        float height = f2 / ((float) bitmap3.getHeight());
        float f3 = f / 2.0f;
        float f4 = f2 / 2.0f;
        Matrix matrix = new Matrix();
        matrix.setScale(width, height, f3, f4);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setMatrix(matrix);
        canvas.drawBitmap(bitmap3, f3 - ((float) (bitmap3.getWidth() / 2)), f4 - ((float) (bitmap3.getHeight() / 2)), paint);
        bitmap3.recycle();
        return createBitmap;
    }

    public void ClearCanvas(Canvas canvas) {
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
    }

    public void DebugText(String str) {
        System.out.println(str);
    }

    public void DrawBox(Canvas canvas, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, float f5) {
        this.mStrokePaint.setStrokeWidth((float) Strokebox);
        this.mStrokePaint.setColor(Color.rgb(i2, i3, i4));
        this.mStrokePaint.setAlpha(i);
        if(mStrokePaint.getColor()!=Color.GREEN)
        this.mStrokePaint.setColor(ColorBox);
        canvas.drawRect(f2, f3, f4, f5, this.mStrokePaint);
    }

    public void DrawFilledRect4(Canvas canvas, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        this.mFilledPaint.setColor(Color.rgb(i2, i3, i4));
        this.mFilledPaint.setAlpha(i);
        int i5 = 0;
        int i6 = 0;
        canvas.drawRect(f - ((float) i5), (f2 + ((float) i5)) - ((float) i6), f3 + ((float) i5), (f4 - ((float) i5)) - ((float) i6), this.mFilledPaint);
    }



    public void DrawBoxBot(Canvas canvas, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, float f5) {
        this.mStrokePaint.setStrokeWidth((float) Strokebox);
        this.mStrokePaint.setColor(Color.rgb(i2, i3, i4));
        this.mStrokePaint.setAlpha(i);
        if(mStrokePaint.getColor()!=Color.GREEN)
        this.mStrokePaint.setColor(ColorBoxbot);
        canvas.drawRect(f2, f3, f4, f5, this.mStrokePaint);
    }

    public void DrawCircle(Canvas canvas, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        this.mStrokePaint.setColor(Color.rgb(i2, i3, i4));
        this.mStrokePaint.setAlpha(i);
        this.mStrokePaint.setStrokeWidth(f);
        canvas.drawCircle(f2, f3, f4, this.mStrokePaint);
    }

    public void DrawCircle1(Canvas canvas, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        this.mStrokePaint.setARGB(i, i2, i3, i4);
        this.mStrokePaint.setStrokeWidth(f4);
        canvas.drawCircle(f, f2, f3, this.mStrokePaint);
    }

    public void DrawCross(Canvas canvas, int i, int i2, int i3, int i4, String str, float f, float f2, float f3) {
        this.mTextPaint3.setARGB(i, i2, i3, i4);
        this.mTextPaint3.setTextSize(f3);
        if (Overlay.getConfig("CrossHair")) {
            this.mTextPaint3.setColor(ColorCross);
            this.mTextPaint3.setAntiAlias(true);
            this.mTextPaint3.setStyle(Paint.Style.STROKE);
            this.mTextPaint3.setStrokeWidth((float) StrokeCross2);
            canvas.drawCircle(f, f2, (float) StrokeCross, this.mTextPaint3);
        }
    }

    public void DrawCross2(Canvas canvas, int i, int i2, int i3, int i4, String str, float f, float f2, float f3) {
        this.mTextPaint3.setARGB(i, i2, i3, i4);
        this.mTextPaint3.setTextSize(f3);
        if (Overlay.getConfig("CrossHair")) {
            this.mTextPaint3.setColor(ColorCross);
            this.mTextPaint3.setAntiAlias(true);
            int i5 = StrokeCross;
            int i6 = (i5 + 62) / 2;
            int i7 = (i5 + 62) / 2;
            int length = Cross.length;
            for (int i8 = 0; i8 < length; i8++) {
                this.CROSSHAIR[i8] = getBitmap24(Overlay.ctx, 62, 62, Cross[i8].intValue(), canvas, f - 31.0f, f2 - 31.0f);
            }
            canvas.drawBitmap(this.CROSSHAIR[CrossCount], f - 31.0f, f2 - 31.0f, this.mTextPaint3);
            this.CROSSHAIR[CrossCount].recycle();
        }
    }

    public void DrawFilledCircle(Canvas canvas, int i, int i2, int i3, int i4, float f, float f2, float f3) {
        this.mFilledPaint.setColor(Color.rgb(i2, i3, i4));
        this.mFilledPaint.setAlpha(i);
        if (!Overlay.getConfig("SQUARE") && !Overlay.getConfig("SQUARE")) {
            this.mFilledPaint.setColor(ColorAlert);
            canvas.drawCircle(f, f2, f3, this.mFilledPaint);
            return;
        }
        this.mFilledPaint.setColor(ColorAlert);
        canvas.drawRect(f - 75.0f, f2 - 32.0f, f + 75.0f, f2 + 16.0f, this.mFilledPaint);
    }

    public void DrawFilledCircleleft(Canvas canvas, int i, int i2, int i3, int i4, float f, float f2, float f3) {
        this.mFilledPaint.setColor(Color.rgb(i2, i3, i4));
        this.mFilledPaint.setAlpha(i);
        String str = alert;
        if (str == "Square") {
            this.mFilledPaint.setColor(ColorAlert);
            canvas.drawRect(f - 75.0f, f2 - 32.0f, f + 75.0f, f2 + 16.0f, this.mFilledPaint);
        } else if (str == "Arrow") {
            this.mFilledPaint.setColor(ColorAlert);
            canvas.drawBitmap(this.INFOSTYLE[6], f, f2 - 39.0f, (Paint) null);
        } else {
            this.mFilledPaint.setColor(ColorAlert);
            canvas.drawCircle(f, f2, f3, this.mFilledPaint);
        }
    }

    public void DrawFilledCircleright(Canvas canvas, int i, int i2, int i3, int i4, float f, float f2, float f3) {
        this.mFilledPaint.setColor(Color.rgb(i2, i3, i4));
        this.mFilledPaint.setAlpha(i);
        String str = alert;
        if (str == "Square") {
            this.mFilledPaint.setColor(ColorAlert);
            canvas.drawRect(f - 75.0f, f2 - 32.0f, f + 75.0f, f2 + 16.0f, this.mFilledPaint);
        } else if (str == "Arrow") {
            this.mFilledPaint.setColor(ColorAlert);
            canvas.drawBitmap(this.INFOSTYLE[5], f - 80.0f, f2 - 39.0f, (Paint) null);
        } else {
            this.mFilledPaint.setColor(ColorAlert);
            canvas.drawCircle(f, f2, f3, this.mFilledPaint);
        }
    }

    public void DrawFilledRect(Canvas canvas, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        this.mFilledPaint.setColor(Color.rgb(i2, i3, i4));
        this.mFilledPaint.setAlpha(i);
        canvas.drawRect(f, f2, f3, f4, this.mFilledPaint);
    }

    public void DrawFilledRect2(Canvas canvas, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        this.mFilledPaint.setColor(Color.rgb(i2, i3, i4));
        this.mFilledPaint.setAlpha(i);
        this.bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.ic_danger_boot);
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.ic_danger_enemy);
        this.bitmap = decodeResource;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeResource, 155, 50, false);
        this.out = createScaledBitmap;
        canvas.drawBitmap(createScaledBitmap, f - 80.0f, f2, (Paint) null);
        Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(this.bitmap2, 142, 50, false);
        this.out2 = createScaledBitmap2;
        canvas.drawBitmap(createScaledBitmap2, f + 68.0f, f2, (Paint) null);
    }

    public void DrawFilledRect3(Canvas canvas, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        this.mFilledPaint2.setColor(Color.rgb(i2, i3, i4));
        this.mFilledPaint2.setAlpha(i);
        int i5 = Pos;
        canvas.drawRect(f - 60.0f, (f2 - 6.0f) - ((float) i5), f3 + 60.0f, (f4 - 1.0f) - ((float) i5), this.mFilledPaint2);
    }

    public void DrawHead(Canvas canvas, int i, int i2, int i3, int i4, float f, float f2, float f3) {
        this.mFilledPaint.setColor(Color.rgb(i2, i3, i4));
        this.mFilledPaint.setAlpha(i);
        this.mFilledPaint.setColor(ColorHead);
        canvas.drawCircle(f, f2, f3, this.mFilledPaint);
    }

    public void DrawHeadBot(Canvas canvas, int i, int i2, int i3, int i4, float f, float f2, float f3) {
        this.mFilledPaint.setColor(Color.rgb(i2, i3, i4));
        this.mFilledPaint.setAlpha(i);
        this.mFilledPaint.setColor(ColorHeadbot);
        canvas.drawCircle(f, f2, f3, this.mFilledPaint);
    }

    public void DrawItems(Canvas canvas, String str, float f, float f2, float f3, float f4) {
        StringBuilder sb = null;
        String str2;
        int itemNum = getItemNum(str);
        String itemName = getItemName(str);
        this.mTextPaint2.setTextSize((float) (itemSize + 15));
        this.mStrokePaint.setColor(-1);
        if (itemName != null && !itemName.equals("")) {
            if (Overlay.getConfig("Material")) {
                canvas.drawBitmap(this.NEWITEM[itemNum], f2 - 30.0f, (f3 - 85.0f) - ((float) itemPosition), (Paint) null);
                return;
            }
            if (Overlay.getConfig("Dual")) {
                canvas.drawBitmap(this.NEWITEM[itemNum], f2 - 30.0f, (f3 - 85.0f) - ((float) itemPosition), (Paint) null);
                sb = new StringBuilder();
            } else if (Overlay.getConfig("MaterialDistance")) {
                canvas.drawBitmap(this.NEWITEM[itemNum], f2 - 30.0f, (f3 - 85.0f) - ((float) itemPosition), (Paint) null);
                str2 = "(" + Math.round(f) + "m)";
                canvas.drawText(str2, f2, f3 - ((float) itemPosition), this.mTextPaint2);
                return;
            } else {
                sb = new StringBuilder();
            }
            sb.append(itemName);
            sb.append(" (");
            sb.append(Math.round(f));
            sb.append("m)");
            str2 = sb.toString();
            canvas.drawText(str2, f2, f3 - ((float) itemPosition), this.mTextPaint2);
        }
    }

    public void DrawLine(Canvas canvas, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, float f5) {
        this.mStrokePaint.setColor(Color.rgb(i2, i3, i4));
        this.mStrokePaint.setAlpha(i);
        this.mStrokePaint.setStrokeWidth((float) Strokeline);
        if(mStrokePaint.getColor()!=Color.GREEN)
        this.mStrokePaint.setColor(ColorLine);
        canvas.drawLine(f2, Linestyle == "Top" ? 10.0f + (f3 / 10.0f) : f3 / 2.0f, f4, f5, this.mStrokePaint);
    }

    public void DrawLineBot(Canvas canvas, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, float f5) {
        this.mStrokePaint.setColor(Color.rgb(i2, i3, i4));
        this.mStrokePaint.setAlpha(i);
        this.mStrokePaint.setStrokeWidth(f);
        if(mStrokePaint.getColor()!=Color.GREEN)
        this.mStrokePaint.setColor(ColorLinebot);
        canvas.drawLine(f2, Linestyle == "Top" ? 10.0f + (f3 / 10.0f) : f3 / 2.0f, f4, f5, this.mStrokePaint);
    }


    public void DrawName2(Canvas canvas, int i, int i2, int i3, int i4, String str,int i5, float f, float f2, float f3) {
        String[] split = str.split(":");
        char[] cArr = new char[split.length];
        for (int i6 = 0; i6 < split.length; i6++) {
            cArr[i6] = (char) Integer.parseInt(split[i6]);
        }
        String str2 = new String(cArr);
        this.mTextPaint.setARGB(i, i2, i3, i4);
        this.mTextPaint2.setColor(bgname);
        int i7 = Size;
        int i8 = Pos;
        //canvas.drawRect((f - 100.0f) - ((float) i7), ((f2 - 22.0f) - ((float) i8)) - ((float) i7), 100.0f + f + ((float) i7), (f2 + 10.0f) - ((float) i8), this.mTextPaint2);
        this.mTextPaint.setColor(bgid);
        int i9 = Size;
        int i10 = Pos;
        canvas.drawRect((f - 95.0f) - ((float) i9), ((f2 - 18.0f) - ((float) i10)) - ((float) i9), (f - 70.0f) + ((float) i9), (f2 + 6.0f) - ((float) i10), this.mTextPaint);
        this.mTextPaint.setTextSize((float) (Size + 15));
        this.mTextPaint.setColor(textname);
        canvas.drawText("" + str2, f, f2 - ((float) Pos), this.mTextPaint);
        this.mTextPaint.setColor(textid);
        canvas.drawText("" + i5, f - 84.0f, f2 - ((float) Pos), this.mTextPaint);

       /* String[] namesp = nametxt.split(":");
        char[] nameint = new char[namesp.length];
        for (int i = 0; i < namesp.length; i++)
            nameint[i] = (char) Integer.parseInt(namesp[i]);
        String realname = new String(nameint);
        mTextPaint.setARGB(a,r, g, b);
        mTextPaint.setTextSize(size+Size);
        // cvs.drawText(realname, posX, posY, mTextPaint);
        cvs.drawText(teamid+". "+realname, posX, posY, mTextPaint);*/

       /* String[] namesp = nametxt.split(":");
        char[] nameint = new char[namesp.length];
        for (int i = 0; i < namesp.length; i++)
            nameint[i] = (char) Integer.parseInt(namesp[i]);
        String realname = new String(nameint);
        mTextPaint.setARGB(a,r, g, b);
        mTextPaint.setTextSize(size+Size);
        // mTextPaint.setTextAlign(Paint.Align.CENTER);
        mTextPaint2.setTextSize(size+Size);
        mTextPaint2.setFakeBoldText(true);
        mTextPaint2.setColor(Color.rgb(0,255,255));
        // cvs.drawText(realname, posX, posY, mTextPaint);
        cvs.drawText(" "+realname, posX+(mTextPaint2.measureText(teamid+". ")/2), posY, mTextPaint);
        cvs.drawText(teamid+". ", posX+5-(mTextPaint.measureText(" "+realname)/2), posY, mTextPaint2);*/
    }

    public void DrawName(Canvas canvas, int i, int i2, int i3, int i4, String str, int i5, float f, float f2, float f3) {
        String[] split = str.split(":");
        char[] cArr = new char[split.length];
        for (int i6 = 0; i6 < split.length; i6++) {
            cArr[i6] = (char) Integer.parseInt(split[i6]);
        }
        String str2 = new String(cArr);
        this.mTextPaint.setARGB(i, i2, i3, i4);
        this.mTextPaint2.setColor(bgname);
        int i7 = Size;
        int i8 = Pos;
        canvas.drawRect((f - 100.0f) - ((float) i7), ((f2 - 22.0f) - ((float) i8)) - ((float) i7), 100.0f + f + ((float) i7), (f2 + 10.0f) - ((float) i8), this.mTextPaint2);
        this.mTextPaint.setColor(bgid);
        int i9 = Size;
        int i10 = Pos;
        canvas.drawRect((f - 95.0f) - ((float) i9), ((f2 - 18.0f) - ((float) i10)) - ((float) i9), (f - 70.0f) + ((float) i9), (f2 + 6.0f) - ((float) i10), this.mTextPaint);
        this.mTextPaint.setTextSize((float) (Size + 15));
        this.mTextPaint.setColor(textname);
        canvas.drawText("" + str2, f, f2 - ((float) Pos), this.mTextPaint);
        this.mTextPaint.setColor(textid);
        canvas.drawText("" + i5, f - 84.0f, f2 - ((float) Pos), this.mTextPaint);
    }


    public void DrawHealth(Canvas canvas, int i, int i2, int i3, int i4, String str, int i5, float f, float f2, float f3) {
        String[] split = str.split(":");
        char[] cArr = new char[split.length];
        for (int i6 = 0; i6 < split.length; i6++) {
            cArr[i6] = (char) Integer.parseInt(split[i6]);
        }
        String str2 = new String(cArr);
        this.mTextPaint.setARGB(i, i2, i3, i4);
      //  this.mTextPaint2.setColor(bgname);
        int i7 = Size;
        int i8 = Pos;
        canvas.drawRect((f - 100.0f) - ((float) i7), ((f2 - 22.0f) - ((float) i8)) - ((float) i7), 100.0f + f + ((float) i7), (f2 + 10.0f) - ((float) i8), this.mTextPaint);
        this.mStrokePaint2.setStrokeWidth(1);
        this.mStrokePaint2.setColor(Color.rgb(0, 0, 0));
        this.mStrokePaint2.setAlpha(200);
        canvas.drawRect((f - 100.0f) - ((float) i7), ((f2 - 22.0f) - ((float) i8)) - ((float) i7), 100.0f + f + ((float) i7), (f2 + 10.0f) - ((float) i8), this.mStrokePaint2);

        //int i5 = Pos;
       // canvas.drawRect((f - 100.0f) - ((float) i7), ((f2 - 22.0f) - ((float) i8)) - ((float) i7), 100.0f + f + ((float) i7), (f2 + 10.0f) - ((float) i8), this.mStrokePaint2);

    }

    public void DrawNameBot(Canvas canvas, int i, int i2, int i3, int i4, String str, int i5, float f, float f2, float f3) {
        String[] split = str.split(":");
        char[] cArr = new char[split.length];
        for (int i6 = 0; i6 < split.length; i6++) {
            cArr[i6] = (char) Integer.parseInt(split[i6]);
        }
        new String(cArr);
        this.mTextPaint.setARGB(i, i2, i3, i4);
        this.mTextPaint2.setColor(bgname);
        int i7 = Size;
        int i8 = Pos;
        canvas.drawRect((f - 100.0f) - ((float) i7), ((f2 - 22.0f) - ((float) i8)) - ((float) i7), 100.0f + f + ((float) i7), (f2 + 10.0f) - ((float) i8), this.mTextPaint2);
        this.mTextPaint.setColor(bgid);
        int i9 = Size;
        int i10 = Pos;
        canvas.drawRect((f - 95.0f) - ((float) i9), ((f2 - 18.0f) - ((float) i10)) - ((float) i9), (f - 70.0f) + ((float) i9), (f2 + 6.0f) - ((float) i10), this.mTextPaint);
        this.mTextPaint.setTextSize((float) (Size + 15));
        this.mTextPaint.setColor(textname);
        canvas.drawText("" + namebot, f, f2 - ((float) Pos), this.mTextPaint);
        this.mTextPaint.setColor(textid);
        canvas.drawText("" + i5, f - 84.0f, f2 - ((float) Pos), this.mTextPaint);
    }

    public void DrawOTH(Canvas canvas, int i, float f, float f2) {
        canvas.drawBitmap(this.OTHER[i], f, f2, (Paint) null);
    }

    public void DrawRect(Canvas canvas, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, float f5) {
        this.mStrokePaint.setStrokeWidth(f);
        this.mStrokePaint.setColor(Color.rgb(i2, i3, i4));
        this.mStrokePaint.setAlpha(i);
        canvas.drawRect(f2, f3, f4, f5, this.mStrokePaint);
    }

    public void DrawRect2(Canvas canvas, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, float f5) {
        this.mStrokePaint2.setStrokeWidth(f);
        this.mStrokePaint2.setColor(Color.rgb(i2, i3, i4));
        this.mStrokePaint2.setAlpha(i);
        int i5 = Pos;
        canvas.drawRect(f2 - 60.0f, (f3 - 6.0f) - ((float) i5), f4 + 60.0f, (f5 - 1.0f) - ((float) i5), this.mStrokePaint2);
    }

    public void DrawSkeleton(Canvas canvas, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, float f5) {
        this.mStrokePaint.setColor(Color.rgb(i2, i3, i4));
        this.mStrokePaint.setAlpha(i);
        this.mStrokePaint.setStrokeWidth((float) Strokeskel);
        if(mStrokePaint.getColor()!=Color.GREEN)
        this.mStrokePaint.setColor(ColorSkel);
        canvas.drawLine(f2, f3, f4, f5, this.mStrokePaint);
    }

    public void DrawSkeletonBot(Canvas canvas, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, float f5) {
        this.mStrokePaint.setColor(Color.rgb(i2, i3, i4));
        this.mStrokePaint.setAlpha(i);
        this.mStrokePaint.setStrokeWidth((float) Strokeskel);
        if(mStrokePaint.getColor()!=Color.GREEN)
        this.mStrokePaint.setColor(ColorSkel);
        canvas.drawLine(f2, f3, f4, f5, this.mStrokePaint);
    }

    public void DrawText(Canvas canvas, int i, int i2, int i3, int i4, String str, float f, float f2, float f3) {
        this.mTextPaint.setARGB(i, i2, i3, i4);
        this.mTextPaint.setTextSize(f3);
        canvas.drawText(str, f, f2, this.mTextPaint);
    }

    public void DrawTextAltert(Canvas canvas, int i, int i2, int i3, int i4, String str, float f, float f2, float f3) {
        this.mTextPaint.setARGB(i, i2, i3, i4);
        this.mTextPaint.setTextSize(f3);
        this.mTextPaint.setColor(ColorAlertText);
        canvas.drawText(str, f, f2, this.mTextPaint);
    }

    public void DrawTextCount(Canvas canvas, int i, int i2, int i3, int i4, String str, float f, float f2, float f3) {
        this.mTextPaint.setARGB(i, i2, i3, i4);
        if (EnemyStylestyle == "Default") {
            this.mTextPaint.setTextSize(f3);
        } else {
            this.mTextPaint.setTextSize(20.0f);
        }
        canvas.drawText(str, f, f2, this.mTextPaint);
    }
    public void DrawTextTime(Canvas cvs, int a, int r, int g, int b, String txt, float posX, float posY, float size) {
        mTextPaint.setARGB(a,r, g, b);
        mTextPaint.setTextSize(size);
        String s = "" + String.format(Locale.ENGLISH,formatter.format(Calendar.getInstance().getTime()));
        cvs.drawText(/*"FPS :   "+*/s, posX/*-885*/, posY/*+940*/, mTextPaint);
    }
    public void DrawTextDistance(Canvas canvas, int i, int i2, int i3, int i4, String str, float f, float f2, float f3) {
        RectF rectF;
        float f4;
        RectF rectF2 = null;
        float f5=0f;
        this.mTextPaint.setARGB(i, i2, i3, i4);
        String str2 = Infostyle;
        if (str2 == "Default") {
            this.mTextPaint.setColor(bgdistance);
            int i5 = Size;
            int i6 = Pos;
            rectF2 = new RectF((f - 44.0f) + ((float) i5), ((f2 - 18.0f) - ((float) i6)) - ((float) i5), (f - 79.0f) - ((float) i5), (6.0f + f2) - ((float) i6));
            f5 = (float) 10;
        } else if (str2 == "Hexagon") {
            this.mTextPaint.setColor(-256);
            int i7 = Size;
            int i8 = Pos;
            rectF2 = new RectF((f - 44.0f) + ((float) i7), ((f2 - 18.0f) - ((float) i8)) - ((float) i7), (f - 79.0f) - ((float) i7), (6.0f + f2) - ((float) i8));
            f5 = (float) 2;
        } else {
            if (str2 == "Holo Blue") {
                this.mTextPaint.setColor(Color.rgb(255, 255, 255));
                int i9 = Size;
                int i10 = Pos;
                rectF = new RectF((f - 24.0f) + ((float) i9), ((f2 - 38.0f) - ((float) i10)) - ((float) i9), (f - 59.0f) - ((float) i9), (f2 - 16.0f) - ((float) i10));
            } else {
                this.mTextPaint.setColor(Color.rgb(255, 255, 255));
                int i11 = Size;
                int i12 = Pos;
                rectF = new RectF((f - 24.0f) + ((float) i11), ((f2 - 38.0f) - ((float) i12)) - ((float) i11), (f - 59.0f) - ((float) i11), (f2 - 16.0f) - ((float) i12));
            }
            float f6 = (float) 2;
            canvas.drawRoundRect(rectF, f6, f6, this.mTextPaint);
            this.mTextPaint.setColor(textdistance);
            this.mTextPaint.setTextSize((float) (Size + 15));
            f4 = f - 42.0f;
            f2 -= 20.0f;
            canvas.drawText(str, f4, f2 - ((float) Pos), this.mTextPaint);
        }
        canvas.drawRoundRect(rectF2, f5, f5, this.mTextPaint);
        this.mTextPaint.setColor(textdistance);
        this.mTextPaint.setTextSize((float) (Size + 15));
        f4 = f - 62.0f;
        canvas.drawText(str, f4, f2 - ((float) Pos), this.mTextPaint);
    }

    public void DrawTextName(Canvas canvas, int i, int i2, int i3, int i4, String str, float f, float f2, float f3) {
        int i5;
        this.mTextPaint.setARGB(i, i2, i3, i4);
        this.mTextPaint.setTextSize(f3);
        if (SystemClock.uptimeMillis() - this.mFPSTime > 1000) {
            this.mFPSTime = SystemClock.uptimeMillis();
            this.mFPS = this.mFPSCounter;
            i5 = 0;
        } else {
            i5 = this.mFPSCounter + 1;
        }
        this.mFPSCounter = i5;
        canvas.drawText("Fps :   " + ("" + this.mFPS), f - 885.0f, f2 + 940.0f, this.mTextPaint);
    }

    public void DrawNation(Canvas cvs, int a, int r, int g, int b, String nametxt, float posX, float posY, float size) {
        String[] namesp = nametxt.split(":");
        char[] nameint = new char[namesp.length];
        for (int i = 0; i < namesp.length; i++)
            nameint[i] = (char) Integer.parseInt(namesp[i]);
        String txt = new String(nameint);
        int temm=0;
        if(txt.toLowerCase().equals("ad"))temm=0;
        else if(txt.toLowerCase().equals("ae"))temm=1;
        else if(txt.toLowerCase().equals("af"))temm=2;
        else if(txt.toLowerCase().equals("ag"))temm=3;
        else if(txt.toLowerCase().equals("ai"))temm=4;
        else if(txt.toLowerCase().equals("al"))temm=5;
        else if(txt.toLowerCase().equals("am"))temm=6;
        else if(txt.toLowerCase().equals("ao"))temm=7;
        else if(txt.toLowerCase().equals("aq"))temm=8;
        else if(txt.toLowerCase().equals("ar"))temm=9;
        else if(txt.toLowerCase().equals("as"))temm=10;
        else if(txt.toLowerCase().equals("at"))temm=11;
        else if(txt.toLowerCase().equals("au"))temm=12;
        else if(txt.toLowerCase().equals("aw"))temm=13;
        else if(txt.toLowerCase().equals("ax"))temm=14;
        else if(txt.toLowerCase().equals("az"))temm=15;else if(txt.toLowerCase().equals("ba"))temm=16;else if(txt.toLowerCase().equals("bb"))temm=17;else if(txt.toLowerCase().equals("bd"))temm=18;else if(txt.toLowerCase().equals("be"))temm=19;else if(txt.toLowerCase().equals("bf"))temm=20;else if(txt.toLowerCase().equals("bg"))temm=21;else if(txt.toLowerCase().equals("bh"))temm=22;else if(txt.toLowerCase().equals("bi"))temm=23;else if(txt.toLowerCase().equals("bj"))temm=24;else if(txt.toLowerCase().equals("bl"))temm=25;else if(txt.toLowerCase().equals("bm"))temm=26;else if(txt.toLowerCase().equals("bn"))temm=27;else if(txt.toLowerCase().equals("bo"))temm=28;else if(txt.toLowerCase().equals("bq"))temm=29;else if(txt.toLowerCase().equals("br"))temm=30;else if(txt.toLowerCase().equals("bs"))temm=31;else if(txt.toLowerCase().equals("bt"))temm=32;else if(txt.toLowerCase().equals("bv"))temm=33;else if(txt.toLowerCase().equals("bw"))temm=34;else if(txt.toLowerCase().equals("by"))temm=35;else if(txt.toLowerCase().equals("bz"))temm=36;else if(txt.toLowerCase().equals("ca"))temm=37;else if(txt.toLowerCase().equals("cc"))temm=38;else if(txt.toLowerCase().equals("cd"))temm=39;else if(txt.toLowerCase().equals("cf"))temm=40;else if(txt.toLowerCase().equals("cg"))temm=41;else if(txt.toLowerCase().equals("ch"))temm=42;else if(txt.toLowerCase().equals("ci"))temm=43;else if(txt.toLowerCase().equals("ck"))temm=44;else if(txt.toLowerCase().equals("cl"))temm=45;else if(txt.toLowerCase().equals("cm"))temm=46;else if(txt.toLowerCase().equals("cn"))temm=47;else if(txt.toLowerCase().equals("co"))temm=48;else if(txt.toLowerCase().equals("cr"))temm=49;else if(txt.toLowerCase().equals("cu"))temm=50;else if(txt.toLowerCase().equals("cv"))temm=51;else if(txt.toLowerCase().equals("cw"))temm=52;else if(txt.toLowerCase().equals("cx"))temm=53;else if(txt.toLowerCase().equals("cy"))temm=54;else if(txt.toLowerCase().equals("cz"))temm=55;else if(txt.toLowerCase().equals("de"))temm=56;else if(txt.toLowerCase().equals("dj"))temm=57;else if(txt.toLowerCase().equals("dk"))temm=58;else if(txt.toLowerCase().equals("dm"))temm=59;else if(txt.toLowerCase().equals("do"))temm=60;else if(txt.toLowerCase().equals("dz"))temm=61;else if(txt.toLowerCase().equals("ec"))temm=62;else if(txt.toLowerCase().equals("ee"))temm=63;else if(txt.toLowerCase().equals("eg"))temm=64;else if(txt.toLowerCase().equals("eh"))temm=65;else if(txt.toLowerCase().equals("er"))temm=66;else if(txt.toLowerCase().equals("es"))temm=67;else if(txt.toLowerCase().equals("et"))temm=68;else if(txt.toLowerCase().equals("fi"))temm=69;else if(txt.toLowerCase().equals("fj"))temm=70;else if(txt.toLowerCase().equals("fk"))temm=71;else if(txt.toLowerCase().equals("fm"))temm=72;else if(txt.toLowerCase().equals("fo"))temm=73;else if(txt.toLowerCase().equals("fr"))temm=74;else if(txt.toLowerCase().equals("ga"))temm=75;else if(txt.toLowerCase().equals("gb"))temm=76;else if(txt.toLowerCase().equals("gd"))temm=77;else if(txt.toLowerCase().equals("ge"))temm=78;else if(txt.toLowerCase().equals("gf"))temm=79;else if(txt.toLowerCase().equals("gg"))temm=80;else if(txt.toLowerCase().equals("gh"))temm=81;else if(txt.toLowerCase().equals("gi"))temm=82;else if(txt.toLowerCase().equals("gl"))temm=83;else if(txt.toLowerCase().equals("gm"))temm=84;else if(txt.toLowerCase().equals("gn"))temm=85;else if(txt.toLowerCase().equals("gp"))temm=86;else if(txt.toLowerCase().equals("gq"))temm=87;else if(txt.toLowerCase().equals("gr"))temm=88;else if(txt.toLowerCase().equals("gs"))temm=89;else if(txt.toLowerCase().equals("gt"))temm=90;else if(txt.toLowerCase().equals("gu"))temm=91;else if(txt.toLowerCase().equals("gw"))temm=92;else if(txt.toLowerCase().equals("gy"))temm=93;else if(txt.toLowerCase().equals("hk"))temm=94;else if(txt.toLowerCase().equals("hm"))temm=95;else if(txt.toLowerCase().equals("hn"))temm=96;else if(txt.toLowerCase().equals("hr"))temm=97;else if(txt.toLowerCase().equals("ht"))temm=98;else if(txt.toLowerCase().equals("hu"))temm=99;else if(txt.toLowerCase().equals("id"))temm=100;else if(txt.toLowerCase().equals("ie"))temm=101;else if(txt.toLowerCase().equals("il"))temm=102;else if(txt.toLowerCase().equals("im"))temm=103;else if(txt.toLowerCase().contains("in"))temm=104;else if(txt.toLowerCase().equals("io"))temm=105;else if(txt.toLowerCase().equals("iq"))temm=106;else if(txt.toLowerCase().equals("ir"))temm=107;else if(txt.toLowerCase().equals("is"))temm=108;else if(txt.toLowerCase().equals("it"))temm=109;else if(txt.toLowerCase().equals("je"))temm=110;else if(txt.toLowerCase().equals("jm"))temm=111;else if(txt.toLowerCase().equals("jo"))temm=112;else if(txt.toLowerCase().equals("jp"))temm=113;else if(txt.toLowerCase().equals("ke"))temm=114;else if(txt.toLowerCase().equals("kg"))temm=115;else if(txt.toLowerCase().equals("kh"))temm=116;else if(txt.toLowerCase().equals("ki"))temm=117;else if(txt.toLowerCase().equals("km"))temm=118;else if(txt.toLowerCase().equals("kn"))temm=119;else if(txt.toLowerCase().equals("kp"))temm=120;else if(txt.toLowerCase().equals("kr"))temm=121;else if(txt.toLowerCase().equals("kw"))temm=122;else if(txt.toLowerCase().equals("ky"))temm=123;else if(txt.toLowerCase().equals("kz"))temm=124;else if(txt.toLowerCase().equals("la"))temm=125;else if(txt.toLowerCase().equals("lb"))temm=126;else if(txt.toLowerCase().equals("lc"))temm=127;else if(txt.toLowerCase().equals("li"))temm=128;else if(txt.toLowerCase().equals("lk"))temm=129;else if(txt.toLowerCase().equals("lr"))temm=130;else if(txt.toLowerCase().equals("ls"))temm=131;else if(txt.toLowerCase().equals("lt"))temm=132;else if(txt.toLowerCase().equals("lu"))temm=133;else if(txt.toLowerCase().equals("lv"))temm=134;else if(txt.toLowerCase().equals("ly"))temm=135;else if(txt.toLowerCase().equals("ma"))temm=136;else if(txt.toLowerCase().equals("mc"))temm=137;else if(txt.toLowerCase().equals("md"))temm=138;else if(txt.toLowerCase().equals("me"))temm=139;else if(txt.toLowerCase().equals("mf"))temm=140;else if(txt.toLowerCase().equals("mg"))temm=141;else if(txt.toLowerCase().equals("mh"))temm=142;else if(txt.toLowerCase().equals("mk"))temm=143;else if(txt.toLowerCase().equals("ml"))temm=144;else if(txt.toLowerCase().equals("mm"))temm=145;else if(txt.toLowerCase().equals("mn"))temm=146;else if(txt.toLowerCase().equals("mo"))temm=147;else if(txt.toLowerCase().equals("mp"))temm=148;else if(txt.toLowerCase().equals("mq"))temm=149;else if(txt.toLowerCase().equals("mr"))temm=150;else if(txt.toLowerCase().equals("ms"))temm=151;else if(txt.toLowerCase().equals("mt"))temm=152;else if(txt.toLowerCase().equals("mu"))temm=153;else if(txt.toLowerCase().equals("mv"))temm=154;else if(txt.toLowerCase().equals("mw"))temm=155;else if(txt.toLowerCase().equals("mx"))temm=156;else if(txt.toLowerCase().equals("my"))temm=157;else if(txt.toLowerCase().equals("mz"))temm=158;else if(txt.toLowerCase().equals("na"))temm=159;else if(txt.toLowerCase().equals("nc"))temm=160;else if(txt.toLowerCase().equals("ne"))temm=161;else if(txt.toLowerCase().equals("nf"))temm=162;else if(txt.toLowerCase().equals("ng"))temm=163;else if(txt.toLowerCase().equals("ni"))temm=164;else if(txt.toLowerCase().equals("nl"))temm=165;else if(txt.toLowerCase().equals("no"))temm=166;else if(txt.toLowerCase().equals("np"))temm=167;else if(txt.toLowerCase().equals("nr"))temm=168;else if(txt.toLowerCase().equals("nu"))temm=169;else if(txt.toLowerCase().equals("nz"))temm=170;else if(txt.toLowerCase().equals("om"))temm=171;else if(txt.toLowerCase().equals("pa"))temm=172;else if(txt.toLowerCase().equals("pe"))temm=173;else if(txt.toLowerCase().equals("pf"))temm=174;else if(txt.toLowerCase().equals("pg"))temm=175;else if(txt.toLowerCase().equals("ph"))temm=176;else if(txt.toLowerCase().equals("pk"))temm=177;else if(txt.toLowerCase().equals("pl"))temm=178;else if(txt.toLowerCase().equals("pm"))temm=179;else if(txt.toLowerCase().equals("pn"))temm=180;else if(txt.toLowerCase().equals("pr"))temm=181;else if(txt.toLowerCase().equals("ps"))temm=182;else if(txt.toLowerCase().equals("pt"))temm=183;else if(txt.toLowerCase().equals("pw"))temm=184;else if(txt.toLowerCase().equals("py"))temm=185;else if(txt.toLowerCase().equals("qa"))temm=186;else if(txt.toLowerCase().equals("re"))temm=187;else if(txt.toLowerCase().equals("ro"))temm=188;else if(txt.toLowerCase().equals("rs"))temm=189;else if(txt.toLowerCase().equals("ru"))temm=190;else if(txt.toLowerCase().equals("rw"))temm=191;else if(txt.toLowerCase().equals("sa"))temm=192;else if(txt.toLowerCase().equals("sb"))temm=193;else if(txt.toLowerCase().equals("sc"))temm=194;else if(txt.toLowerCase().equals("sd"))temm=195;else if(txt.toLowerCase().equals("se"))temm=196;else if(txt.toLowerCase().equals("sg"))temm=197;else if(txt.toLowerCase().equals("sh"))temm=198;else if(txt.toLowerCase().equals("si"))temm=199;else if(txt.toLowerCase().equals("sj"))temm=200;else if(txt.toLowerCase().equals("sk"))temm=201;else if(txt.toLowerCase().equals("sl"))temm=202;else if(txt.toLowerCase().equals("sm"))temm=203;else if(txt.toLowerCase().equals("sn"))temm=204;else if(txt.toLowerCase().equals("so"))temm=205;else if(txt.toLowerCase().equals("sr"))temm=206;else if(txt.toLowerCase().equals("ss"))temm=207;else if(txt.toLowerCase().equals("st"))temm=208;else if(txt.toLowerCase().equals("sv"))temm=209;else if(txt.toLowerCase().equals("sx"))temm=210;else if(txt.toLowerCase().equals("sy"))temm=211;else if(txt.toLowerCase().equals("sz"))temm=212;else if(txt.toLowerCase().equals("tc"))temm=213;else if(txt.toLowerCase().equals("td"))temm=214;else if(txt.toLowerCase().equals("tf"))temm=215;else if(txt.toLowerCase().equals("tg"))temm=216;else if(txt.toLowerCase().equals("th"))temm=217;else if(txt.toLowerCase().equals("tj"))temm=218;else if(txt.toLowerCase().equals("tk"))temm=219;else if(txt.toLowerCase().equals("tl"))temm=220;else if(txt.toLowerCase().equals("tm"))temm=221;else if(txt.toLowerCase().equals("tn"))temm=222;else if(txt.toLowerCase().equals("to"))temm=223;else if(txt.toLowerCase().equals("tr"))temm=224;else if(txt.toLowerCase().equals("tt"))temm=225;else if(txt.toLowerCase().equals("tv"))temm=226;else if(txt.toLowerCase().equals("tw"))temm=227;else if(txt.toLowerCase().equals("tz"))temm=228;else if(txt.toLowerCase().equals("ua"))temm=229;else if(txt.toLowerCase().equals("ug"))temm=230;else if(txt.toLowerCase().equals("um"))temm=231;else if(txt.toLowerCase().equals("us"))temm=232;else if(txt.toLowerCase().equals("uy"))temm=233;else if(txt.toLowerCase().equals("uz"))temm=234;else if(txt.toLowerCase().equals("va"))temm=235;else if(txt.toLowerCase().equals("vc"))temm=236;else if(txt.toLowerCase().equals("ve"))temm=237;else if(txt.toLowerCase().equals("vg"))temm=238;else if(txt.toLowerCase().equals("vi"))temm=239;else if(txt.toLowerCase().equals("vn"))temm=240;else if(txt.toLowerCase().equals("vu"))temm=241;else if(txt.toLowerCase().equals("wf"))temm=242;else if(txt.toLowerCase().equals("ws"))temm=243;else if(txt.toLowerCase().equals("ye"))temm=244;else if(txt.toLowerCase().equals("yt"))temm=245;else if(txt.toLowerCase().equals("za"))temm=246;else if(txt.toLowerCase().equals("zm"))temm=247;else if(txt.toLowerCase().equals("zw"))temm=248;

        // Calling wait() will block this thread until another thread
        // calls notify() on the object.

        cvs.drawBitmap(FLAG[temm], posX-Size, posY-Size, (Paint) null);
        //mTextPaint.setARGB(a,r, g, b);
        // mTextPaint.setTextSize(size);
        //cvs.drawText(realname, posX, posY+Pos, mTextPaint);

    }

    public void DrawNation2(Canvas cvs, int a, int r, int g, int b, String nametxt, float posX, float posY, float size) {
        String[] namesp = nametxt.split(":");
        char[] nameint = new char[namesp.length];
        for (int i = 0; i < namesp.length; i++)
            nameint[i] = (char) Integer.parseInt(namesp[i]);
        String txt = new String(nameint);
        int temm=0;
        if(txt.toLowerCase().equals("ad"))temm=0;
        else if(txt.toLowerCase().equals("ae"))temm=1;
        else if(txt.toLowerCase().equals("af"))temm=2;
        else if(txt.toLowerCase().equals("ag"))temm=3;
        else if(txt.toLowerCase().equals("ai"))temm=4;
        else if(txt.toLowerCase().equals("al"))temm=5;
        else if(txt.toLowerCase().equals("am"))temm=6;
        else if(txt.toLowerCase().equals("ao"))temm=7;
        else if(txt.toLowerCase().equals("aq"))temm=8;
        else if(txt.toLowerCase().equals("ar"))temm=9;
        else if(txt.toLowerCase().equals("as"))temm=10;
        else if(txt.toLowerCase().equals("at"))temm=11;
        else if(txt.toLowerCase().equals("au"))temm=12;
        else if(txt.toLowerCase().equals("aw"))temm=13;
        else if(txt.toLowerCase().equals("ax"))temm=14;
        else if(txt.toLowerCase().equals("az"))temm=15;else if(txt.toLowerCase().equals("ba"))temm=16;else if(txt.toLowerCase().equals("bb"))temm=17;else if(txt.toLowerCase().equals("bd"))temm=18;else if(txt.toLowerCase().equals("be"))temm=19;else if(txt.toLowerCase().equals("bf"))temm=20;else if(txt.toLowerCase().equals("bg"))temm=21;else if(txt.toLowerCase().equals("bh"))temm=22;else if(txt.toLowerCase().equals("bi"))temm=23;else if(txt.toLowerCase().equals("bj"))temm=24;else if(txt.toLowerCase().equals("bl"))temm=25;else if(txt.toLowerCase().equals("bm"))temm=26;else if(txt.toLowerCase().equals("bn"))temm=27;else if(txt.toLowerCase().equals("bo"))temm=28;else if(txt.toLowerCase().equals("bq"))temm=29;else if(txt.toLowerCase().equals("br"))temm=30;else if(txt.toLowerCase().equals("bs"))temm=31;else if(txt.toLowerCase().equals("bt"))temm=32;else if(txt.toLowerCase().equals("bv"))temm=33;else if(txt.toLowerCase().equals("bw"))temm=34;else if(txt.toLowerCase().equals("by"))temm=35;else if(txt.toLowerCase().equals("bz"))temm=36;else if(txt.toLowerCase().equals("ca"))temm=37;else if(txt.toLowerCase().equals("cc"))temm=38;else if(txt.toLowerCase().equals("cd"))temm=39;else if(txt.toLowerCase().equals("cf"))temm=40;else if(txt.toLowerCase().equals("cg"))temm=41;else if(txt.toLowerCase().equals("ch"))temm=42;else if(txt.toLowerCase().equals("ci"))temm=43;else if(txt.toLowerCase().equals("ck"))temm=44;else if(txt.toLowerCase().equals("cl"))temm=45;else if(txt.toLowerCase().equals("cm"))temm=46;else if(txt.toLowerCase().equals("cn"))temm=47;else if(txt.toLowerCase().equals("co"))temm=48;else if(txt.toLowerCase().equals("cr"))temm=49;else if(txt.toLowerCase().equals("cu"))temm=50;else if(txt.toLowerCase().equals("cv"))temm=51;else if(txt.toLowerCase().equals("cw"))temm=52;else if(txt.toLowerCase().equals("cx"))temm=53;else if(txt.toLowerCase().equals("cy"))temm=54;else if(txt.toLowerCase().equals("cz"))temm=55;else if(txt.toLowerCase().equals("de"))temm=56;else if(txt.toLowerCase().equals("dj"))temm=57;else if(txt.toLowerCase().equals("dk"))temm=58;else if(txt.toLowerCase().equals("dm"))temm=59;else if(txt.toLowerCase().equals("do"))temm=60;else if(txt.toLowerCase().equals("dz"))temm=61;else if(txt.toLowerCase().equals("ec"))temm=62;else if(txt.toLowerCase().equals("ee"))temm=63;else if(txt.toLowerCase().equals("eg"))temm=64;else if(txt.toLowerCase().equals("eh"))temm=65;else if(txt.toLowerCase().equals("er"))temm=66;else if(txt.toLowerCase().equals("es"))temm=67;else if(txt.toLowerCase().equals("et"))temm=68;else if(txt.toLowerCase().equals("fi"))temm=69;else if(txt.toLowerCase().equals("fj"))temm=70;else if(txt.toLowerCase().equals("fk"))temm=71;else if(txt.toLowerCase().equals("fm"))temm=72;else if(txt.toLowerCase().equals("fo"))temm=73;else if(txt.toLowerCase().equals("fr"))temm=74;else if(txt.toLowerCase().equals("ga"))temm=75;else if(txt.toLowerCase().equals("gb"))temm=76;else if(txt.toLowerCase().equals("gd"))temm=77;else if(txt.toLowerCase().equals("ge"))temm=78;else if(txt.toLowerCase().equals("gf"))temm=79;else if(txt.toLowerCase().equals("gg"))temm=80;else if(txt.toLowerCase().equals("gh"))temm=81;else if(txt.toLowerCase().equals("gi"))temm=82;else if(txt.toLowerCase().equals("gl"))temm=83;else if(txt.toLowerCase().equals("gm"))temm=84;else if(txt.toLowerCase().equals("gn"))temm=85;else if(txt.toLowerCase().equals("gp"))temm=86;else if(txt.toLowerCase().equals("gq"))temm=87;else if(txt.toLowerCase().equals("gr"))temm=88;else if(txt.toLowerCase().equals("gs"))temm=89;else if(txt.toLowerCase().equals("gt"))temm=90;else if(txt.toLowerCase().equals("gu"))temm=91;else if(txt.toLowerCase().equals("gw"))temm=92;else if(txt.toLowerCase().equals("gy"))temm=93;else if(txt.toLowerCase().equals("hk"))temm=94;else if(txt.toLowerCase().equals("hm"))temm=95;else if(txt.toLowerCase().equals("hn"))temm=96;else if(txt.toLowerCase().equals("hr"))temm=97;else if(txt.toLowerCase().equals("ht"))temm=98;else if(txt.toLowerCase().equals("hu"))temm=99;else if(txt.toLowerCase().equals("id"))temm=100;else if(txt.toLowerCase().equals("ie"))temm=101;else if(txt.toLowerCase().equals("il"))temm=102;else if(txt.toLowerCase().equals("im"))temm=103;else if(txt.toLowerCase().contains("in"))temm=104;else if(txt.toLowerCase().equals("io"))temm=105;else if(txt.toLowerCase().equals("iq"))temm=106;else if(txt.toLowerCase().equals("ir"))temm=107;else if(txt.toLowerCase().equals("is"))temm=108;else if(txt.toLowerCase().equals("it"))temm=109;else if(txt.toLowerCase().equals("je"))temm=110;else if(txt.toLowerCase().equals("jm"))temm=111;else if(txt.toLowerCase().equals("jo"))temm=112;else if(txt.toLowerCase().equals("jp"))temm=113;else if(txt.toLowerCase().equals("ke"))temm=114;else if(txt.toLowerCase().equals("kg"))temm=115;else if(txt.toLowerCase().equals("kh"))temm=116;else if(txt.toLowerCase().equals("ki"))temm=117;else if(txt.toLowerCase().equals("km"))temm=118;else if(txt.toLowerCase().equals("kn"))temm=119;else if(txt.toLowerCase().equals("kp"))temm=120;else if(txt.toLowerCase().equals("kr"))temm=121;else if(txt.toLowerCase().equals("kw"))temm=122;else if(txt.toLowerCase().equals("ky"))temm=123;else if(txt.toLowerCase().equals("kz"))temm=124;else if(txt.toLowerCase().equals("la"))temm=125;else if(txt.toLowerCase().equals("lb"))temm=126;else if(txt.toLowerCase().equals("lc"))temm=127;else if(txt.toLowerCase().equals("li"))temm=128;else if(txt.toLowerCase().equals("lk"))temm=129;else if(txt.toLowerCase().equals("lr"))temm=130;else if(txt.toLowerCase().equals("ls"))temm=131;else if(txt.toLowerCase().equals("lt"))temm=132;else if(txt.toLowerCase().equals("lu"))temm=133;else if(txt.toLowerCase().equals("lv"))temm=134;else if(txt.toLowerCase().equals("ly"))temm=135;else if(txt.toLowerCase().equals("ma"))temm=136;else if(txt.toLowerCase().equals("mc"))temm=137;else if(txt.toLowerCase().equals("md"))temm=138;else if(txt.toLowerCase().equals("me"))temm=139;else if(txt.toLowerCase().equals("mf"))temm=140;else if(txt.toLowerCase().equals("mg"))temm=141;else if(txt.toLowerCase().equals("mh"))temm=142;else if(txt.toLowerCase().equals("mk"))temm=143;else if(txt.toLowerCase().equals("ml"))temm=144;else if(txt.toLowerCase().equals("mm"))temm=145;else if(txt.toLowerCase().equals("mn"))temm=146;else if(txt.toLowerCase().equals("mo"))temm=147;else if(txt.toLowerCase().equals("mp"))temm=148;else if(txt.toLowerCase().equals("mq"))temm=149;else if(txt.toLowerCase().equals("mr"))temm=150;else if(txt.toLowerCase().equals("ms"))temm=151;else if(txt.toLowerCase().equals("mt"))temm=152;else if(txt.toLowerCase().equals("mu"))temm=153;else if(txt.toLowerCase().equals("mv"))temm=154;else if(txt.toLowerCase().equals("mw"))temm=155;else if(txt.toLowerCase().equals("mx"))temm=156;else if(txt.toLowerCase().equals("my"))temm=157;else if(txt.toLowerCase().equals("mz"))temm=158;else if(txt.toLowerCase().equals("na"))temm=159;else if(txt.toLowerCase().equals("nc"))temm=160;else if(txt.toLowerCase().equals("ne"))temm=161;else if(txt.toLowerCase().equals("nf"))temm=162;else if(txt.toLowerCase().equals("ng"))temm=163;else if(txt.toLowerCase().equals("ni"))temm=164;else if(txt.toLowerCase().equals("nl"))temm=165;else if(txt.toLowerCase().equals("no"))temm=166;else if(txt.toLowerCase().equals("np"))temm=167;else if(txt.toLowerCase().equals("nr"))temm=168;else if(txt.toLowerCase().equals("nu"))temm=169;else if(txt.toLowerCase().equals("nz"))temm=170;else if(txt.toLowerCase().equals("om"))temm=171;else if(txt.toLowerCase().equals("pa"))temm=172;else if(txt.toLowerCase().equals("pe"))temm=173;else if(txt.toLowerCase().equals("pf"))temm=174;else if(txt.toLowerCase().equals("pg"))temm=175;else if(txt.toLowerCase().equals("ph"))temm=176;else if(txt.toLowerCase().equals("pk"))temm=177;else if(txt.toLowerCase().equals("pl"))temm=178;else if(txt.toLowerCase().equals("pm"))temm=179;else if(txt.toLowerCase().equals("pn"))temm=180;else if(txt.toLowerCase().equals("pr"))temm=181;else if(txt.toLowerCase().equals("ps"))temm=182;else if(txt.toLowerCase().equals("pt"))temm=183;else if(txt.toLowerCase().equals("pw"))temm=184;else if(txt.toLowerCase().equals("py"))temm=185;else if(txt.toLowerCase().equals("qa"))temm=186;else if(txt.toLowerCase().equals("re"))temm=187;else if(txt.toLowerCase().equals("ro"))temm=188;else if(txt.toLowerCase().equals("rs"))temm=189;else if(txt.toLowerCase().equals("ru"))temm=190;else if(txt.toLowerCase().equals("rw"))temm=191;else if(txt.toLowerCase().equals("sa"))temm=192;else if(txt.toLowerCase().equals("sb"))temm=193;else if(txt.toLowerCase().equals("sc"))temm=194;else if(txt.toLowerCase().equals("sd"))temm=195;else if(txt.toLowerCase().equals("se"))temm=196;else if(txt.toLowerCase().equals("sg"))temm=197;else if(txt.toLowerCase().equals("sh"))temm=198;else if(txt.toLowerCase().equals("si"))temm=199;else if(txt.toLowerCase().equals("sj"))temm=200;else if(txt.toLowerCase().equals("sk"))temm=201;else if(txt.toLowerCase().equals("sl"))temm=202;else if(txt.toLowerCase().equals("sm"))temm=203;else if(txt.toLowerCase().equals("sn"))temm=204;else if(txt.toLowerCase().equals("so"))temm=205;else if(txt.toLowerCase().equals("sr"))temm=206;else if(txt.toLowerCase().equals("ss"))temm=207;else if(txt.toLowerCase().equals("st"))temm=208;else if(txt.toLowerCase().equals("sv"))temm=209;else if(txt.toLowerCase().equals("sx"))temm=210;else if(txt.toLowerCase().equals("sy"))temm=211;else if(txt.toLowerCase().equals("sz"))temm=212;else if(txt.toLowerCase().equals("tc"))temm=213;else if(txt.toLowerCase().equals("td"))temm=214;else if(txt.toLowerCase().equals("tf"))temm=215;else if(txt.toLowerCase().equals("tg"))temm=216;else if(txt.toLowerCase().equals("th"))temm=217;else if(txt.toLowerCase().equals("tj"))temm=218;else if(txt.toLowerCase().equals("tk"))temm=219;else if(txt.toLowerCase().equals("tl"))temm=220;else if(txt.toLowerCase().equals("tm"))temm=221;else if(txt.toLowerCase().equals("tn"))temm=222;else if(txt.toLowerCase().equals("to"))temm=223;else if(txt.toLowerCase().equals("tr"))temm=224;else if(txt.toLowerCase().equals("tt"))temm=225;else if(txt.toLowerCase().equals("tv"))temm=226;else if(txt.toLowerCase().equals("tw"))temm=227;else if(txt.toLowerCase().equals("tz"))temm=228;else if(txt.toLowerCase().equals("ua"))temm=229;else if(txt.toLowerCase().equals("ug"))temm=230;else if(txt.toLowerCase().equals("um"))temm=231;else if(txt.toLowerCase().equals("us"))temm=232;else if(txt.toLowerCase().equals("uy"))temm=233;else if(txt.toLowerCase().equals("uz"))temm=234;else if(txt.toLowerCase().equals("va"))temm=235;else if(txt.toLowerCase().equals("vc"))temm=236;else if(txt.toLowerCase().equals("ve"))temm=237;else if(txt.toLowerCase().equals("vg"))temm=238;else if(txt.toLowerCase().equals("vi"))temm=239;else if(txt.toLowerCase().equals("vn"))temm=240;else if(txt.toLowerCase().equals("vu"))temm=241;else if(txt.toLowerCase().equals("wf"))temm=242;else if(txt.toLowerCase().equals("ws"))temm=243;else if(txt.toLowerCase().equals("ye"))temm=244;else if(txt.toLowerCase().equals("yt"))temm=245;else if(txt.toLowerCase().equals("za"))temm=246;else if(txt.toLowerCase().equals("zm"))temm=247;else if(txt.toLowerCase().equals("zw"))temm=248;

        // Calling wait() will block this thread until another thread
        // calls notify() on the object.

        cvs.drawBitmap(FLAG2[temm], posX-Size, posY-Size, (Paint) null);
        //mTextPaint.setARGB(a,r, g, b);
        // mTextPaint.setTextSize(size);
        //cvs.drawText(realname, posX, posY+Pos, mTextPaint);

    }


    public void DrawTextknok(Canvas canvas, int i, int i2, int i3, int i4, String str, float f, float f2, float f3) {
        this.mTextPaint.setARGB(i, i2, i3, i4);
        this.mTextPaint.setTextSize(f3);
        String str2 = knok;
        if (str2 != "Default") {
            if (str2 == "Material") {
                canvas.drawBitmap(this.INFOSTYLE[7], f - 22.0f, f2 - 80.0f, (Paint) null);
                return;
            }
            canvas.drawBitmap(this.INFOSTYLE[7], f - 22.0f, f2 - 80.0f, (Paint) null);
        }
        canvas.drawText("Knocked", f, f2, this.mTextPaint);
    }

    public void DrawVehicles(Canvas canvas, String str, float f, float f2, float f3, float f4) {
        StringBuilder sb=null;
        String str2;
        int vehicleNum = getVehicleNum(str);
        String vehicleName = getVehicleName(str);
        this.mTextPaint2.setColor(Color.YELLOW);
        this.mTextPaint2.setTextSize((float) (itemSize + 15));
        if (vehicleNum == -1) {
         //   canvas.drawBitmap(this.VEH[0], f2 - 10.0f, (f3 - 80.0f) - ((float) itemPosition), (Paint) null);
            return;
        }
        if (Overlay.getConfig("Material")) {
            canvas.drawBitmap(this.VEH[vehicleNum], f2 - 10.0f, (f3 - 80.0f) - ((float) itemPosition), (Paint) null);
            return;
        }else if (Overlay.getConfig("Dual")) {
            canvas.drawBitmap(this.VEH[vehicleNum], f2 - 10.0f, (f3 - 80.0f) - ((float) itemPosition), (Paint) null);
            sb = new StringBuilder();
        } else if (Overlay.getConfig("MaterialDistance")) {
            canvas.drawBitmap(this.VEH[vehicleNum], f2 - 10.0f, (f3 - 80.0f) - ((float) itemPosition), (Paint) null);
            str2 = "(" + Math.round(f) + "m)";
            canvas.drawText(str2, f2, f3 - ((float) itemPosition), this.mTextPaint2);
            return;
        } else {
            sb = new StringBuilder();
        }
        sb.append(vehicleName);
        sb.append(" (");
        sb.append(Math.round(f));
        sb.append("m)");
        str2 = sb.toString();
        canvas.drawText(str2, f2, f3 - ((float) itemPosition), this.mTextPaint2);
    }

    public void DrawWeapon(Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3) {
        StringBuilder sb;
        String sb2;
        float f4;
        float f5;
        float f6=0f;
        this.mTextPaint.setARGB(i, i2, i3, i4);
        String weapon = getWeapon(i5);
        if (weapon != null) {
            String str = Infostyle;
            if (str == "Default") {
                this.mTextPaint.setColor(bgEnWeapon);
                int i7 = Size;
                int i8 = Pos;
                float f7 = (float) 10;
                canvas.drawRoundRect(new RectF((f - 100.0f) - ((float) i7), ((f2 - 8.0f) - ((float) i8)) - ((float) i7), f + 100.0f + ((float) i7), (f2 + 18.0f) - ((float) i8)), f7, f7, this.mTextPaint);
                this.mTextPaint.setTextSize((float) (Size + 15));
                this.mTextPaint.setColor(textenweapon);
                sb2 = weapon + " > " + i6;
                f4 = f - 40.0f;
                f6 = 12.0f;
            } else if (str == "Hexagon") {
                canvas.drawBitmap(this.INFOSTYLE[2], f - 100.0f, (f2 - 10.0f) - ((float) Pos), (Paint) null);
                this.mTextPaint.setTextSize((float) (Size + 15));
                this.mTextPaint.setColor(textenweapon);
                sb2 = weapon + " > " + i6;
                f4 = f - 42.0f;
                f6 = 6.0f;
            } else {
                if (str == "Holo Blue") {
                    this.mTextPaint.setColor(-1);
                    int i9 = Size;
                    int i10 = Pos;
                    float f8 = (float) 5;
                    canvas.drawRoundRect(new RectF((f - 50.0f) - ((float) i9), ((f2 - 28.0f) - ((float) i10)) - ((float) i9), f + 100.0f + ((float) i9), f2 - ((float) i10)), f8, f8, this.mTextPaint);
                    this.mTextPaint.setTextSize((float) (Size + 15));
                    this.mTextPaint.setColor(textenweapon);
                    sb = new StringBuilder();
                } else {
                    this.mTextPaint.setColor(-1);
                    int i11 = Size;
                    int i12 = Pos;
                    float f9 = (float) 5;
                    canvas.drawRoundRect(new RectF((f - 50.0f) - ((float) i11), ((f2 - 28.0f) - ((float) i12)) - ((float) i11), f + 100.0f + ((float) i11), f2 - ((float) i12)), f9, f9, this.mTextPaint);
                    this.mTextPaint.setTextSize((float) (Size + 15));
                    this.mTextPaint.setColor(textenweapon);
                    sb = new StringBuilder();
                }
                sb.append(weapon);
                sb.append(" > ");
                sb.append(i6);
                sb2 = sb.toString();
                f4 = f + 36.0f;
                f5 = f2 - 15.0f;
                canvas.drawText(sb2, f4, f5 - ((float) Pos), this.mTextPaint);
            }
            f5 = f2 + f6;
            canvas.drawText(sb2, f4, f5 - ((float) Pos), this.mTextPaint);
        }
    }

    public void InitializePaints() {
        Paint paint = new Paint();
        this.mStrokePaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.mStrokePaint.setAntiAlias(true);
        this.mStrokePaint.setColor(Color.rgb(0, 0, 0));
        Paint paint2 = new Paint();
        this.mFilledPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.mFilledPaint.setAntiAlias(true);
        this.mFilledPaint.setColor(Color.rgb(0, 0, 0));
        Paint paint3 = new Paint();
        this.mStrokePaint2 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.mStrokePaint2.setAntiAlias(true);
        this.mStrokePaint2.setColor(Color.rgb(0, 0, 0));
        Paint paint4 = new Paint();
        this.mFilledPaint2 = paint4;
        paint4.setStyle(Paint.Style.FILL);
        this.mFilledPaint2.setAntiAlias(true);
        this.mFilledPaint2.setColor(Color.rgb(0, 0, 0));
        Paint paint5 = new Paint();
        this.mTextPaint = paint5;
        paint5.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mTextPaint.setAntiAlias(true);
        this.mTextPaint.setColor(Color.rgb(0, 0, 0));
        this.mTextPaint.setTextAlign(Paint.Align.CENTER);
        Typeface plain = ResourcesCompat.getFont(getContext(), R.font.poppinsmedium);
        Typeface normal = Typeface.create(plain,Typeface.NORMAL);
        Typeface bold = Typeface.create(plain,Typeface.BOLD);
        this.mTextPaint.setTypeface(normal);
       // this.mTextPaint.setStrokeWidth(1.1f);
        Paint paint6 = new Paint();
        this.mTextPaint2 = paint6;
        paint6.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mTextPaint2.setAntiAlias(true);
        this.mTextPaint2.setColor(Color.rgb(0, 0, 0));
        this.mTextPaint2.setTextAlign(Paint.Align.CENTER);
        this.mTextPaint2.setTypeface(bold);
     //   this.mTextPaint2.setStrokeWidth(1.1f);
        Paint paint7 = new Paint();
        this.mTextPaint3 = paint7;
        paint7.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mTextPaint3.setAntiAlias(true);
        this.mTextPaint3.setColor(Color.rgb(0, 0, 0));
        this.mTextPaint3.setTextAlign(Paint.Align.CENTER);
        this.mTextPaint3.setStrokeWidth(1.1f);
        int length = VEH_NAME.length;
        for (int i = 0; i < length; i++) {
            this.VEH[i] = BitmapFactory.decodeResource(getResources(), VEH_NAME[i]);
            Bitmap[] bitmapArr = this.VEH;
            bitmapArr[i] = scale(bitmapArr[i], 40, 40);
        }
        int length2 = infostyle.length;
        for (int i2 = 0; i2 < length2; i2++) {
            this.INFOSTYLE[i2] = BitmapFactory.decodeResource(getResources(), infostyle[i2]);
            if (i2 == 0) {
                Bitmap[] bitmapArr2 = this.INFOSTYLE;
                bitmapArr2[0] = scale2(bitmapArr2[0], 280, 40, Color.parseColor("#000000"));
            } else if (i2 == 1) {
                Bitmap[] bitmapArr3 = this.INFOSTYLE;
                bitmapArr3[1] = scale2(bitmapArr3[1], 70, 70, Color.parseColor("#ffff00"));
            } else if (i2 == 2) {
                Bitmap[] bitmapArr4 = this.INFOSTYLE;
                bitmapArr4[2] = scale2(bitmapArr4[2], 180, 30, Color.parseColor("#ffff00"));
            } else if (i2 == 3) {
                Bitmap[] bitmapArr5 = this.INFOSTYLE;
                bitmapArr5[3] = scale(bitmapArr5[3], 280, 85);
            } else if (i2 == 4) {
                Bitmap[] bitmapArr6 = this.INFOSTYLE;
                bitmapArr6[4] = scale(bitmapArr6[4], 280, 85);
            } else if (i2 == 5) {
                Bitmap[] bitmapArr7 = this.INFOSTYLE;
                bitmapArr7[5] = scale(bitmapArr7[5], 80, 80);
            } else if (i2 == 6) {
                Bitmap[] bitmapArr8 = this.INFOSTYLE;
                bitmapArr8[6] = scale(bitmapArr8[6], 80, 80);
            } else if (i2 == 7) {
                Bitmap[] bitmapArr9 = this.INFOSTYLE;
                bitmapArr9[7] = scale(bitmapArr9[7], 60, 60);
            }
        }
        int length3 = nou.length;
        for (int i3 = 0; i3 < length3; i3++) {
            this.f48no[i3] = nou[i3].intValue();
        }
        int length4 = ITEMVECTOR.length;
        for (int i4 = 0; i4 < length4; i4++) {
            this.NEWITEM[i4] = getBitmap(Overlay.ctx, 60, 60, ITEMVECTOR[i4]);
        }
        int length5 = this.OTHER.length;
        for (int i5 = 0; i5 < length5; i5++) {
            this.OTHER[i5] = BitmapFactory.decodeResource(getResources(), OTH_NAME[i5]);
            if (i5 == 4) {
                Bitmap[] bitmapArr10 = this.OTHER;
                bitmapArr10[i5] = scale(bitmapArr10[i5], 500, 400);
            } else {
                Bitmap[] bitmapArr11 = this.OTHER;
                bitmapArr11[i5] = scale(bitmapArr11[i5], 80, 80);
            }
        }
        int length6 = this.OTHER.length;
        for (int i6 = 0; i6 < length6; i6++) {
            this.OTHER2[i6] = BitmapFactory.decodeResource(getResources(), OTH_NAME[i6]);
            Bitmap[] bitmapArr12 = this.OTHER2;
            if (i6 == 4) {
                bitmapArr12[i6] = scale(bitmapArr12[i6], 500, 400);
            } else {
                bitmapArr12[i6] = scale(bitmapArr12[i6], 60, 60);
            }
        }
        final int bitmap_count_flag = FLAG.length;

        for(int i = 0 ; i < bitmap_count_flag ; i++)
        {
            FLAG[i] = BitmapFactory.decodeResource(getResources(), FLAG_NAME[i]);
            FLAG[i] = scale(FLAG[i],50,50);
        }
        final int bitmap_count_flag2 = FLAG2.length;

        for(int i = 0 ; i < bitmap_count_flag2 ; i++)
        {
            FLAG2[i] = BitmapFactory.decodeResource(getResources(), FLAG_NAME[i]);
            FLAG2[i] = scale(FLAG2[i],50,35);
        }
    }
    public static native void CSize(int i);
    public static native void CPosition(int i);

    public void DrawLine2(Canvas cvs, int a, int r, int g, int b, float lineWidth, float fromX, float fromY, float toX, float toY) {
        mStrokePaint.setColor(Color.rgb(r, g, b));
        mStrokePaint.setAlpha(a);
        mStrokePaint.setStrokeWidth(lineWidth);
        cvs.drawLine(fromX, fromY, toX, toY, mStrokePaint);
    }

    public void DrawFilledRect1(Canvas cvs, int a, int r, int g, int b, float x, float y, float width, float height) {
        mFilledPaint.setColor(Color.rgb(r, g, b));
        mFilledPaint.setAlpha(a);
        cvs.drawRect(x, y, x + width, y + height, mFilledPaint);
        /*mStrokePaint2.setStrokeWidth(1);
        mStrokePaint2.setColor(Color.argb(255,0, 0, 0));
        mStrokePaint2.setAlpha(a);
        //cvs.drawRect(x-65, y-5-Pos,  width+65,  height-3-Pos, mStrokePaint2);
        cvs.drawRect(x, y, x +Size, y +Size, mFilledPaint2);*/
    }

    public void DrawWeapon2(Canvas cvs, int a, int r, int g, int b, int id,int ammo, float posX, float posY, float size) {
        mTextPaint.setARGB(a,r, g, b);
        mTextPaint.setTextSize(size+Size);
        String wname=getWeapon(id);
        if(wname!=null)
            cvs.drawText(wname+": "+ammo, posX, posY, mTextPaint);
    }

    public void DrawText2(Canvas cvs, int a, int r, int g, int b, String txt, float posX, float posY, float size) {
        mTextPaint.setARGB(a,r, g, b);
        mTextPaint.setTextSize(size+Size);
        cvs.drawText(txt, posX, posY - Pos, mTextPaint);
    }

    protected void onDraw(Canvas canvas) {
        if (canvas != null && getVisibility() == VISIBLE) {
            ClearCanvas(canvas);
            DrawOn(this, canvas);
        }
    }

    public void run() {
        Process.setThreadPriority(10);
        while (this.mThread.isAlive() && !this.mThread.isInterrupted()) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                postInvalidate();
                Thread.sleep(Math.max(Math.min(0L, sleepTime - (System.currentTimeMillis() - currentTimeMillis)), sleepTime));
            } catch (Exception unused) {
                return;
            }
        }
    }
}