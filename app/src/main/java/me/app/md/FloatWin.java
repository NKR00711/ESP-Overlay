package me.app.md;

import static me.app.md.MainActivity.bit;
import static me.app.md.MainActivity.gameType;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import android.view.GestureDetector;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.cardview.widget.CardView;

import com.flask.colorpicker.ColorPickerView;
import com.flask.colorpicker.OnColorChangedListener;

import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;

public class FloatWin extends Service implements View.OnClickListener {
    private static final int[] ITEM_ID;
    @SuppressLint({"StaticFieldLeak"})
    private static FloatWin Instance;
    private final Integer[] Cross = {Integer.valueOf((int) R.drawable.chr_1), Integer.valueOf((int) R.drawable.chr_2), Integer.valueOf((int) R.drawable.chr_3), Integer.valueOf((int) R.drawable.chr_4), Integer.valueOf((int) R.drawable.chr_5), Integer.valueOf((int) R.drawable.chr_6), Integer.valueOf((int) R.drawable.chr_7), Integer.valueOf((int) R.drawable.chr_8), Integer.valueOf((int) R.drawable.chr_9), Integer.valueOf((int) R.drawable.chr_10), Integer.valueOf((int) R.drawable.chr10)};
    private final String[] CrossName = {"Triangle", "Dot Box", "Circle", "Dot Small", "Dot Small 2", "Dot Circle", "Dot Triangle", "Dot Triangle 2", "Dot Triangle 3", "X", "+"};
    private final String[] CrossName2 = {"", "", "", "", "", "", "", "", "", "", ""};
    private Spinner SpNamenitem;
    private final String[] alertstyle = {"Default", "Square", "Arrow"};
    private final String[] enemystatus = {"Default", "Small"};
    View espView;
    private final String[] germanFeminine = {"Default", "Acme", "Amerika", "Arbutus", "Boycott", "BubblegumSans", "Cagliostro", "Carousel", "Coiny", "College", "District", "Edo", "FrancoisOne", "Graduate", "SFArcheryBlack", "SFCollegiate"};
    private final String[] imagestyle = {"Material", "Vector"};
    private final String[] infostyle = {"Default", "Hexagon", "Holo Blue", "Holo Red"};
    CheckBox[] items = new CheckBox[200];
    private final String[] knokstyle = {"Default", "Material", "Material With Text"};
    private final String[] lineposition = {"Top", "Center"};
    View logoView;
    View logoView2;
    View logoView3;
    View logoViewCarJump;
    int mDefaultColor;
    private View mFloatingView;
    private View mFloatingView2;
    private View mFloatingView3;
    private View mFloatingView4;
    private View mFloatingView5;
    private View mFloatingView7;
    private View mFloatingView8;
    private WindowManager mWindowManager;
    private WindowManager mWindowManager2;
    private WindowManager mWindowManager3;
    private WindowManager mWindowManager4;
    private WindowManager mWindowManager5;
    private WindowManager mWindowManager7;
    private WindowManager mWindowManager8;
    private Spinner spNamen2;
    private Spinner spnamen3;
    private Spinner spnamen4;
    private Spinner spnamen5;
    private Spinner spnamen6;
    private Spinner spnamen7;
    private Spinner spnamen8;

    
    /* class for FloatWin : this.b$O0000000 */
    public class O0000000 implements View.OnClickListener {
        final  LinearLayout OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  LinearLayout f7005OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  LinearLayout f7006OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  LinearLayout f7007OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  LinearLayout f7008OooO0oO;
        final  LinearLayout OooO0oo;
        final  LinearLayout OooOO0;
        final  LinearLayout OooOO0O;
        final  LinearLayout OooOO0o;
        final  LinearLayout OooOOO;
        final  LinearLayout OooOOO0;
        final  LinearLayout OooOOOO;

        O0000000(FloatWin bVar, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, LinearLayout linearLayout11, LinearLayout linearLayout12) {
            this.f7005OooO0Oo = linearLayout;
            this.f7007OooO0o0 = linearLayout2;
            this.f7006OooO0o = linearLayout3;
            this.f7008OooO0oO = linearLayout4;
            this.OooO0oo = linearLayout5;
            this.OooO = linearLayout6;
            this.OooOO0 = linearLayout7;
            this.OooOO0O = linearLayout8;
            this.OooOO0o = linearLayout9;
            this.OooOOO0 = linearLayout10;
            this.OooOOO = linearLayout11;
            this.OooOOOO = linearLayout12;
        }

        public void onClick(View view) {
            this.f7005OooO0Oo.setVisibility(View.GONE);
            this.f7007OooO0o0.setVisibility(View.GONE);
            this.f7006OooO0o.setVisibility(View.GONE);
            this.f7008OooO0oO.setVisibility(View.GONE);
            this.OooO0oo.setVisibility(View.GONE);
            this.OooO.setVisibility(View.GONE);
            this.OooOO0.setVisibility(View.GONE);
            this.OooOO0O.setVisibility(View.GONE);
            this.OooOO0o.setVisibility(View.GONE);
            this.OooOOO0.setVisibility(View.GONE);
            this.OooOOO.setVisibility(View.VISIBLE);
            this.OooOOOO.setVisibility(View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$O0O0 */
    public class O0O0 implements View.OnClickListener {
        final  LinearLayout OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  LinearLayout f7009OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  LinearLayout f7010OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  LinearLayout f7011OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  LinearLayout f7012OooO0oO;
        final  LinearLayout OooO0oo;
        final  LinearLayout OooOO0;
        final  LinearLayout OooOO0O;
        final  LinearLayout OooOO0o;
        final  LinearLayout OooOOO;
        final  LinearLayout OooOOO0;
        final  LinearLayout OooOOOO;

        O0O0(FloatWin bVar, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, LinearLayout linearLayout11, LinearLayout linearLayout12) {
            this.f7009OooO0Oo = linearLayout;
            this.f7011OooO0o0 = linearLayout2;
            this.f7010OooO0o = linearLayout3;
            this.f7012OooO0oO = linearLayout4;
            this.OooO0oo = linearLayout5;
            this.OooO = linearLayout6;
            this.OooOO0 = linearLayout7;
            this.OooOO0O = linearLayout8;
            this.OooOO0o = linearLayout9;
            this.OooOOO0 = linearLayout10;
            this.OooOOO = linearLayout11;
            this.OooOOOO = linearLayout12;
        }

        public void onClick(View view) {
            this.f7009OooO0Oo.setVisibility(View.VISIBLE);
            this.f7011OooO0o0.setVisibility(View.GONE);
            this.f7010OooO0o.setVisibility(View.GONE);
            this.f7012OooO0oO.setVisibility(View.GONE);
            this.OooO0oo.setVisibility(View.GONE);
            this.OooO.setVisibility(View.GONE);
            this.OooOO0.setVisibility(View.GONE);
            this.OooOO0O.setVisibility(View.GONE);
            this.OooOO0o.setVisibility(View.GONE);
            this.OooOOO0.setVisibility(View.GONE);
            this.OooOOO.setVisibility(View.GONE);
            this.OooOOOO.setVisibility(View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$O0OO00 */
    public class O0OO00 implements View.OnClickListener {
        final  LinearLayout OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  Button f7013OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  Button f7014OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  Button f7015OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  Button f7016OooO0oO;
        final  Button OooO0oo;
        final  LinearLayout OooOO0;
        final  LinearLayout OooOO0O;
        final  LinearLayout OooOO0o;
        final  LinearLayout OooOOO0;

        O0OO00(FloatWin bVar, Button button, Button button2, Button button3, Button button4, Button button5, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5) {
            this.f7013OooO0Oo = button;
            this.f7015OooO0o0 = button2;
            this.f7014OooO0o = button3;
            this.f7016OooO0oO = button4;
            this.OooO0oo = button5;
            this.OooO = linearLayout;
            this.OooOO0 = linearLayout2;
            this.OooOO0O = linearLayout3;
            this.OooOO0o = linearLayout4;
            this.OooOOO0 = linearLayout5;
        }

        public void onClick(View view) {
            this.f7013OooO0Oo.setBackgroundResource(R.drawable.yellow_border_rounded_header3);
            this.f7015OooO0o0.setBackgroundResource(R.drawable.yellow_border_rounded_header2);
            this.f7014OooO0o.setBackgroundResource(R.drawable.yellow_border_rounded_header2);
            this.f7016OooO0oO.setBackgroundResource(R.drawable.yellow_border_rounded_header2);
            this.OooO0oo.setBackgroundResource(R.drawable.yellow_border_rounded_header2);
            this.OooO.setVisibility(View.GONE);
            this.OooOO0.setVisibility(View.VISIBLE);
            this.OooOO0O.setVisibility(View.GONE);
            this.OooOO0o.setVisibility(View.GONE);
            this.OooOOO0.setVisibility(View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$Oo0000 */
    public class Oo0000 implements View.OnClickListener {
        final  LinearLayout OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  Button f7017OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  Button f7018OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  Button f7019OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  Button f7020OooO0oO;
        final  Button OooO0oo;
        final  LinearLayout OooOO0;
        final  LinearLayout OooOO0O;
        final  LinearLayout OooOO0o;
        final  LinearLayout OooOOO0;

        Oo0000(FloatWin bVar, Button button, Button button2, Button button3, Button button4, Button button5, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5) {
            this.f7017OooO0Oo = button;
            this.f7019OooO0o0 = button2;
            this.f7018OooO0o = button3;
            this.f7020OooO0oO = button4;
            this.OooO0oo = button5;
            this.OooO = linearLayout;
            this.OooOO0 = linearLayout2;
            this.OooOO0O = linearLayout3;
            this.OooOO0o = linearLayout4;
            this.OooOOO0 = linearLayout5;
        }

        public void onClick(View view) {
            this.f7017OooO0Oo.setBackgroundResource(R.drawable.yellow_border_rounded_header2);
            this.f7019OooO0o0.setBackgroundResource(R.drawable.yellow_border_rounded_header3);
            this.f7018OooO0o.setBackgroundResource(R.drawable.yellow_border_rounded_header2);
            this.f7020OooO0oO.setBackgroundResource(R.drawable.yellow_border_rounded_header2);
            this.OooO0oo.setBackgroundResource(R.drawable.yellow_border_rounded_header2);
            this.OooO.setVisibility(View.VISIBLE);
            this.OooOO0.setVisibility(View.GONE);
            this.OooOO0O.setVisibility(View.GONE);
            this.OooOO0o.setVisibility(View.GONE);
            this.OooOOO0.setVisibility(View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$OooO */
    public class C1867OooO implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7021OooO00o;

        C1867OooO(CheckBox checkBox) {
            this.f7021OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7021OooO00o.getText()), this.f7021OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$OooO00o */
    public class C1868OooO00o implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7023OooO00o;

        C1868OooO00o(CheckBox checkBox) {
            this.f7023OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7023OooO00o.getText()), this.f7023OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$OooO0O0 */
    public class C1869OooO0O0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7025OooO00o;

        C1869OooO0O0(CheckBox checkBox) {
            this.f7025OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7025OooO00o.getText()), this.f7025OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$OooO0OO */
    public class C1870OooO0OO implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7027OooO00o;

        C1870OooO0OO(CheckBox checkBox) {
            this.f7027OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7027OooO00o.getText()), this.f7027OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$OooO0o */
    public class C1871OooO0o implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7029OooO00o;

        C1871OooO0o(CheckBox checkBox) {
            this.f7029OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7029OooO00o.getText()), this.f7029OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$OooOO0 */
    public class C1872OooOO0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7031OooO00o;

        C1872OooOO0(CheckBox checkBox) {
            this.f7031OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7031OooO00o.getText()), this.f7031OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$OooOO0O */
    public class C1873OooOO0O implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7033OooO00o;

        C1873OooOO0O(CheckBox checkBox) {
            this.f7033OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7033OooO00o.getText()), this.f7033OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$OooOOO */
    public class C1874OooOOO implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7035OooO00o;

        C1874OooOOO(CheckBox checkBox) {
            this.f7035OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7035OooO00o.getText()), this.f7035OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$OooOOO0 */
    public class C1875OooOOO0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7037OooO00o;

        C1875OooOOO0(CheckBox checkBox) {
            this.f7037OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7037OooO00o.getText()), this.f7037OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$OooOOOO */
    public class C1876OooOOOO implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7039OooO00o;

        C1876OooOOOO(CheckBox checkBox) {
            this.f7039OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7039OooO00o.getText()), this.f7039OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$OooOo */
    public class OooOo implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7041OooO00o;

        OooOo(CheckBox checkBox) {
            this.f7041OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7041OooO00o.getText()), this.f7041OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$OooOo00 */
    public class C1877OooOo00 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7043OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  CheckBox f7044OooO0O0;

        /* renamed from: OooO0OO  reason: collision with root package name */
        final  CheckBox f7045OooO0OO;

        C1877OooOo00(CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3) {
            this.f7043OooO00o = checkBox;
            this.f7044OooO0O0 = checkBox2;
            this.f7045OooO0OO = checkBox3;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue("Dual", this.f7043OooO00o.isChecked());
            if (z) {
                this.f7044OooO0O0.setChecked(false);
                this.f7045OooO0OO.setChecked(false);
            }
        }
    }

    
    /* class for FloatWin : this.b$Oooo0 */
    public class Oooo0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7047OooO00o;

        Oooo0(CheckBox checkBox) {
            this.f7047OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7047OooO00o.getText()), this.f7047OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$Oooo000 */
    public class Oooo000 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7049OooO00o;

        Oooo000(CheckBox checkBox) {
            this.f7049OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7049OooO00o.getText()), this.f7049OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$a */
    public class View$OnClickListenerC1878a implements View.OnClickListener {
        final  LinearLayout OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  Button f7051OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  Button f7052OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  Button f7053OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  Button f7054OooO0oO;
        final  Button OooO0oo;
        final  LinearLayout OooOO0;
        final  LinearLayout OooOO0O;
        final  LinearLayout OooOO0o;
        final  LinearLayout OooOOO0;

        View$OnClickListenerC1878a(FloatWin bVar, Button button, Button button2, Button button3, Button button4, Button button5, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5) {
            this.f7051OooO0Oo = button;
            this.f7053OooO0o0 = button2;
            this.f7052OooO0o = button3;
            this.f7054OooO0oO = button4;
            this.OooO0oo = button5;
            this.OooO = linearLayout;
            this.OooOO0 = linearLayout2;
            this.OooOO0O = linearLayout3;
            this.OooOO0o = linearLayout4;
            this.OooOOO0 = linearLayout5;
        }

        public void onClick(View view) {
            this.f7051OooO0Oo.setBackgroundResource(R.drawable.yellow_border_rounded_header2);
            this.f7053OooO0o0.setBackgroundResource(R.drawable.yellow_border_rounded_header2);
            this.f7052OooO0o.setBackgroundResource(R.drawable.yellow_border_rounded_header3);
            this.f7054OooO0oO.setBackgroundResource(R.drawable.yellow_border_rounded_header2);
            this.OooO0oo.setBackgroundResource(R.drawable.yellow_border_rounded_header2);
            this.OooO.setVisibility(View.GONE);
            this.OooOO0.setVisibility(View.GONE);
            this.OooOO0O.setVisibility(View.VISIBLE);
            this.OooOO0o.setVisibility(View.GONE);
            this.OooOOO0.setVisibility(View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$a0 */
    public class C1879a0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7055OooO00o;

        C1879a0(CheckBox checkBox) {
            this.f7055OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7055OooO00o.getText()), this.f7055OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$b */
    public class View$OnClickListenerC1880b implements View.OnClickListener {
        final  LinearLayout OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  Button f7057OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  Button f7058OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  Button f7059OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  Button f7060OooO0oO;
        final  Button OooO0oo;
        final  LinearLayout OooOO0;
        final  LinearLayout OooOO0O;
        final  LinearLayout OooOO0o;
        final  LinearLayout OooOOO0;

        View$OnClickListenerC1880b(FloatWin bVar, Button button, Button button2, Button button3, Button button4, Button button5, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5) {
            this.f7057OooO0Oo = button;
            this.f7059OooO0o0 = button2;
            this.f7058OooO0o = button3;
            this.f7060OooO0oO = button4;
            this.OooO0oo = button5;
            this.OooO = linearLayout;
            this.OooOO0 = linearLayout2;
            this.OooOO0O = linearLayout3;
            this.OooOO0o = linearLayout4;
            this.OooOOO0 = linearLayout5;
        }

        public void onClick(View view) {
            this.f7057OooO0Oo.setBackgroundResource(R.drawable.yellow_border_rounded_header2);
            this.f7059OooO0o0.setBackgroundResource(R.drawable.yellow_border_rounded_header2);
            this.f7058OooO0o.setBackgroundResource(R.drawable.yellow_border_rounded_header2);
            this.f7060OooO0oO.setBackgroundResource(R.drawable.yellow_border_rounded_header3);
            this.OooO0oo.setBackgroundResource(R.drawable.yellow_border_rounded_header2);
            this.OooO.setVisibility(View.GONE);
            this.OooOO0.setVisibility(View.GONE);
            this.OooOO0O.setVisibility(View.GONE);
            this.OooOO0o.setVisibility(View.GONE);
            this.OooOOO0.setVisibility(View.VISIBLE);
        }
    }

    
    /* class for FloatWin : this.b$b0 */
    public class View$OnTouchListenerC1881b0 implements View.OnTouchListener {
        final  WindowManager.LayoutParams OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        private int f7061OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        private float f7062OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        private int f7063OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        private float f7064OooO0oO;
        final  GestureDetector OooO0oo;

        View$OnTouchListenerC1881b0(GestureDetector gestureDetector, WindowManager.LayoutParams layoutParams) {
            this.OooO0oo = gestureDetector;
            this.OooO = layoutParams;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.OooO0oo.onTouchEvent(motionEvent)) {
                FloatWin.this.logoView.setVisibility(View.GONE);
                FloatWin.this.espView.setVisibility(View.VISIBLE);
                return true;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                WindowManager.LayoutParams layoutParams = this.OooO;
                this.f7061OooO0Oo = layoutParams.x;
                this.f7063OooO0o0 = layoutParams.y;
                this.f7062OooO0o = motionEvent.getRawX();
                this.f7064OooO0oO = motionEvent.getRawY();
                return true;
            } else if (action != 2) {
                return false;
            } else {
                this.OooO.x = this.f7061OooO0Oo + ((int) (motionEvent.getRawX() - this.f7062OooO0o));
                this.OooO.y = this.f7063OooO0o0 + ((int) (motionEvent.getRawY() - this.f7064OooO0oO));
                FloatWin.this.mWindowManager3.updateViewLayout(FloatWin.this.mFloatingView3, this.OooO);
                return true;
            }
        }
    }

    
    /* class for FloatWin : this.b$c */
    public class View$OnClickListenerC1882c implements View.OnClickListener {
        final  LinearLayout OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  Button f7065OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  Button f7066OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  Button f7067OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  Button f7068OooO0oO;
        final  Button OooO0oo;
        final  LinearLayout OooOO0;
        final  LinearLayout OooOO0O;
        final  LinearLayout OooOO0o;
        final  LinearLayout OooOOO0;

        View$OnClickListenerC1882c(FloatWin bVar, Button button, Button button2, Button button3, Button button4, Button button5, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5) {
            this.f7065OooO0Oo = button;
            this.f7067OooO0o0 = button2;
            this.f7066OooO0o = button3;
            this.f7068OooO0oO = button4;
            this.OooO0oo = button5;
            this.OooO = linearLayout;
            this.OooOO0 = linearLayout2;
            this.OooOO0O = linearLayout3;
            this.OooOO0o = linearLayout4;
            this.OooOOO0 = linearLayout5;
        }

        public void onClick(View view) {
            this.f7065OooO0Oo.setBackgroundResource(R.drawable.yellow_border_rounded_header2);
            this.f7067OooO0o0.setBackgroundResource(R.drawable.yellow_border_rounded_header2);
            this.f7066OooO0o.setBackgroundResource(R.drawable.yellow_border_rounded_header2);
            this.f7068OooO0oO.setBackgroundResource(R.drawable.yellow_border_rounded_header2);
            this.OooO0oo.setBackgroundResource(R.drawable.yellow_border_rounded_header3);
            this.OooO.setVisibility(View.GONE);
            this.OooOO0.setVisibility(View.GONE);
            this.OooOO0O.setVisibility(View.GONE);
            this.OooOO0o.setVisibility(View.GONE);
            this.OooOOO0.setVisibility(View.VISIBLE);
        }
    }

    
    /* class for FloatWin : this.b$c0 */
    public class C1883c0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7069OooO00o;

        C1883c0(CheckBox checkBox) {
            this.f7069OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7069OooO00o.getText()), this.f7069OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$d */
    public class C1884d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7071OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  CheckBox f7072OooO0O0;

        /* renamed from: OooO0OO  reason: collision with root package name */
        final  CheckBox f7073OooO0OO;

        C1884d(CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3) {
            this.f7071OooO00o = checkBox;
            this.f7072OooO0O0 = checkBox2;
            this.f7073OooO0OO = checkBox3;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue("Material", this.f7071OooO00o.isChecked());
            if (z) {
                this.f7072OooO0O0.setChecked(false);
                this.f7073OooO0OO.setChecked(false);
            }
        }
    }

    
    /* class for FloatWin : this.b$d0 */
    public class C1885d0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7075OooO00o;

        C1885d0(CheckBox checkBox) {
            this.f7075OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7075OooO00o.getText()), this.f7075OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$e */
    public class View$OnTouchListenerC1886e implements View.OnTouchListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        private int f7077OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        private float f7078OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        private int f7079OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        private float f7080OooO0oO;
        final  WindowManager.LayoutParams OooO0oo;

        View$OnTouchListenerC1886e(WindowManager.LayoutParams layoutParams) {
            this.OooO0oo = layoutParams;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                WindowManager.LayoutParams layoutParams = this.OooO0oo;
                this.f7077OooO0Oo = layoutParams.x;
                this.f7079OooO0o0 = layoutParams.y;
                this.f7078OooO0o = motionEvent.getRawX();
                this.f7080OooO0oO = motionEvent.getRawY();
                return true;
            } else if (action != 2) {
                return false;
            } else {
                this.OooO0oo.x = this.f7077OooO0Oo + ((int) (motionEvent.getRawX() - this.f7078OooO0o));
                this.OooO0oo.y = this.f7079OooO0o0 + ((int) (motionEvent.getRawY() - this.f7080OooO0oO));
                FloatWin.this.mWindowManager5.updateViewLayout(FloatWin.this.mFloatingView5, this.OooO0oo);
                return true;
            }
        }
    }

    
    /* class for FloatWin : this.b$e0 */
    public class C1887e0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7081OooO00o;

        C1887e0(CheckBox checkBox) {
            this.f7081OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7081OooO00o.getText()), this.f7081OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$f */
    public class C1888f implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7083OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  CheckBox f7084OooO0O0;

        /* renamed from: OooO0OO  reason: collision with root package name */
        final  CheckBox f7085OooO0OO;

        C1888f(CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3) {
            this.f7083OooO00o = checkBox;
            this.f7084OooO0O0 = checkBox2;
            this.f7085OooO0OO = checkBox3;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue("MaterialDistance", this.f7083OooO00o.isChecked());
            if (z) {
                this.f7084OooO0O0.setChecked(false);
                this.f7085OooO0OO.setChecked(false);
            }
        }
    }

    
    /* class for FloatWin : this.b$f0 */
    public class C1889f0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7087OooO00o;

        C1889f0(CheckBox checkBox) {
            this.f7087OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7087OooO00o.getText()), this.f7087OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$g */
    public class C1890g implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7089OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  CheckBox f7090OooO0O0;

        /* renamed from: OooO0OO  reason: collision with root package name */
        final  CheckBox f7091OooO0OO;

        C1890g(CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3) {
            this.f7089OooO00o = checkBox;
            this.f7090OooO0O0 = checkBox2;
            this.f7091OooO0OO = checkBox3;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue("Dual", this.f7089OooO00o.isChecked());
            if (z) {
                this.f7090OooO0O0.setChecked(false);
                this.f7091OooO0OO.setChecked(false);
            }
        }
    }

    
    /* class for FloatWin : this.b$g0 */
    public class C1891g0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7093OooO00o;

        C1891g0(CheckBox checkBox) {
            this.f7093OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7093OooO00o.getText()), this.f7093OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$h */
    public class C1892h implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  SeekBar f7095OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  TextView f7096OooO0O0;

        C1892h(SeekBar seekBar, TextView textView) {
            this.f7095OooO00o = seekBar;
            this.f7096OooO0O0 = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int progress = this.f7095OooO00o.getProgress();
            FloatWin.this.setItemPosition(progress);
            ESPSyncView.ChangeitemPosition(progress);
            this.f7096OooO0O0.setText(String.valueOf(progress));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    
    /* class for FloatWin : this.b$h0 */
    public class C1893h0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7098OooO00o;

        C1893h0(CheckBox checkBox) {
            this.f7098OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7098OooO00o.getText()), this.f7098OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$i */
    public class C1894i implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  SeekBar f7100OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  TextView f7101OooO0O0;

        C1894i(SeekBar seekBar, TextView textView) {
            this.f7100OooO00o = seekBar;
            this.f7101OooO0O0 = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int progress = this.f7100OooO00o.getProgress();
            FloatWin.this.setItemSIze(progress);
            ESPSyncView.ChangeitemSize(progress);
            this.f7101OooO0O0.setText(String.valueOf(progress));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    
    /* class for FloatWin : this.b$i0 */
    public class C1895i0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7103OooO00o;

        C1895i0(CheckBox checkBox) {
            this.f7103OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7103OooO00o.getText()), this.f7103OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$j */
    public class C1896j implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  SeekBar f7105OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  TextView f7106OooO0O0;

        C1896j(SeekBar seekBar, TextView textView) {
            this.f7105OooO00o = seekBar;
            this.f7106OooO0O0 = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int progress = this.f7105OooO00o.getProgress();
            FloatWin.this.setPosition(progress);
            ESPSyncView.ChangePosition(progress);
            this.f7106OooO0O0.setText(String.valueOf(progress));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    
    /* class for FloatWin : this.b$j0 */
    public class C1897j0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7108OooO00o;

        C1897j0(CheckBox checkBox) {
            this.f7108OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7108OooO00o.getText()), this.f7108OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$k */
    public class C1898k implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  SeekBar f7110OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  TextView f7111OooO0O0;

        C1898k(SeekBar seekBar, TextView textView) {
            this.f7110OooO00o = seekBar;
            this.f7111OooO0O0 = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int progress = this.f7110OooO00o.getProgress();
            FloatWin.this.setSize(progress);
            ESPSyncView.ChangeSize(progress);
            this.f7111OooO0O0.setText(String.valueOf(progress));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    
    /* class for FloatWin : this.b$k0 */
    public class C1899k0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  Switch f7113OooO00o;

        C1899k0(Switch r2) {
            this.f7113OooO00o = r2;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7113OooO00o.getText()), this.f7113OooO00o.isChecked());
            FloatWin.this.SettingValue(10, this.f7113OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$l */
    public class C1900l implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7115OooO00o;

        C1900l(CheckBox checkBox) {
            this.f7115OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7115OooO00o.getText()), this.f7115OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$l0 */
    public class C1901l0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  Switch f7117OooO00o;

        C1901l0(Switch r2) {
            this.f7117OooO00o = r2;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7117OooO00o.getText()), this.f7117OooO00o.isChecked());
            FloatWin.this.SettingValue(9, this.f7117OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$m */
    public class C1902m implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7119OooO00o;

        C1902m(CheckBox checkBox) {
            this.f7119OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7119OooO00o.getText()), this.f7119OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$m0 */
    public class C1903m0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7121OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  CheckBox f7122OooO0O0;

        /* renamed from: OooO0OO  reason: collision with root package name */
        final  CheckBox f7123OooO0OO;

        C1903m0(CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3) {
            this.f7121OooO00o = checkBox;
            this.f7122OooO0O0 = checkBox2;
            this.f7123OooO0OO = checkBox3;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue("Material", this.f7121OooO00o.isChecked());
            if (z) {
                this.f7122OooO0O0.setChecked(false);
                this.f7123OooO0OO.setChecked(false);
            }
        }
    }

    
    /* class for FloatWin : this.b$n */
    public class C1904n implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7125OooO00o;

        C1904n(CheckBox checkBox) {
            this.f7125OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7125OooO00o.getText()), this.f7125OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$n0 */
    public class C1905n0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  Switch f7127OooO00o;

        C1905n0(Switch r2) {
            this.f7127OooO00o = r2;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7127OooO00o.getText()), this.f7127OooO00o.isChecked());
            FloatWin.this.SettingValue(8, this.f7127OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o */
    public class C1906o implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  SeekBar f7129OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  TextView f7130OooO0O0;

        C1906o(SeekBar seekBar, TextView textView) {
            this.f7129OooO00o = seekBar;
            this.f7130OooO0O0 = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int progress = this.f7129OooO00o.getProgress();
            FloatWin.this.setStrokeSkeleton(progress);
            ESPSyncView.ChangeStrokeSkel(progress);
            this.f7130OooO0O0.setText(String.valueOf(progress));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    
    /* class for FloatWin : this.b$o0 */
    public class C1907o0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7132OooO00o;

        C1907o0(CheckBox checkBox) {
            this.f7132OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7132OooO00o.getText()), this.f7132OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00 */
    public class o00 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7134OooO00o;

        o00(CheckBox checkBox) {
            this.f7134OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7134OooO00o.getText()), this.f7134OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o000 */
    public class o000 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioButton f7136OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  RadioButton f7137OooO0O0;

        /* renamed from: OooO0OO  reason: collision with root package name */
        final  ColorPickerView f7138OooO0OO;

        o000(RadioButton radioButton, RadioButton radioButton2, ColorPickerView colorPickerView) {
            this.f7136OooO00o = radioButton;
            this.f7137OooO0O0 = radioButton2;
            this.f7138OooO0OO = colorPickerView;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                this.f7136OooO00o.setChecked(false);
                this.f7137OooO0O0.setChecked(false);
                this.f7138OooO0OO.setColor(FloatWin.this.getBothead(), true);
            }
        }
    }

    
    /* class for FloatWin : this.b$o0000 */
    public class o0000 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7140OooO00o;

        o0000(CheckBox checkBox) {
            this.f7140OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7140OooO00o.getText()), this.f7140OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00000 */
    public class o00000 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7142OooO00o;

        o00000(CheckBox checkBox) {
            this.f7142OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7142OooO00o.getText()), this.f7142OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o000000 */
    public class o000000 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7144OooO00o;

        o000000(CheckBox checkBox) {
            this.f7144OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7144OooO00o.getText()), this.f7144OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o000000O */
    public class o000000O implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7146OooO00o;

        o000000O(CheckBox checkBox) {
            this.f7146OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7146OooO00o.getText()), this.f7146OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00000O */
    public class C1908o00000O implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioButton f7148OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  RadioButton f7149OooO0O0;

        /* renamed from: OooO0OO  reason: collision with root package name */
        final  ColorPickerView f7150OooO0OO;

        C1908o00000O(RadioButton radioButton, RadioButton radioButton2, ColorPickerView colorPickerView) {
            this.f7148OooO00o = radioButton;
            this.f7149OooO0O0 = radioButton2;
            this.f7150OooO0OO = colorPickerView;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                this.f7148OooO00o.setChecked(false);
                this.f7149OooO0O0.setChecked(false);
                this.f7150OooO0OO.setColor(FloatWin.this.getBotbox(), true);
            }
        }
    }

    
    /* class for FloatWin : this.b$o00000O0 */
    public class C1909o00000O0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7152OooO00o;

        C1909o00000O0(CheckBox checkBox) {
            this.f7152OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7152OooO00o.getText()), this.f7152OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00000OO */
    public class C1910o00000OO implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7154OooO00o;

        C1910o00000OO(CheckBox checkBox) {
            this.f7154OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7154OooO00o.getText()), this.f7154OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0000O */
    public class o0000O implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7156OooO00o;

        o0000O(CheckBox checkBox) {
            this.f7156OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7156OooO00o.getText()), this.f7156OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0000O0 */
    public class o0000O0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7158OooO00o;

        o0000O0(CheckBox checkBox) {
            this.f7158OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7158OooO00o.getText()), this.f7158OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0000O00 */
    public class o0000O00 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7160OooO00o;

        o0000O00(CheckBox checkBox) {
            this.f7160OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7160OooO00o.getText()), this.f7160OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0000O0O */
    public class o0000O0O implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7162OooO00o;

        o0000O0O(CheckBox checkBox) {
            this.f7162OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7162OooO00o.getText()), this.f7162OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0000OO0 */
    public class o0000OO0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7164OooO00o;

        o0000OO0(CheckBox checkBox) {
            this.f7164OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7164OooO00o.getText()), this.f7164OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0000Ooo */
    public class o0000Ooo implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7166OooO00o;

        o0000Ooo(CheckBox checkBox) {
            this.f7166OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7166OooO00o.getText()), this.f7166OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0000oo */
    public class o0000oo implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7168OooO00o;

        o0000oo(CheckBox checkBox) {
            this.f7168OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7168OooO00o.getText()), this.f7168OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o000O */
    public class o000O implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7170OooO00o;

        o000O(CheckBox checkBox) {
            this.f7170OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7170OooO00o.getText()), this.f7170OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o000O0 */
    public class o000O0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7172OooO00o;

        o000O0(CheckBox checkBox) {
            this.f7172OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7172OooO00o.getText()), this.f7172OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o000O00 */
    public class o000O00 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7174OooO00o;

        o000O00(CheckBox checkBox) {
            this.f7174OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7174OooO00o.getText()), this.f7174OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o000O000 */
    public class C1911o000O000 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7176OooO00o;

        C1911o000O000(CheckBox checkBox) {
            this.f7176OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7176OooO00o.getText()), this.f7176OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o000O00O */
    public class o000O00O implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7178OooO00o;

        o000O00O(CheckBox checkBox) {
            this.f7178OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7178OooO00o.getText()), this.f7178OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o000O0O0 */
    public class o000O0O0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7180OooO00o;

        o000O0O0(CheckBox checkBox) {
            this.f7180OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7180OooO00o.getText()), this.f7180OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o000O0Oo */
    public class o000O0Oo implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7182OooO00o;

        o000O0Oo(CheckBox checkBox) {
            this.f7182OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7182OooO00o.getText()), this.f7182OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o000O0o */
    public class o000O0o implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7184OooO00o;

        o000O0o(CheckBox checkBox) {
            this.f7184OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7184OooO00o.getText()), this.f7184OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o000OO */
    public class o000OO implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7186OooO00o;

        o000OO(CheckBox checkBox) {
            this.f7186OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7186OooO00o.getText()), this.f7186OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o000OO00 */
    public class o000OO00 implements OnColorChangedListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioButton f7188OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  RadioButton f7189OooO0O0;

        o000OO00(RadioButton radioButton, RadioButton radioButton2) {
            this.f7188OooO00o = radioButton;
            this.f7189OooO0O0 = radioButton2;
        }

        @Override
        public void onColorChanged(int i) {
            if (this.f7188OooO00o.isChecked()) {
                FloatWin.this.setBotline(i);
                ESPSyncView.ChangeColorLineBot(i);
            } else if (this.f7189OooO0O0.isChecked()) {
                FloatWin.this.setBotbox(i);
                ESPSyncView.ChangeColorBoxBot(i);
            } else {
                FloatWin.this.setBothead(i);
                ESPSyncView.ChangeColorHeadBot(i);
            }
        }
    }

    
    /* class for FloatWin : this.b$o000OO0O */
    public class o000OO0O implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7191OooO00o;

        o000OO0O(CheckBox checkBox) {
            this.f7191OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7191OooO00o.getText()), this.f7191OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o000OOo */
    public class o000OOo implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7193OooO00o;

        o000OOo(CheckBox checkBox) {
            this.f7193OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7193OooO00o.getText()), this.f7193OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o000OOo0 */
    public class o000OOo0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7195OooO00o;

        o000OOo0(CheckBox checkBox) {
            this.f7195OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7195OooO00o.getText()), this.f7195OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o000Oo0 */
    public class o000Oo0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7197OooO00o;

        o000Oo0(CheckBox checkBox) {
            this.f7197OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7197OooO00o.getText()), this.f7197OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o000oOoO */
    public class o000oOoO implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7199OooO00o;

        o000oOoO(CheckBox checkBox) {
            this.f7199OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7199OooO00o.getText()), this.f7199OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00O */
    public class o00O implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7201OooO00o;

        o00O(CheckBox checkBox) {
            this.f7201OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7201OooO00o.getText()), this.f7201OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00O0 */
    public class o00O0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7203OooO00o;

        o00O0(CheckBox checkBox) {
            this.f7203OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7203OooO00o.getText()), this.f7203OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00O00 */
    public class o00O00 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7205OooO00o;

        o00O00(CheckBox checkBox) {
            this.f7205OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7205OooO00o.getText()), this.f7205OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00O000 */
    public class o00O000 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7207OooO00o;

        o00O000(CheckBox checkBox) {
            this.f7207OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7207OooO00o.getText()), this.f7207OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00O0000 */
    public class o00O0000 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7209OooO00o;

        o00O0000(CheckBox checkBox) {
            this.f7209OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7209OooO00o.getText()), this.f7209OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00O000o */
    public class o00O000o implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7211OooO00o;

        o00O000o(CheckBox checkBox) {
            this.f7211OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7211OooO00o.getText()), this.f7211OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00O00O */
    public class o00O00O implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7213OooO00o;

        o00O00O(CheckBox checkBox) {
            this.f7213OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7213OooO00o.getText()), this.f7213OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00O00OO */
    public class o00O00OO implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RelativeLayout f7215OooO00o;

        o00O00OO(FloatWin bVar, RelativeLayout relativeLayout) {
            this.f7215OooO00o = relativeLayout;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f7215OooO00o.setVisibility(z ? View.VISIBLE : View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$o00O00o0 */
    public class o00O00o0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7216OooO00o;

        o00O00o0(CheckBox checkBox) {
            this.f7216OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7216OooO00o.getText()), this.f7216OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00O0O */
    public class o00O0O implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7218OooO00o;

        o00O0O(CheckBox checkBox) {
            this.f7218OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7218OooO00o.getText()), this.f7218OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00O0O0 */
    public class o00O0O0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7220OooO00o;

        o00O0O0(CheckBox checkBox) {
            this.f7220OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7220OooO00o.getText()), this.f7220OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00O0O00 */
    public class o00O0O00 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7222OooO00o;

        o00O0O00(CheckBox checkBox) {
            this.f7222OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7222OooO00o.getText()), this.f7222OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00O0O0O */
    public class o00O0O0O implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7224OooO00o;

        o00O0O0O(CheckBox checkBox) {
            this.f7224OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7224OooO00o.getText()), this.f7224OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00O0OO */
    public class o00O0OO implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7226OooO00o;

        o00O0OO(CheckBox checkBox) {
            this.f7226OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7226OooO00o.getText()), this.f7226OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00O0OO0 */
    public class o00O0OO0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7228OooO00o;

        o00O0OO0(CheckBox checkBox) {
            this.f7228OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7228OooO00o.getText()), this.f7228OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00O0OOO */
    public class o00O0OOO implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7230OooO00o;

        o00O0OOO(CheckBox checkBox) {
            this.f7230OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7230OooO00o.getText()), this.f7230OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00OO */
    public class o00OO implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7232OooO00o;

        o00OO(CheckBox checkBox) {
            this.f7232OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7232OooO00o.getText()), this.f7232OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00OO000 */
    public class o00OO000 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7234OooO00o;

        o00OO000(CheckBox checkBox) {
            this.f7234OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7234OooO00o.getText()), this.f7234OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00OO00O */
    public class o00OO00O implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7236OooO00o;

        o00OO00O(CheckBox checkBox) {
            this.f7236OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7236OooO00o.getText()), this.f7236OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00OO0O0 */
    public class o00OO0O0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7238OooO00o;

        o00OO0O0(CheckBox checkBox) {
            this.f7238OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7238OooO00o.getText()), this.f7238OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00OO0OO */
    public class o00OO0OO implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7240OooO00o;

        o00OO0OO(CheckBox checkBox) {
            this.f7240OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7240OooO00o.getText()), this.f7240OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00OOO0 */
    public class o00OOO0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7242OooO00o;

        o00OOO0(CheckBox checkBox) {
            this.f7242OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7242OooO00o.getText()), this.f7242OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00OOO00 */
    public class o00OOO00 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7244OooO00o;

        o00OOO00(CheckBox checkBox) {
            this.f7244OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7244OooO00o.getText()), this.f7244OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00OOO0O */
    public class o00OOO0O implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7246OooO00o;

        o00OOO0O(CheckBox checkBox) {
            this.f7246OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7246OooO00o.getText()), this.f7246OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00OOOO0 */
    public class o00OOOO0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7248OooO00o;

        o00OOOO0(CheckBox checkBox) {
            this.f7248OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7248OooO00o.getText()), this.f7248OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00OOOOo */
    public class o00OOOOo implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7250OooO00o;

        o00OOOOo(CheckBox checkBox) {
            this.f7250OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7250OooO00o.getText()), this.f7250OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00Oo0 */
    public class o00Oo0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7252OooO00o;

        o00Oo0(CheckBox checkBox) {
            this.f7252OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7252OooO00o.getText()), this.f7252OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00Oo00 */
    public class o00Oo00 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7254OooO00o;

        o00Oo00(CheckBox checkBox) {
            this.f7254OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7254OooO00o.getText()), this.f7254OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00Ooo */
    public class o00Ooo implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7256OooO00o;

        o00Ooo(CheckBox checkBox) {
            this.f7256OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7256OooO00o.getText()), this.f7256OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00oO0o */
    public class C1912o00oO0o implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7258OooO00o;

        C1912o00oO0o(CheckBox checkBox) {
            this.f7258OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7258OooO00o.getText()), this.f7258OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o00oOoo */
    public class o00oOoo implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7260OooO00o;

        o00oOoo(CheckBox checkBox) {
            this.f7260OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7260OooO00o.getText()), this.f7260OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0O */
    public class o0O implements OnColorChangedListener {
        o0O() {
        }

        @Override
        public void onColorChanged(int i) {
            FloatWin.this.setColorSkel(i);
            ESPSyncView.ChangeColorSkel(i);
        }
    }

    
    /* class for FloatWin : this.b$o0O00 */
    public class o0O00 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7263OooO00o;

        o0O00(CheckBox checkBox) {
            this.f7263OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7263OooO00o.getText()), this.f7263OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0O000 */
    public class o0O000 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7265OooO00o;

        o0O000(CheckBox checkBox) {
            this.f7265OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7265OooO00o.getText()), this.f7265OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0O00000 */
    public class o0O00000 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7267OooO00o;

        o0O00000(CheckBox checkBox) {
            this.f7267OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7267OooO00o.getText()), this.f7267OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0O0000O */
    public class o0O0000O implements AdapterView.OnItemSelectedListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ArrayAdapter f7269OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  RadioButton f7270OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  RadioButton f7271OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  RadioButton f7272OooO0oO;
        final  RadioButton OooO0oo;

        o0O0000O(ArrayAdapter arrayAdapter, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioButton radioButton4) {
            this.f7269OooO0Oo = arrayAdapter;
            this.f7271OooO0o0 = radioButton;
            this.f7270OooO0o = radioButton2;
            this.f7272OooO0oO = radioButton3;
            this.OooO0oo = radioButton4;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            FloatWin bVar = FloatWin.this;
            ArrayAdapter arrayAdapter = this.f7269OooO0Oo;
            bVar.setInfoStyle(arrayAdapter.getPosition((String) arrayAdapter.getItem(i)));
            ESPSyncView.ChangeInfoStyle((String) this.f7269OooO0Oo.getItem(i));
            ArrayAdapter arrayAdapter2 = this.f7269OooO0Oo;
            int position = arrayAdapter2.getPosition((String) arrayAdapter2.getItem(i));
            if (position == 0) {
                this.f7271OooO0o0.setEnabled(true);
                this.f7270OooO0o.setEnabled(true);
                this.f7272OooO0oO.setEnabled(true);
                this.OooO0oo.setEnabled(true);
            } else if (position == 1 || position == 2 || position == 3) {
                this.f7271OooO0o0.setEnabled(false);
                this.f7270OooO0o.setEnabled(false);
                this.f7272OooO0oO.setEnabled(false);
                this.OooO0oo.setEnabled(false);
                this.f7271OooO0o0.setChecked(false);
                this.f7270OooO0o.setChecked(false);
                this.f7272OooO0oO.setChecked(false);
                this.OooO0oo.setChecked(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    
    /* class for FloatWin : this.b$o0O000O */
    public class o0O000O implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7273OooO00o;

        o0O000O(CheckBox checkBox) {
            this.f7273OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7273OooO00o.getText()), this.f7273OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0O000Oo */
    public class o0O000Oo implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7275OooO00o;

        o0O000Oo(CheckBox checkBox) {
            this.f7275OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7275OooO00o.getText()), this.f7275OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0O000o0 */
    public class o0O000o0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7277OooO00o;

        o0O000o0(CheckBox checkBox) {
            this.f7277OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7277OooO00o.getText()), this.f7277OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0O00O */
    public class o0O00O implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7279OooO00o;

        o0O00O(CheckBox checkBox) {
            this.f7279OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7279OooO00o.getText()), this.f7279OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0O00O0o */
    public class o0O00O0o implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7281OooO00o;

        o0O00O0o(CheckBox checkBox) {
            this.f7281OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7281OooO00o.getText()), this.f7281OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0O00OO */
    public class o0O00OO implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7283OooO00o;

        o0O00OO(CheckBox checkBox) {
            this.f7283OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7283OooO00o.getText()), this.f7283OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0O00OOO */
    public class o0O00OOO implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7285OooO0Oo;

        o0O00OOO(ToggleButton toggleButton) {
            this.f7285OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            FloatWin.this.logoView3.setVisibility(View.GONE);
            this.f7285OooO0Oo.setChecked(false);
        }
    }

    
    /* class for FloatWin : this.b$o0O00o0 */
    public class o0O00o0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7287OooO00o;

        o0O00o0(CheckBox checkBox) {
            this.f7287OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7287OooO00o.getText()), this.f7287OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0O00o00 */
    public class o0O00o00 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7289OooO00o;

        o0O00o00(CheckBox checkBox) {
            this.f7289OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7289OooO00o.getText()), this.f7289OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0O00oO0 */
    public class o0O00oO0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7291OooO00o;

        o0O00oO0(CheckBox checkBox) {
            this.f7291OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7291OooO00o.getText()), this.f7291OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0O0O00 */
    public class o0O0O00 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7293OooO00o;

        o0O0O00(CheckBox checkBox) {
            this.f7293OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7293OooO00o.getText()), this.f7293OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0O0O0O */
    public class o0O0O0O implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7295OooO00o;

        o0O0O0O(CheckBox checkBox) {
            this.f7295OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7295OooO00o.getText()), this.f7295OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0O0O0Oo */
    public class o0O0O0Oo implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7297OooO00o;

        o0O0O0Oo(CheckBox checkBox) {
            this.f7297OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7297OooO00o.getText()), this.f7297OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0O0O0o0 */
    public class o0O0O0o0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7299OooO00o;

        o0O0O0o0(CheckBox checkBox) {
            this.f7299OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7299OooO00o.getText()), this.f7299OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0O0OO0 */
    public class o0O0OO0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7301OooO00o;

        o0O0OO0(CheckBox checkBox) {
            this.f7301OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7301OooO00o.getText()), this.f7301OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0O0OOO0 */
    public class o0O0OOO0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7303OooO00o;

        o0O0OOO0(CheckBox checkBox) {
            this.f7303OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7303OooO00o.getText()), this.f7303OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0O0OOOo */
    public class o0O0OOOo implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7305OooO00o;

        o0O0OOOo(CheckBox checkBox) {
            this.f7305OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7305OooO00o.getText()), this.f7305OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0O0o */
    public class o0O0o implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7307OooO00o;

        o0O0o(CheckBox checkBox) {
            this.f7307OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7307OooO00o.getText()), this.f7307OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0O0o0 */
    public class o0O0o0 implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  SeekBar f7309OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  TextView f7310OooO0O0;

        o0O0o0(SeekBar seekBar, TextView textView) {
            this.f7309OooO00o = seekBar;
            this.f7310OooO0O0 = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int progress = this.f7309OooO00o.getProgress();
            FloatWin.this.setStrokeCrosHair2(progress);
            ESPSyncView.ChangeStrokeCross2(progress);
            this.f7310OooO0O0.setText(String.valueOf(progress));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    
    /* class for FloatWin : this.b$o0O0o000 */
    public class o0O0o000 implements OnColorChangedListener {
        o0O0o000() {
        }

        @Override
        public void onColorChanged(int i) {
            FloatWin.this.setColorCrosHair(i);
            ESPSyncView.ChangeColorCross(i);
        }
    }

    
    /* class for FloatWin : this.b$o0O0o00O */
    public class o0O0o00O implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  SeekBar f7313OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  TextView f7314OooO0O0;

        o0O0o00O(SeekBar seekBar, TextView textView) {
            this.f7313OooO00o = seekBar;
            this.f7314OooO0O0 = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int progress = this.f7313OooO00o.getProgress();
            FloatWin.this.setStrokeCrosHair(progress);
            ESPSyncView.ChangeStrokeCross(progress);
            this.f7314OooO0O0.setText(String.valueOf(progress));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    
    /* class for FloatWin : this.b$o0O0oo00 */
    public class o0O0oo00 implements OnColorChangedListener {
        o0O0oo00() {
        }

        @Override
        public void onColorChanged(int i) {
            FloatWin.this.setColorBox(i);
            ESPSyncView.ChangeColorBox(i);
        }
    }

    
    /* class for FloatWin : this.b$o0O0oo0o */
    public class o0O0oo0o implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7317OooO00o;

        o0O0oo0o(CheckBox checkBox) {
            this.f7317OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7317OooO00o.getText()), this.f7317OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0O0ooO */
    public class o0O0ooO implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7319OooO00o;

        o0O0ooO(CheckBox checkBox) {
            this.f7319OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7319OooO00o.getText()), this.f7319OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0OO */
    public class o0OO implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioButton f7321OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  RadioButton f7322OooO0O0;

        /* renamed from: OooO0OO  reason: collision with root package name */
        final  RadioButton f7323OooO0OO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ColorPickerView f7324OooO0Oo;

        o0OO(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, ColorPickerView colorPickerView) {
            this.f7321OooO00o = radioButton;
            this.f7322OooO0O0 = radioButton2;
            this.f7323OooO0OO = radioButton3;
            this.f7324OooO0Oo = colorPickerView;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            int i;
            ColorPickerView colorPickerView;
            if (z) {
                this.f7321OooO00o.setChecked(false);
                this.f7322OooO0O0.setChecked(false);
                this.f7323OooO0OO.setChecked(false);
                if (FloatWin.this.getIDBgt() == 100) {
                    colorPickerView = this.f7324OooO0Oo;
                    i = Color.argb(180, 0, 0, 0);
                } else {
                    colorPickerView = this.f7324OooO0Oo;
                    i = FloatWin.this.getIDBgt();
                }
                colorPickerView.setColor(i, true);
            }
        }
    }

    
    /* class for FloatWin : this.b$o0OO0 */
    public class o0OO0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioButton f7326OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  RadioButton f7327OooO0O0;

        /* renamed from: OooO0OO  reason: collision with root package name */
        final  RadioButton f7328OooO0OO;

        o0OO0(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
            this.f7326OooO00o = radioButton;
            this.f7327OooO0O0 = radioButton2;
            this.f7328OooO0OO = radioButton3;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                this.f7326OooO00o.setChecked(false);
                this.f7327OooO0O0.setChecked(false);
                this.f7328OooO0OO.setChecked(false);
                FloatWin.this.setFps(30);
                ESPSyncView.ChangeFps(30);
            }
        }
    }

    
    /* class for FloatWin : this.b$o0OO000 */
    public class o0OO000 implements OnColorChangedListener {
        o0OO000() {
        }

        @Override
        public void onColorChanged(int i) {
            FloatWin.this.setColorHead(i);
            ESPSyncView.ChangeColorHead(i);
        }
    }

    
    /* class for FloatWin : this.b$o0OO000o */
    public class o0OO000o implements OnColorChangedListener {
        o0OO000o() {
        }

        @Override
        public void onColorChanged(int i) {
            FloatWin.this.setColorLine(i);
            ESPSyncView.ChangeColorLine(i);
        }
    }

    
    /* class for FloatWin : this.b$o0OO00O */
    public class o0OO00O implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7332OooO00o;

        o0OO00O(CheckBox checkBox) {
            this.f7332OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7332OooO00o.getText()), this.f7332OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0OO00OO */
    public class o0OO00OO implements View.OnFocusChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  WindowManager.LayoutParams f7334OooO00o;

        o0OO00OO(WindowManager.LayoutParams layoutParams) {
            this.f7334OooO00o = layoutParams;
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                Log.d("", "Has focus");
                this.f7334OooO00o.flags = WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL;
                FloatWin.this.mWindowManager.updateViewLayout(FloatWin.this.mFloatingView4, this.f7334OooO00o);
                ((InputMethodManager) FloatWin.this.getSystemService(INPUT_METHOD_SERVICE)).toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.RESULT_UNCHANGED_SHOWN);
                return;
            }
            Log.d("", "Lost focus");
            this.f7334OooO00o.flags = WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE;
            FloatWin.this.mWindowManager.updateViewLayout(FloatWin.this.mFloatingView4, this.f7334OooO00o);
            ((InputMethodManager) FloatWin.this.getSystemService(INPUT_METHOD_SERVICE)).toggleSoftInput(0, 0);
        }
    }

    
    /* class for FloatWin : this.b$o0OO00o0 */
    public class o0OO00o0 implements OnColorChangedListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioButton f7336OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  RadioButton f7337OooO0O0;

        o0OO00o0(RadioButton radioButton, RadioButton radioButton2) {
            this.f7336OooO00o = radioButton;
            this.f7337OooO0O0 = radioButton2;
        }

        @Override
        public void onColorChanged(int i) {
            if (this.f7336OooO00o.isChecked()) {
                FloatWin.this.setColorAlert(i);
                ESPSyncView.ChangeColorAlert(i);
            } else if (this.f7337OooO0O0.isChecked()) {
                FloatWin.this.setColorAlertText(i);
                ESPSyncView.ChangeColorAlertText(i);
            }
        }
    }

    
    /* class for FloatWin : this.b$o0OO0O0 */
    public class o0OO0O0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioButton f7339OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  RadioButton f7340OooO0O0;

        /* renamed from: OooO0OO  reason: collision with root package name */
        final  RadioButton f7341OooO0OO;

        o0OO0O0(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
            this.f7339OooO00o = radioButton;
            this.f7340OooO0O0 = radioButton2;
            this.f7341OooO0OO = radioButton3;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                this.f7339OooO00o.setChecked(false);
                this.f7340OooO0O0.setChecked(false);
                this.f7341OooO0OO.setChecked(false);
                FloatWin.this.setFps(60);
                ESPSyncView.ChangeFps(60);
            }
        }
    }

    
    /* class for FloatWin : this.b$o0OO0o */
    public class o0OO0o implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioButton f7343OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  RadioButton f7344OooO0O0;

        /* renamed from: OooO0OO  reason: collision with root package name */
        final  RadioButton f7345OooO0OO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ColorPickerView f7346OooO0Oo;

        o0OO0o(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, ColorPickerView colorPickerView) {
            this.f7343OooO00o = radioButton;
            this.f7344OooO0O0 = radioButton2;
            this.f7345OooO0OO = radioButton3;
            this.f7346OooO0Oo = colorPickerView;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            int i;
            ColorPickerView colorPickerView;
            if (z) {
                this.f7343OooO00o.setChecked(false);
                this.f7344OooO0O0.setChecked(false);
                this.f7345OooO0OO.setChecked(false);
                if (FloatWin.this.getEnemyName() == 100) {
                    colorPickerView = this.f7346OooO0Oo;
                    i = Color.argb(180, 0, 0, 0);
                } else {
                    colorPickerView = this.f7346OooO0Oo;
                    i = FloatWin.this.getEnemyName();
                }
                colorPickerView.setColor(i, true);
            }
        }
    }

    
    /* class for FloatWin : this.b$o0OO0o00 */
    public class o0OO0o00 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioButton f7348OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  RadioButton f7349OooO0O0;

        /* renamed from: OooO0OO  reason: collision with root package name */
        final  RadioButton f7350OooO0OO;

        o0OO0o00(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
            this.f7348OooO00o = radioButton;
            this.f7349OooO0O0 = radioButton2;
            this.f7350OooO0OO = radioButton3;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                this.f7348OooO00o.setChecked(false);
                this.f7349OooO0O0.setChecked(false);
                this.f7350OooO0OO.setChecked(false);
                FloatWin.this.setFps(120);
                ESPSyncView.ChangeFps(120);
            }
        }
    }

    
    /* class for FloatWin : this.b$o0OO0oO0 */
    public class o0OO0oO0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioButton f7352OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  RadioButton f7353OooO0O0;

        /* renamed from: OooO0OO  reason: collision with root package name */
        final  RadioButton f7354OooO0OO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ColorPickerView f7355OooO0Oo;

        o0OO0oO0(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, ColorPickerView colorPickerView) {
            this.f7352OooO00o = radioButton;
            this.f7353OooO0O0 = radioButton2;
            this.f7354OooO0OO = radioButton3;
            this.f7355OooO0Oo = colorPickerView;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            int i;
            ColorPickerView colorPickerView;
            if (z) {
                this.f7352OooO00o.setChecked(false);
                this.f7353OooO0O0.setChecked(false);
                this.f7354OooO0OO.setChecked(false);
                if (FloatWin.this.getEnemyNameText() == 100) {
                    colorPickerView = this.f7355OooO0Oo;
                    i = -1;
                } else {
                    colorPickerView = this.f7355OooO0Oo;
                    i = FloatWin.this.getEnemyNameText();
                }
                colorPickerView.setColor(i, true);
            }
        }
    }

    
    /* class for FloatWin : this.b$o0OOO0 */
    public class o0OOO0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioButton f7357OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  ColorPickerView f7358OooO0O0;

        o0OOO0(RadioButton radioButton, ColorPickerView colorPickerView) {
            this.f7357OooO00o = radioButton;
            this.f7358OooO0O0 = colorPickerView;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            int i;
            ColorPickerView colorPickerView;
            if (z) {
                this.f7357OooO00o.setChecked(false);
                if (FloatWin.this.getEnemyDistance() == 100) {
                    colorPickerView = this.f7358OooO0O0;
                    i = Color.argb(180, 0, 0, 0);
                } else {
                    colorPickerView = this.f7358OooO0O0;
                    i = FloatWin.this.getEnemyDistance();
                }
                colorPickerView.setColor(i, true);
            }
        }
    }

    
    /* class for FloatWin : this.b$o0OOO00 */
    public class o0OOO00 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioButton f7360OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  RadioButton f7361OooO0O0;

        /* renamed from: OooO0OO  reason: collision with root package name */
        final  RadioButton f7362OooO0OO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ColorPickerView f7363OooO0Oo;

        o0OOO00(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, ColorPickerView colorPickerView) {
            this.f7360OooO00o = radioButton;
            this.f7361OooO0O0 = radioButton2;
            this.f7362OooO0OO = radioButton3;
            this.f7363OooO0Oo = colorPickerView;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            int i;
            ColorPickerView colorPickerView;
            if (z) {
                this.f7360OooO00o.setChecked(false);
                this.f7361OooO0O0.setChecked(false);
                this.f7362OooO0OO.setChecked(false);
                if (FloatWin.this.getIDtext() == 100) {
                    colorPickerView = this.f7363OooO0Oo;
                    i = Color.argb(180, 0, 0, 0);
                } else {
                    colorPickerView = this.f7363OooO0Oo;
                    i = FloatWin.this.getIDtext();
                }
                colorPickerView.setColor(i, true);
            }
        }
    }

    
    /* class for FloatWin : this.b$o0OOO0OO */
    public class o0OOO0OO implements AdapterView.OnItemSelectedListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ArrayAdapter f7365OooO0Oo;

        o0OOO0OO(ArrayAdapter arrayAdapter) {
            this.f7365OooO0Oo = arrayAdapter;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            FloatWin bVar = FloatWin.this;
            ArrayAdapter arrayAdapter = this.f7365OooO0Oo;
            bVar.setKnokStyle(arrayAdapter.getPosition((String) arrayAdapter.getItem(i)));
            ESPSyncView.ChangeKnokStyle((String) this.f7365OooO0Oo.getItem(i));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    
    /* class for FloatWin : this.b$o0OOO0o */
    public class C1913o0OOO0o implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7367OooO00o;

        C1913o0OOO0o(CheckBox checkBox) {
            this.f7367OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7367OooO00o.getText()), this.f7367OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0OOOO00 */
    public class o0OOOO00 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioButton f7369OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  ColorPickerView f7370OooO0O0;

        o0OOOO00(RadioButton radioButton, ColorPickerView colorPickerView) {
            this.f7369OooO00o = radioButton;
            this.f7370OooO0O0 = colorPickerView;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            int i;
            ColorPickerView colorPickerView;
            if (z) {
                this.f7369OooO00o.setChecked(false);
                if (FloatWin.this.getEnemyDistanceText() == 100) {
                    colorPickerView = this.f7370OooO0O0;
                    i = -1;
                } else {
                    colorPickerView = this.f7370OooO0O0;
                    i = FloatWin.this.getEnemyDistanceText();
                }
                colorPickerView.setColor(i, true);
            }
        }
    }

    
    /* class for FloatWin : this.b$o0OOOO0o */
    public class o0OOOO0o implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioButton f7372OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  ColorPickerView f7373OooO0O0;

        o0OOOO0o(RadioButton radioButton, ColorPickerView colorPickerView) {
            this.f7372OooO00o = radioButton;
            this.f7373OooO0O0 = colorPickerView;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            int i;
            ColorPickerView colorPickerView;
            if (z) {
                this.f7372OooO00o.setChecked(false);
                if (FloatWin.this.getEnemyWeapon() == 100) {
                    colorPickerView = this.f7373OooO0O0;
                    i = Color.argb(180, 0, 0, 0);
                } else {
                    colorPickerView = this.f7373OooO0O0;
                    i = FloatWin.this.getEnemyWeapon();
                }
                colorPickerView.setColor(i, true);
            }
        }
    }

    
    /* class for FloatWin : this.b$o0OOo000 */
    public class o0OOo000 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioButton f7375OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  ColorPickerView f7376OooO0O0;

        o0OOo000(RadioButton radioButton, ColorPickerView colorPickerView) {
            this.f7375OooO00o = radioButton;
            this.f7376OooO0O0 = colorPickerView;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            int i;
            ColorPickerView colorPickerView;
            if (z) {
                this.f7375OooO00o.setChecked(false);
                if (FloatWin.this.getEnemyWeaponText() == 100) {
                    colorPickerView = this.f7376OooO0O0;
                    i = -1;
                } else {
                    colorPickerView = this.f7376OooO0O0;
                    i = FloatWin.this.getEnemyWeaponText();
                }
                colorPickerView.setColor(i, true);
            }
        }
    }

    
    /* class for FloatWin : this.b$o0OOooO0 */
    public class o0OOooO0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioButton f7378OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  RadioButton f7379OooO0O0;

        /* renamed from: OooO0OO  reason: collision with root package name */
        final  RadioButton f7380OooO0OO;

        o0OOooO0(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
            this.f7378OooO00o = radioButton;
            this.f7379OooO0O0 = radioButton2;
            this.f7380OooO0OO = radioButton3;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                this.f7378OooO00o.setChecked(false);
                this.f7379OooO0O0.setChecked(false);
                this.f7380OooO0OO.setChecked(false);
                FloatWin.this.setFps(90);
                ESPSyncView.ChangeFps(90);
            }
        }
    }

    
    /* class for FloatWin : this.b$o0Oo0oo */
    public class o0Oo0oo implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7382OooO00o;

        o0Oo0oo(CheckBox checkBox) {
            this.f7382OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7382OooO00o.getText()), this.f7382OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0OoO00O */
    public class o0OoO00O implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7384OooO00o;

        o0OoO00O(CheckBox checkBox) {
            this.f7384OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7384OooO00o.getText()), this.f7384OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0OoOo0 */
    public class o0OoOo0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7386OooO00o;

        o0OoOo0(CheckBox checkBox) {
            this.f7386OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7386OooO00o.getText()), this.f7386OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0OoOoOo */
    public class o0OoOoOo implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7388OooO00o;

        o0OoOoOo(CheckBox checkBox) {
            this.f7388OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7388OooO00o.getText()), this.f7388OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0o0000 */
    public class o0o0000 implements OnColorChangedListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioButton f7390OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  RadioButton f7391OooO0O0;

        /* renamed from: OooO0OO  reason: collision with root package name */
        final  RadioButton f7392OooO0OO;

        o0o0000(RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3) {
            this.f7390OooO00o = radioButton;
            this.f7391OooO0O0 = radioButton2;
            this.f7392OooO0OO = radioButton3;
        }

        @Override
        public void onColorChanged(int i) {
            if (this.f7390OooO00o.isChecked()) {
                FloatWin.this.setEnemyName(i);
                ESPSyncView.ChangeBgName(i);
            } else if (this.f7391OooO0O0.isChecked()) {
                FloatWin.this.setIDBgt(i);
                ESPSyncView.ChangeBgId(i);
            } else if (this.f7392OooO0OO.isChecked()) {
                FloatWin.this.setEnemyNameText(i);
                ESPSyncView.ChangeTextName(i);
            } else {
                FloatWin.this.setIDtext(i);
                ESPSyncView.ChangeTextId(i);
            }
        }
    }

    
    /* class for FloatWin : this.b$o0o0Oo */
    public class o0o0Oo implements AdapterView.OnItemSelectedListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ArrayAdapter f7394OooO0Oo;

        o0o0Oo(ArrayAdapter arrayAdapter) {
            this.f7394OooO0Oo = arrayAdapter;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            FloatWin bVar = FloatWin.this;
            ArrayAdapter arrayAdapter = this.f7394OooO0Oo;
            bVar.setFont(arrayAdapter.getPosition((String) arrayAdapter.getItem(i)));
            ESPSyncView.ChangeFont((String) this.f7394OooO0Oo.getItem(i));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    
    /* class for FloatWin : this.b$o0oO0O0o */
    public class o0oO0O0o implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7396OooO00o;

        o0oO0O0o(CheckBox checkBox) {
            this.f7396OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7396OooO00o.getText()), this.f7396OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0oO0Ooo */
    public class o0oO0Ooo implements View.OnTouchListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        private int f7398OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        private float f7399OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        private int f7400OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        private float f7401OooO0oO;
        final  WindowManager.LayoutParams OooO0oo;

        o0oO0Ooo(WindowManager.LayoutParams layoutParams) {
            this.OooO0oo = layoutParams;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                WindowManager.LayoutParams layoutParams = this.OooO0oo;
                this.f7398OooO0Oo = layoutParams.x;
                this.f7400OooO0o0 = layoutParams.y;
                this.f7399OooO0o = motionEvent.getRawX();
                this.f7401OooO0oO = motionEvent.getRawY();
                return true;
            } else if (action != 2) {
                return false;
            } else {
                this.OooO0oo.x = this.f7398OooO0Oo + ((int) (motionEvent.getRawX() - this.f7399OooO0o));
                this.OooO0oo.y = this.f7400OooO0o0 + ((int) (motionEvent.getRawY() - this.f7401OooO0oO));
                FloatWin.this.mWindowManager8.updateViewLayout(FloatWin.this.mFloatingView8, this.OooO0oo);
                return true;
            }
        }
    }

    
    /* class for FloatWin : this.b$o0oOO */
    public class o0oOO implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7402OooO00o;

        o0oOO(CheckBox checkBox) {
            this.f7402OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7402OooO00o.getText()), this.f7402OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0oOOo */
    public class o0oOOo implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7404OooO00o;

        o0oOOo(CheckBox checkBox) {
            this.f7404OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7404OooO00o.getText()), this.f7404OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0oOo0O0 */
    public class o0oOo0O0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  Switch f7406OooO00o;

        o0oOo0O0(Switch r2) {
            this.f7406OooO00o = r2;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue("CrossHair", this.f7406OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$o0oo0000 */
    public class o0oo0000 implements OnColorChangedListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioButton f7408OooO00o;

        o0oo0000(RadioButton radioButton) {
            this.f7408OooO00o = radioButton;
        }

        @Override
        public void onColorChanged(int i) {
            if (this.f7408OooO00o.isChecked()) {
                FloatWin.this.setEnemyWeapon(i);
                ESPSyncView.ChangeBgEnWeapon(i);
                return;
            }
            FloatWin.this.setEnemyWeaponText(i);
            ESPSyncView.ChangeTextEnWeapon(i);
        }
    }

    
    /* class for FloatWin : this.b$o0ooOOo */
    public class C1914o0ooOOo implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioButton f7410OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  RadioButton f7411OooO0O0;

        /* renamed from: OooO0OO  reason: collision with root package name */
        final  ColorPickerView f7412OooO0OO;

        C1914o0ooOOo(RadioButton radioButton, RadioButton radioButton2, ColorPickerView colorPickerView) {
            this.f7410OooO00o = radioButton;
            this.f7411OooO0O0 = radioButton2;
            this.f7412OooO0OO = colorPickerView;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                this.f7410OooO00o.setChecked(false);
                this.f7411OooO0O0.setChecked(false);
                this.f7412OooO0OO.setColor(FloatWin.this.getBotline(), true);
            }
        }
    }

    
    /* class for FloatWin : this.b$oO */
    public class View$OnClickListenerC1915oO implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7414OooO0Oo;

        View$OnClickListenerC1915oO(ToggleButton toggleButton) {
            this.f7414OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7414OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "2323");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Aimlock Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "2424");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Aimlock Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oO0 */
    public class oO0 implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7416OooO0Oo;

        oO0(ToggleButton toggleButton) {
            this.f7416OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7416OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "3939");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Remove Grass And Tress Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "4040");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Remove Grass And Tress Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oO000 */
    public class oO000 implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioGroup f7418OooO00o;

        oO000(RadioGroup radioGroup) {
            this.f7418OooO00o = radioGroup;
        }

        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            FloatWin.this.AimWhen(Integer.parseInt(((RadioButton) FloatWin.this.mFloatingView.findViewById(this.f7418OooO00o.getCheckedRadioButtonId())).getTag().toString()));
        }
    }

    
    /* class for FloatWin : this.b$oO00000 */
    public class oO00000 implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  SeekBar f7420OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  TextView f7421OooO0O0;

        oO00000(SeekBar seekBar, TextView textView) {
            this.f7420OooO00o = seekBar;
            this.f7421OooO0O0 = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int progress = this.f7420OooO00o.getProgress();
            FloatWin.this.setStrokeLine(progress);
            ESPSyncView.ChangeStrokeLine(progress);
            this.f7421OooO0O0.setText(String.valueOf(progress));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    
    /* class for FloatWin : this.b$oO00000o */
    public class oO00000o implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  SeekBar f7423OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  TextView f7424OooO0O0;

        oO00000o(SeekBar seekBar, TextView textView) {
            this.f7423OooO00o = seekBar;
            this.f7424OooO0O0 = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int progress = this.f7423OooO00o.getProgress();
            FloatWin.this.setFps(progress);
            ESPSyncView.ChangeFps(progress);
            this.f7424OooO0O0.setText(String.valueOf(progress));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    
    /* class for FloatWin : this.b$oO0000O */
    public class oO0000O implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  EditText f7426OooO0Oo;

        oO0000O(EditText editText) {
            this.f7426OooO0Oo = editText;
        }

        public void onClick(View view) {
            String obj = this.f7426OooO0Oo.getText().toString();
            FloatWin.this.setNamebot(obj);
            ESPSyncView.ChangeBotName(obj);
            String string = FloatWin.this.getString(R.string.toasbotnameset);
            Context context = FloatWin.this.mFloatingView4.getContext();
            Toast.makeText(context, ((Object) string) + " " + obj, Toast.LENGTH_LONG).show();
        }
    }

    
    /* class for FloatWin : this.b$oO0000Oo */
    public class oO0000Oo implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  SeekBar f7428OooO00o;

        oO0000Oo(SeekBar seekBar) {
            this.f7428OooO00o = seekBar;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            FloatWin.this.Range(this.f7428OooO00o.getProgress());
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    
    /* class for FloatWin : this.b$oO0000o0 */
    public class oO0000o0 implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioGroup f7430OooO00o;

        oO0000o0(RadioGroup radioGroup) {
            this.f7430OooO00o = radioGroup;
        }

        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            FloatWin.this.AimBy(Integer.parseInt(((RadioButton) FloatWin.this.mFloatingView.findViewById(this.f7430OooO00o.getCheckedRadioButtonId())).getTag().toString()));
        }
    }

    
    /* class for FloatWin : this.b$oO000O0 */
    public class oO000O0 implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioGroup f7432OooO00o;

        oO000O0(RadioGroup radioGroup) {
            this.f7432OooO00o = radioGroup;
        }

        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            FloatWin.this.Target(Integer.parseInt(((RadioButton) FloatWin.this.mFloatingView.findViewById(this.f7432OooO00o.getCheckedRadioButtonId())).getTag().toString()));
        }
    }

    
    /* class for FloatWin : this.b$oO000O0O */
    public class oO000O0O implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioGroup f7434OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  LinearLayout f7435OooO0O0;

        oO000O0O(RadioGroup radioGroup, LinearLayout linearLayout) {
            this.f7434OooO00o = radioGroup;
            this.f7435OooO0O0 = linearLayout;
        }

        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            String str;
            if (((RadioButton) FloatWin.this.mFloatingView.findViewById(this.f7434OooO00o.getCheckedRadioButtonId())).getText().toString().equalsIgnoreCase("Memory Aimbot 1.0")) {
                this.f7435OooO0O0.setVisibility(View.VISIBLE);
                FloatWin.this.createOver2();
                str = "on";
            } else {
                this.f7435OooO0O0.setVisibility(View.GONE);
                if (FloatWin.this.mFloatingView2 != null) {
                    FloatWin.this.mWindowManager2.removeView(FloatWin.this.mFloatingView2);
                }
                FloatWin.this.SettingValue(11, false);
                str = "off";
            }
            Log.d("aimbotvalue", str);
        }
    }

    
    /* class for FloatWin : this.b$oO000OOo */
    public class oO000OOo implements View.OnClickListener {
        final  CheckBox OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  CheckBox f7437OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  CheckBox f7438OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  CheckBox f7439OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  CheckBox f7440OooO0oO;
        final  CheckBox OooO0oo;
        final  CheckBox OooOO0;
        final  CheckBox OooOO0O;

        oO000OOo(FloatWin bVar, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, CheckBox checkBox7, CheckBox checkBox8) {
            this.f7437OooO0Oo = checkBox;
            this.f7439OooO0o0 = checkBox2;
            this.f7438OooO0o = checkBox3;
            this.f7440OooO0oO = checkBox4;
            this.OooO0oo = checkBox5;
            this.OooO = checkBox6;
            this.OooOO0 = checkBox7;
            this.OooOO0O = checkBox8;
        }

        public void onClick(View view) {
            this.f7437OooO0Oo.setChecked(true);
            this.f7439OooO0o0.setChecked(true);
            this.f7438OooO0o.setChecked(true);
            this.f7440OooO0oO.setChecked(true);
            this.OooO0oo.setChecked(true);
            this.OooO.setChecked(true);
            this.OooOO0.setChecked(true);
            this.OooOO0O.setChecked(true);
        }
    }

    
    /* class for FloatWin : this.b$oO000Oo */
    public class oO000Oo implements View.OnClickListener {
        final  CheckBox OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  CheckBox f7441OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  CheckBox f7442OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  CheckBox f7443OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  CheckBox f7444OooO0oO;
        final  CheckBox OooO0oo;
        final  CheckBox OooOO0;
        final  CheckBox OooOO0O;
        final  CheckBox OooOO0o;
        final  CheckBox OooOOO;
        final  CheckBox OooOOO0;
        final  CheckBox OooOOOO;
        final  CheckBox OooOOOo;
        final  CheckBox OooOOo;
        final  CheckBox OooOOo0;
        final  CheckBox OooOOoo;
        final  CheckBox OooOo0;
        final  CheckBox OooOo00;

        oO000Oo(FloatWin bVar, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, CheckBox checkBox7, CheckBox checkBox8, CheckBox checkBox9, CheckBox checkBox10, CheckBox checkBox11, CheckBox checkBox12, CheckBox checkBox13, CheckBox checkBox14, CheckBox checkBox15, CheckBox checkBox16, CheckBox checkBox17, CheckBox checkBox18) {
            this.f7441OooO0Oo = checkBox;
            this.f7443OooO0o0 = checkBox2;
            this.f7442OooO0o = checkBox3;
            this.f7444OooO0oO = checkBox4;
            this.OooO0oo = checkBox5;
            this.OooO = checkBox6;
            this.OooOO0 = checkBox7;
            this.OooOO0O = checkBox8;
            this.OooOO0o = checkBox9;
            this.OooOOO0 = checkBox10;
            this.OooOOO = checkBox11;
            this.OooOOOO = checkBox12;
            this.OooOOOo = checkBox13;
            this.OooOOo0 = checkBox14;
            this.OooOOo = checkBox15;
            this.OooOOoo = checkBox16;
            this.OooOo00 = checkBox17;
            this.OooOo0 = checkBox18;
        }

        public void onClick(View view) {
            this.f7441OooO0Oo.setChecked(false);
            this.f7443OooO0o0.setChecked(false);
            this.f7442OooO0o.setChecked(false);
            this.f7444OooO0oO.setChecked(false);
            this.OooO0oo.setChecked(false);
            this.OooO.setChecked(false);
            this.OooOO0.setChecked(false);
            this.OooOO0O.setChecked(false);
            this.OooOO0o.setChecked(false);
            this.OooOOO0.setChecked(false);
            this.OooOOO.setChecked(false);
            this.OooOOOO.setChecked(false);
            this.OooOOOo.setChecked(false);
            this.OooOOo0.setChecked(false);
            this.OooOOo.setChecked(false);
            this.OooOOoo.setChecked(false);
            this.OooOo00.setChecked(false);
            this.OooOo0.setChecked(false);
        }
    }

    
    /* class for FloatWin : this.b$oO000Oo0 */
    public class oO000Oo0 implements View.OnClickListener {
        final  CheckBox OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  CheckBox f7445OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  CheckBox f7446OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  CheckBox f7447OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  CheckBox f7448OooO0oO;
        final  CheckBox OooO0oo;
        final  CheckBox OooOO0;
        final  CheckBox OooOO0O;
        final  CheckBox OooOO0o;
        final  CheckBox OooOOO;
        final  CheckBox OooOOO0;
        final  CheckBox OooOOOO;
        final  CheckBox OooOOOo;
        final  CheckBox OooOOo;
        final  CheckBox OooOOo0;
        final  CheckBox OooOOoo;
        final  CheckBox OooOo0;
        final  CheckBox OooOo00;

        oO000Oo0(FloatWin bVar, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, CheckBox checkBox7, CheckBox checkBox8, CheckBox checkBox9, CheckBox checkBox10, CheckBox checkBox11, CheckBox checkBox12, CheckBox checkBox13, CheckBox checkBox14, CheckBox checkBox15, CheckBox checkBox16, CheckBox checkBox17, CheckBox checkBox18) {
            this.f7445OooO0Oo = checkBox;
            this.f7447OooO0o0 = checkBox2;
            this.f7446OooO0o = checkBox3;
            this.f7448OooO0oO = checkBox4;
            this.OooO0oo = checkBox5;
            this.OooO = checkBox6;
            this.OooOO0 = checkBox7;
            this.OooOO0O = checkBox8;
            this.OooOO0o = checkBox9;
            this.OooOOO0 = checkBox10;
            this.OooOOO = checkBox11;
            this.OooOOOO = checkBox12;
            this.OooOOOo = checkBox13;
            this.OooOOo0 = checkBox14;
            this.OooOOo = checkBox15;
            this.OooOOoo = checkBox16;
            this.OooOo00 = checkBox17;
            this.OooOo0 = checkBox18;
        }

        public void onClick(View view) {
            this.f7445OooO0Oo.setChecked(true);
            this.f7447OooO0o0.setChecked(true);
            this.f7446OooO0o.setChecked(true);
            this.f7448OooO0oO.setChecked(true);
            this.OooO0oo.setChecked(true);
            this.OooO.setChecked(true);
            this.OooOO0.setChecked(true);
            this.OooOO0O.setChecked(true);
            this.OooOO0o.setChecked(true);
            this.OooOOO0.setChecked(true);
            this.OooOOO.setChecked(true);
            this.OooOOOO.setChecked(true);
            this.OooOOOo.setChecked(true);
            this.OooOOo0.setChecked(true);
            this.OooOOo.setChecked(true);
            this.OooOOoo.setChecked(true);
            this.OooOo00.setChecked(true);
            this.OooOo0.setChecked(true);
        }
    }

    
    /* class for FloatWin : this.b$oO000o00 */
    public class oO000o00 implements View.OnClickListener {
        final  CheckBox OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  CheckBox f7449OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  CheckBox f7450OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  CheckBox f7451OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  CheckBox f7452OooO0oO;
        final  CheckBox OooO0oo;
        final  CheckBox OooOO0;
        final  CheckBox OooOO0O;
        final  CheckBox OooOO0o;
        final  CheckBox OooOOO0;

        oO000o00(FloatWin bVar, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, CheckBox checkBox7, CheckBox checkBox8, CheckBox checkBox9, CheckBox checkBox10) {
            this.f7449OooO0Oo = checkBox;
            this.f7451OooO0o0 = checkBox2;
            this.f7450OooO0o = checkBox3;
            this.f7452OooO0oO = checkBox4;
            this.OooO0oo = checkBox5;
            this.OooO = checkBox6;
            this.OooOO0 = checkBox7;
            this.OooOO0O = checkBox8;
            this.OooOO0o = checkBox9;
            this.OooOOO0 = checkBox10;
        }

        public void onClick(View view) {
            this.f7449OooO0Oo.setChecked(true);
            this.f7451OooO0o0.setChecked(true);
            this.f7450OooO0o.setChecked(true);
            this.f7452OooO0oO.setChecked(true);
            this.OooO0oo.setChecked(true);
            this.OooO.setChecked(true);
            this.OooOO0.setChecked(true);
            this.OooOO0O.setChecked(true);
            this.OooOO0o.setChecked(true);
            this.OooOOO0.setChecked(true);
        }
    }

    
    /* class for FloatWin : this.b$oO00O0o */
    public class oO00O0o implements View.OnClickListener {
        final  CheckBox OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  CheckBox f7453OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  CheckBox f7454OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  CheckBox f7455OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  CheckBox f7456OooO0oO;
        final  CheckBox OooO0oo;
        final  CheckBox OooOO0;
        final  CheckBox OooOO0O;
        final  CheckBox OooOO0o;

        oO00O0o(FloatWin bVar, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, CheckBox checkBox7, CheckBox checkBox8, CheckBox checkBox9) {
            this.f7453OooO0Oo = checkBox;
            this.f7455OooO0o0 = checkBox2;
            this.f7454OooO0o = checkBox3;
            this.f7456OooO0oO = checkBox4;
            this.OooO0oo = checkBox5;
            this.OooO = checkBox6;
            this.OooOO0 = checkBox7;
            this.OooOO0O = checkBox8;
            this.OooOO0o = checkBox9;
        }

        public void onClick(View view) {
            this.f7453OooO0Oo.setChecked(false);
            this.f7455OooO0o0.setChecked(false);
            this.f7454OooO0o.setChecked(false);
            this.f7456OooO0oO.setChecked(false);
            this.OooO0oo.setChecked(false);
            this.OooO.setChecked(false);
            this.OooOO0.setChecked(false);
            this.OooOO0O.setChecked(false);
            this.OooOO0o.setChecked(false);
        }
    }

    
    /* class for FloatWin : this.b$oO00O0o0 */
    public class oO00O0o0 implements View.OnClickListener {
        final  CheckBox OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  CheckBox f7457OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  CheckBox f7458OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  CheckBox f7459OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  CheckBox f7460OooO0oO;
        final  CheckBox OooO0oo;
        final  CheckBox OooOO0;
        final  CheckBox OooOO0O;
        final  CheckBox OooOO0o;

        oO00O0o0(FloatWin bVar, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, CheckBox checkBox7, CheckBox checkBox8, CheckBox checkBox9) {
            this.f7457OooO0Oo = checkBox;
            this.f7459OooO0o0 = checkBox2;
            this.f7458OooO0o = checkBox3;
            this.f7460OooO0oO = checkBox4;
            this.OooO0oo = checkBox5;
            this.OooO = checkBox6;
            this.OooOO0 = checkBox7;
            this.OooOO0O = checkBox8;
            this.OooOO0o = checkBox9;
        }

        public void onClick(View view) {
            this.f7457OooO0Oo.setChecked(true);
            this.f7459OooO0o0.setChecked(true);
            this.f7458OooO0o.setChecked(true);
            this.f7460OooO0oO.setChecked(true);
            this.OooO0oo.setChecked(true);
            this.OooO.setChecked(true);
            this.OooOO0.setChecked(true);
            this.OooOO0O.setChecked(true);
            this.OooOO0o.setChecked(true);
        }
    }

    
    /* class for FloatWin : this.b$oO00O0oO */
    public class oO00O0oO implements View.OnClickListener {
        final  CheckBox OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  CheckBox f7461OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  CheckBox f7462OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  CheckBox f7463OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  CheckBox f7464OooO0oO;
        final  CheckBox OooO0oo;
        final  CheckBox OooOO0;
        final  CheckBox OooOO0O;

        oO00O0oO(FloatWin bVar, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, CheckBox checkBox7, CheckBox checkBox8) {
            this.f7461OooO0Oo = checkBox;
            this.f7463OooO0o0 = checkBox2;
            this.f7462OooO0o = checkBox3;
            this.f7464OooO0oO = checkBox4;
            this.OooO0oo = checkBox5;
            this.OooO = checkBox6;
            this.OooOO0 = checkBox7;
            this.OooOO0O = checkBox8;
        }

        public void onClick(View view) {
            this.f7461OooO0Oo.setChecked(false);
            this.f7463OooO0o0.setChecked(false);
            this.f7462OooO0o.setChecked(false);
            this.f7464OooO0oO.setChecked(false);
            this.OooO0oo.setChecked(false);
            this.OooO.setChecked(false);
            this.OooOO0.setChecked(false);
            this.OooOO0O.setChecked(false);
        }
    }

    
    /* class for FloatWin : this.b$oO00OO0O */
    public class oO00OO0O implements View.OnClickListener {
        final  CheckBox OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  CheckBox f7465OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  CheckBox f7466OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  CheckBox f7467OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  CheckBox f7468OooO0oO;
        final  CheckBox OooO0oo;
        final  CheckBox OooOO0;

        oO00OO0O(FloatWin bVar, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, CheckBox checkBox7) {
            this.f7465OooO0Oo = checkBox;
            this.f7467OooO0o0 = checkBox2;
            this.f7466OooO0o = checkBox3;
            this.f7468OooO0oO = checkBox4;
            this.OooO0oo = checkBox5;
            this.OooO = checkBox6;
            this.OooOO0 = checkBox7;
        }

        public void onClick(View view) {
            this.f7465OooO0Oo.setChecked(true);
            this.f7467OooO0o0.setChecked(true);
            this.f7466OooO0o.setChecked(true);
            this.f7468OooO0oO.setChecked(true);
            this.OooO0oo.setChecked(true);
            this.OooO.setChecked(true);
            this.OooOO0.setChecked(true);
        }
    }

    
    /* class for FloatWin : this.b$oO00OOO */
    public class oO00OOO implements AdapterView.OnItemSelectedListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ArrayAdapter f7469OooO0Oo;

        oO00OOO(ArrayAdapter arrayAdapter) {
            this.f7469OooO0Oo = arrayAdapter;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            FloatWin bVar = FloatWin.this;
            ArrayAdapter arrayAdapter = this.f7469OooO0Oo;
            bVar.setEnemyStatusStyle(arrayAdapter.getPosition((String) arrayAdapter.getItem(i)));
            ESPSyncView.ChangeEnemyStatusStyle((String) this.f7469OooO0Oo.getItem(i));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    
    /* class for FloatWin : this.b$oO00OOOo */
    public class oO00OOOo implements View.OnClickListener {
        final  CheckBox OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  CheckBox f7471OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  CheckBox f7472OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  CheckBox f7473OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  CheckBox f7474OooO0oO;
        final  CheckBox OooO0oo;
        final  CheckBox OooOO0;

        oO00OOOo(FloatWin bVar, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, CheckBox checkBox7) {
            this.f7471OooO0Oo = checkBox;
            this.f7473OooO0o0 = checkBox2;
            this.f7472OooO0o = checkBox3;
            this.f7474OooO0oO = checkBox4;
            this.OooO0oo = checkBox5;
            this.OooO = checkBox6;
            this.OooOO0 = checkBox7;
        }

        public void onClick(View view) {
            this.f7471OooO0Oo.setChecked(false);
            this.f7473OooO0o0.setChecked(false);
            this.f7472OooO0o.setChecked(false);
            this.f7474OooO0oO.setChecked(false);
            this.OooO0oo.setChecked(false);
            this.OooO.setChecked(false);
            this.OooOO0.setChecked(false);
        }
    }

    
    /* class for FloatWin : this.b$oO00OOo0 */
    public class oO00OOo0 implements View.OnClickListener {
        final  CheckBox OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  CheckBox f7475OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  CheckBox f7476OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  CheckBox f7477OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  CheckBox f7478OooO0oO;
        final  CheckBox OooO0oo;
        final  CheckBox OooOO0;
        final  CheckBox OooOO0O;
        final  CheckBox OooOO0o;

        oO00OOo0(FloatWin bVar, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, CheckBox checkBox7, CheckBox checkBox8, CheckBox checkBox9) {
            this.f7475OooO0Oo = checkBox;
            this.f7477OooO0o0 = checkBox2;
            this.f7476OooO0o = checkBox3;
            this.f7478OooO0oO = checkBox4;
            this.OooO0oo = checkBox5;
            this.OooO = checkBox6;
            this.OooOO0 = checkBox7;
            this.OooOO0O = checkBox8;
            this.OooOO0o = checkBox9;
        }

        public void onClick(View view) {
            this.f7475OooO0Oo.setChecked(true);
            this.f7477OooO0o0.setChecked(true);
            this.f7476OooO0o.setChecked(true);
            this.f7478OooO0oO.setChecked(true);
            this.OooO0oo.setChecked(true);
            this.OooO.setChecked(true);
            this.OooOO0.setChecked(true);
            this.OooOO0O.setChecked(true);
            this.OooOO0o.setChecked(true);
        }
    }

    
    /* class for FloatWin : this.b$oO00Oo0 */
    public class oO00Oo0 implements View.OnClickListener {
        final  CheckBox OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  CheckBox f7479OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  CheckBox f7480OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  CheckBox f7481OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  CheckBox f7482OooO0oO;
        final  CheckBox OooO0oo;

        oO00Oo0(FloatWin bVar, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6) {
            this.f7479OooO0Oo = checkBox;
            this.f7481OooO0o0 = checkBox2;
            this.f7480OooO0o = checkBox3;
            this.f7482OooO0oO = checkBox4;
            this.OooO0oo = checkBox5;
            this.OooO = checkBox6;
        }

        public void onClick(View view) {
            this.f7479OooO0Oo.setChecked(true);
            this.f7481OooO0o0.setChecked(true);
            this.f7480OooO0o.setChecked(true);
            this.f7482OooO0oO.setChecked(true);
            this.OooO0oo.setChecked(true);
            this.OooO.setChecked(true);
        }
    }

    
    /* class for FloatWin : this.b$oO00Oo00 */
    public class oO00Oo00 implements View.OnClickListener {
        final  CheckBox OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  CheckBox f7483OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  CheckBox f7484OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  CheckBox f7485OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  CheckBox f7486OooO0oO;
        final  CheckBox OooO0oo;
        final  CheckBox OooOO0;
        final  CheckBox OooOO0O;
        final  CheckBox OooOO0o;

        oO00Oo00(FloatWin bVar, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, CheckBox checkBox7, CheckBox checkBox8, CheckBox checkBox9) {
            this.f7483OooO0Oo = checkBox;
            this.f7485OooO0o0 = checkBox2;
            this.f7484OooO0o = checkBox3;
            this.f7486OooO0oO = checkBox4;
            this.OooO0oo = checkBox5;
            this.OooO = checkBox6;
            this.OooOO0 = checkBox7;
            this.OooOO0O = checkBox8;
            this.OooOO0o = checkBox9;
        }

        public void onClick(View view) {
            this.f7483OooO0Oo.setChecked(false);
            this.f7485OooO0o0.setChecked(false);
            this.f7484OooO0o.setChecked(false);
            this.f7486OooO0oO.setChecked(false);
            this.OooO0oo.setChecked(false);
            this.OooO.setChecked(false);
            this.OooOO0.setChecked(false);
            this.OooOO0O.setChecked(false);
            this.OooOO0o.setChecked(false);
        }
    }

    
    /* class for FloatWin : this.b$oO00o0 */
    public class oO00o0 implements View.OnClickListener {
        final  CheckBox OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  CheckBox f7487OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  CheckBox f7488OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  CheckBox f7489OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  CheckBox f7490OooO0oO;
        final  CheckBox OooO0oo;
        final  CheckBox OooOO0;
        final  CheckBox OooOO0O;
        final  CheckBox OooOO0o;
        final  CheckBox OooOOO;
        final  CheckBox OooOOO0;
        final  CheckBox OooOOOO;
        final  CheckBox OooOOOo;
        final  CheckBox OooOOo;
        final  CheckBox OooOOo0;
        final  CheckBox OooOOoo;
        final  CheckBox OooOo0;
        final  CheckBox OooOo00;

        oO00o0(FloatWin bVar, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, CheckBox checkBox7, CheckBox checkBox8, CheckBox checkBox9, CheckBox checkBox10, CheckBox checkBox11, CheckBox checkBox12, CheckBox checkBox13, CheckBox checkBox14, CheckBox checkBox15, CheckBox checkBox16, CheckBox checkBox17, CheckBox checkBox18) {
            this.f7487OooO0Oo = checkBox;
            this.f7489OooO0o0 = checkBox2;
            this.f7488OooO0o = checkBox3;
            this.f7490OooO0oO = checkBox4;
            this.OooO0oo = checkBox5;
            this.OooO = checkBox6;
            this.OooOO0 = checkBox7;
            this.OooOO0O = checkBox8;
            this.OooOO0o = checkBox9;
            this.OooOOO0 = checkBox10;
            this.OooOOO = checkBox11;
            this.OooOOOO = checkBox12;
            this.OooOOOo = checkBox13;
            this.OooOOo0 = checkBox14;
            this.OooOOo = checkBox15;
            this.OooOOoo = checkBox16;
            this.OooOo00 = checkBox17;
            this.OooOo0 = checkBox18;
        }

        public void onClick(View view) {
            this.f7487OooO0Oo.setChecked(true);
            this.f7489OooO0o0.setChecked(true);
            this.f7488OooO0o.setChecked(true);
            this.f7490OooO0oO.setChecked(true);
            this.OooO0oo.setChecked(true);
            this.OooO.setChecked(true);
            this.OooOO0.setChecked(true);
            this.OooOO0O.setChecked(true);
            this.OooOO0o.setChecked(true);
            this.OooOOO0.setChecked(true);
            this.OooOOO.setChecked(true);
            this.OooOOOO.setChecked(true);
            this.OooOOOo.setChecked(true);
            this.OooOOo0.setChecked(true);
            this.OooOOo.setChecked(true);
            this.OooOOoo.setChecked(true);
            this.OooOo00.setChecked(true);
            this.OooOo0.setChecked(true);
        }
    }

    
    /* class for FloatWin : this.b$oO00o00 */
    public class oO00o00 implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  CheckBox f7491OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  CheckBox f7492OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  CheckBox f7493OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  CheckBox f7494OooO0oO;

        oO00o00(FloatWin bVar, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4) {
            this.f7491OooO0Oo = checkBox;
            this.f7493OooO0o0 = checkBox2;
            this.f7492OooO0o = checkBox3;
            this.f7494OooO0oO = checkBox4;
        }

        public void onClick(View view) {
            this.f7491OooO0Oo.setChecked(false);
            this.f7493OooO0o0.setChecked(false);
            this.f7492OooO0o.setChecked(false);
            this.f7494OooO0oO.setChecked(false);
        }
    }

    
    /* class for FloatWin : this.b$oO00o000 */
    public class oO00o000 implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  CheckBox f7495OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  CheckBox f7496OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  CheckBox f7497OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  CheckBox f7498OooO0oO;

        oO00o000(FloatWin bVar, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4) {
            this.f7495OooO0Oo = checkBox;
            this.f7497OooO0o0 = checkBox2;
            this.f7496OooO0o = checkBox3;
            this.f7498OooO0oO = checkBox4;
        }

        public void onClick(View view) {
            this.f7495OooO0Oo.setChecked(true);
            this.f7497OooO0o0.setChecked(true);
            this.f7496OooO0o.setChecked(true);
            this.f7498OooO0oO.setChecked(true);
        }
    }

    
    /* class for FloatWin : this.b$oO00o00O */
    public class oO00o00O implements View.OnClickListener {
        final  CheckBox OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  CheckBox f7499OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  CheckBox f7500OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  CheckBox f7501OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  CheckBox f7502OooO0oO;
        final  CheckBox OooO0oo;
        final  CheckBox OooOO0;
        final  CheckBox OooOO0O;
        final  CheckBox OooOO0o;
        final  CheckBox OooOOO;
        final  CheckBox OooOOO0;
        final  CheckBox OooOOOO;
        final  CheckBox OooOOOo;
        final  CheckBox OooOOo;
        final  CheckBox OooOOo0;
        final  CheckBox OooOOoo;
        final  CheckBox OooOo;
        final  CheckBox OooOo0;
        final  CheckBox OooOo00;
        final  CheckBox OooOo0O;
        final  CheckBox OooOo0o;
        final  CheckBox OooOoO;
        final  CheckBox OooOoO0;
        final  CheckBox OooOoOO;
        final  CheckBox OooOoo;
        final  CheckBox OooOoo0;
        final  CheckBox OooOooO;
        final  CheckBox OooOooo;
        final  CheckBox Oooo0;
        final  CheckBox Oooo000;
        final  CheckBox Oooo00O;
        final  CheckBox Oooo00o;

        oO00o00O(FloatWin bVar, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, CheckBox checkBox7, CheckBox checkBox8, CheckBox checkBox9, CheckBox checkBox10, CheckBox checkBox11, CheckBox checkBox12, CheckBox checkBox13, CheckBox checkBox14, CheckBox checkBox15, CheckBox checkBox16, CheckBox checkBox17, CheckBox checkBox18, CheckBox checkBox19, CheckBox checkBox20, CheckBox checkBox21, CheckBox checkBox22, CheckBox checkBox23, CheckBox checkBox24, CheckBox checkBox25, CheckBox checkBox26, CheckBox checkBox27, CheckBox checkBox28, CheckBox checkBox29, CheckBox checkBox30, CheckBox checkBox31, CheckBox checkBox32) {
            this.f7499OooO0Oo = checkBox;
            this.f7501OooO0o0 = checkBox2;
            this.f7500OooO0o = checkBox3;
            this.f7502OooO0oO = checkBox4;
            this.OooO0oo = checkBox5;
            this.OooO = checkBox6;
            this.OooOO0 = checkBox7;
            this.OooOO0O = checkBox8;
            this.OooOO0o = checkBox9;
            this.OooOOO0 = checkBox10;
            this.OooOOO = checkBox11;
            this.OooOOOO = checkBox12;
            this.OooOOOo = checkBox13;
            this.OooOOo0 = checkBox14;
            this.OooOOo = checkBox15;
            this.OooOOoo = checkBox16;
            this.OooOo00 = checkBox17;
            this.OooOo0 = checkBox18;
            this.OooOo0O = checkBox19;
            this.OooOo0o = checkBox20;
            this.OooOo = checkBox21;
            this.OooOoO0 = checkBox22;
            this.OooOoO = checkBox23;
            this.OooOoOO = checkBox24;
            this.OooOoo0 = checkBox25;
            this.OooOoo = checkBox26;
            this.OooOooO = checkBox27;
            this.OooOooo = checkBox28;
            this.Oooo000 = checkBox29;
            this.Oooo00O = checkBox30;
            this.Oooo00o = checkBox31;
            this.Oooo0 = checkBox32;
        }

        public void onClick(View view) {
            this.f7499OooO0Oo.setChecked(false);
            this.f7501OooO0o0.setChecked(false);
            this.f7500OooO0o.setChecked(false);
            this.f7502OooO0oO.setChecked(false);
            this.OooO0oo.setChecked(false);
            this.OooO.setChecked(false);
            this.OooOO0.setChecked(false);
            this.OooOO0O.setChecked(false);
            this.OooOO0o.setChecked(false);
            this.OooOOO0.setChecked(false);
            this.OooOOO.setChecked(false);
            this.OooOOOO.setChecked(false);
            this.OooOOOo.setChecked(false);
            this.OooOOo0.setChecked(false);
            this.OooOOo.setChecked(false);
            this.OooOOoo.setChecked(false);
            this.OooOo00.setChecked(false);
            this.OooOo0.setChecked(false);
            this.OooOo0O.setChecked(false);
            this.OooOOo0.setChecked(false);
            this.OooOo0o.setChecked(false);
            this.OooOo.setChecked(false);
            this.OooOoO0.setChecked(false);
            this.OooOoO.setChecked(false);
            this.OooOoOO.setChecked(false);
            this.OooOoo0.setChecked(false);
            this.OooOoo.setChecked(false);
            this.OooOooO.setChecked(false);
            this.OooOooo.setChecked(false);
            this.Oooo000.setChecked(false);
            this.Oooo00O.setChecked(false);
            this.Oooo00o.setChecked(false);
            this.Oooo0.setChecked(false);
        }
    }

    
    /* class for FloatWin : this.b$oO0O0 */
    public class oO0O0 implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7503OooO0Oo;

        oO0O0(ToggleButton toggleButton) {
            this.f7503OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7503OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal2", "3535");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Headshot 75% Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal2", "3636");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Headshot 75% Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oO0O00 */
    public class oO0O00 implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7505OooO0Oo;

        oO0O00(ToggleButton toggleButton) {
            this.f7505OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7505OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal2", "2929");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Jeep Unlimited Fuel Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal2", "3030");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Jeep Unlimited Fuel Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oO0O000 */
    public class oO0O000 implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7507OooO0Oo;

        oO0O000(ToggleButton toggleButton) {
            this.f7507OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7507OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "3737");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Stand Scope Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "3838");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Stand Scope Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oO0O000o */
    public class oO0O000o implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7509OooO0Oo;

        oO0O000o(ToggleButton toggleButton) {
            this.f7509OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7509OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "3333");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Medium Speed Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "3434");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Medium Speed Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oO0O00O */
    public class oO0O00O implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7511OooO0Oo;

        oO0O00O(ToggleButton toggleButton) {
            this.f7511OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7511OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "5151");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Less Recoil v2 Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "5252");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Less Recoil v2 Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oO0O00o0 */
    public class oO0O00o0 implements AdapterView.OnItemSelectedListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ArrayAdapter f7513OooO0Oo;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  RelativeLayout f7515OooO0o0;

        oO0O00o0(ArrayAdapter arrayAdapter, RelativeLayout relativeLayout) {
            this.f7513OooO0Oo = arrayAdapter;
            this.f7515OooO0o0 = relativeLayout;
        }

        @SuppressLint("WrongConstant")
        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            int i2;
            RelativeLayout relativeLayout;
            if (i == 1) {
                FloatWin bVar = FloatWin.this;
                ArrayAdapter arrayAdapter = this.f7513OooO0Oo;
                bVar.setImageStyle(arrayAdapter.getPosition((String) arrayAdapter.getItem(1)));
                ESPSyncView.ChangeImageStyle((String) this.f7513OooO0Oo.getItem(1));
                relativeLayout = this.f7515OooO0o0;
                i2 = 0;
            } else {
                FloatWin bVar2 = FloatWin.this;
                ArrayAdapter arrayAdapter2 = this.f7513OooO0Oo;
                bVar2.setImageStyle(arrayAdapter2.getPosition((String) arrayAdapter2.getItem(i)));
                ESPSyncView.ChangeImageStyle((String) this.f7513OooO0Oo.getItem(i));
                relativeLayout = this.f7515OooO0o0;
                i2 = 8;
            }
            relativeLayout.setVisibility(i2);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    
    /* class for FloatWin : this.b$oO0O00oO */
    public class oO0O00oO implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7516OooO0Oo;

        oO0O00oO(ToggleButton toggleButton) {
            this.f7516OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7516OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal2", "303");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Fix 10min Ban Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal2", "404");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Fix 10min Ban Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oO0O0O00 */
    public class oO0O0O00 implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7518OooO0Oo;

        oO0O0O00(ToggleButton toggleButton) {
            this.f7518OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            String str;
            if (this.f7518OooO0Oo.isChecked()) {
                FloatWin.this.createOver8();
                str = "on";
            } else {
                if (FloatWin.this.mFloatingView8 != null) {
                    FloatWin.this.mWindowManager8.removeView(FloatWin.this.mFloatingView8);
                }
                str = "off";
            }
            Log.d("parachutefastvalue", str);
        }
    }

    
    /* class for FloatWin : this.b$oO0O0O0o */
    public class oO0O0O0o implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7520OooO0Oo;

        oO0O0O0o(ToggleButton toggleButton) {
            this.f7520OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            String str;
            if (this.f7520OooO0Oo.isChecked()) {
                FloatWin.this.createOver5();
                str = "on";
            } else {
                if (FloatWin.this.mFloatingView5 != null) {
                    FloatWin.this.mWindowManager5.removeView(FloatWin.this.mFloatingView5);
                }
                str = "off";
            }
            Log.d("carjumpvalue", str);
        }
    }

    
    /* class for FloatWin : this.b$oO0O0Oo0 */
    public class oO0O0Oo0 implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7522OooO0Oo;

        oO0O0Oo0(ToggleButton toggleButton) {
            this.f7522OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7522OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "1717");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Instant Hit Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "1818");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Instant Hit Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oO0O0OoO */
    public class oO0O0OoO implements View.OnClickListener {
        final  CheckBox OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  CheckBox f7524OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  CheckBox f7525OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  CheckBox f7526OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  CheckBox f7527OooO0oO;
        final  CheckBox OooO0oo;
        final  CheckBox OooOO0;
        final  CheckBox OooOO0O;
        final  CheckBox OooOO0o;
        final  CheckBox OooOOO0;

        oO0O0OoO(FloatWin bVar, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, CheckBox checkBox7, CheckBox checkBox8, CheckBox checkBox9, CheckBox checkBox10) {
            this.f7524OooO0Oo = checkBox;
            this.f7526OooO0o0 = checkBox2;
            this.f7525OooO0o = checkBox3;
            this.f7527OooO0oO = checkBox4;
            this.OooO0oo = checkBox5;
            this.OooO = checkBox6;
            this.OooOO0 = checkBox7;
            this.OooOO0O = checkBox8;
            this.OooOO0o = checkBox9;
            this.OooOOO0 = checkBox10;
        }

        public void onClick(View view) {
            this.f7524OooO0Oo.setChecked(false);
            this.f7526OooO0o0.setChecked(false);
            this.f7525OooO0o.setChecked(false);
            this.f7527OooO0oO.setChecked(false);
            this.OooO0oo.setChecked(false);
            this.OooO.setChecked(false);
            this.OooOO0.setChecked(false);
            this.OooOO0O.setChecked(false);
            this.OooOO0o.setChecked(false);
            this.OooOOO0.setChecked(false);
        }
    }

    
    /* class for FloatWin : this.b$oO0OO00 */
    public class oO0OO00 implements View.OnTouchListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        private int f7528OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        private float f7529OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        private int f7530OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        private float f7531OooO0oO;
        final  WindowManager.LayoutParams OooO0oo;

        oO0OO00(WindowManager.LayoutParams layoutParams) {
            this.OooO0oo = layoutParams;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                WindowManager.LayoutParams layoutParams = this.OooO0oo;
                this.f7528OooO0Oo = layoutParams.x;
                this.f7530OooO0o0 = layoutParams.y;
                this.f7529OooO0o = motionEvent.getRawX();
                this.f7531OooO0oO = motionEvent.getRawY();
                return true;
            } else if (action != 2) {
                return false;
            } else {
                this.OooO0oo.x = this.f7528OooO0Oo + ((int) (motionEvent.getRawX() - this.f7529OooO0o));
                this.OooO0oo.y = this.f7530OooO0o0 + ((int) (motionEvent.getRawY() - this.f7531OooO0oO));
                FloatWin.this.mWindowManager2.updateViewLayout(FloatWin.this.mFloatingView2, this.OooO0oo);
                return true;
            }
        }
    }

    
    /* class for FloatWin : this.b$oO0OO00o */
    public class oO0OO00o implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7532OooO0Oo;

        oO0OO00o(ToggleButton toggleButton) {
            this.f7532OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7532OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "4747");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Remove Smoke Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "4848");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Remove Smoke Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oO0OO0O */
    public class oO0OO0O implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7534OooO0Oo;

        oO0OO0O(ToggleButton toggleButton) {
            this.f7534OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7534OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("um", "Headshot400");
               // FloatWin.this.ICEROOTCPP("CPPFinal2", "3737");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Headshot 100% Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("um", "HeadshotOFF");
               // FloatWin.this.ICEROOTCPP("CPPFinal2", "3838");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Headshot 100% Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oO0OOO00 */
    public class oO0OOO00 implements View.OnClickListener {
        final  CheckBox OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  CheckBox f7536OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  CheckBox f7537OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  CheckBox f7538OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  CheckBox f7539OooO0oO;
        final  CheckBox OooO0oo;
        final  CheckBox OooOO0;
        final  CheckBox OooOO0O;
        final  CheckBox OooOO0o;
        final  CheckBox OooOOO;
        final  CheckBox OooOOO0;
        final  CheckBox OooOOOO;
        final  CheckBox OooOOOo;
        final  CheckBox OooOOo;
        final  CheckBox OooOOo0;
        final  CheckBox OooOOoo;
        final  CheckBox OooOo;
        final  CheckBox OooOo0;
        final  CheckBox OooOo00;
        final  CheckBox OooOo0O;
        final  CheckBox OooOo0o;
        final  CheckBox OooOoO;
        final  CheckBox OooOoO0;
        final  CheckBox OooOoOO;
        final  CheckBox OooOoo;
        final  CheckBox OooOoo0;
        final  CheckBox OooOooO;
        final  CheckBox OooOooo;
        final  CheckBox Oooo0;
        final  CheckBox Oooo000;
        final  CheckBox Oooo00O;
        final  CheckBox Oooo00o;

        oO0OOO00(FloatWin bVar, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, CheckBox checkBox7, CheckBox checkBox8, CheckBox checkBox9, CheckBox checkBox10, CheckBox checkBox11, CheckBox checkBox12, CheckBox checkBox13, CheckBox checkBox14, CheckBox checkBox15, CheckBox checkBox16, CheckBox checkBox17, CheckBox checkBox18, CheckBox checkBox19, CheckBox checkBox20, CheckBox checkBox21, CheckBox checkBox22, CheckBox checkBox23, CheckBox checkBox24, CheckBox checkBox25, CheckBox checkBox26, CheckBox checkBox27, CheckBox checkBox28, CheckBox checkBox29, CheckBox checkBox30, CheckBox checkBox31, CheckBox checkBox32) {
            this.f7536OooO0Oo = checkBox;
            this.f7538OooO0o0 = checkBox2;
            this.f7537OooO0o = checkBox3;
            this.f7539OooO0oO = checkBox4;
            this.OooO0oo = checkBox5;
            this.OooO = checkBox6;
            this.OooOO0 = checkBox7;
            this.OooOO0O = checkBox8;
            this.OooOO0o = checkBox9;
            this.OooOOO0 = checkBox10;
            this.OooOOO = checkBox11;
            this.OooOOOO = checkBox12;
            this.OooOOOo = checkBox13;
            this.OooOOo0 = checkBox14;
            this.OooOOo = checkBox15;
            this.OooOOoo = checkBox16;
            this.OooOo00 = checkBox17;
            this.OooOo0 = checkBox18;
            this.OooOo0O = checkBox19;
            this.OooOo0o = checkBox20;
            this.OooOo = checkBox21;
            this.OooOoO0 = checkBox22;
            this.OooOoO = checkBox23;
            this.OooOoOO = checkBox24;
            this.OooOoo0 = checkBox25;
            this.OooOoo = checkBox26;
            this.OooOooO = checkBox27;
            this.OooOooo = checkBox28;
            this.Oooo000 = checkBox29;
            this.Oooo00O = checkBox30;
            this.Oooo00o = checkBox31;
            this.Oooo0 = checkBox32;
        }

        public void onClick(View view) {
            this.f7536OooO0Oo.setChecked(true);
            this.f7538OooO0o0.setChecked(true);
            this.f7537OooO0o.setChecked(true);
            this.f7539OooO0oO.setChecked(true);
            this.OooO0oo.setChecked(true);
            this.OooO.setChecked(true);
            this.OooOO0.setChecked(true);
            this.OooOO0O.setChecked(true);
            this.OooOO0o.setChecked(true);
            this.OooOOO0.setChecked(true);
            this.OooOOO.setChecked(true);
            this.OooOOOO.setChecked(true);
            this.OooOOOo.setChecked(true);
            this.OooOOo0.setChecked(true);
            this.OooOOo.setChecked(true);
            this.OooOOoo.setChecked(true);
            this.OooOo00.setChecked(true);
            this.OooOo0.setChecked(true);
            this.OooOo0O.setChecked(true);
            this.OooOOo0.setChecked(true);
            this.OooOo0o.setChecked(true);
            this.OooOo.setChecked(true);
            this.OooOoO0.setChecked(true);
            this.OooOoO.setChecked(true);
            this.OooOoOO.setChecked(true);
            this.OooOoo0.setChecked(true);
            this.OooOoo.setChecked(true);
            this.OooOooO.setChecked(true);
            this.OooOooo.setChecked(true);
            this.Oooo000.setChecked(true);
            this.Oooo00O.setChecked(true);
            this.Oooo00o.setChecked(true);
            this.Oooo0.setChecked(true);
        }
    }

    
    /* class for FloatWin : this.b$oO0OOo0o */
    public class oO0OOo0o implements View.OnClickListener {
        final  CheckBox OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  CheckBox f7540OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  CheckBox f7541OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  CheckBox f7542OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  CheckBox f7543OooO0oO;
        final  CheckBox OooO0oo;
        final  CheckBox OooOO0;
        final  CheckBox OooOO0O;

        oO0OOo0o(FloatWin bVar, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, CheckBox checkBox7, CheckBox checkBox8) {
            this.f7540OooO0Oo = checkBox;
            this.f7542OooO0o0 = checkBox2;
            this.f7541OooO0o = checkBox3;
            this.f7543OooO0oO = checkBox4;
            this.OooO0oo = checkBox5;
            this.OooO = checkBox6;
            this.OooOO0 = checkBox7;
            this.OooOO0O = checkBox8;
        }

        public void onClick(View view) {
            this.f7540OooO0Oo.setChecked(false);
            this.f7542OooO0o0.setChecked(false);
            this.f7541OooO0o.setChecked(false);
            this.f7543OooO0oO.setChecked(false);
            this.OooO0oo.setChecked(false);
            this.OooO.setChecked(false);
            this.OooOO0.setChecked(false);
            this.OooOO0O.setChecked(false);
        }
    }

    
    /* class for FloatWin : this.b$oO0Oo */
    public class oO0Oo implements OnColorChangedListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioButton f7544OooO00o;

        oO0Oo(RadioButton radioButton) {
            this.f7544OooO00o = radioButton;
        }

        @Override
        public void onColorChanged(int i) {
            if (this.f7544OooO00o.isChecked()) {
                FloatWin.this.setEnemyDistance(i);
                ESPSyncView.ChangeBgDist(i);
                return;
            }
            FloatWin.this.setEnemyDistanceText(i);
            ESPSyncView.ChangeTextDist(i);
        }
    }

    
    /* class for FloatWin : this.b$oO0Oo0o0 */
    public class oO0Oo0o0 implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7546OooO0Oo;

        oO0Oo0o0(ToggleButton toggleButton) {
            this.f7546OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7546OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "4343");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "No Grass Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "4444");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "No Grass Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oO0Oo0oo */
    public class oO0Oo0oo implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  CheckBox f7548OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  CheckBox f7549OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  CheckBox f7550OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  CheckBox f7551OooO0oO;
        final  CheckBox OooO0oo;

        oO0Oo0oo(FloatWin bVar, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5) {
            this.f7548OooO0Oo = checkBox;
            this.f7550OooO0o0 = checkBox2;
            this.f7549OooO0o = checkBox3;
            this.f7551OooO0oO = checkBox4;
            this.OooO0oo = checkBox5;
        }

        public void onClick(View view) {
            this.f7548OooO0Oo.setChecked(false);
            this.f7550OooO0o0.setChecked(false);
            this.f7549OooO0o.setChecked(false);
            this.f7551OooO0oO.setChecked(false);
            this.OooO0oo.setChecked(false);
        }
    }

    
    /* class for FloatWin : this.b$oO0OoOO0 */
    public class oO0OoOO0 implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  CheckBox f7552OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  CheckBox f7553OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  CheckBox f7554OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  CheckBox f7555OooO0oO;
        final  CheckBox OooO0oo;

        oO0OoOO0(FloatWin bVar, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5) {
            this.f7552OooO0Oo = checkBox;
            this.f7554OooO0o0 = checkBox2;
            this.f7553OooO0o = checkBox3;
            this.f7555OooO0oO = checkBox4;
            this.OooO0oo = checkBox5;
        }

        public void onClick(View view) {
            this.f7552OooO0Oo.setChecked(true);
            this.f7554OooO0o0.setChecked(true);
            this.f7553OooO0o.setChecked(true);
            this.f7555OooO0oO.setChecked(true);
            this.OooO0oo.setChecked(true);
        }
    }

    
    /* class for FloatWin : this.b$oO0Ooooo */
    public class oO0Ooooo implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  Switch f7556OooO00o;

        oO0Ooooo(Switch r2) {
            this.f7556OooO00o = r2;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7556OooO00o.getText()), this.f7556OooO00o.isChecked());
            FloatWin.this.SettingValue(11, this.f7556OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$oO0o0000 */
    public class oO0o0000 implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7558OooO0Oo;

        oO0o0000(ToggleButton toggleButton) {
            this.f7558OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7558OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("sockind", "07");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "No Fog Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("sockind", "08");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "No Fog Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oO0o0o */
    public class oO0o0o implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  Switch f7560OooO00o;

        oO0o0o(Switch r2) {
            this.f7560OooO00o = r2;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7560OooO00o.getText()), this.f7560OooO00o.isChecked());
            FloatWin.this.SettingValue(12, this.f7560OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$oO0oO000 */
    public class oO0oO000 implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7562OooO0Oo;

        oO0oO000(ToggleButton toggleButton) {
            this.f7562OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7562OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "2727");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Black Sky Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "2828");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Black Sky Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oOO */
    public class oOO implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  LinearLayout f7564OooO00o;

        oOO(FloatWin bVar, LinearLayout linearLayout) {
            this.f7564OooO00o = linearLayout;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f7564OooO00o.setVisibility(z ? View.VISIBLE : View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$oOO0 */
    public class oOO0 implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7565OooO0Oo;

        oOO0(ToggleButton toggleButton) {
            this.f7565OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7565OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "1313");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Aimbot 100m Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "1414");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Aimbot 100m Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    public class oOO02 implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7565OooO0Oo;

        oOO02(ToggleButton toggleButton) {
            this.f7565OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7565OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("ao", "");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Aimbot 200m Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("ao2", "");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Aimbot 200m Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    public class oOO03 implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7565OooO0Oo;

        oOO03(ToggleButton toggleButton) {
            this.f7565OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7565OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("sockind", "98");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Aimbot 300m Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("sockind", "99");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Aimbot 300m Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    public class oOO04 implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7565OooO0Oo;

        oOO04(ToggleButton toggleButton) {
            this.f7565OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7565OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("sockind", "4141");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Headshot 0 Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("sockind", "4242");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Headshot 0 Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    Process process;

    public void Shell(String str) {

        DataOutputStream dataOutputStream = null;
        try {
            process = Runtime.getRuntime().exec(str);
        } catch (IOException e) {
            e.printStackTrace();
            process = null;
        }
        if (process != null) {
            dataOutputStream = new DataOutputStream(process.getOutputStream());

            try {
                dataOutputStream.flush();
            } catch (IOException e2) {
                e2.printStackTrace();
            }

            try {
                process.waitFor();
            } catch (InterruptedException e3) {
                e3.printStackTrace();
            }
        }
    }

    public class oOO0t implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7565OooO0Oo;

        oOO0t(ToggleButton toggleButton) {
            this.f7565OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7565OooO0Oo.isChecked()) {
                Shell("su -c chmod +x "+getApplicationContext().getCacheDir()+"/"+"sockind2");
                Shell("su -c "+getApplicationContext().getCacheDir()+"/"+"sockind2"+" "+getString(R.string.tme));
               // FloatWin.this.ICEROOTCPP("sockind2", getString(R.string.tme));
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Touch Aimbot Activated!", Toast.LENGTH_SHORT);
            } else {
                if(process!=null)
                    process.destroy();
               // FloatWin.this.ICEROOTCPP("sockind2", getString(R.string.tme));
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Touch Aimbot Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oOO00 */
    public class oOO00 implements CompoundButton.OnCheckedChangeListener {
        oOO00() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin bVar;
            boolean z2;
            if (z) {
                bVar = FloatWin.this;
                z2 = true;
            } else {
                bVar = FloatWin.this;
                z2 = false;
            }
            bVar.SettingValue(11, z2);
        }
    }

    
    /* class for FloatWin : this.b$oOO000 */
    public class oOO000 implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7568OooO0Oo;

        oOO000(ToggleButton toggleButton) {
            this.f7568OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7568OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal2", "3737");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Headshot 50% Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal2", "3838");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Headshot 50% Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oOO0000 */
    public class oOO0000 implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7570OooO0Oo;

        oOO0000(ToggleButton toggleButton) {
            this.f7570OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7570OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "1919");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Long Jump Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "2020");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Long Jump Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oOO00000 */
    public class oOO00000 implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7572OooO0Oo;

        oOO00000(ToggleButton toggleButton) {
            this.f7572OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7572OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "4545");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Knock Speed Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "4646");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Knock Speed Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oOO000o */
    public class oOO000o implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7574OooO0Oo;

        oOO000o(ToggleButton toggleButton) {
            this.f7574OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7574OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "1515");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Night Mode Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "1616");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Night Mode Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oOO00O */
    public class oOO00O implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7576OooO00o;

        oOO00O(CheckBox checkBox) {
            this.f7576OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7576OooO00o.getText()), this.f7576OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$oOO00O0 */
    public class oOO00O0 implements CompoundButton.OnCheckedChangeListener {
        oOO00O0() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Toast toast;
            if (z) {
                FloatWin.this.ICEROOTCPP("fp1", "");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Fast Parachute Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("fp2", "");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Fast Parachute Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oOO00OO */
    public class oOO00OO implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7579OooO0Oo;

        oOO00OO(ToggleButton toggleButton) {
            this.f7579OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7579OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal2", "1919");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Anteena Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal2", "2020");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Anteena Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oOO0O0 */
    public class oOO0O0 implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7581OooO0Oo;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  ToggleButton f7583OooO0o0;

        oOO0O0(ToggleButton toggleButton, ToggleButton toggleButton2) {
            this.f7581OooO0Oo = toggleButton;
            this.f7583OooO0o0 = toggleButton2;
        }

        public void onClick(View view) {
            FloatWin.this.espView.setVisibility(View.GONE);
            FloatWin.this.logoView.setVisibility(View.VISIBLE);
            FloatWin.this.logoView3.setVisibility(View.GONE);
            this.f7581OooO0Oo.setChecked(false);
            this.f7583OooO0o0.setChecked(false);
        }
    }

    
    /* class for FloatWin : this.b$oOO0O000 */
    public class oOO0O000 implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7584OooO0Oo;

        oOO0O000(ToggleButton toggleButton) {
            this.f7584OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7584OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "303");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Wide View Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "404");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Wide View Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oOO0O00O */
    public class oOO0O00O implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7586OooO0Oo;

        oOO0O00O(ToggleButton toggleButton) {
            this.f7586OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7586OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "101");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Less Recoil Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "202");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Less Recoil Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oOO0O0O */
    public class oOO0O0O implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  LinearLayout f7588OooO00o;

        oOO0O0O(FloatWin bVar, LinearLayout linearLayout) {
            this.f7588OooO00o = linearLayout;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f7588OooO00o.setVisibility(z ? View.VISIBLE : View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$oOO0O0O0 */
    public class oOO0O0O0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  LinearLayout f7589OooO00o;

        oOO0O0O0(FloatWin bVar, LinearLayout linearLayout) {
            this.f7589OooO00o = linearLayout;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f7589OooO00o.setVisibility(z ? View.VISIBLE : View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$oOO0OO */
    public class oOO0OO implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  LinearLayout f7590OooO00o;

        oOO0OO(FloatWin bVar, LinearLayout linearLayout) {
            this.f7590OooO00o = linearLayout;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f7590OooO00o.setVisibility(z ? View.VISIBLE : View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$oOO0OO0O */
    public class oOO0OO0O implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  LinearLayout f7591OooO00o;

        oOO0OO0O(FloatWin bVar, LinearLayout linearLayout) {
            this.f7591OooO00o = linearLayout;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f7591OooO00o.setVisibility(z ? View.VISIBLE : View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$oOO0OOO */
    public class oOO0OOO implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CardView f7592OooO00o;

        oOO0OOO(FloatWin bVar, CardView cardView) {
            this.f7592OooO00o = cardView;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f7592OooO00o.setVisibility(z ? View.VISIBLE : View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$oOO0Oo00 */
    public class oOO0Oo00 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  ToggleButton f7593OooO00o;

        oOO0Oo00(ToggleButton toggleButton) {
            this.f7593OooO00o = toggleButton;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                FloatWin.this.logoView3.setVisibility(View.VISIBLE);
                this.f7593OooO00o.setChecked(true);
                return;
            }
            FloatWin.this.logoView3.setVisibility(View.GONE);
            this.f7593OooO00o.setChecked(false);
        }
    }

    
    /* class for FloatWin : this.b$oOO0OoO0 */
    public class oOO0OoO0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  ToggleButton f7595OooO00o;

        oOO0OoO0(ToggleButton toggleButton) {
            this.f7595OooO00o = toggleButton;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                FloatWin.this.logoView3.setVisibility(View.VISIBLE);
                this.f7595OooO00o.setChecked(true);
                return;
            }
            FloatWin.this.logoView3.setVisibility(View.GONE);
            this.f7595OooO00o.setChecked(false);
        }
    }

    
    /* class for FloatWin : this.b$oOOO00 */
    public class oOOO00 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  LinearLayout f7597OooO00o;

        oOOO00(FloatWin bVar, LinearLayout linearLayout) {
            this.f7597OooO00o = linearLayout;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f7597OooO00o.setVisibility(z ? View.VISIBLE : View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$oOOO000o */
    public class oOOO000o implements View.OnTouchListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        private int f7598OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        private float f7599OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        private int f7600OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        private float f7601OooO0oO;
        final  WindowManager.LayoutParams OooO0oo;

        oOOO000o(WindowManager.LayoutParams layoutParams) {
            this.OooO0oo = layoutParams;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                WindowManager.LayoutParams layoutParams = this.OooO0oo;
                this.f7598OooO0Oo = layoutParams.x;
                this.f7600OooO0o0 = layoutParams.y;
                this.f7599OooO0o = motionEvent.getRawX();
                this.f7601OooO0oO = motionEvent.getRawY();
                return true;
            } else if (action != 2) {
                return false;
            } else {
                this.OooO0oo.x = this.f7598OooO0Oo + ((int) (motionEvent.getRawX() - this.f7599OooO0o));
                this.OooO0oo.y = this.f7600OooO0o0 + ((int) (motionEvent.getRawY() - this.f7601OooO0oO));
                FloatWin.this.mWindowManager7.updateViewLayout(FloatWin.this.mFloatingView7, this.OooO0oo);
                return true;
            }
        }
    }

    
    /* class for FloatWin : this.b$oOOO00Oo */
    public class oOOO00Oo implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RelativeLayout f7602OooO00o;

        oOOO00Oo(FloatWin bVar, RelativeLayout relativeLayout) {
            this.f7602OooO00o = relativeLayout;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f7602OooO00o.setVisibility(z ? View.VISIBLE : View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$oOOO00o0 */
    public class oOOO00o0 implements View.OnClickListener {
        final  LinearLayout OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  LinearLayout f7603OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  LinearLayout f7604OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  LinearLayout f7605OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  LinearLayout f7606OooO0oO;
        final  LinearLayout OooO0oo;
        final  LinearLayout OooOO0;
        final  LinearLayout OooOO0O;
        final  LinearLayout OooOO0o;
        final  LinearLayout OooOOO;
        final  LinearLayout OooOOO0;
        final  LinearLayout OooOOOO;

        oOOO00o0(FloatWin bVar, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, LinearLayout linearLayout11, LinearLayout linearLayout12) {
            this.f7603OooO0Oo = linearLayout;
            this.f7605OooO0o0 = linearLayout2;
            this.f7604OooO0o = linearLayout3;
            this.f7606OooO0oO = linearLayout4;
            this.OooO0oo = linearLayout5;
            this.OooO = linearLayout6;
            this.OooOO0 = linearLayout7;
            this.OooOO0O = linearLayout8;
            this.OooOO0o = linearLayout9;
            this.OooOOO0 = linearLayout10;
            this.OooOOO = linearLayout11;
            this.OooOOOO = linearLayout12;
        }

        public void onClick(View view) {
            this.f7603OooO0Oo.setVisibility(View.VISIBLE);
            this.f7605OooO0o0.setVisibility(View.GONE);
            this.f7604OooO0o.setVisibility(View.GONE);
            this.f7606OooO0oO.setVisibility(View.GONE);
            this.OooO0oo.setVisibility(View.GONE);
            this.OooO.setVisibility(View.GONE);
            this.OooOO0.setVisibility(View.GONE);
            this.OooOO0O.setVisibility(View.GONE);
            this.OooOO0o.setVisibility(View.GONE);
            this.OooOOO0.setVisibility(View.GONE);
            this.OooOOO.setVisibility(View.GONE);
            this.OooOOOO.setVisibility(View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$oOOO0O0o */
    public class oOOO0O0o implements View.OnClickListener {
        final  LinearLayout OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  LinearLayout f7607OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  LinearLayout f7608OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  LinearLayout f7609OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  LinearLayout f7610OooO0oO;
        final  LinearLayout OooO0oo;
        final  LinearLayout OooOO0;
        final  LinearLayout OooOO0O;
        final  LinearLayout OooOO0o;
        final  LinearLayout OooOOO;
        final  LinearLayout OooOOO0;
        final  LinearLayout OooOOOO;

        oOOO0O0o(FloatWin bVar, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, LinearLayout linearLayout11, LinearLayout linearLayout12) {
            this.f7607OooO0Oo = linearLayout;
            this.f7609OooO0o0 = linearLayout2;
            this.f7608OooO0o = linearLayout3;
            this.f7610OooO0oO = linearLayout4;
            this.OooO0oo = linearLayout5;
            this.OooO = linearLayout6;
            this.OooOO0 = linearLayout7;
            this.OooOO0O = linearLayout8;
            this.OooOO0o = linearLayout9;
            this.OooOOO0 = linearLayout10;
            this.OooOOO = linearLayout11;
            this.OooOOOO = linearLayout12;
        }

        public void onClick(View view) {
            this.f7607OooO0Oo.setVisibility(View.GONE);
            this.f7609OooO0o0.setVisibility(View.VISIBLE);
            this.f7608OooO0o.setVisibility(View.GONE);
            this.f7610OooO0oO.setVisibility(View.GONE);
            this.OooO0oo.setVisibility(View.GONE);
            this.OooO.setVisibility(View.GONE);
            this.OooOO0.setVisibility(View.GONE);
            this.OooOO0O.setVisibility(View.GONE);
            this.OooOO0o.setVisibility(View.GONE);
            this.OooOOO0.setVisibility(View.GONE);
            this.OooOOO.setVisibility(View.GONE);
            this.OooOOOO.setVisibility(View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$oOOO0OO0 */
    public class oOOO0OO0 implements View.OnClickListener {
        final  LinearLayout OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  LinearLayout f7611OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  LinearLayout f7612OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  LinearLayout f7613OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  LinearLayout f7614OooO0oO;
        final  LinearLayout OooO0oo;
        final  LinearLayout OooOO0;
        final  LinearLayout OooOO0O;
        final  LinearLayout OooOO0o;
        final  LinearLayout OooOOO;
        final  LinearLayout OooOOO0;
        final  LinearLayout OooOOOO;

        oOOO0OO0(FloatWin bVar, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, LinearLayout linearLayout11, LinearLayout linearLayout12) {
            this.f7611OooO0Oo = linearLayout;
            this.f7613OooO0o0 = linearLayout2;
            this.f7612OooO0o = linearLayout3;
            this.f7614OooO0oO = linearLayout4;
            this.OooO0oo = linearLayout5;
            this.OooO = linearLayout6;
            this.OooOO0 = linearLayout7;
            this.OooOO0O = linearLayout8;
            this.OooOO0o = linearLayout9;
            this.OooOOO0 = linearLayout10;
            this.OooOOO = linearLayout11;
            this.OooOOOO = linearLayout12;
        }

        public void onClick(View view) {
            this.f7611OooO0Oo.setVisibility(View.GONE);
            this.f7613OooO0o0.setVisibility(View.GONE);
            this.f7612OooO0o.setVisibility(View.GONE);
            this.f7614OooO0oO.setVisibility(View.GONE);
            this.OooO0oo.setVisibility(View.VISIBLE);
            this.OooO.setVisibility(View.GONE);
            this.OooOO0.setVisibility(View.GONE);
            this.OooOO0O.setVisibility(View.GONE);
            this.OooOO0o.setVisibility(View.GONE);
            this.OooOOO0.setVisibility(View.GONE);
            this.OooOOO.setVisibility(View.GONE);
            this.OooOOOO.setVisibility(View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$oOOO0OOO */
    public class oOOO0OOO implements View.OnClickListener {
        final  LinearLayout OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  LinearLayout f7615OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  LinearLayout f7616OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  LinearLayout f7617OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  LinearLayout f7618OooO0oO;
        final  LinearLayout OooO0oo;
        final  LinearLayout OooOO0;
        final  LinearLayout OooOO0O;
        final  LinearLayout OooOO0o;
        final  LinearLayout OooOOO;
        final  LinearLayout OooOOO0;
        final  LinearLayout OooOOOO;

        oOOO0OOO(FloatWin bVar, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, LinearLayout linearLayout11, LinearLayout linearLayout12) {
            this.f7615OooO0Oo = linearLayout;
            this.f7617OooO0o0 = linearLayout2;
            this.f7616OooO0o = linearLayout3;
            this.f7618OooO0oO = linearLayout4;
            this.OooO0oo = linearLayout5;
            this.OooO = linearLayout6;
            this.OooOO0 = linearLayout7;
            this.OooOO0O = linearLayout8;
            this.OooOO0o = linearLayout9;
            this.OooOOO0 = linearLayout10;
            this.OooOOO = linearLayout11;
            this.OooOOOO = linearLayout12;
        }

        public void onClick(View view) {
            this.f7615OooO0Oo.setVisibility(View.GONE);
            this.f7617OooO0o0.setVisibility(View.GONE);
            this.f7616OooO0o.setVisibility(View.VISIBLE);
            this.f7618OooO0oO.setVisibility(View.GONE);
            this.OooO0oo.setVisibility(View.GONE);
            this.OooO.setVisibility(View.GONE);
            this.OooOO0.setVisibility(View.GONE);
            this.OooOO0O.setVisibility(View.GONE);
            this.OooOO0o.setVisibility(View.GONE);
            this.OooOOO0.setVisibility(View.GONE);
            this.OooOOO.setVisibility(View.GONE);
            this.OooOOOO.setVisibility(View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$oOOOOo0O */
    public class oOOOOo0O implements View.OnClickListener {
        final  LinearLayout OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  LinearLayout f7619OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  LinearLayout f7620OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  LinearLayout f7621OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  LinearLayout f7622OooO0oO;
        final  LinearLayout OooO0oo;
        final  LinearLayout OooOO0;
        final  LinearLayout OooOO0O;
        final  LinearLayout OooOO0o;
        final  LinearLayout OooOOO;
        final  LinearLayout OooOOO0;
        final  LinearLayout OooOOOO;

        oOOOOo0O(FloatWin bVar, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, LinearLayout linearLayout11, LinearLayout linearLayout12) {
            this.f7619OooO0Oo = linearLayout;
            this.f7621OooO0o0 = linearLayout2;
            this.f7620OooO0o = linearLayout3;
            this.f7622OooO0oO = linearLayout4;
            this.OooO0oo = linearLayout5;
            this.OooO = linearLayout6;
            this.OooOO0 = linearLayout7;
            this.OooOO0O = linearLayout8;
            this.OooOO0o = linearLayout9;
            this.OooOOO0 = linearLayout10;
            this.OooOOO = linearLayout11;
            this.OooOOOO = linearLayout12;
        }

        public void onClick(View view) {
            this.f7619OooO0Oo.setVisibility(View.GONE);
            this.f7621OooO0o0.setVisibility(View.GONE);
            this.f7620OooO0o.setVisibility(View.GONE);
            this.f7622OooO0oO.setVisibility(View.GONE);
            this.OooO0oo.setVisibility(View.GONE);
            this.OooO.setVisibility(View.GONE);
            this.OooOO0.setVisibility(View.GONE);
            this.OooOO0O.setVisibility(View.GONE);
            this.OooOO0o.setVisibility(View.VISIBLE);
            this.OooOOO0.setVisibility(View.GONE);
            this.OooOOO.setVisibility(View.GONE);
            this.OooOOOO.setVisibility(View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$oOOOoo00 */
    public class oOOOoo00 implements View.OnClickListener {
        final  LinearLayout OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  LinearLayout f7623OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  LinearLayout f7624OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  LinearLayout f7625OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  LinearLayout f7626OooO0oO;
        final  LinearLayout OooO0oo;
        final  LinearLayout OooOO0;
        final  LinearLayout OooOO0O;
        final  LinearLayout OooOO0o;
        final  LinearLayout OooOOO;
        final  LinearLayout OooOOO0;
        final  LinearLayout OooOOOO;

        oOOOoo00(FloatWin bVar, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, LinearLayout linearLayout11, LinearLayout linearLayout12) {
            this.f7623OooO0Oo = linearLayout;
            this.f7625OooO0o0 = linearLayout2;
            this.f7624OooO0o = linearLayout3;
            this.f7626OooO0oO = linearLayout4;
            this.OooO0oo = linearLayout5;
            this.OooO = linearLayout6;
            this.OooOO0 = linearLayout7;
            this.OooOO0O = linearLayout8;
            this.OooOO0o = linearLayout9;
            this.OooOOO0 = linearLayout10;
            this.OooOOO = linearLayout11;
            this.OooOOOO = linearLayout12;
        }

        public void onClick(View view) {
            this.f7623OooO0Oo.setVisibility(View.GONE);
            this.f7625OooO0o0.setVisibility(View.GONE);
            this.f7624OooO0o.setVisibility(View.GONE);
            this.f7626OooO0oO.setVisibility(View.VISIBLE);
            this.OooO0oo.setVisibility(View.GONE);
            this.OooO.setVisibility(View.GONE);
            this.OooOO0.setVisibility(View.GONE);
            this.OooOO0O.setVisibility(View.GONE);
            this.OooOO0o.setVisibility(View.GONE);
            this.OooOOO0.setVisibility(View.GONE);
            this.OooOOO.setVisibility(View.GONE);
            this.OooOOOO.setVisibility(View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$oOOo0000 */
    public class oOOo0000 implements View.OnClickListener {
        final  LinearLayout OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  LinearLayout f7627OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  LinearLayout f7628OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  LinearLayout f7629OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  LinearLayout f7630OooO0oO;
        final  LinearLayout OooO0oo;
        final  LinearLayout OooOO0;
        final  LinearLayout OooOO0O;
        final  LinearLayout OooOO0o;
        final  LinearLayout OooOOO;
        final  LinearLayout OooOOO0;
        final  LinearLayout OooOOOO;

        oOOo0000(FloatWin bVar, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, LinearLayout linearLayout11, LinearLayout linearLayout12) {
            this.f7627OooO0Oo = linearLayout;
            this.f7629OooO0o0 = linearLayout2;
            this.f7628OooO0o = linearLayout3;
            this.f7630OooO0oO = linearLayout4;
            this.OooO0oo = linearLayout5;
            this.OooO = linearLayout6;
            this.OooOO0 = linearLayout7;
            this.OooOO0O = linearLayout8;
            this.OooOO0o = linearLayout9;
            this.OooOOO0 = linearLayout10;
            this.OooOOO = linearLayout11;
            this.OooOOOO = linearLayout12;
        }

        public void onClick(View view) {
            this.f7627OooO0Oo.setVisibility(View.GONE);
            this.f7629OooO0o0.setVisibility(View.GONE);
            this.f7628OooO0o.setVisibility(View.GONE);
            this.f7630OooO0oO.setVisibility(View.GONE);
            this.OooO0oo.setVisibility(View.GONE);
            this.OooO.setVisibility(View.VISIBLE);
            this.OooOO0.setVisibility(View.GONE);
            this.OooOO0O.setVisibility(View.GONE);
            this.OooOO0o.setVisibility(View.GONE);
            this.OooOOO0.setVisibility(View.GONE);
            this.OooOOO.setVisibility(View.GONE);
            this.OooOOOO.setVisibility(View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$oOOo0O00 */
    public class oOOo0O00 implements View.OnClickListener {
        final  LinearLayout OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  LinearLayout f7631OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  LinearLayout f7632OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  LinearLayout f7633OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  LinearLayout f7634OooO0oO;
        final  LinearLayout OooO0oo;
        final  LinearLayout OooOO0;
        final  LinearLayout OooOO0O;
        final  LinearLayout OooOO0o;
        final  LinearLayout OooOOO;
        final  LinearLayout OooOOO0;
        final  LinearLayout OooOOOO;

        oOOo0O00(FloatWin bVar, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, LinearLayout linearLayout11, LinearLayout linearLayout12) {
            this.f7631OooO0Oo = linearLayout;
            this.f7633OooO0o0 = linearLayout2;
            this.f7632OooO0o = linearLayout3;
            this.f7634OooO0oO = linearLayout4;
            this.OooO0oo = linearLayout5;
            this.OooO = linearLayout6;
            this.OooOO0 = linearLayout7;
            this.OooOO0O = linearLayout8;
            this.OooOO0o = linearLayout9;
            this.OooOOO0 = linearLayout10;
            this.OooOOO = linearLayout11;
            this.OooOOOO = linearLayout12;
        }

        public void onClick(View view) {
            this.f7631OooO0Oo.setVisibility(View.GONE);
            this.f7633OooO0o0.setVisibility(View.GONE);
            this.f7632OooO0o.setVisibility(View.GONE);
            this.f7634OooO0oO.setVisibility(View.GONE);
            this.OooO0oo.setVisibility(View.GONE);
            this.OooO.setVisibility(View.GONE);
            this.OooOO0.setVisibility(View.VISIBLE);
            this.OooOO0O.setVisibility(View.GONE);
            this.OooOO0o.setVisibility(View.GONE);
            this.OooOOO0.setVisibility(View.GONE);
            this.OooOOO.setVisibility(View.GONE);
            this.OooOOOO.setVisibility(View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$oOOoOOO0 */
    public class oOOoOOO0 implements View.OnClickListener {
        final  CheckBox OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  CheckBox f7635OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  CheckBox f7636OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  CheckBox f7637OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  CheckBox f7638OooO0oO;
        final  CheckBox OooO0oo;

        oOOoOOO0(FloatWin bVar, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6) {
            this.f7635OooO0Oo = checkBox;
            this.f7637OooO0o0 = checkBox2;
            this.f7636OooO0o = checkBox3;
            this.f7638OooO0oO = checkBox4;
            this.OooO0oo = checkBox5;
            this.OooO = checkBox6;
        }

        public void onClick(View view) {
            this.f7635OooO0Oo.setChecked(false);
            this.f7637OooO0o0.setChecked(false);
            this.f7636OooO0o.setChecked(false);
            this.f7638OooO0oO.setChecked(false);
            this.OooO0oo.setChecked(false);
            this.OooO.setChecked(false);
        }
    }

    
    /* class for FloatWin : this.b$oOo0000O */
    public class oOo0000O implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7639OooO0Oo;

        oOo0000O(ToggleButton toggleButton) {
            this.f7639OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7639OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "101");
                FloatWin.this.ICEROOTCPP("CPPFinal2", "101");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "No Recoil Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "202");
                FloatWin.this.ICEROOTCPP("CPPFinal2", "202");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "No Recoil Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oOo000Oo */
    public class oOo000Oo implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7641OooO0Oo;

        oOo000Oo(ToggleButton toggleButton) {
            this.f7641OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7641OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "1111");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "No Recoil Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "1212");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "No Recoil Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oOo000o0 */
    public class oOo000o0 implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7643OooO0Oo;

        oOo000o0(ToggleButton toggleButton) {
            this.f7643OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7643OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "4949");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Desert Mode Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "5050");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Desert Mode Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oOo00OO0 */
    public class oOo00OO0 implements View.OnClickListener {
        final  CheckBox OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  CheckBox f7645OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  CheckBox f7646OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  CheckBox f7647OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  CheckBox f7648OooO0oO;
        final  CheckBox OooO0oo;
        final  CheckBox OooOO0;
        final  CheckBox OooOO0O;

        oOo00OO0(FloatWin bVar, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, CheckBox checkBox7, CheckBox checkBox8) {
            this.f7645OooO0Oo = checkBox;
            this.f7647OooO0o0 = checkBox2;
            this.f7646OooO0o = checkBox3;
            this.f7648OooO0oO = checkBox4;
            this.OooO0oo = checkBox5;
            this.OooO = checkBox6;
            this.OooOO0 = checkBox7;
            this.OooOO0O = checkBox8;
        }

        public void onClick(View view) {
            this.f7645OooO0Oo.setChecked(true);
            this.f7647OooO0o0.setChecked(true);
            this.f7646OooO0o.setChecked(true);
            this.f7648OooO0oO.setChecked(true);
            this.OooO0oo.setChecked(true);
            this.OooO.setChecked(true);
            this.OooOO0.setChecked(true);
            this.OooOO0O.setChecked(true);
        }
    }

    
    /* class for FloatWin : this.b$oOo00o00 */
    public class oOo00o00 implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7649OooO0Oo;

        oOo00o00(ToggleButton toggleButton) {
            this.f7649OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7649OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal2", "101");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Antishake Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal2", "202");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Antishake Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oOo00o0o */
    public class oOo00o0o implements AdapterView.OnItemSelectedListener {
        oOo00o0o() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            ESPSyncView.ChangeCross(i);
            FloatWin.this.setCross(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    
    /* class for FloatWin : this.b$oOo00ooO */
    public class oOo00ooO implements View.OnClickListener {
        final  CheckBox OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  CheckBox f7652OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  CheckBox f7653OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  CheckBox f7654OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  CheckBox f7655OooO0oO;
        final  CheckBox OooO0oo;
        final  CheckBox OooOO0;
        final  CheckBox OooOO0O;
        final  CheckBox OooOO0o;
        final  CheckBox OooOOO;
        final  CheckBox OooOOO0;
        final  CheckBox OooOOOO;
        final  CheckBox OooOOOo;
        final  CheckBox OooOOo;
        final  CheckBox OooOOo0;
        final  CheckBox OooOOoo;
        final  CheckBox OooOo0;
        final  CheckBox OooOo00;

        oOo00ooO(FloatWin bVar, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, CheckBox checkBox6, CheckBox checkBox7, CheckBox checkBox8, CheckBox checkBox9, CheckBox checkBox10, CheckBox checkBox11, CheckBox checkBox12, CheckBox checkBox13, CheckBox checkBox14, CheckBox checkBox15, CheckBox checkBox16, CheckBox checkBox17, CheckBox checkBox18) {
            this.f7652OooO0Oo = checkBox;
            this.f7654OooO0o0 = checkBox2;
            this.f7653OooO0o = checkBox3;
            this.f7655OooO0oO = checkBox4;
            this.OooO0oo = checkBox5;
            this.OooO = checkBox6;
            this.OooOO0 = checkBox7;
            this.OooOO0O = checkBox8;
            this.OooOO0o = checkBox9;
            this.OooOOO0 = checkBox10;
            this.OooOOO = checkBox11;
            this.OooOOOO = checkBox12;
            this.OooOOOo = checkBox13;
            this.OooOOo0 = checkBox14;
            this.OooOOo = checkBox15;
            this.OooOOoo = checkBox16;
            this.OooOo00 = checkBox17;
            this.OooOo0 = checkBox18;
        }

        public void onClick(View view) {
            this.f7652OooO0Oo.setChecked(false);
            this.f7654OooO0o0.setChecked(false);
            this.f7653OooO0o.setChecked(false);
            this.f7655OooO0oO.setChecked(false);
            this.OooO0oo.setChecked(false);
            this.OooO.setChecked(false);
            this.OooOO0.setChecked(false);
            this.OooOO0O.setChecked(false);
            this.OooOO0o.setChecked(false);
            this.OooOOO0.setChecked(false);
            this.OooOOO.setChecked(false);
            this.OooOOOO.setChecked(false);
            this.OooOOOo.setChecked(false);
            this.OooOOo0.setChecked(false);
            this.OooOOo.setChecked(false);
            this.OooOOoo.setChecked(false);
            this.OooOo00.setChecked(false);
            this.OooOo0.setChecked(false);
        }
    }

    
    /* class for FloatWin : this.b$oOo0o00 */
    public class oOo0o00 implements CompoundButton.OnCheckedChangeListener {
        oOo0o00() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Toast toast;
            if (z) {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "6363");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Flash Speed Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "6464");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Flash Speed Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oOo0o0oO */
    public class oOo0o0oO implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7657OooO0Oo;

        oOo0o0oO(ToggleButton toggleButton) {
            this.f7657OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7657OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "909");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Magic Bullet Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "1010");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Magic Bullet Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oOo0oooO */
    public class oOo0oooO implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7659OooO0Oo;

        oOo0oooO(ToggleButton toggleButton) {
            this.f7659OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7659OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal2", "1515");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Vehicles Speed Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal2", "1616");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Vehicles Speed Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$oo00 */
    public class oo00 implements View.OnClickListener {
        final  LinearLayout OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  LinearLayout f7661OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  LinearLayout f7662OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  LinearLayout f7663OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  LinearLayout f7664OooO0oO;
        final  LinearLayout OooO0oo;
        final  LinearLayout OooOO0;
        final  LinearLayout OooOO0O;
        final  LinearLayout OooOO0o;
        final  LinearLayout OooOOO;
        final  LinearLayout OooOOO0;
        final  LinearLayout OooOOOO;

        oo00(FloatWin bVar, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, LinearLayout linearLayout11, LinearLayout linearLayout12) {
            this.f7661OooO0Oo = linearLayout;
            this.f7663OooO0o0 = linearLayout2;
            this.f7662OooO0o = linearLayout3;
            this.f7664OooO0oO = linearLayout4;
            this.OooO0oo = linearLayout5;
            this.OooO = linearLayout6;
            this.OooOO0 = linearLayout7;
            this.OooOO0O = linearLayout8;
            this.OooOO0o = linearLayout9;
            this.OooOOO0 = linearLayout10;
            this.OooOOO = linearLayout11;
            this.OooOOOO = linearLayout12;
        }

        public void onClick(View view) {
            this.f7661OooO0Oo.setVisibility(View.GONE);
            this.f7663OooO0o0.setVisibility(View.GONE);
            this.f7662OooO0o.setVisibility(View.GONE);
            this.f7664OooO0oO.setVisibility(View.GONE);
            this.OooO0oo.setVisibility(View.GONE);
            this.OooO.setVisibility(View.GONE);
            this.OooOO0.setVisibility(View.GONE);
            this.OooOO0O.setVisibility(View.GONE);
            this.OooOO0o.setVisibility(View.GONE);
            this.OooOOO0.setVisibility(View.VISIBLE);
            this.OooOOO.setVisibility(View.GONE);
            this.OooOOOO.setVisibility(View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$oo000000 */
    public class oo000000 implements View.OnClickListener {
        final  LinearLayout OooO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  LinearLayout f7665OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  LinearLayout f7666OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  LinearLayout f7667OooO0o0;

        /* renamed from: OooO0oO  reason: collision with root package name */
        final  LinearLayout f7668OooO0oO;
        final  LinearLayout OooO0oo;
        final  LinearLayout OooOO0;
        final  LinearLayout OooOO0O;
        final  LinearLayout OooOO0o;
        final  LinearLayout OooOOO;
        final  LinearLayout OooOOO0;
        final  LinearLayout OooOOOO;

        oo000000(FloatWin bVar, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, LinearLayout linearLayout10, LinearLayout linearLayout11, LinearLayout linearLayout12) {
            this.f7665OooO0Oo = linearLayout;
            this.f7667OooO0o0 = linearLayout2;
            this.f7666OooO0o = linearLayout3;
            this.f7668OooO0oO = linearLayout4;
            this.OooO0oo = linearLayout5;
            this.OooO = linearLayout6;
            this.OooOO0 = linearLayout7;
            this.OooOO0O = linearLayout8;
            this.OooOO0o = linearLayout9;
            this.OooOOO0 = linearLayout10;
            this.OooOOO = linearLayout11;
            this.OooOOOO = linearLayout12;
        }

        public void onClick(View view) {
            this.f7665OooO0Oo.setVisibility(View.GONE);
            this.f7667OooO0o0.setVisibility(View.GONE);
            this.f7666OooO0o.setVisibility(View.GONE);
            this.f7668OooO0oO.setVisibility(View.GONE);
            this.OooO0oo.setVisibility(View.GONE);
            this.OooO.setVisibility(View.GONE);
            this.OooOO0.setVisibility(View.GONE);
            this.OooOO0O.setVisibility(View.VISIBLE);
            this.OooOO0o.setVisibility(View.GONE);
            this.OooOOO0.setVisibility(View.GONE);
            this.OooOOO.setVisibility(View.GONE);
            this.OooOOOO.setVisibility(View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$oo000o */
    public class C1916oo000o implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7669OooO00o;

        C1916oo000o(CheckBox checkBox) {
            this.f7669OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7669OooO00o.getText()), this.f7669OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$oo00o */
    public class oo00o implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7671OooO00o;

        oo00o(CheckBox checkBox) {
            this.f7671OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7671OooO00o.getText()), this.f7671OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$oo00oO */
    public class oo00oO implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7673OooO00o;

        oo00oO(CheckBox checkBox) {
            this.f7673OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7673OooO00o.getText()), this.f7673OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$oo0O */
    public class oo0O implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7675OooO00o;

        oo0O(CheckBox checkBox) {
            this.f7675OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7675OooO00o.getText()), this.f7675OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$oo0OOoo */
    public class oo0OOoo implements AdapterView.OnItemSelectedListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ArrayAdapter f7677OooO0Oo;

        /* renamed from: OooO0o  reason: collision with root package name */
        final  RadioButton f7678OooO0o;

        /* renamed from: OooO0o0  reason: collision with root package name */
        final  ArrayAdapter f7679OooO0o0;

        oo0OOoo(ArrayAdapter arrayAdapter, ArrayAdapter arrayAdapter2, RadioButton radioButton) {
            this.f7677OooO0Oo = arrayAdapter;
            this.f7679OooO0o0 = arrayAdapter2;
            this.f7678OooO0o = radioButton;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            RadioButton radioButton;
            FloatWin bVar = FloatWin.this;
            ArrayAdapter arrayAdapter = this.f7677OooO0Oo;
            bVar.setAlertStyle(arrayAdapter.getPosition((String) arrayAdapter.getItem(i)));
            ESPSyncView.ChangeAlertStyle((String) this.f7677OooO0Oo.getItem(i));
            int position = this.f7679OooO0o0.getPosition((String) this.f7677OooO0Oo.getItem(i));
            boolean z = true;
            if (position == 0 || position == 1) {
                radioButton = this.f7678OooO0o;
            } else {
                radioButton = this.f7678OooO0o;
                z = false;
            }
            radioButton.setEnabled(z);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    
    /* class for FloatWin : this.b$oo0o0O0 */
    public class oo0o0O0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7681OooO00o;

        oo0o0O0(CheckBox checkBox) {
            this.f7681OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7681OooO00o.getText()), this.f7681OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$oo0o0Oo */
    public class oo0o0Oo implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7683OooO00o;

        oo0o0Oo(CheckBox checkBox) {
            this.f7683OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7683OooO00o.getText()), this.f7683OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$oo0oO0 */
    public class oo0oO0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioButton f7685OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  ColorPickerView f7686OooO0O0;

        oo0oO0(RadioButton radioButton, ColorPickerView colorPickerView) {
            this.f7685OooO00o = radioButton;
            this.f7686OooO0O0 = colorPickerView;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            int i;
            if (z) {
                this.f7685OooO00o.setChecked(false);
                if (FloatWin.this.getColorAlert() == 100) {
                    this.f7686OooO0O0.setColor(Color.argb(180, 255, 0, 0), true);
                    i = Color.argb(180, 255, 0, 0);
                } else {
                    this.f7686OooO0O0.setColor(FloatWin.this.getColorAlert(), true);
                    i = FloatWin.this.getColorAlert();
                }
                ESPSyncView.ChangeColorAlert(i);
            }
        }
    }

    
    /* class for FloatWin : this.b$oo0oOO0 */
    public class oo0oOO0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RelativeLayout f7688OooO00o;

        oo0oOO0(FloatWin bVar, RelativeLayout relativeLayout) {
            this.f7688OooO00o = relativeLayout;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f7688OooO00o.setVisibility(z ? View.VISIBLE : View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$oo0ooO */
    public class oo0ooO implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  RadioButton f7689OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  ColorPickerView f7690OooO0O0;

        oo0ooO(RadioButton radioButton, ColorPickerView colorPickerView) {
            this.f7689OooO00o = radioButton;
            this.f7690OooO0O0 = colorPickerView;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                this.f7689OooO00o.setChecked(false);
                if (FloatWin.this.getColorAlertText() == 100) {
                    this.f7690OooO0O0.setColor(-1, true);
                    ESPSyncView.ChangeColorAlertText(-1);
                    return;
                }
                this.f7690OooO0O0.setColor(FloatWin.this.getColorAlertText(), true);
                ESPSyncView.ChangeColorAlertText(FloatWin.this.getColorAlertText());
            }
        }
    }

    
    /* class for FloatWin : this.b$ooOOO00O */
    public class ooOOO00O implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7692OooO0Oo;

        ooOOO00O(ToggleButton toggleButton) {
            this.f7692OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7692OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "2929");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Black Body Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "3030");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Black Body Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$ooOOO0Oo */
    public class ooOOO0Oo implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7694OooO0Oo;

        ooOOO0Oo(ToggleButton toggleButton) {
            this.f7694OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7694OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal2", "2121");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Sit Scope Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal2", "2222");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Sit Scope Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$ooOOOOoo */
    public class ooOOOOoo implements AdapterView.OnItemSelectedListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ArrayAdapter f7696OooO0Oo;

        ooOOOOoo(ArrayAdapter arrayAdapter) {
            this.f7696OooO0Oo = arrayAdapter;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            FloatWin bVar = FloatWin.this;
            ArrayAdapter arrayAdapter = this.f7696OooO0Oo;
            bVar.setLineStyle(arrayAdapter.getPosition((String) arrayAdapter.getItem(i)));
            ESPSyncView.ChangeLineStyle((String) this.f7696OooO0Oo.getItem(i));
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    
    /* class for FloatWin : this.b$ooo0Oo0 */
    public class ooo0Oo0 implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  SeekBar f7698OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  TextView f7699OooO0O0;

        ooo0Oo0(SeekBar seekBar, TextView textView) {
            this.f7698OooO00o = seekBar;
            this.f7699OooO0O0 = textView;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int progress = this.f7698OooO00o.getProgress();
            FloatWin.this.setStrokeBox(progress);
            ESPSyncView.ChangeStrokeBox(progress);
            this.f7699OooO0O0.setText(String.valueOf(progress));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    
    /* class for FloatWin : this.b$ooo0o */
    public class ooo0o implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7701OooO0Oo;

        ooo0o(ToggleButton toggleButton) {
            this.f7701OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            String str;
            if (this.f7701OooO0Oo.isChecked()) {
                FloatWin.this.createOver7();
                str = "on";
            } else {
                if (FloatWin.this.mFloatingView7 != null) {
                    FloatWin.this.mWindowManager7.removeView(FloatWin.this.mFloatingView7);
                }
                str = "off";
            }
            Log.d("flashspdvalue", str);
        }
    }

    
    /* class for FloatWin : this.b$ooooO000 */
    public class ooooO000 implements View.OnClickListener {

        /* renamed from: OooO0Oo  reason: collision with root package name */
        final  ToggleButton f7703OooO0Oo;

        ooooO000(ToggleButton toggleButton) {
            this.f7703OooO0Oo = toggleButton;
        }

        public void onClick(View view) {
            Toast toast;
            if (this.f7703OooO0Oo.isChecked()) {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "505");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Small Crosshair Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal1", "606");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Small Crosshair Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$ooooO0O0 */
    public class ooooO0O0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  LinearLayout f7705OooO00o;

        ooooO0O0(FloatWin bVar, LinearLayout linearLayout) {
            this.f7705OooO00o = linearLayout;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f7705OooO00o.setVisibility(z ? View.VISIBLE : View.GONE);
        }
    }

    
    /* class for FloatWin : this.b$p */
    public class C1917p implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7706OooO00o;

        C1917p(CheckBox checkBox) {
            this.f7706OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7706OooO00o.getText()), this.f7706OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$p0 */
    public class C1918p0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  Switch f7708OooO00o;

        C1918p0(Switch r2) {
            this.f7708OooO00o = r2;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7708OooO00o.getText()), this.f7708OooO00o.isChecked());
            FloatWin.this.SettingValue(6, this.f7708OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$q */
    public class C1919q implements CompoundButton.OnCheckedChangeListener {
        C1919q() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Toast toast;
            if (z) {
                FloatWin.this.ICEROOTCPP("CPPFinal2", "1313");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Cars Jumping Activated!", Toast.LENGTH_SHORT);
            } else {
                FloatWin.this.ICEROOTCPP("CPPFinal2", "1414");
                toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Cars Jumping Deactivated!", Toast.LENGTH_SHORT);
            }
            toast.show();
        }
    }

    
    /* class for FloatWin : this.b$q0 */
    public class C1920q0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  Switch f7711OooO00o;

        C1920q0(Switch r2) {
            this.f7711OooO00o = r2;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7711OooO00o.getText()), this.f7711OooO00o.isChecked());
            FloatWin.this.SettingValue(1, this.f7711OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$r */
    public class C1921r implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7713OooO00o;

        C1921r(CheckBox checkBox) {
            this.f7713OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7713OooO00o.getText()), this.f7713OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$r0 */
    public class C1922r0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  Switch f7715OooO00o;

        C1922r0(Switch r2) {
            this.f7715OooO00o = r2;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7715OooO00o.getText()), this.f7715OooO00o.isChecked());
            FloatWin.this.SettingValue(2, this.f7715OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$s */
    public class C1923s implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7717OooO00o;

        C1923s(CheckBox checkBox) {
            this.f7717OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7717OooO00o.getText()), this.f7717OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$s0 */
    public class C1924s0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  Switch f7719OooO00o;

        C1924s0(Switch r2) {
            this.f7719OooO00o = r2;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7719OooO00o.getText()), this.f7719OooO00o.isChecked());
            FloatWin.this.SettingValue(7, this.f7719OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$t */
    public class C1925t implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7721OooO00o;

        C1925t(CheckBox checkBox) {
            this.f7721OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7721OooO00o.getText()), this.f7721OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$t0 */
    public class C1926t0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  Switch f7723OooO00o;

        C1926t0(Switch r2) {
            this.f7723OooO00o = r2;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7723OooO00o.getText()), this.f7723OooO00o.isChecked());
            FloatWin.this.SettingValue(4, this.f7723OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$u */
    public class C1927u implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7725OooO00o;

        C1927u(CheckBox checkBox) {
            this.f7725OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7725OooO00o.getText()), this.f7725OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$u0 */
    public class C1928u0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  Switch f7727OooO00o;

        C1928u0(Switch r2) {
            this.f7727OooO00o = r2;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7727OooO00o.getText()), this.f7727OooO00o.isChecked());
            FloatWin.this.SettingValue(5, this.f7727OooO00o.isChecked());
        }
    }

    public class C1928u02 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  Switch f7727OooO00o;

        C1928u02(Switch r2) {
            this.f7727OooO00o = r2;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7727OooO00o.getText()), this.f7727OooO00o.isChecked());
            FloatWin.this.SettingValue(17, this.f7727OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$v */
    public class C1929v implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7729OooO00o;

        C1929v(CheckBox checkBox) {
            this.f7729OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7729OooO00o.getText()), this.f7729OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$v0 */
    public class C1930v0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  Switch f7731OooO00o;

        C1930v0(Switch r2) {
            this.f7731OooO00o = r2;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7731OooO00o.getText()), this.f7731OooO00o.isChecked());
            FloatWin.this.SettingValue(3, this.f7731OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$w */
    public class C1931w implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7733OooO00o;

        C1931w(CheckBox checkBox) {
            this.f7733OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7733OooO00o.getText()), this.f7733OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$w0 */
    public class C1932w0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7735OooO00o;

        C1932w0(CheckBox checkBox) {
            this.f7735OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7735OooO00o.getText()), this.f7735OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$x */
    public class C1933x implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7737OooO00o;

        C1933x(CheckBox checkBox) {
            this.f7737OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7737OooO00o.getText()), this.f7737OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$x0 */
    public class C1934x0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7739OooO00o;

        C1934x0(CheckBox checkBox) {
            this.f7739OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7739OooO00o.getText()), this.f7739OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$y */
    public class C1935y implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7741OooO00o;

        C1935y(CheckBox checkBox) {
            this.f7741OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7741OooO00o.getText()), this.f7741OooO00o.isChecked());
        }
    }

    
    /* class for FloatWin : this.b$y0 */
    public class C1936y0 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7743OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        final  CheckBox f7744OooO0O0;

        /* renamed from: OooO0OO  reason: collision with root package name */
        final  CheckBox f7745OooO0OO;

        C1936y0(CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3) {
            this.f7743OooO00o = checkBox;
            this.f7744OooO0O0 = checkBox2;
            this.f7745OooO0OO = checkBox3;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue("MaterialDistance", this.f7743OooO00o.isChecked());
            if (z) {
                this.f7744OooO0O0.setChecked(false);
                this.f7745OooO0OO.setChecked(false);
            }
        }
    }

    
    /* class for FloatWin : this.b$z */
    public class C1937z implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7747OooO00o;

        C1937z(CheckBox checkBox) {
            this.f7747OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7747OooO00o.getText()), this.f7747OooO00o.isChecked());
        }
    }
    public class C1937z1 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: OooO00o  reason: collision with root package name */
        final  CheckBox f7747OooO00o;

        C1937z1(CheckBox checkBox) {
            this.f7747OooO00o = checkBox;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FloatWin.this.setValue(String.valueOf(this.f7747OooO00o.getText()), this.f7747OooO00o.isChecked());
        }
    }

    static {
        int[] iArr = new int[134];
        // fill-array-data instruction
        iArr[0] = 2131296295;
        iArr[1] = 2131296450;
        iArr[2] = 2131296448;
        iArr[3] = 2131296291;
        iArr[4] = 2131296337;
        iArr[5] = 2131296372;
        iArr[6] = 2131296294;
        iArr[7] = 2131296424;
        iArr[8] = 2131296297;
        iArr[9] = 2131296388;
        iArr[10] = 2131296411;
        iArr[11] = 2131296432;
        iArr[12] = 2131296433;
        iArr[13] = 2131296443;
        iArr[14] = 2131296449;
        iArr[15] = 2131296392;
        iArr[16] = 2131296286;
        iArr[17] = 2131296375;
        iArr[18] = 2131296324;
        iArr[19] = 2131296267;
        iArr[20] = 2131296330;
        iArr[21] = 2131296340;
        iArr[22] = 2131296632;
        iArr[23] = 2131297059;
        iArr[24] = 2131296815;
        iArr[25] = 2131297284;
        iArr[26] = 2131297262;
        iArr[27] = 2131296779;
        iArr[28] = 2131297136;
        iArr[29] = 2131296755;
        iArr[30] = 2131296263;
        iArr[31] = 2131296403;
        iArr[32] = 2131296421;
        iArr[33] = 2131296420;
        iArr[34] = 2131296387;
        iArr[35] = 2131296379;
        iArr[36] = 2131296373;
        iArr[37] = 2131296453;
        iArr[38] = 2131296461;
        iArr[39] = 2131296262;
        iArr[40] = 2131296382;
        iArr[41] = 2131296415;
        iArr[42] = 2131296381;
        iArr[43] = 2131296378;
        iArr[44] = 2131296390;
        iArr[45] = 2131296357;
        iArr[46] = 2131296404;
        iArr[47] = 2131296259;
        iArr[48] = 2131296361;
        iArr[49] = 2131296412;
        iArr[50] = 2131296335;
        iArr[51] = 2131296414;
        iArr[52] = 2131296413;
        iArr[53] = 2131296423;
        iArr[54] = 2131296447;
        iArr[55] = 2131296384;
        iArr[56] = 2131296454;
        iArr[57] = 2131296452;
        iArr[58] = 2131296409;
        iArr[59] = 2131296460;
        iArr[60] = 2131296399;
        iArr[61] = 2131296397;
        iArr[62] = 2131296410;
        iArr[63] = 2131296398;
        iArr[64] = 2131296338;
        iArr[65] = 2131296426;
        iArr[66] = 2131296385;
        iArr[67] = 2131296402;
        iArr[68] = 2131296389;
        iArr[69] = 2131297170;
        iArr[70] = 2131296766;
        iArr[71] = 2131296767;
        iArr[72] = 2131296995;
        iArr[73] = 2131297285;
        iArr[74] = 2131297010;
        iArr[75] = 2131296325;
        iArr[76] = 2131296431;
        iArr[77] = 2131296336;
        iArr[78] = 2131296380;
        iArr[79] = 2131296360;
        iArr[80] = 2131296430;
        iArr[81] = 2131296391;
        iArr[82] = 2131296401;
        iArr[83] = 2131296264;
        iArr[84] = 2131296342;
        iArr[85] = 2131296352;
        iArr[86] = 2131296290;
        iArr[87] = 2131296386;
        iArr[88] = 2131296353;
        iArr[89] = 2131296362;
        iArr[90] = 2131296451;
        iArr[91] = 2131296292;
        iArr[92] = 2131296329;
        iArr[93] = 2131296355;
        iArr[94] = 2131296354;
        iArr[95] = 2131296281;
        iArr[96] = 2131296441;
        iArr[97] = 2131296341;
        iArr[98] = 2131296356;
        iArr[99] = 2131296437;
        iArr[100] = 2131296364;
        iArr[101] = 2131296434;
        iArr[102] = 2131296438;
        iArr[103] = 2131296436;
        iArr[104] = 2131296346;
        iArr[105] = 2131296406;
        iArr[106] = 2131296347;
        iArr[107] = 2131296407;
        iArr[108] = 2131296348;
        iArr[109] = 2131296343;
        iArr[110] = 2131296344;
        iArr[111] = 2131296405;
        iArr[112] = 2131296345;
        iArr[113] = 2131296408;
        iArr[114] = 2131296296;
        iArr[115] = 2131296446;
        iArr[116] = 2131296376;
        iArr[117] = 2131296280;
        iArr[118] = 2131296377;
        iArr[119] = 2131296455;
        iArr[120] = 2131296358;
        iArr[121] = 2131296282;
        iArr[122] = 2131296332;
        iArr[123] = 2131296287;
        iArr[124] = 2131296288;
        iArr[125] = 2131296289;
        iArr[126] = 2131296365;
        iArr[127] = 2131296366;
        iArr[128] = 2131296367;
        iArr[129] = 2131296456;
        iArr[130] = 2131296457;
        iArr[131] = 2131296458;
        iArr[132] = 2131296435;
        iArr[133] = 2131296334;
        ITEM_ID = iArr;
        System.loadLibrary("native-lib");
    }

    private void ExecuteElf(String str) {
        try {
            Runtime.getRuntime().exec(str, (String[]) null, (File) null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void HideFloat() {
        FloatWin bVar = Instance;
        if (bVar != null) {
            bVar.Hide();
        }
    }

    private void ICEROOT(String str, String str2) {
        try {
            Process exec = Runtime.getRuntime().exec("su");
            DataOutputStream dataOutputStream = new DataOutputStream(exec.getOutputStream());
            dataOutputStream.writeBytes("chmod 777 /data/media/0/Android/data/com.android.vending/files/installer/" + str + "\n");
            dataOutputStream.writeBytes("su -c /data/media/0/Android/data/com.android.vending/files/installer/" + str + "\n");
            dataOutputStream.flush();
            dataOutputStream.writeBytes("exit\n");
            dataOutputStream.flush();
            exec.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    
    
    private void ICEROOTCPP(String str, String str2) {
        String str3 = getFilesDir().toString() + "/data/" + str;
        try {
            Runtime.getRuntime().exec("chmod 777 " + str3);
        } catch (IOException unused) {
        }
        ExecuteElf("su -c ./%d %u".replace("%d", str3).replace("%u", str2));
    }
    
    public  void OooO0O0(Switch r1, CompoundButton compoundButton, boolean z) {
        setValue(String.valueOf(r1.getText()), r1.isChecked());
        SettingValue(13, r1.isChecked());
    }

    private String getType() {
        return getSharedPreferences("espValue", 0).getString("type", "1");
    }

    
    
    private void setValue(String str, boolean z) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    private void userchek() {
    }

    public native void AimBy(int i);

    public native void AimWhen(int i);

    public void Hide() {
        mFloatingView3.callOnClick();
        stopSelf();
        //System.exit(-1);
    }

    
    public void Init() {

        Switch logoby = (Switch) this.mFloatingView.findViewById(R.id.isESP);
        logoby.setChecked(Overlay.isRunning());
        logoby.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Overlay.Start(getApplicationContext(), gameType, bit);
                }else {
                    Overlay.Stop(getApplicationContext());
                }
            }
        });

        ToggleButton logobypas=mFloatingView.findViewById(R.id.islogobypass);
        logobypas.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast toast;
                if (isChecked) {
                    FloatWin.this.ICEROOTCPP("cpp", "0 1");
                    toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Logo Bypass!", Toast.LENGTH_SHORT);
                } else {
                    FloatWin.this.ICEROOTCPP("cpp", "0 0");
                    toast = Toast.makeText(FloatWin.this.getApplicationContext(), "Logo Bypass!", Toast.LENGTH_SHORT);
                }
                toast.show();
            }
        });
        CheckBox checkBox;
        CheckBox checkBox2;
        CheckBox checkBox3;
        int i;
        int i2;
        int i3;
        CheckBox checkBox4 = (CheckBox) this.mFloatingView.findViewById(R.id.dual);
        CheckBox checkBox5 = (CheckBox) this.mFloatingView.findViewById(R.id.meterial);
        CheckBox checkBox6 = (CheckBox) this.mFloatingView.findViewById(R.id.meterialdistance);
        checkBox5.setChecked(getConfig("Material"));
        checkBox5.setOnCheckedChangeListener(new C1884d(checkBox5, checkBox4, checkBox6));
        checkBox6.setChecked(getConfig("MaterialDistance"));
        checkBox6.setOnCheckedChangeListener(new C1888f(checkBox6, checkBox4, checkBox5));
        checkBox4.setChecked(getConfig("Dual"));
        checkBox4.setOnCheckedChangeListener(new C1890g(checkBox4, checkBox5, checkBox6));
        TextView textView = (TextView) this.mFloatingView.findViewById(R.id.positionText);
        SeekBar seekBar = (SeekBar) this.mFloatingView.findViewById(R.id.position);
        TextView textView2 = (TextView) this.mFloatingView.findViewById(R.id.SizeText);
        SeekBar seekBar2 = (SeekBar) this.mFloatingView.findViewById(R.id.Size);
        TextView textView3 = (TextView) this.mFloatingView.findViewById(R.id.itemSizeText);
        SeekBar seekBar3 = (SeekBar) this.mFloatingView.findViewById(R.id.itemSize);
        TextView textView4 = (TextView) this.mFloatingView.findViewById(R.id.itemPositionText);
        SeekBar seekBar4 = (SeekBar) this.mFloatingView.findViewById(R.id.itemPosition);
        seekBar4.setProgress(getItemPosition());
        textView4.setText(String.valueOf(getItemPosition()));
        ESPSyncView.ChangeitemPosition(getItemPosition());
        seekBar4.setOnSeekBarChangeListener(new C1892h(seekBar4, textView4));
        seekBar3.setProgress(getItemSize());
        textView3.setText(String.valueOf(getItemSize()));
        ESPSyncView.ChangeitemSize(getItemSize());
        seekBar3.setOnSeekBarChangeListener(new C1894i(seekBar3, textView3));
        seekBar.setProgress(getPosition());
        textView.setText(String.valueOf(getPosition()));
        ESPSyncView.ChangePosition(getPosition());
        seekBar.setOnSeekBarChangeListener(new C1896j(seekBar, textView));
        seekBar2.setProgress(getSize());
        textView2.setText(String.valueOf(getSize()));
        ESPSyncView.ChangeSize(getSize());
        seekBar2.setOnSeekBarChangeListener(new C1898k(seekBar2, textView2));
        CheckBox checkBox7 = (CheckBox) this.mFloatingView.findViewById(R.id.Buggy);
        checkBox7.setChecked(getConfig((String) checkBox7.getText()));
        checkBox7.setOnCheckedChangeListener(new C1900l(checkBox7));
        CheckBox checkBox8 = (CheckBox) this.mFloatingView.findViewById(R.id.UAZ);
        checkBox8.setChecked(getConfig((String) checkBox8.getText()));
        checkBox8.setOnCheckedChangeListener(new C1902m(checkBox8));
        CheckBox checkBox9 = (CheckBox) this.mFloatingView.findViewById(R.id.Trike);
        checkBox9.setChecked(getConfig((String) checkBox9.getText()));
        checkBox9.setOnCheckedChangeListener(new C1904n(checkBox9));
        CheckBox checkBox10 = (CheckBox) this.mFloatingView.findViewById(R.id.Bike);
        checkBox10.setChecked(getConfig((String) checkBox10.getText()));
        checkBox10.setOnCheckedChangeListener(new C1917p(checkBox10));
        CheckBox checkBox11 = (CheckBox) this.mFloatingView.findViewById(R.id.Dacia);
        checkBox11.setChecked(getConfig((String) checkBox11.getText()));
        checkBox11.setOnCheckedChangeListener(new C1921r(checkBox11));
        CheckBox checkBox12 = (CheckBox) this.mFloatingView.findViewById(R.id.Jet);
        checkBox12.setChecked(getConfig((String) checkBox12.getText()));
        checkBox12.setOnCheckedChangeListener(new C1923s(checkBox12));
        CheckBox checkBox13 = (CheckBox) this.mFloatingView.findViewById(R.id.Boat);
        checkBox13.setChecked(getConfig((String) checkBox13.getText()));
        checkBox13.setOnCheckedChangeListener(new C1925t(checkBox13));
        CheckBox checkBox14 = (CheckBox) this.mFloatingView.findViewById(R.id.Scooter);
        checkBox14.setChecked(getConfig((String) checkBox14.getText()));
        checkBox14.setOnCheckedChangeListener(new C1927u(checkBox14));
        CheckBox checkBox15 = (CheckBox) this.mFloatingView.findViewById(R.id.Bus);
        checkBox15.setChecked(getConfig((String) checkBox15.getText()));
        checkBox15.setOnCheckedChangeListener(new C1929v(checkBox15));
        CheckBox checkBox16 = (CheckBox) this.mFloatingView.findViewById(R.id.Mirado);
        checkBox16.setChecked(getConfig((String) checkBox16.getText()));
        checkBox16.setOnCheckedChangeListener(new C1931w(checkBox16));
        CheckBox checkBox17 = (CheckBox) this.mFloatingView.findViewById(R.id.Rony);
        checkBox17.setChecked(getConfig((String) checkBox17.getText()));
        checkBox17.setOnCheckedChangeListener(new C1933x(checkBox17));
        CheckBox checkBox18 = (CheckBox) this.mFloatingView.findViewById(R.id.Snowbike);
        checkBox18.setChecked(getConfig((String) checkBox18.getText()));
        checkBox18.setOnCheckedChangeListener(new C1935y(checkBox18));
        CheckBox checkBox19 = (CheckBox) this.mFloatingView.findViewById(R.id.Snowmobile);
        checkBox19.setChecked(getConfig((String) checkBox19.getText()));
        checkBox19.setOnCheckedChangeListener(new C1937z(checkBox19));
        CheckBox checkBox191 = (CheckBox) this.mFloatingView.findViewById(R.id.CoupeRB);
        checkBox191.setChecked(getConfig((String) checkBox191.getText()));
        checkBox191.setOnCheckedChangeListener(new C1937z1(checkBox191));
        CheckBox checkBox20 = (CheckBox) this.mFloatingView.findViewById(R.id.Tempo);
        checkBox20.setChecked(getConfig((String) checkBox20.getText()));
        checkBox20.setOnCheckedChangeListener(new C1879a0(checkBox20));
        CheckBox checkBox21 = (CheckBox) this.mFloatingView.findViewById(R.id.Truck);
        checkBox21.setChecked(getConfig((String) checkBox21.getText()));
        checkBox21.setOnCheckedChangeListener(new C1883c0(checkBox21));
        CheckBox checkBox22 = (CheckBox) this.mFloatingView.findViewById(R.id.MonsterTruck);
        checkBox22.setChecked(getConfig((String) checkBox22.getText()));
        checkBox22.setOnCheckedChangeListener(new C1885d0(checkBox22));
        CheckBox checkBox23 = (CheckBox) this.mFloatingView.findViewById(R.id.BRDM);
        checkBox23.setChecked(getConfig((String) checkBox23.getText()));
        checkBox23.setOnCheckedChangeListener(new C1887e0(checkBox23));
        CheckBox checkBox24 = (CheckBox) this.mFloatingView.findViewById(R.id.LadaNiva);
        checkBox24.setChecked(getConfig((String) checkBox24.getText()));
        checkBox24.setOnCheckedChangeListener(new C1889f0(checkBox24));
        CheckBox checkBox25 = (CheckBox) this.mFloatingView.findViewById(R.id.CheekPad);
        checkBox25.setChecked(getConfig((String) checkBox25.getText()));
        checkBox25.setOnCheckedChangeListener(new C1891g0(checkBox25));
        CheckBox checkBox26 = (CheckBox) this.mFloatingView.findViewById(R.id.AirDrop);
        checkBox26.setChecked(getConfig((String) checkBox26.getText()));
        checkBox26.setOnCheckedChangeListener(new C1893h0(checkBox26));
        CheckBox checkBox27 = (CheckBox) this.mFloatingView.findViewById(R.id.Crate);
        checkBox27.setChecked(getConfig((String) checkBox27.getText()));
        checkBox27.setOnCheckedChangeListener(new C1895i0(checkBox27));
        CheckBox checkBox28 = (CheckBox) this.mFloatingView.findViewById(R.id.DropPlane);
        checkBox28.setChecked(getConfig((String) checkBox28.getText()));
        checkBox28.setOnCheckedChangeListener(new C1897j0(checkBox28));
        Switch r0 = (Switch) this.mFloatingView.findViewById(R.id.isEnemyWeapon);
        r0.setChecked(getConfig((String) r0.getText()));
        SettingValue(10, getConfig((String) r0.getText()));
        r0.setOnCheckedChangeListener(new C1899k0(r0));
        Switch r02 = (Switch) this.mFloatingView.findViewById(R.id.isGrenadeWarning);
        r02.setChecked(getConfig((String) r02.getText()));
        SettingValue(9, getConfig((String) r02.getText()));
        r02.setOnCheckedChangeListener(new C1901l0(r02));
        Switch r03 = (Switch) this.mFloatingView.findViewById(R.id.isSkelton);
        r03.setChecked(getConfig((String) r03.getText()));
        SettingValue(8, getConfig((String) r03.getText()));
        r03.setOnCheckedChangeListener(new C1905n0(r03));
        Switch r04 = (Switch) this.mFloatingView.findViewById(R.id.isHead);
        r04.setChecked(getConfig((String) r04.getText()));
        SettingValue(6, getConfig((String) r04.getText()));
        r04.setOnCheckedChangeListener(new C1918p0(r04));
        Switch r05 = (Switch) this.mFloatingView.findViewById(R.id.isBox);
        r05.setChecked(getConfig((String) r05.getText()));
        SettingValue(1, getConfig((String) r05.getText()));
        r05.setOnCheckedChangeListener(new C1920q0(r05));
        Switch r06 = (Switch) this.mFloatingView.findViewById(R.id.isLine);
        r06.setChecked(getConfig((String) r06.getText()));
        SettingValue(2, getConfig((String) r06.getText()));
        r06.setOnCheckedChangeListener(new C1922r0(r06));
        Switch r07 = (Switch) this.mFloatingView.findViewById(R.id.isBack);
        r07.setChecked(getConfig((String) r07.getText()));
        SettingValue(7, getConfig((String) r07.getText()));
        r07.setOnCheckedChangeListener(new C1924s0(r07));
        Switch r08 = (Switch) this.mFloatingView.findViewById(R.id.isHealth);
        r08.setChecked(getConfig((String) r08.getText()));
        SettingValue(4, getConfig((String) r08.getText()));
        r08.setOnCheckedChangeListener(new C1926t0(r08));
        Switch r09 = (Switch) this.mFloatingView.findViewById(R.id.isName);
        r09.setChecked(getConfig((String) r09.getText()));
        SettingValue(5, getConfig((String) r09.getText()));
        r09.setOnCheckedChangeListener(new C1928u0(r09));
        Switch r010 = (Switch) this.mFloatingView.findViewById(R.id.isDist);
        r010.setChecked(getConfig((String) r010.getText()));
        SettingValue(3, getConfig((String) r010.getText()));
        r010.setOnCheckedChangeListener(new C1930v0(r010));
        Switch r11 = (Switch) this.mFloatingView.findViewById(R.id.isNation);
        r11.setChecked(getConfig((String) r11.getText()));
        SettingValue(17, getConfig((String) r11.getText()));
        r11.setOnCheckedChangeListener(new C1928u02(r11));
        CheckBox checkBox29 = (CheckBox) this.mFloatingView.findViewById(R.id.canted);
        checkBox29.setChecked(getConfig((String) checkBox29.getText()));
        checkBox29.setOnCheckedChangeListener(new C1932w0(checkBox29));
        CheckBox checkBox30 = (CheckBox) this.mFloatingView.findViewById(R.id.reddot);
        checkBox30.setChecked(getConfig((String) checkBox30.getText()));
        checkBox30.setOnCheckedChangeListener(new C1934x0(checkBox30));
        CheckBox checkBox31 = (CheckBox) this.mFloatingView.findViewById(R.id.hollow);
        checkBox31.setChecked(getConfig((String) checkBox31.getText()));
        checkBox31.setOnCheckedChangeListener(new C1868OooO00o(checkBox31));
        CheckBox checkBox32 = (CheckBox) this.mFloatingView.findViewById(R.id.twox);
        checkBox32.setChecked(getConfig((String) checkBox32.getText()));
        checkBox32.setOnCheckedChangeListener(new C1869OooO0O0(checkBox32));
        CheckBox checkBox33 = (CheckBox) this.mFloatingView.findViewById(R.id.threex);
        checkBox33.setChecked(getConfig((String) checkBox33.getText()));
        checkBox33.setOnCheckedChangeListener(new C1870OooO0OO(checkBox33));
        CheckBox checkBox34 = (CheckBox) this.mFloatingView.findViewById(R.id.fourx);
        checkBox34.setChecked(getConfig((String) checkBox34.getText()));
        checkBox34.setOnCheckedChangeListener(new C1871OooO0o(checkBox34));
        CheckBox checkBox35 = (CheckBox) this.mFloatingView.findViewById(R.id.sixx);
        checkBox35.setChecked(getConfig((String) checkBox35.getText()));
        checkBox35.setOnCheckedChangeListener(new C1867OooO(checkBox35));
        CheckBox checkBox36 = (CheckBox) this.mFloatingView.findViewById(R.id.eightx);
        checkBox36.setChecked(getConfig((String) checkBox36.getText()));
        checkBox36.setOnCheckedChangeListener(new C1872OooOO0(checkBox36));
        CheckBox checkBox37 = (CheckBox) this.mFloatingView.findViewById(R.id.AWM);
        checkBox37.setChecked(getConfig((String) checkBox37.getText()));
        checkBox37.setOnCheckedChangeListener(new C1873OooOO0O(checkBox37));
        CheckBox checkBox38 = (CheckBox) this.mFloatingView.findViewById(R.id.QBU);
        checkBox38.setChecked(getConfig((String) checkBox38.getText()));
        checkBox38.setOnCheckedChangeListener(new C1875OooOOO0(checkBox38));
        CheckBox checkBox39 = (CheckBox) this.mFloatingView.findViewById(R.id.SLR);
        checkBox39.setChecked(getConfig((String) checkBox39.getText()));
        checkBox39.setOnCheckedChangeListener(new C1874OooOOO(checkBox39));
        CheckBox checkBox40 = (CheckBox) this.mFloatingView.findViewById(R.id.SKS);
        checkBox40.setChecked(getConfig((String) checkBox40.getText()));
        checkBox40.setOnCheckedChangeListener(new C1876OooOOOO(checkBox40));
        CheckBox checkBox41 = (CheckBox) this.mFloatingView.findViewById(R.id.Mini14);
        checkBox41.setChecked(getConfig((String) checkBox41.getText()));
        checkBox41.setOnCheckedChangeListener(new OooOo(checkBox41));
        CheckBox checkBox42 = (CheckBox) this.mFloatingView.findViewById(R.id.M24);
        checkBox42.setChecked(getConfig((String) checkBox42.getText()));
        checkBox42.setOnCheckedChangeListener(new Oooo000(checkBox42));
        CheckBox checkBox43 = (CheckBox) this.mFloatingView.findViewById(R.id.Kar98k);
        checkBox43.setChecked(getConfig((String) checkBox43.getText()));
        checkBox43.setOnCheckedChangeListener(new Oooo0(checkBox43));
        CheckBox checkBox44 = (CheckBox) this.mFloatingView.findViewById(R.id.VSS);
        checkBox44.setChecked(getConfig((String) checkBox44.getText()));
        checkBox44.setOnCheckedChangeListener(new o000oOoO(checkBox44));
        CheckBox checkBox45 = (CheckBox) this.mFloatingView.findViewById(R.id.Win94);
        checkBox45.setChecked(getConfig((String) checkBox45.getText()));
        checkBox45.setOnCheckedChangeListener(new o0OoOo0(checkBox45));
        CheckBox checkBox46 = (CheckBox) this.mFloatingView.findViewById(R.id.AUG);
        checkBox46.setChecked(getConfig((String) checkBox46.getText()));
        checkBox46.setOnCheckedChangeListener(new o00O0O(checkBox46));
        CheckBox checkBox47 = (CheckBox) this.mFloatingView.findViewById(R.id.M762);
        checkBox47.setChecked(getConfig((String) checkBox47.getText()));
        checkBox47.setOnCheckedChangeListener(new o00Oo0(checkBox47));
        CheckBox checkBox48 = (CheckBox) this.mFloatingView.findViewById(R.id.SCARL);
        checkBox48.setChecked(getConfig((String) checkBox48.getText()));
        checkBox48.setOnCheckedChangeListener(new o00Ooo(checkBox48));
        CheckBox checkBox49 = (CheckBox) this.mFloatingView.findViewById(R.id.M416);
        checkBox49.setChecked(getConfig((String) checkBox49.getText()));
        checkBox49.setOnCheckedChangeListener(new C1916oo000o(checkBox49));
        CheckBox checkBox50 = (CheckBox) this.mFloatingView.findViewById(R.id.M16A4);
        checkBox50.setChecked(getConfig((String) checkBox50.getText()));
        checkBox50.setOnCheckedChangeListener(new C1912o00oO0o(checkBox50));
        CheckBox checkBox51 = (CheckBox) this.mFloatingView.findViewById(R.id.Mk47Mutant);
        checkBox51.setChecked(getConfig((String) checkBox51.getText()));
        checkBox51.setOnCheckedChangeListener(new C1913o0OOO0o(checkBox51));
        CheckBox checkBox52 = (CheckBox) this.mFloatingView.findViewById(R.id.G36C);
        checkBox52.setChecked(getConfig((String) checkBox52.getText()));
        checkBox52.setOnCheckedChangeListener(new o0Oo0oo(checkBox52));
        CheckBox checkBox53 = (CheckBox) this.mFloatingView.findViewById(R.id.QBZ);
        checkBox53.setChecked(getConfig((String) checkBox53.getText()));
        checkBox53.setOnCheckedChangeListener(new o0OO00O(checkBox53));
        CheckBox checkBox54 = (CheckBox) this.mFloatingView.findViewById(R.id.AKM);
        checkBox54.setChecked(getConfig((String) checkBox54.getText()));
        checkBox54.setOnCheckedChangeListener(new oo0o0Oo(checkBox54));
        CheckBox checkBox55 = (CheckBox) this.mFloatingView.findViewById(R.id.Groza);
        checkBox55.setChecked(getConfig((String) checkBox55.getText()));
        checkBox55.setOnCheckedChangeListener(new o0O0O00(checkBox55));
        CheckBox checkBox56 = (CheckBox) this.mFloatingView.findViewById(R.id.S12K);
        checkBox56.setChecked(getConfig((String) checkBox56.getText()));
        checkBox56.setOnCheckedChangeListener(new o000OOo(checkBox56));
        CheckBox checkBox57 = (CheckBox) this.mFloatingView.findViewById(R.id.DBS);
        checkBox57.setChecked(getConfig((String) checkBox57.getText()));
        checkBox57.setOnCheckedChangeListener(new o000000(checkBox57));
        CheckBox checkBox58 = (CheckBox) this.mFloatingView.findViewById(R.id.S686);
        checkBox58.setChecked(getConfig((String) checkBox58.getText()));
        checkBox58.setOnCheckedChangeListener(new o000000O(checkBox58));
        CheckBox checkBox59 = (CheckBox) this.mFloatingView.findViewById(R.id.S1897);
        checkBox59.setChecked(getConfig((String) checkBox59.getText()));
        checkBox59.setOnCheckedChangeListener(new o00000(checkBox59));
        CheckBox checkBox60 = (CheckBox) this.mFloatingView.findViewById(R.id.SawedOff);
        checkBox60.setChecked(getConfig((String) checkBox60.getText()));
        checkBox60.setOnCheckedChangeListener(new C1909o00000O0(checkBox60));
        CheckBox checkBox61 = (CheckBox) this.mFloatingView.findViewById(R.id.TommyGun);
        checkBox61.setChecked(getConfig((String) checkBox61.getText()));
        checkBox61.setOnCheckedChangeListener(new C1910o00000OO(checkBox61));
        CheckBox checkBox62 = (CheckBox) this.mFloatingView.findViewById(R.id.MP5K);
        checkBox62.setChecked(getConfig((String) checkBox62.getText()));
        checkBox62.setOnCheckedChangeListener(new o0000Ooo(checkBox62));
        CheckBox checkBox63 = (CheckBox) this.mFloatingView.findViewById(R.id.Vector);
        checkBox63.setChecked(getConfig((String) checkBox63.getText()));
        checkBox63.setOnCheckedChangeListener(new o0000(checkBox63));
        CheckBox checkBox64 = (CheckBox) this.mFloatingView.findViewById(R.id.Uzi);
        checkBox64.setChecked(getConfig((String) checkBox64.getText()));
        checkBox64.setOnCheckedChangeListener(new o0000O00(checkBox64));
        CheckBox checkBox65 = (CheckBox) this.mFloatingView.findViewById(R.id.R1895);
        checkBox65.setChecked(getConfig((String) checkBox65.getText()));
        checkBox65.setOnCheckedChangeListener(new o0000oo(checkBox65));
        CheckBox checkBox66 = (CheckBox) this.mFloatingView.findViewById(R.id.Vz61);
        checkBox66.setChecked(getConfig((String) checkBox66.getText()));
        checkBox66.setOnCheckedChangeListener(new o0000O0(checkBox66));
        CheckBox checkBox67 = (CheckBox) this.mFloatingView.findViewById(R.id.P92);
        checkBox67.setChecked(getConfig((String) checkBox67.getText()));
        checkBox67.setOnCheckedChangeListener(new o0000O0O(checkBox67));
        CheckBox checkBox68 = (CheckBox) this.mFloatingView.findViewById(R.id.P18C);
        checkBox68.setChecked(getConfig((String) checkBox68.getText()));
        checkBox68.setOnCheckedChangeListener(new o000OO(checkBox68));
        CheckBox checkBox69 = (CheckBox) this.mFloatingView.findViewById(R.id.R45);
        checkBox69.setChecked(getConfig((String) checkBox69.getText()));
        checkBox69.setOnCheckedChangeListener(new o0000O(checkBox69));
        CheckBox checkBox70 = (CheckBox) this.mFloatingView.findViewById(R.id.P1911);
        checkBox70.setChecked(getConfig((String) checkBox70.getText()));
        checkBox70.setOnCheckedChangeListener(new o0000OO0(checkBox70));
        CheckBox checkBox71 = (CheckBox) this.mFloatingView.findViewById(R.id.DesertEagle);
        checkBox71.setChecked(getConfig((String) checkBox71.getText()));
        checkBox71.setOnCheckedChangeListener(new C1911o000O000(checkBox71));
        CheckBox checkBox72 = (CheckBox) this.mFloatingView.findViewById(R.id.Sickle);
        checkBox72.setChecked(getConfig((String) checkBox72.getText()));
        checkBox72.setOnCheckedChangeListener(new o000O0o(checkBox72));
        CheckBox checkBox73 = (CheckBox) this.mFloatingView.findViewById(R.id.Machete);
        checkBox73.setChecked(getConfig((String) checkBox73.getText()));
        checkBox73.setOnCheckedChangeListener(new o000Oo0(checkBox73));
        CheckBox checkBox74 = (CheckBox) this.mFloatingView.findViewById(R.id.Pan);
        checkBox74.setChecked(getConfig((String) checkBox74.getText()));
        checkBox74.setOnCheckedChangeListener(new o000O00(checkBox74));
        CheckBox checkBox75 = (CheckBox) this.mFloatingView.findViewById(R.id.Mk14);
        checkBox75.setChecked(getConfig((String) checkBox75.getText()));
        checkBox75.setOnCheckedChangeListener(new o000O00O(checkBox75));
        CheckBox checkBox76 = (CheckBox) this.mFloatingView.findViewById(R.id.sst);
        checkBox76.setChecked(getConfig((String) checkBox76.getText()));
        checkBox76.setOnCheckedChangeListener(new o000O0(checkBox76));
        CheckBox checkBox77 = (CheckBox) this.mFloatingView.findViewById(R.id.ffACP);
        checkBox77.setChecked(getConfig((String) checkBox77.getText()));
        checkBox77.setOnCheckedChangeListener(new o000O0Oo(checkBox77));
        CheckBox checkBox78 = (CheckBox) this.mFloatingView.findViewById(R.id.ffs);
        checkBox78.setChecked(getConfig((String) checkBox78.getText()));
        checkBox78.setOnCheckedChangeListener(new o000OO0O(checkBox78));
        CheckBox checkBox79 = (CheckBox) this.mFloatingView.findViewById(R.id.nmm);
        checkBox79.setChecked(getConfig((String) checkBox79.getText()));
        checkBox79.setOnCheckedChangeListener(new o000O0O0(checkBox79));
        CheckBox checkBox80 = (CheckBox) this.mFloatingView.findViewById(R.id.tzzMagnum);
        checkBox80.setChecked(getConfig((String) checkBox80.getText()));
        checkBox80.setOnCheckedChangeListener(new o000O(checkBox80));
        CheckBox checkBox81 = (CheckBox) this.mFloatingView.findViewById(R.id.otGuage);
        checkBox81.setChecked(getConfig((String) checkBox81.getText()));
        checkBox81.setOnCheckedChangeListener(new o000OOo0(checkBox81));
        CheckBox checkBox82 = (CheckBox) this.mFloatingView.findViewById(R.id.Choke);
        checkBox82.setChecked(getConfig((String) checkBox82.getText()));
        checkBox82.setOnCheckedChangeListener(new o00(checkBox82));
        CheckBox checkBox83 = (CheckBox) this.mFloatingView.findViewById(R.id.SniperCompensator);
        checkBox83.setChecked(getConfig((String) checkBox83.getText()));
        checkBox83.setOnCheckedChangeListener(new o00O0000(checkBox83));
        CheckBox checkBox84 = (CheckBox) this.mFloatingView.findViewById(R.id.DP28);
        checkBox84.setChecked(getConfig((String) checkBox84.getText()));
        checkBox84.setOnCheckedChangeListener(new o0O0ooO(checkBox84));
        CheckBox checkBox85 = (CheckBox) this.mFloatingView.findViewById(R.id.M249);
        checkBox85.setChecked(getConfig((String) checkBox85.getText()));
        checkBox85.setOnCheckedChangeListener(new o00oOoo(checkBox85));
        CheckBox checkBox86 = (CheckBox) this.mFloatingView.findViewById(R.id.Grenade);
        checkBox86.setChecked(getConfig((String) checkBox86.getText()));
        checkBox86.setOnCheckedChangeListener(new o00O000(checkBox86));
        CheckBox checkBox87 = (CheckBox) this.mFloatingView.findViewById(R.id.Smoke);
        checkBox87.setChecked(getConfig((String) checkBox87.getText()));
        checkBox87.setOnCheckedChangeListener(new o00O000o(checkBox87));
        CheckBox checkBox88 = (CheckBox) this.mFloatingView.findViewById(R.id.Molotov);
        checkBox88.setChecked(getConfig((String) checkBox88.getText()));
        checkBox88.setOnCheckedChangeListener(new o00O00(checkBox88));
        CheckBox checkBox89 = (CheckBox) this.mFloatingView.findViewById(R.id.Painkiller);
        checkBox89.setChecked(getConfig((String) checkBox89.getText()));
        checkBox89.setOnCheckedChangeListener(new o00O00O(checkBox89));
        CheckBox checkBox90 = (CheckBox) this.mFloatingView.findViewById(R.id.Adrenaline);
        checkBox90.setChecked(getConfig((String) checkBox90.getText()));
        checkBox90.setOnCheckedChangeListener(new oOO00O(checkBox90));
        CheckBox checkBox91 = (CheckBox) this.mFloatingView.findViewById(R.id.EnergyDrink);
        checkBox91.setChecked(getConfig((String) checkBox91.getText()));
        checkBox91.setOnCheckedChangeListener(new o00O00o0(checkBox91));
        CheckBox checkBox92 = (CheckBox) this.mFloatingView.findViewById(R.id.FirstAidKit);
        checkBox92.setChecked(getConfig((String) checkBox92.getText()));
        checkBox92.setOnCheckedChangeListener(new oo00o(checkBox92));
        CheckBox checkBox93 = (CheckBox) this.mFloatingView.findViewById(R.id.Bandage);
        checkBox93.setChecked(getConfig((String) checkBox93.getText()));
        checkBox93.setOnCheckedChangeListener(new o00O0(checkBox93));
        CheckBox checkBox94 = (CheckBox) this.mFloatingView.findViewById(R.id.Medkit);
        checkBox94.setChecked(getConfig((String) checkBox94.getText()));
        checkBox94.setOnCheckedChangeListener(new o00O0O00(checkBox94));
        CheckBox checkBox95 = (CheckBox) this.mFloatingView.findViewById(R.id.FlareGun);
        checkBox95.setChecked(getConfig((String) checkBox95.getText()));
        checkBox95.setOnCheckedChangeListener(new o00O0O0(checkBox95));
        CheckBox checkBox96 = (CheckBox) this.mFloatingView.findViewById(R.id.GullieSuit);
        checkBox96.setChecked(getConfig((String) checkBox96.getText()));
        checkBox96.setOnCheckedChangeListener(new o00O0O0O(checkBox96));
        CheckBox checkBox97 = (CheckBox) this.mFloatingView.findViewById(R.id.UMP);
        checkBox97.setChecked(getConfig((String) checkBox97.getText()));
        checkBox97.setOnCheckedChangeListener(new o00O0OO0(checkBox97));
        CheckBox checkBox98 = (CheckBox) this.mFloatingView.findViewById(R.id.Bizon);
        checkBox98.setChecked(getConfig((String) checkBox98.getText()));
        checkBox98.setOnCheckedChangeListener(new oo0o0O0(checkBox98));
        CheckBox checkBox99 = (CheckBox) this.mFloatingView.findViewById(R.id.CompensatorSMG);
        checkBox99.setChecked(getConfig((String) checkBox99.getText()));
        checkBox99.setOnCheckedChangeListener(new o00O0OO(checkBox99));
        CheckBox checkBox100 = (CheckBox) this.mFloatingView.findViewById(R.id.FlashHiderSMG);
        checkBox100.setChecked(getConfig((String) checkBox100.getText()));
        checkBox100.setOnCheckedChangeListener(new o00O0OOO(checkBox100));
        CheckBox checkBox101 = (CheckBox) this.mFloatingView.findViewById(R.id.FlashHiderAr);
        checkBox101.setChecked(getConfig((String) checkBox101.getText()));
        checkBox101.setOnCheckedChangeListener(new o00O(checkBox101));
        CheckBox checkBox102 = (CheckBox) this.mFloatingView.findViewById(R.id.ArCompensator);
        checkBox102.setChecked(getConfig((String) checkBox102.getText()));
        checkBox102.setOnCheckedChangeListener(new o00OO000(checkBox102));
        CheckBox checkBox103 = (CheckBox) this.mFloatingView.findViewById(R.id.TacticalStock);
        checkBox103.setChecked(getConfig((String) checkBox103.getText()));
        checkBox103.setOnCheckedChangeListener(new o00OO00O(checkBox103));
        CheckBox checkBox104 = (CheckBox) this.mFloatingView.findViewById(R.id.Duckbill);
        checkBox104.setChecked(getConfig((String) checkBox104.getText()));
        checkBox104.setOnCheckedChangeListener(new o00OO0O0(checkBox104));
        CheckBox checkBox105 = (CheckBox) this.mFloatingView.findViewById(R.id.FlashHiderSniper);
        checkBox105.setChecked(getConfig((String) checkBox105.getText()));
        checkBox105.setOnCheckedChangeListener(new o00OO0OO(checkBox105));
        CheckBox checkBox106 = (CheckBox) this.mFloatingView.findViewById(R.id.SuppressorSMG);
        checkBox106.setChecked(getConfig((String) checkBox106.getText()));
        checkBox106.setOnCheckedChangeListener(new oo0O(checkBox106));
        CheckBox checkBox107 = (CheckBox) this.mFloatingView.findViewById(R.id.HalfGrip);
        checkBox107.setChecked(getConfig((String) checkBox107.getText()));
        checkBox107.setOnCheckedChangeListener(new o00OO(checkBox107));
        CheckBox checkBox108 = (CheckBox) this.mFloatingView.findViewById(R.id.StockMicroUZI);
        checkBox108.setChecked(getConfig((String) checkBox108.getText()));
        checkBox108.setOnCheckedChangeListener(new o00OOO00(checkBox108));
        CheckBox checkBox109 = (CheckBox) this.mFloatingView.findViewById(R.id.SuppressorSniper);
        checkBox109.setChecked(getConfig((String) checkBox109.getText()));
        checkBox109.setOnCheckedChangeListener(new o00OOO0(checkBox109));
        CheckBox checkBox110 = (CheckBox) this.mFloatingView.findViewById(R.id.SuppressorAr);
        checkBox110.setChecked(getConfig((String) checkBox110.getText()));
        checkBox110.setOnCheckedChangeListener(new o00OOO0O(checkBox110));
        CheckBox checkBox111 = (CheckBox) this.mFloatingView.findViewById(R.id.ExQdSniper);
        checkBox111.setChecked(getConfig((String) checkBox111.getText()));
        checkBox111.setOnCheckedChangeListener(new o00OOOO0(checkBox111));
        CheckBox checkBox112 = (CheckBox) this.mFloatingView.findViewById(R.id.QdSMG);
        checkBox112.setChecked(getConfig((String) checkBox112.getText()));
        checkBox112.setOnCheckedChangeListener(new o00OOOOo(checkBox112));
        CheckBox checkBox113 = (CheckBox) this.mFloatingView.findViewById(R.id.ExSMG);
        checkBox113.setChecked(getConfig((String) checkBox113.getText()));
        checkBox113.setOnCheckedChangeListener(new o00Oo00(checkBox113));
        CheckBox checkBox114 = (CheckBox) this.mFloatingView.findViewById(R.id.QdSniper);
        checkBox114.setChecked(getConfig((String) checkBox114.getText()));
        checkBox114.setOnCheckedChangeListener(new o0oOO(checkBox114));
        CheckBox checkBox115 = (CheckBox) this.mFloatingView.findViewById(R.id.ExSniper);
        checkBox115.setChecked(getConfig((String) checkBox115.getText()));
        checkBox115.setOnCheckedChangeListener(new o0O00o0(checkBox115));
        CheckBox checkBox116 = (CheckBox) this.mFloatingView.findViewById(R.id.ExAr);
        checkBox116.setChecked(getConfig((String) checkBox116.getText()));
        checkBox116.setOnCheckedChangeListener(new oo00oO(checkBox116));
        CheckBox checkBox117 = (CheckBox) this.mFloatingView.findViewById(R.id.ExQdAr);
        checkBox117.setChecked(getConfig((String) checkBox117.getText()));
        checkBox117.setOnCheckedChangeListener(new o0oOOo(checkBox117));
        CheckBox checkBox118 = (CheckBox) this.mFloatingView.findViewById(R.id.QdAr);
        checkBox118.setChecked(getConfig((String) checkBox118.getText()));
        checkBox118.setOnCheckedChangeListener(new o0O0o(checkBox118));
        CheckBox checkBox119 = (CheckBox) this.mFloatingView.findViewById(R.id.ExQdSMG);
        checkBox119.setChecked(getConfig((String) checkBox119.getText()));
        checkBox119.setOnCheckedChangeListener(new C1907o0(checkBox119));
        CheckBox checkBox120 = (CheckBox) this.mFloatingView.findViewById(R.id.QuiverCrossBow);
        checkBox120.setChecked(getConfig((String) checkBox120.getText()));
        checkBox120.setOnCheckedChangeListener(new o0O00000(checkBox120));
        CheckBox checkBox121 = (CheckBox) this.mFloatingView.findViewById(R.id.BulletLoop);
        checkBox121.setChecked(getConfig((String) checkBox121.getText()));
        checkBox121.setOnCheckedChangeListener(new o0O000(checkBox121));
        CheckBox checkBox122 = (CheckBox) this.mFloatingView.findViewById(R.id.ThumbGrip);
        checkBox122.setChecked(getConfig((String) checkBox122.getText()));
        checkBox122.setOnCheckedChangeListener(new o0O000O(checkBox122));
        CheckBox checkBox123 = (CheckBox) this.mFloatingView.findViewById(R.id.LaserSight);
        checkBox123.setChecked(getConfig((String) checkBox123.getText()));
        checkBox123.setOnCheckedChangeListener(new o0OoOoOo(checkBox123));
        CheckBox checkBox124 = (CheckBox) this.mFloatingView.findViewById(R.id.AngledGrip);
        checkBox124.setChecked(getConfig((String) checkBox124.getText()));
        checkBox124.setOnCheckedChangeListener(new o0O000Oo(checkBox124));
        CheckBox checkBox125 = (CheckBox) this.mFloatingView.findViewById(R.id.LightGrip);
        checkBox125.setChecked(getConfig((String) checkBox125.getText()));
        checkBox125.setOnCheckedChangeListener(new o0O000o0(checkBox125));
        CheckBox checkBox126 = (CheckBox) this.mFloatingView.findViewById(R.id.VerticalGrip);
        checkBox126.setChecked(getConfig((String) checkBox126.getText()));
        checkBox126.setOnCheckedChangeListener(new o0O00(checkBox126));
        CheckBox checkBox127 = (CheckBox) this.mFloatingView.findViewById(R.id.GasCan);
        checkBox127.setChecked(getConfig((String) checkBox127.getText()));
        checkBox127.setOnCheckedChangeListener(new o0OoO00O(checkBox127));
        CheckBox checkBox128 = (CheckBox) this.mFloatingView.findViewById(R.id.Arrow);
        checkBox128.setChecked(getConfig((String) checkBox128.getText()));
        checkBox128.setOnCheckedChangeListener(new o0O00O0o(checkBox128));
        CheckBox checkBox129 = (CheckBox) this.mFloatingView.findViewById(R.id.CrossBow);
        checkBox129.setChecked(getConfig((String) checkBox129.getText()));
        checkBox129.setOnCheckedChangeListener(new o0O00O(checkBox129));
        CheckBox checkBox130 = (CheckBox) this.mFloatingView.findViewById(R.id.Baglvl1);
        checkBox130.setChecked(getConfig((String) checkBox130.getText()));
        checkBox130.setOnCheckedChangeListener(new o0O00OO(checkBox130));
        CheckBox checkBox131 = (CheckBox) this.mFloatingView.findViewById(R.id.Baglvl2);
        checkBox131.setChecked(getConfig((String) checkBox131.getText()));
        checkBox131.setOnCheckedChangeListener(new o0O00o00(checkBox131));
        CheckBox checkBox132 = (CheckBox) this.mFloatingView.findViewById(R.id.Baglvl3);
        checkBox132.setChecked(getConfig((String) checkBox132.getText()));
        checkBox132.setOnCheckedChangeListener(new o0O00oO0(checkBox132));
        CheckBox checkBox133 = (CheckBox) this.mFloatingView.findViewById(R.id.Helmetlvl1);
        checkBox133.setChecked(getConfig((String) checkBox133.getText()));
        checkBox133.setOnCheckedChangeListener(new o0O0O0O(checkBox133));
        CheckBox checkBox134 = (CheckBox) this.mFloatingView.findViewById(R.id.Helmetlvl2);
        checkBox134.setChecked(getConfig((String) checkBox134.getText()));
        checkBox134.setOnCheckedChangeListener(new o0oO0O0o(checkBox134));
        CheckBox checkBox135 = (CheckBox) this.mFloatingView.findViewById(R.id.Helmetlvl3);
        checkBox135.setChecked(getConfig((String) checkBox135.getText()));
        checkBox135.setOnCheckedChangeListener(new o0O0oo0o(checkBox135));
        CheckBox checkBox136 = (CheckBox) this.mFloatingView.findViewById(R.id.Vestlvl1);
        checkBox136.setChecked(getConfig((String) checkBox136.getText()));
        checkBox136.setOnCheckedChangeListener(new o0O0O0Oo(checkBox136));
        CheckBox checkBox137 = (CheckBox) this.mFloatingView.findViewById(R.id.Vestlvl2);
        checkBox137.setChecked(getConfig((String) checkBox137.getText()));
        checkBox137.setOnCheckedChangeListener(new o0O0O0o0(checkBox137));
        CheckBox checkBox138 = (CheckBox) this.mFloatingView.findViewById(R.id.Vestlvl3);
        checkBox138.setChecked(getConfig((String) checkBox138.getText()));
        checkBox138.setOnCheckedChangeListener(new o0O0OO0(checkBox138));
        CheckBox checkBox139 = (CheckBox) this.mFloatingView.findViewById(R.id.Stung);
        checkBox139.setChecked(getConfig((String) checkBox139.getText()));
        checkBox139.setOnCheckedChangeListener(new o0O0OOO0(checkBox139));
        CheckBox checkBox140 = (CheckBox) this.mFloatingView.findViewById(R.id.Crowbar);
        checkBox140.setChecked(getConfig((String) checkBox140.getText()));
        checkBox140.setOnCheckedChangeListener(new o0O0OOOo(checkBox140));
        ColorPickerView colorPickerView = (ColorPickerView) this.mFloatingView.findViewById(R.id.color_picker_viewcroshair);
        if (getColorCrosHair() == 100) {
            checkBox = checkBox29;
            colorPickerView.setColor(Color.argb(255, 255, 0, 0), true);
            ESPSyncView.ChangeColorCross(Color.argb(255, 255, 0, 0));
        } else {
            checkBox = checkBox29;
            colorPickerView.setColor(getColorCrosHair(), true);
            ESPSyncView.ChangeColorCross(getColorCrosHair());
        }
        colorPickerView.addOnColorChangedListener(new o0O0o000());
        TextView textView5 = (TextView) this.mFloatingView.findViewById(R.id.croshairstrokeText);
        SeekBar seekBar5 = (SeekBar) this.mFloatingView.findViewById(R.id.croshairstroke);
        seekBar5.setProgress(getStrokeCrosHair());
        textView5.setText(String.valueOf(getStrokeCrosHair()));
        ESPSyncView.ChangeStrokeCross(getStrokeCrosHair());
        seekBar5.setOnSeekBarChangeListener(new o0O0o00O(seekBar5, textView5));
        TextView textView6 = (TextView) this.mFloatingView.findViewById(R.id.croshair2strokeText);
        SeekBar seekBar6 = (SeekBar) this.mFloatingView.findViewById(R.id.croshair2stroke);
        seekBar6.setProgress(getStrokeCrosHair2());
        textView6.setText(String.valueOf(getStrokeCrosHair2()));
        ESPSyncView.ChangeStrokeCross2(getStrokeCrosHair2());
        seekBar6.setOnSeekBarChangeListener(new o0O0o0(seekBar6, textView6));
        Switch r011 = (Switch) this.mFloatingView.findViewById(R.id.isCrosHair);
        r011.setChecked(getConfig("CrossHair"));
        r011.setOnCheckedChangeListener(new o0oOo0O0(r011));
        ColorPickerView colorPickerView2 = (ColorPickerView) this.mFloatingView.findViewById(R.id.color_picker_view);
        if (getColorBox() == 100) {
            checkBox3 = checkBox18;
            checkBox2 = checkBox17;
            colorPickerView2.setColor(Color.argb(255, 199, 69, 102), true);
            i = Color.argb(255, 199, 69, 102);
        } else {
            checkBox3 = checkBox18;
            checkBox2 = checkBox17;
            colorPickerView2.setColor(getColorBox(), true);
            i = getColorBox();
        }
        ESPSyncView.ChangeColorBox(i);
        colorPickerView2.addOnColorChangedListener(new o0O0oo00());
        ColorPickerView colorPickerView3 = (ColorPickerView) this.mFloatingView.findViewById(R.id.color_picker_viewskel);
        if (getColorSkel() == 100) {
            colorPickerView3.setColor(-256, true);
            ESPSyncView.ChangeColorSkel(-256);
        } else {
            colorPickerView3.setColor(getColorSkel(), true);
            ESPSyncView.ChangeColorSkel(getColorSkel());
        }
        colorPickerView3.addOnColorChangedListener(new o0O());
        ColorPickerView colorPickerView4 = (ColorPickerView) this.mFloatingView.findViewById(R.id.color_picker_viewhead);
        if (getColorHead() == 100) {
            colorPickerView4.setColor(-256, true);
            ESPSyncView.ChangeColorHead(-256);
        } else {
            colorPickerView4.setColor(getColorHead(), true);
            ESPSyncView.ChangeColorHead(getColorHead());
        }
        colorPickerView4.addOnColorChangedListener(new o0OO000());
        ColorPickerView colorPickerView5 = (ColorPickerView) this.mFloatingView.findViewById(R.id.color_picker_viewline);
        if (getColorLine() == 100) {
            colorPickerView5.setColor(Color.argb(255, 255, 255, 0), true);
            ESPSyncView.ChangeColorLine(Color.argb(255, 221, 230, 211));
        } else {
            colorPickerView5.setColor(getColorLine(), true);
            ESPSyncView.ChangeColorLine(getColorLine());
        }
        colorPickerView5.addOnColorChangedListener(new o0OO000o());
        ColorPickerView colorPickerView6 = (ColorPickerView) this.mFloatingView.findViewById(R.id.color_picker_viewalert);
        RadioButton radioButton = (RadioButton) this.mFloatingView.findViewById(R.id.alerttheme);
        RadioButton radioButton2 = (RadioButton) this.mFloatingView.findViewById(R.id.alertthememenu);
        if (getColorAlert() == 100 && getColorAlertText() == 100) {
            colorPickerView6.setColor(Color.argb(255, 255, 255, 255), true);
            ESPSyncView.ChangeColorAlert(Color.argb(150, 246, 70, 70));
            ESPSyncView.ChangeColorAlertText(-1);
        } else {
            colorPickerView6.setColor(getColorAlert(), true);
            ESPSyncView.ChangeColorAlert(getColorAlert());
            ESPSyncView.ChangeColorAlertText(getColorAlertText());
        }
        radioButton.setOnCheckedChangeListener(new oo0oO0(radioButton2, colorPickerView6));
        radioButton2.setOnCheckedChangeListener(new oo0ooO(radioButton, colorPickerView6));
        colorPickerView6.addOnColorChangedListener(new o0OO00o0(radioButton, radioButton2));
        RadioButton radioButton3 = (RadioButton) this.mFloatingView.findViewById(R.id.fpsdefault);
        RadioButton radioButton4 = (RadioButton) this.mFloatingView.findViewById(R.id.fps60);
        RadioButton radioButton5 = (RadioButton) this.mFloatingView.findViewById(R.id.fps90);
        RadioButton radioButton6 = (RadioButton) this.mFloatingView.findViewById(R.id.fps120);
        int fps = getFps();
        if (fps == 30) {
            radioButton3.setChecked(true);
        } else if (fps == 60) {
            radioButton4.setChecked(true);
        } else if (fps == 90) {
            radioButton5.setChecked(true);
        } else {
            radioButton6.setChecked(true);
        }
        radioButton3.setOnCheckedChangeListener(new o0OO0(radioButton4, radioButton5, radioButton6));
        radioButton4.setOnCheckedChangeListener(new o0OO0O0(radioButton3, radioButton5, radioButton6));
        radioButton5.setOnCheckedChangeListener(new o0OOooO0(radioButton4, radioButton3, radioButton6));
        radioButton6.setOnCheckedChangeListener(new o0OO0o00(radioButton4, radioButton5, radioButton3));
        ColorPickerView colorPickerView7 = (ColorPickerView) this.mFloatingView.findViewById(R.id.color_picker_viewisname);
        ColorPickerView colorPickerView8 = (ColorPickerView) this.mFloatingView.findViewById(R.id.color_picker_viewisDist);
        ColorPickerView colorPickerView9 = (ColorPickerView) this.mFloatingView.findViewById(R.id.color_picker_viewisEnemyWeapon);
        RadioButton radioButton7 = (RadioButton) this.mFloatingView.findViewById(R.id.bgName);
        RadioButton radioButton8 = (RadioButton) this.mFloatingView.findViewById(R.id.bgID);
        RadioButton radioButton9 = (RadioButton) this.mFloatingView.findViewById(R.id.IDclr);
        RadioButton radioButton10 = (RadioButton) this.mFloatingView.findViewById(R.id.clrname);
        RadioButton radioButton11 = (RadioButton) this.mFloatingView.findViewById(R.id.bgDist);
        RadioButton radioButton12 = (RadioButton) this.mFloatingView.findViewById(R.id.clrDist);
        RadioButton radioButton13 = (RadioButton) this.mFloatingView.findViewById(R.id.bgEnWeapon);
        RadioButton radioButton14 = (RadioButton) this.mFloatingView.findViewById(R.id.clrEnWeapon);
        radioButton7.setOnCheckedChangeListener(new o0OO0o(radioButton10, radioButton8, radioButton9, colorPickerView7));
        radioButton10.setOnCheckedChangeListener(new o0OO0oO0(radioButton7, radioButton8, radioButton9, colorPickerView7));
        radioButton8.setOnCheckedChangeListener(new o0OO(radioButton7, radioButton10, radioButton9, colorPickerView7));
        radioButton9.setOnCheckedChangeListener(new o0OOO00(radioButton7, radioButton10, radioButton8, colorPickerView7));
        radioButton11.setOnCheckedChangeListener(new o0OOO0(radioButton12, colorPickerView8));
        radioButton12.setOnCheckedChangeListener(new o0OOOO00(radioButton11, colorPickerView8));
        radioButton13.setOnCheckedChangeListener(new o0OOOO0o(radioButton14, colorPickerView9));
        radioButton14.setOnCheckedChangeListener(new o0OOo000(radioButton13, colorPickerView9));
        if (getEnemyName() == 100 && getIDBgt() == 100 && getEnemyNameText() == 100 && getIDtext() == 100) {
            colorPickerView7.setColor(Color.argb(255, 255, 255, 255), true);
            ESPSyncView.ChangeBgName(Color.argb(200, 21, 38, 54));
            ESPSyncView.ChangeBgId(Color.argb(255, 48, 121, 162));
            ESPSyncView.ChangeTextName(-1);
            ESPSyncView.ChangeTextId(-1);
        } else {
            colorPickerView7.setColor(getEnemyName(), true);
            ESPSyncView.ChangeBgName(getEnemyName());
            ESPSyncView.ChangeBgId(getIDBgt());
            ESPSyncView.ChangeTextName(getEnemyNameText());
            ESPSyncView.ChangeTextId(getIDtext());
        }
        colorPickerView7.addOnColorChangedListener(new o0o0000(radioButton7, radioButton8, radioButton10));
        if (getEnemyDistance() == 100 && getEnemyNameText() == 100) {
            i2 = -1;
            colorPickerView8.setColor(-1, true);
            ESPSyncView.ChangeBgDist(Color.argb(255, 67, 212, 117));
        } else {
            colorPickerView8.setColor(getEnemyDistance(), true);
            ESPSyncView.ChangeBgDist(getEnemyDistance());
            i2 = getEnemyDistanceText();
        }
        ESPSyncView.ChangeTextDist(i2);
        colorPickerView8.addOnColorChangedListener(new oO0Oo(radioButton11));
        if (getEnemyWeapon() == 100 && getEnemyWeaponText() == 100) {
            colorPickerView9.setColor(Color.argb(255, 255, 255, 255), true);
            ESPSyncView.ChangeBgEnWeapon(Color.argb(200, 255, 69, 87));
            i3 = Color.argb(255, 255, 255, 255);
        } else {
            colorPickerView9.setColor(getEnemyWeapon(), true);
            ESPSyncView.ChangeBgEnWeapon(getEnemyWeapon());
            i3 = getEnemyWeaponText();
        }
        ESPSyncView.ChangeTextEnWeapon(i3);
        colorPickerView9.addOnColorChangedListener(new o0oo0000(radioButton13));
        TextView textView7 = (TextView) this.mFloatingView.findViewById(R.id.fpsText);
        TextView textView8 = (TextView) this.mFloatingView.findViewById(R.id.boxstrokeText);
        SeekBar seekBar7 = (SeekBar) this.mFloatingView.findViewById(R.id.boxstroke);
        TextView textView9 = (TextView) this.mFloatingView.findViewById(R.id.skeletonstrokeText);
        SeekBar seekBar8 = (SeekBar) this.mFloatingView.findViewById(R.id.skeletonstroke);
        TextView textView10 = (TextView) this.mFloatingView.findViewById(R.id.linestrokeText);
        SeekBar seekBar9 = (SeekBar) this.mFloatingView.findViewById(R.id.linestroke);
        seekBar7.setProgress(getStrokeBox());
        textView8.setText(String.valueOf(getStrokeBox()));
        ESPSyncView.ChangeStrokeBox(getStrokeBox());
        seekBar7.setOnSeekBarChangeListener(new ooo0Oo0(seekBar7, textView8));
        seekBar8.setProgress(getStrokeSkeleton());
        textView9.setText(String.valueOf(getStrokeSkeleton()));
        ESPSyncView.ChangeStrokeSkel(getStrokeSkeleton());
        seekBar8.setOnSeekBarChangeListener(new C1906o(seekBar8, textView9));
        seekBar9.setProgress(getStrokeLine());
        textView10.setText(String.valueOf(getStrokeLine()));
        ESPSyncView.ChangeStrokeLine(getStrokeLine());
        seekBar9.setOnSeekBarChangeListener(new oO00000(seekBar9, textView10));
        SeekBar seekBar10 = (SeekBar) this.mFloatingView.findViewById(R.id.fps);
        seekBar10.setProgress(getFps());
        textView7.setText(String.valueOf(getFps()));
        ESPSyncView.ChangeFps(getFps());
        seekBar10.setOnSeekBarChangeListener(new oO00000o(seekBar10, textView7));
        SeekBar seekBar11 = (SeekBar) this.mFloatingView.findViewById(R.id.range);
        seekBar11.setOnSeekBarChangeListener(new oO0000Oo(seekBar11));
        RadioGroup radioGroup = (RadioGroup) this.mFloatingView.findViewById(R.id.aimby);
        radioGroup.setOnCheckedChangeListener(new oO0000o0(radioGroup));
        RadioGroup radioGroup2 = (RadioGroup) this.mFloatingView.findViewById(R.id.aimwhen);
        radioGroup2.setOnCheckedChangeListener(new oO000(radioGroup2));
        RadioGroup radioGroup3 = (RadioGroup) this.mFloatingView.findViewById(R.id.aimbotmode);
        radioGroup3.setOnCheckedChangeListener(new oO000O0(radioGroup3));
        RadioGroup radioGroup4 = (RadioGroup) this.mFloatingView.findViewById(R.id.aimbotmode_onof);
        ((RadioButton) this.mFloatingView.findViewById(R.id.radio_2)).setChecked(true);
        radioGroup4.setOnCheckedChangeListener(new oO000O0O(radioGroup4, (LinearLayout) this.mFloatingView.findViewById(R.id.aimBot_section)));
        Switch r012 = (Switch) this.mFloatingView.findViewById(R.id.aimbot);
        r012.setChecked(getConfig((String) r012.getText()));
        SettingValue(11, getConfig((String) r012.getText()));
        r012.setOnCheckedChangeListener(new oO0Ooooo(r012));
        Switch r013 = (Switch) this.mFloatingView.findViewById(R.id.bullettrack);
        r013.setChecked(false);
        SettingValue(12, getConfig((String) r013.getText()));
        r013.setOnCheckedChangeListener(new oO0o0o(r013));
        Switch r014 = (Switch) this.mFloatingView.findViewById(R.id.aimknocked);
        r014.setChecked(getConfig((String) r014.getText()));
        SettingValue(13, getConfig((String) r014.getText()));
        r014.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setValue(String.valueOf(buttonView.getText()), isChecked);
                SettingValue(13,isChecked);
            }
        });
        Button button = (Button) this.mFloatingView.findViewById(R.id.CEKALL1);
        Button button2 = (Button) this.mFloatingView.findViewById(R.id.CEKALL2);
        Button button3 = (Button) this.mFloatingView.findViewById(R.id.CEKALL3);
        Button button4 = (Button) this.mFloatingView.findViewById(R.id.CEKALL4);
        Button button5 = (Button) this.mFloatingView.findViewById(R.id.CEKALL5);
        Button button6 = (Button) this.mFloatingView.findViewById(R.id.CEKALL6);
        Button button7 = (Button) this.mFloatingView.findViewById(R.id.CEKALL7);
        Button button8 = (Button) this.mFloatingView.findViewById(R.id.CEKALL8);
        Button button9 = (Button) this.mFloatingView.findViewById(R.id.CEKALL9);
        Button button10 = (Button) this.mFloatingView.findViewById(R.id.CEKALL10);
        Button button11 = (Button) this.mFloatingView.findViewById(R.id.CEKALL11);
        Button button12 = (Button) this.mFloatingView.findViewById(R.id.CEKALL12);
        Button button13 = (Button) this.mFloatingView.findViewById(R.id.CEKNONE1);
        Button button14 = (Button) this.mFloatingView.findViewById(R.id.CEKNONE2);
        Button button15 = (Button) this.mFloatingView.findViewById(R.id.CEKNONE3);
        Button button16 = (Button) this.mFloatingView.findViewById(R.id.CEKNONE4);
        Button button17 = (Button) this.mFloatingView.findViewById(R.id.CEKNONE5);
        Button button18 = (Button) this.mFloatingView.findViewById(R.id.CEKNONE6);
        Button button19 = (Button) this.mFloatingView.findViewById(R.id.CEKNONE7);
        Button button20 = (Button) this.mFloatingView.findViewById(R.id.CEKNONE8);
        Button button21 = (Button) this.mFloatingView.findViewById(R.id.CEKNONE9);
        Button button22 = (Button) this.mFloatingView.findViewById(R.id.CEKNONE10);
        Button button23 = (Button) this.mFloatingView.findViewById(R.id.CEKNONE11);
        Button button24 = (Button) this.mFloatingView.findViewById(R.id.CEKNONE12);
        button.setOnClickListener(new oO0OoOO0(this, checkBox95, checkBox96, checkBox26, checkBox28, checkBox27));
        button13.setOnClickListener(new oO0Oo0oo(this, checkBox95, checkBox96, checkBox26, checkBox28, checkBox27));
        button2.setOnClickListener(new oO000OOo(this, checkBox31, checkBox, checkBox30, checkBox32, checkBox36, checkBox33, checkBox34, checkBox35));
        button14.setOnClickListener(new oO0OOo0o(this, checkBox31, checkBox, checkBox30, checkBox32, checkBox36, checkBox33, checkBox34, checkBox35));
        button3.setOnClickListener(new oO000Oo0(this, checkBox46, checkBox47, checkBox48, checkBox49, checkBox50, checkBox51, checkBox52, checkBox53, checkBox54, checkBox55, checkBox98, checkBox61, checkBox62, checkBox97, checkBox63, checkBox64, checkBox84, checkBox85));
        button15.setOnClickListener(new oO000Oo(this, checkBox46, checkBox47, checkBox48, checkBox49, checkBox50, checkBox51, checkBox52, checkBox53, checkBox54, checkBox55, checkBox98, checkBox61, checkBox62, checkBox97, checkBox63, checkBox64, checkBox84, checkBox85));
        button4.setOnClickListener(new oO000o00(this, checkBox37, checkBox38, checkBox39, checkBox40, checkBox41, checkBox42, checkBox43, checkBox44, checkBox45, checkBox75));
        button16.setOnClickListener(new oO0O0OoO(this, checkBox37, checkBox38, checkBox39, checkBox40, checkBox41, checkBox42, checkBox43, checkBox44, checkBox45, checkBox75));
        button5.setOnClickListener(new oO00O0o0(this, checkBox56, checkBox57, checkBox58, checkBox59, checkBox72, checkBox73, checkBox129, checkBox74, checkBox140));
        button17.setOnClickListener(new oO00O0o(this, checkBox56, checkBox57, checkBox58, checkBox59, checkBox72, checkBox73, checkBox129, checkBox74, checkBox140));
        button6.setOnClickListener(new oOo00OO0(this, checkBox60, checkBox65, checkBox66, checkBox67, checkBox68, checkBox69, checkBox70, checkBox71));
        button18.setOnClickListener(new oO00O0oO(this, checkBox60, checkBox65, checkBox66, checkBox67, checkBox68, checkBox69, checkBox70, checkBox71));
        button7.setOnClickListener(new oO00OO0O(this, checkBox76, checkBox77, checkBox78, checkBox79, checkBox80, checkBox81, checkBox128));
        button19.setOnClickListener(new oO00OOOo(this, checkBox76, checkBox77, checkBox78, checkBox79, checkBox80, checkBox81, checkBox128));
        button8.setOnClickListener(new oO00OOo0(this, checkBox130, checkBox131, checkBox132, checkBox136, checkBox137, checkBox138, checkBox133, checkBox134, checkBox135));
        button20.setOnClickListener(new oO00Oo00(this, checkBox130, checkBox131, checkBox132, checkBox136, checkBox137, checkBox138, checkBox133, checkBox134, checkBox135));
        button9.setOnClickListener(new oO00Oo0(this, checkBox89, checkBox90, checkBox93, checkBox92, checkBox91, checkBox94));
        button21.setOnClickListener(new oOOoOOO0(this, checkBox89, checkBox90, checkBox93, checkBox92, checkBox91, checkBox94));
        button10.setOnClickListener(new oO00o000(this, checkBox139, checkBox86, checkBox87, checkBox88));
        button22.setOnClickListener(new oO00o00(this, checkBox139, checkBox86, checkBox87, checkBox88));
        button11.setOnClickListener(new oO0OOO00(this, checkBox101, checkBox102, checkBox99, checkBox103, checkBox104, checkBox105, checkBox106, checkBox107, checkBox82, checkBox108, checkBox83, checkBox109, checkBox110, checkBox117, checkBox112, checkBox113, checkBox111, checkBox115, checkBox116, checkBox118, checkBox119, checkBox120, checkBox121, checkBox122, checkBox123, checkBox124, checkBox125, checkBox127, checkBox100, checkBox126, checkBox25, checkBox114));
        button23.setOnClickListener(new oO00o00O(this, checkBox101, checkBox102, checkBox99, checkBox103, checkBox104, checkBox105, checkBox106, checkBox107, checkBox82, checkBox108, checkBox83, checkBox109, checkBox110, checkBox117, checkBox112, checkBox113, checkBox111, checkBox115, checkBox116, checkBox118, checkBox119, checkBox120, checkBox121, checkBox122, checkBox123, checkBox124, checkBox125, checkBox127, checkBox100, checkBox126, checkBox25, checkBox114));
        button12.setOnClickListener(new oO00o0(this, checkBox7, checkBox8, checkBox9, checkBox10, checkBox11, checkBox12, checkBox13, checkBox15, checkBox16, checkBox14, checkBox2, checkBox3, checkBox19, checkBox20, checkBox21, checkBox22, checkBox24, checkBox23));
        button24.setOnClickListener(new oOo00ooO(this, checkBox7, checkBox8, checkBox9, checkBox10, checkBox11, checkBox12, checkBox13, checkBox15, checkBox16, checkBox14, checkBox2, checkBox3, checkBox19, checkBox20, checkBox21, checkBox22, checkBox24, checkBox23));
        ToggleButton toggleButton = (ToggleButton) this.mFloatingView.findViewById(R.id.isaim32);
        ToggleButton toggleButtonis2 = (ToggleButton) this.mFloatingView.findViewById(R.id.isaim322);
        ToggleButton toggleButtonis3 = (ToggleButton) this.mFloatingView.findViewById(R.id.isaim323);
        ToggleButton toggleButtonist = (ToggleButton) this.mFloatingView.findViewById(R.id.isaim32t);
        ToggleButton toggleButtonis4 = (ToggleButton) this.mFloatingView.findViewById(R.id.isaim324);
        ToggleButton toggleButton2 = (ToggleButton) this.mFloatingView.findViewById(R.id.iswide32);
        ToggleButton toggleButton3 = (ToggleButton) this.mFloatingView.findViewById(R.id.isless32);
        ToggleButton toggleButton4 = (ToggleButton) this.mFloatingView.findViewById(R.id.isspeed32);
        ToggleButton toggleButton5 = (ToggleButton) this.mFloatingView.findViewById(R.id.isjump32);
        ToggleButton toggleButton6 = (ToggleButton) this.mFloatingView.findViewById(R.id.ismagic32);
        ToggleButton toggleButton7 = (ToggleButton) this.mFloatingView.findViewById(R.id.iscross32);
        ToggleButton toggleButton8 = (ToggleButton) this.mFloatingView.findViewById(R.id.Nightmode32);
        ToggleButton toggleButton9 = (ToggleButton) this.mFloatingView.findViewById(R.id.ant32);
        ToggleButton toggleButton10 = (ToggleButton) this.mFloatingView.findViewById(R.id.AIMLOCK32);
        ToggleButton toggleButton11 = (ToggleButton) this.mFloatingView.findViewById(R.id.ANTISHAKE32);
        ToggleButton toggleButton12 = (ToggleButton) this.mFloatingView.findViewById(R.id.BLACKSKY32);
        ToggleButton toggleButton13 = (ToggleButton) this.mFloatingView.findViewById(R.id.NOGRASH32);
        ToggleButton toggleButton14 = (ToggleButton) this.mFloatingView.findViewById(R.id.NOFOG32);
        ToggleButton toggleButton15 = (ToggleButton) this.mFloatingView.findViewById(R.id.Blackbody32);
        ToggleButton toggleButton16 = (ToggleButton) this.mFloatingView.findViewById(R.id.ishshot32);
        ToggleButton toggleButton17 = (ToggleButton) this.mFloatingView.findViewById(R.id.isfastparc32);
        ToggleButton toggleButton18 = (ToggleButton) this.mFloatingView.findViewById(R.id.isnorecoil32);
        ToggleButton toggleButton19 = (ToggleButton) this.mFloatingView.findViewById(R.id.isflashspeed32);
        ToggleButton toggleButton20 = (ToggleButton) this.mFloatingView.findViewById(R.id.issitscope32);
        ToggleButton toggleButton21 = (ToggleButton) this.mFloatingView.findViewById(R.id.isstandscope32);
        ToggleButton toggleButton22 = (ToggleButton) this.mFloatingView.findViewById(R.id.ismagicbullet32);
        ToggleButton toggleButton23 = (ToggleButton) this.mFloatingView.findViewById(R.id.isinstahit);
        ToggleButton toggleButton24 = (ToggleButton) this.mFloatingView.findViewById(R.id.isvehiclespeed32);
        ToggleButton toggleButton25 = (ToggleButton) this.mFloatingView.findViewById(R.id.isfvehiclefly32);
        ToggleButton toggleButton26 = (ToggleButton) this.mFloatingView.findViewById(R.id.ishshot5032);
        ToggleButton toggleButton27 = (ToggleButton) this.mFloatingView.findViewById(R.id.isfix10minute);
        ToggleButton toggleButton28 = (ToggleButton) this.mFloatingView.findViewById(R.id.islessrecoil2);
        ToggleButton toggleButton29 = (ToggleButton) this.mFloatingView.findViewById(R.id.isjeepfuel32);
        ToggleButton toggleButton30 = (ToggleButton) this.mFloatingView.findViewById(R.id.isflashspeed322);
        ToggleButton toggleButton31 = (ToggleButton) this.mFloatingView.findViewById(R.id.istreeremove32);
        ToggleButton toggleButton32 = (ToggleButton) this.mFloatingView.findViewById(R.id.Desertmode32);
        ToggleButton toggleButton33 = (ToggleButton) this.mFloatingView.findViewById(R.id.inorec232);
        ToggleButton toggleButton34 = (ToggleButton) this.mFloatingView.findViewById(R.id.isnosmoke32);
        toggleButton34.setOnClickListener(new oO0OO00o(toggleButton34));
        toggleButton18.setOnClickListener(new oOo000Oo(toggleButton18));
        toggleButton33.setOnClickListener(new oOo0000O(toggleButton33));
        toggleButton32.setOnClickListener(new oOo000o0(toggleButton32));
        toggleButton31.setOnClickListener(new oO0(toggleButton31));
        toggleButton21.setOnClickListener(new oO0O000(toggleButton21));
        toggleButton30.setOnClickListener(new oO0O000o(toggleButton30));
        toggleButton29.setOnClickListener(new oO0O00(toggleButton29));
        toggleButton28.setOnClickListener(new oO0O00O(toggleButton28));
        toggleButton27.setOnClickListener(new oO0O00oO(toggleButton27));
        toggleButton26.setOnClickListener(new oO0O0(toggleButton26));
        toggleButton17.setOnClickListener(new oO0O0O00(toggleButton17));
        toggleButton25.setOnClickListener(new oO0O0O0o(toggleButton25));
        toggleButton24.setOnClickListener(new oOo0oooO(toggleButton24));
        toggleButton23.setOnClickListener(new oO0O0Oo0(toggleButton23));
        toggleButton22.setOnClickListener(new oOo0o0oO(toggleButton22));
        toggleButton20.setOnClickListener(new ooOOO0Oo(toggleButton20));
        toggleButton15.setOnClickListener(new ooOOO00O(toggleButton15));
        toggleButton19.setOnClickListener(new ooo0o(toggleButton19));
        toggleButton16.setOnClickListener(new oO0OO0O(toggleButton16));
        toggleButton13.setOnClickListener(new oO0Oo0o0(toggleButton13));
        toggleButton14.setOnClickListener(new oO0o0000(toggleButton14));
        toggleButton12.setOnClickListener(new oO0oO000(toggleButton12));
        toggleButton11.setOnClickListener(new oOo00o00(toggleButton11));
        toggleButton10.setOnClickListener(new View$OnClickListenerC1915oO(toggleButton10));
        toggleButton4.setOnClickListener(new oOO00000(toggleButton4));
        toggleButton5.setOnClickListener(new oOO0000(toggleButton5));
        toggleButton6.setOnClickListener(new oOO000(toggleButton6));
        toggleButton8.setOnClickListener(new oOO000o(toggleButton8));
        toggleButton9.setOnClickListener(new oOO00OO(toggleButton9));
        toggleButton7.setOnClickListener(new ooooO000(toggleButton7));
        toggleButton.setOnClickListener(new oOO0(toggleButton));
        toggleButton2.setOnClickListener(new oOO0O000(toggleButton2));
        toggleButton3.setOnClickListener(new oOO0O00O(toggleButton3));
        toggleButtonis2.setOnClickListener(new oOO02(toggleButtonis2));
        toggleButtonis3.setOnClickListener(new oOO03(toggleButtonis3));
        toggleButtonist.setOnClickListener(new oOO0t(toggleButtonist));
        toggleButtonis4.setOnClickListener(new oOO04(toggleButtonis4));
    }

    public native void Range(int i);

    public native void SettingValue(int i, boolean z);

    public native void Target(int i);
    class SingleTapConfirm extends GestureDetector.SimpleOnGestureListener {

        @Override
        public boolean onSingleTapUp(MotionEvent event) {
            return true;
        }
    }

    
    @SuppressLint({"InflateParams"})
    public void createOver() {
        this.mFloatingView = LayoutInflater.from(this).inflate(R.layout.floatlogo4, (ViewGroup) null);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -1, Build.VERSION.SDK_INT >= 26 ? WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY : WindowManager.LayoutParams.TYPE_PHONE, WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE, 1);
        layoutParams.gravity = Gravity.TOP+Gravity.LEFT;
        WindowManager windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        this.mWindowManager = windowManager;
        windowManager.addView(this.mFloatingView, layoutParams);
        new GestureDetector(this, new SingleTapConfirm());
        ((ImageView) this.mFloatingView.findViewById(R.id.closeBtn)).setOnClickListener(new oOO0O0((ToggleButton) this.mFloatingView.findViewById(R.id.showstyele10), (ToggleButton) this.mFloatingView.findViewById(R.id.showstyele6)));
        LinearLayout linearLayout = (LinearLayout) this.mFloatingView.findViewById(R.id.players);
        LinearLayout linearLayout2 = (LinearLayout) this.mFloatingView.findViewById(R.id.items);
        LinearLayout linearLayout3 = (LinearLayout) this.mFloatingView.findViewById(R.id.vehicles);
        Button button = (Button) this.mFloatingView.findViewById(R.id.playerBtn2);
        Button button2 = (Button) this.mFloatingView.findViewById(R.id.itemBtn);
        Button button3 = (Button) this.mFloatingView.findViewById(R.id.aimmenuhack);
        Button button4 = (Button) this.mFloatingView.findViewById(R.id.memoryHack);
        Button button5 = (Button) this.mFloatingView.findViewById(R.id.memoryHack32);
        LinearLayout linearLayout4 = (LinearLayout) this.mFloatingView.findViewById(R.id.spesialsitem);
        LinearLayout linearLayout5 = (LinearLayout) this.mFloatingView.findViewById(R.id.autoaritem);
        LinearLayout linearLayout6 = (LinearLayout) this.mFloatingView.findViewById(R.id.scoperitem);
        LinearLayout linearLayout7 = (LinearLayout) this.mFloatingView.findViewById(R.id.snperitem);
        LinearLayout linearLayout8 = (LinearLayout) this.mFloatingView.findViewById(R.id.shotgunpitem);
        LinearLayout linearLayout9 = (LinearLayout) this.mFloatingView.findViewById(R.id.pidtolsitem);
        LinearLayout linearLayout10 = (LinearLayout) this.mFloatingView.findViewById(R.id.ammossitem);
        LinearLayout linearLayout11 = (LinearLayout) this.mFloatingView.findViewById(R.id.baghelmetsitem);
        LinearLayout linearLayout12 = (LinearLayout) this.mFloatingView.findViewById(R.id.healthkitsitem);
        LinearLayout linearLayout13 = (LinearLayout) this.mFloatingView.findViewById(R.id.throwblesitem);
        LinearLayout linearLayout14 = (LinearLayout) this.mFloatingView.findViewById(R.id.othersitem);
        LinearLayout linearLayout15 = (LinearLayout) this.mFloatingView.findViewById(R.id.vihiclesitem);
        LinearLayout linearLayout16 = (LinearLayout) this.mFloatingView.findViewById(R.id.aimBotmenu);
        LinearLayout linearLayout17 = (LinearLayout) this.mFloatingView.findViewById(R.id.memoryhacck32);
        ImageView imageView = (ImageView) this.mFloatingView.findViewById(R.id.vihicleitem);
        ImageView imageView2 = (ImageView) this.mFloatingView.findViewById(R.id.spesitem);
        ImageView imageView3 = (ImageView) this.mFloatingView.findViewById(R.id.scopeitem);
        ImageView imageView4 = (ImageView) this.mFloatingView.findViewById(R.id.autoitem);
        ImageView imageView5 = (ImageView) this.mFloatingView.findViewById(R.id.sniperitem);
        ImageView imageView6 = (ImageView) this.mFloatingView.findViewById(R.id.shotgunitem);
        ImageView imageView7 = (ImageView) this.mFloatingView.findViewById(R.id.pistolitem);
        ImageView imageView8 = (ImageView) this.mFloatingView.findViewById(R.id.ammoitem);
        ImageView imageView9 = (ImageView) this.mFloatingView.findViewById(R.id.baghelmetitem);
        ImageView imageView10 = (ImageView) this.mFloatingView.findViewById(R.id.healthkititem);
        ImageView imageView11 = (ImageView) this.mFloatingView.findViewById(R.id.Throwablesitem);
        ImageView imageView12 = (ImageView) this.mFloatingView.findViewById(R.id.otheritem);
        ToggleButton toggleButton = (ToggleButton) this.mFloatingView.findViewById(R.id.showstyele6);
        ToggleButton toggleButton2 = (ToggleButton) this.mFloatingView.findViewById(R.id.showstyele7);
        ToggleButton toggleButton3 = (ToggleButton) this.mFloatingView.findViewById(R.id.showstyele8);
        ToggleButton toggleButton4 = (ToggleButton) this.mFloatingView.findViewById(R.id.showstyele9);
        ToggleButton atoggleButton5 = (ToggleButton) this.mFloatingView.findViewById(R.id.CrosHairstyele);
        ToggleButton toggleButton6 = (ToggleButton) this.mFloatingView.findViewById(R.id.showstyele10);
        LinearLayout linearLayout18 = (LinearLayout) this.mFloatingView.findViewById(R.id.themeisDist);
        LinearLayout linearLayout19 = (LinearLayout) this.mFloatingView.findViewById(R.id.themeisEnemyWeapon);
        ((ToggleButton) this.mFloatingView.findViewById(R.id.showstyele)).setOnCheckedChangeListener(new oOO0O0O0(this, (LinearLayout) this.mFloatingView.findViewById(R.id.themebox)));
        ((ToggleButton) this.mFloatingView.findViewById(R.id.showstyele2)).setOnCheckedChangeListener(new oOO0O0O(this, (LinearLayout) this.mFloatingView.findViewById(R.id.themeskeleton)));
        ((ToggleButton) this.mFloatingView.findViewById(R.id.showstyele3)).setOnCheckedChangeListener(new oOO0OO0O(this, (LinearLayout) this.mFloatingView.findViewById(R.id.themeshead)));
        ((ToggleButton) this.mFloatingView.findViewById(R.id.showstyele4)).setOnCheckedChangeListener(new oOO0OO(this, (LinearLayout) this.mFloatingView.findViewById(R.id.themeline)));
        ((ToggleButton) this.mFloatingView.findViewById(R.id.showstyele5)).setOnCheckedChangeListener(new oOO0OOO(this, (CardView) this.mFloatingView.findViewById(R.id.themealert)));
        toggleButton.setOnCheckedChangeListener(new oOO0Oo00(toggleButton6));
        toggleButton6.setOnCheckedChangeListener(new oOO0OoO0(toggleButton));
        toggleButton2.setOnCheckedChangeListener(new ooooO0O0(this, (LinearLayout) this.mFloatingView.findViewById(R.id.themeisname)));
        toggleButton3.setOnCheckedChangeListener(new oOO(this, linearLayout18));
        toggleButton4.setOnCheckedChangeListener(new oOOO00(this, linearLayout19));
        atoggleButton5.setOnCheckedChangeListener(new oOOO00Oo(this, (RelativeLayout) this.mFloatingView.findViewById(R.id.CrossSet)));
        imageView2.setOnClickListener(new oOOO00o0(this, linearLayout4, linearLayout6, linearLayout7, linearLayout8, linearLayout5, linearLayout10, linearLayout11, linearLayout12, linearLayout9, linearLayout13, linearLayout14, linearLayout15));
        imageView3.setOnClickListener(new oOOO0O0o(this, linearLayout4, linearLayout6, linearLayout7, linearLayout8, linearLayout5, linearLayout10, linearLayout11, linearLayout12, linearLayout9, linearLayout13, linearLayout14, linearLayout15));
        imageView4.setOnClickListener(new oOOO0OO0(this, linearLayout4, linearLayout6, linearLayout7, linearLayout8, linearLayout5, linearLayout10, linearLayout11, linearLayout12, linearLayout9, linearLayout13, linearLayout14, linearLayout15));
        imageView5.setOnClickListener(new oOOO0OOO(this, linearLayout4, linearLayout6, linearLayout7, linearLayout8, linearLayout5, linearLayout10, linearLayout11, linearLayout12, linearLayout9, linearLayout13, linearLayout14, linearLayout15));
        imageView6.setOnClickListener(new oOOOoo00(this, linearLayout4, linearLayout6, linearLayout7, linearLayout8, linearLayout5, linearLayout10, linearLayout11, linearLayout12, linearLayout9, linearLayout13, linearLayout14, linearLayout15));
        imageView7.setOnClickListener(new oOOOOo0O(this, linearLayout4, linearLayout6, linearLayout7, linearLayout8, linearLayout5, linearLayout10, linearLayout11, linearLayout12, linearLayout9, linearLayout13, linearLayout14, linearLayout15));
        imageView8.setOnClickListener(new oOOo0000(this, linearLayout4, linearLayout6, linearLayout7, linearLayout8, linearLayout5, linearLayout10, linearLayout11, linearLayout12, linearLayout9, linearLayout13, linearLayout14, linearLayout15));
        imageView9.setOnClickListener(new oOOo0O00(this, linearLayout4, linearLayout6, linearLayout7, linearLayout8, linearLayout5, linearLayout10, linearLayout11, linearLayout12, linearLayout9, linearLayout13, linearLayout14, linearLayout15));
        imageView10.setOnClickListener(new oo000000(this, linearLayout4, linearLayout6, linearLayout7, linearLayout8, linearLayout5, linearLayout10, linearLayout11, linearLayout12, linearLayout9, linearLayout13, linearLayout14, linearLayout15));
        imageView11.setOnClickListener(new oo00(this, linearLayout4, linearLayout6, linearLayout7, linearLayout8, linearLayout5, linearLayout10, linearLayout11, linearLayout12, linearLayout9, linearLayout13, linearLayout14, linearLayout15));
        imageView12.setOnClickListener(new O0000000(this, linearLayout4, linearLayout6, linearLayout7, linearLayout8, linearLayout5, linearLayout10, linearLayout11, linearLayout12, linearLayout9, linearLayout13, linearLayout14, linearLayout15));
        imageView.setOnClickListener(new O0O0(this, linearLayout15, linearLayout4, linearLayout6, linearLayout7, linearLayout8, linearLayout5, linearLayout10, linearLayout11, linearLayout12, linearLayout9, linearLayout13, linearLayout14));
        button.setOnClickListener(new O0OO00(this, button, button2, button4, button5, button3, linearLayout2, linearLayout, linearLayout3, linearLayout16, linearLayout17));
        button2.setOnClickListener(new Oo0000(this, button, button2, button4, button5, button3, linearLayout2, linearLayout, linearLayout3, linearLayout16, linearLayout17));
        button4.setOnClickListener(new View$OnClickListenerC1878a(this, button, button2, button4, button5, button3, linearLayout2, linearLayout, linearLayout3, linearLayout16, linearLayout17));
        button5.setOnClickListener(new View$OnClickListenerC1880b(this, button, button2, button4, button5, button3, linearLayout2, linearLayout, linearLayout3, linearLayout16, linearLayout17));
        button3.setOnClickListener(new View$OnClickListenerC1882c(this, button, button2, button4, button5, button3, linearLayout2, linearLayout, linearLayout3, linearLayout17, linearLayout16));
    }

    
    @SuppressLint({"InflateParams"})
    public void createOver2() {
        this.mFloatingView2 = LayoutInflater.from(this).inflate(R.layout.floatlog2, (ViewGroup) null);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, Build.VERSION.SDK_INT >= 26 ? WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY : WindowManager.LayoutParams.TYPE_PHONE, 8, 1);
        layoutParams.gravity = Gravity.TOP+Gravity.LEFT;
        layoutParams.x = 650;
        layoutParams.y = 100;
        WindowManager windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        this.mWindowManager2 = windowManager;
        windowManager.addView(this.mFloatingView2, layoutParams);
        this.mFloatingView2.findViewById(R.id.relativeLayoutParent2).setOnTouchListener(new oO0OO00(layoutParams));
        ((ToggleButton) this.mFloatingView2.findViewById(R.id.AIMSHOW)).setOnCheckedChangeListener(new oOO00());
    }

    
    @SuppressLint({"InflateParams"})
    public void createOver3() {
        this.mFloatingView3 = LayoutInflater.from(this).inflate(R.layout.floatlog3, (ViewGroup) null);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, Build.VERSION.SDK_INT >= 26 ? WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY : WindowManager.LayoutParams.TYPE_PHONE, 8, 1);
        layoutParams.gravity = Gravity.TOP+Gravity.LEFT;
        WindowManager windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        this.mWindowManager3 = windowManager;
        windowManager.addView(this.mFloatingView3, layoutParams);
        this.mFloatingView3.findViewById(R.id.relativeLayoutParent).setOnTouchListener(new View$OnTouchListenerC1881b0(new GestureDetector(this, new SingleTapConfirm()), layoutParams));
    }

    
    @SuppressLint({"InflateParams"})
    public void createOver4() {
        int i;
        Object obj;
        Spinner spinner;
        Object obj2;
        Spinner spinner2;
        Object obj3;
        Spinner spinner3;
        Object obj4;
        Spinner spinner4;
        Object obj5;
        Spinner spinner5;
        Object obj6;
        Spinner spinner6;
        Spinner spinner7 = null;
        Object item = null;
        this.mFloatingView4 = LayoutInflater.from(this).inflate(R.layout.floatlog4, (ViewGroup) null);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -1, Build.VERSION.SDK_INT >= 26 ? WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY : WindowManager.LayoutParams.TYPE_PHONE, 8, 1);
        layoutParams.gravity = Gravity.TOP+Gravity.RIGHT;
        WindowManager windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        this.mWindowManager4 = windowManager;
        windowManager.addView(this.mFloatingView4, layoutParams);
        CheckBox checkBox = (CheckBox) this.mFloatingView4.findViewById(R.id.dual);
        CheckBox checkBox2 = (CheckBox) this.mFloatingView4.findViewById(R.id.meterial);
        CheckBox checkBox3 = (CheckBox) this.mFloatingView4.findViewById(R.id.meterialdistance);
        checkBox2.setChecked(getConfig("Material"));
        checkBox2.setOnCheckedChangeListener(new C1903m0(checkBox2, checkBox, checkBox3));
        checkBox3.setChecked(getConfig("MaterialDistance"));
        checkBox3.setOnCheckedChangeListener(new C1936y0(checkBox3, checkBox, checkBox2));
        checkBox.setChecked(getConfig("Dual"));
        checkBox.setOnCheckedChangeListener(new C1877OooOo00(checkBox, checkBox2, checkBox3));
        ColorPickerView colorPickerView = (ColorPickerView) this.mFloatingView.findViewById(R.id.color_picker_viewbot);
        RadioButton radioButton = (RadioButton) this.mFloatingView.findViewById(R.id.botline);
        RadioButton radioButton2 = (RadioButton) this.mFloatingView.findViewById(R.id.botbox);
        RadioButton radioButton3 = (RadioButton) this.mFloatingView.findViewById(R.id.bothead);
        radioButton.setOnCheckedChangeListener(new C1914o0ooOOo(radioButton2, radioButton3, colorPickerView));
        radioButton2.setOnCheckedChangeListener(new C1908o00000O(radioButton, radioButton3, colorPickerView));
        radioButton3.setOnCheckedChangeListener(new o000(radioButton2, radioButton, colorPickerView));
        if (getBotline() == 100 && getBotbox() == 100 && getBothead() == 100) {
            colorPickerView.setColor(Color.argb(255, 255, 255, 255), true);
            ESPSyncView.ChangeColorLineBot(Color.argb(255, 255, 255, 255));
            ESPSyncView.ChangeColorBoxBot(Color.argb(255, 255, 255, 255));
            i = -256;
        } else {
            colorPickerView.setColor(getEnemyName(), true);
            ESPSyncView.ChangeColorLineBot(getBotline());
            ESPSyncView.ChangeColorBoxBot(getBotbox());
            i = getBothead();
        }
        ESPSyncView.ChangeColorHeadBot(i);
        colorPickerView.addOnColorChangedListener(new o000OO00(radioButton, radioButton2));
        TextView textView = (TextView) this.mFloatingView4.findViewById(R.id.positionText);
        SeekBar seekBar = (SeekBar) this.mFloatingView4.findViewById(R.id.position);
        TextView textView2 = (TextView) this.mFloatingView4.findViewById(R.id.SizeText);
        SeekBar seekBar2 = (SeekBar) this.mFloatingView4.findViewById(R.id.Size);
        TextView textView3 = (TextView) this.mFloatingView4.findViewById(R.id.itemSizeText);
        SeekBar seekBar3 = (SeekBar) this.mFloatingView4.findViewById(R.id.itemSize);
        TextView textView4 = (TextView) this.mFloatingView4.findViewById(R.id.itemPositionText);
        SeekBar seekBar4 = (SeekBar) this.mFloatingView4.findViewById(R.id.itemPosition);
        ((ToggleButton) this.mFloatingView4.findViewById(R.id.showstyele11)).setOnCheckedChangeListener(new o00O00OO(this, (RelativeLayout) this.mFloatingView4.findViewById(R.id.ColorPickerItem)));
        ((ToggleButton) this.mFloatingView4.findViewById(R.id.showstyele12)).setOnCheckedChangeListener(new oo0oOO0(this, (RelativeLayout) this.mFloatingView4.findViewById(R.id.ColorPickerBot)));
        this.spNamen2 = (Spinner) this.mFloatingView4.findViewById(R.id.textcustom);
        this.spnamen3 = (Spinner) this.mFloatingView4.findViewById(R.id.infocustom);
        this.spnamen4 = (Spinner) this.mFloatingView.findViewById(R.id.alertstylemenu3);
        this.spnamen5 = (Spinner) this.mFloatingView4.findViewById(R.id.knokstylemenu3);
        this.spnamen7 = (Spinner) this.mFloatingView4.findViewById(R.id.linestyle);
        this.spnamen6 = (Spinner) this.mFloatingView4.findViewById(R.id.enemystatusstyle);
        this.spnamen8 = (Spinner) this.mFloatingView.findViewById(R.id.AIMstyle);
        this.SpNamenitem = (Spinner) this.mFloatingView4.findViewById(R.id.ImageStyle);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, this.germanFeminine);
        this.spNamen2.setAdapter((SpinnerAdapter) arrayAdapter);
        if (getFont() == 100) {
            ESPSyncView.ChangeFont((String) arrayAdapter.getItem(View.VISIBLE));
            spinner = this.spNamen2;
            obj = arrayAdapter.getItem(View.VISIBLE);
        } else {
            ESPSyncView.ChangeFont((String) arrayAdapter.getItem(getFont()));
            spinner = this.spNamen2;
            obj = arrayAdapter.getItem(getFont());
        }
        spinner.setSelection(arrayAdapter.getPosition((String) obj));
        this.spNamen2.setOnItemSelectedListener(new o0o0Oo(arrayAdapter));
        RadioButton radioButton4 = (RadioButton) this.mFloatingView.findViewById(R.id.bgName);
        RadioButton radioButton5 = (RadioButton) this.mFloatingView.findViewById(R.id.bgID);
        RadioButton radioButton6 = (RadioButton) this.mFloatingView.findViewById(R.id.bgEnWeapon);
        RadioButton radioButton7 = (RadioButton) this.mFloatingView.findViewById(R.id.bgDist);
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, this.infostyle);
        this.spnamen3.setAdapter((SpinnerAdapter) arrayAdapter2);
        if (getInfoStyle() == 100) {
            ESPSyncView.ChangeInfoStyle((String) arrayAdapter2.getItem(View.VISIBLE));
            spinner2 = this.spnamen3;
            obj2 = arrayAdapter2.getItem(View.VISIBLE);
        } else {
            ESPSyncView.ChangeInfoStyle((String) arrayAdapter2.getItem(getInfoStyle()));
            spinner2 = this.spnamen3;
            obj2 = arrayAdapter2.getItem(getInfoStyle());
        }
        spinner2.setSelection(arrayAdapter2.getPosition((String) obj2));
        if (getInfoStyle() == 0) {
            radioButton4.setEnabled(true);
            radioButton5.setEnabled(true);
            radioButton6.setEnabled(true);
            radioButton7.setEnabled(true);
        } else if (getInfoStyle() == 1 || getInfoStyle() == 2 || getInfoStyle() == 3) {
            radioButton4.setEnabled(false);
            radioButton5.setEnabled(false);
            radioButton6.setEnabled(false);
            radioButton7.setEnabled(false);
            radioButton4.setChecked(false);
            radioButton5.setChecked(false);
            radioButton6.setChecked(false);
            radioButton7.setChecked(false);
        }
        this.spnamen3.setOnItemSelectedListener(new o0O0000O(arrayAdapter2, radioButton4, radioButton5, radioButton6, radioButton7));
        ((ImageView) this.mFloatingView4.findViewById(R.id.itemtheme13)).setOnClickListener(new o0O00OOO((ToggleButton) this.mFloatingView.findViewById(R.id.showstyele10)));
        RadioButton radioButton8 = (RadioButton) this.mFloatingView.findViewById(R.id.alerttheme);
        ArrayAdapter arrayAdapter3 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, this.alertstyle);
        this.spnamen4.setAdapter((SpinnerAdapter) arrayAdapter3);
        if (getAlertStyle() == 100) {
            ESPSyncView.ChangeAlertStyle((String) arrayAdapter3.getItem(View.VISIBLE));
            spinner3 = this.spnamen4;
            obj3 = arrayAdapter3.getItem(View.VISIBLE);
        } else {
            ESPSyncView.ChangeAlertStyle((String) arrayAdapter3.getItem(getAlertStyle()));
            spinner3 = this.spnamen4;
            obj3 = arrayAdapter3.getItem(getAlertStyle());
        }
        spinner3.setSelection(arrayAdapter3.getPosition((String) obj3));
        if (getAlertStyle() == 0 || getAlertStyle() == 1) {
            radioButton8.setEnabled(true);
        } else {
            radioButton8.setEnabled(false);
        }
        this.spnamen4.setOnItemSelectedListener(new oo0OOoo(arrayAdapter3, arrayAdapter2, radioButton8));
        EditText editText = (EditText) this.mFloatingView.findViewById(R.id.botname);
        Button button = (Button) this.mFloatingView.findViewById(R.id.setnamebot);
        editText.setOnFocusChangeListener(new o0OO00OO(layoutParams));
        ArrayAdapter arrayAdapter4 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, this.knokstyle);
        this.spnamen5.setAdapter((SpinnerAdapter) arrayAdapter4);
        if (getKnokStyle() == 100) {
            ESPSyncView.ChangeKnokStyle((String) arrayAdapter4.getItem(View.VISIBLE));
            spinner4 = this.spnamen5;
            obj4 = arrayAdapter4.getItem(View.VISIBLE);
        } else {
            ESPSyncView.ChangeKnokStyle((String) arrayAdapter4.getItem(getKnokStyle()));
            spinner4 = this.spnamen5;
            obj4 = arrayAdapter4.getItem(getKnokStyle());
        }
        spinner4.setSelection(arrayAdapter4.getPosition((String) obj4));
        this.spnamen5.setOnItemSelectedListener(new o0OOO0OO(arrayAdapter4));
        if (getNameBot() == "Bot") {
            ESPSyncView.ChangeBotName("Bot");
        } else {
            ESPSyncView.ChangeBotName(getNameBot());
        }
        editText.setText(getNameBot());
        button.setOnClickListener(new oO0000O(editText));
        ArrayAdapter arrayAdapter5 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, this.lineposition);
        this.spnamen7.setAdapter((SpinnerAdapter) arrayAdapter5);
        if (getLineStyle() == 100) {
            ESPSyncView.ChangeLineStyle((String) arrayAdapter5.getItem(View.VISIBLE));
            spinner5 = this.spnamen7;
            obj5 = arrayAdapter5.getItem(View.VISIBLE);
        } else {
            ESPSyncView.ChangeLineStyle((String) arrayAdapter5.getItem(getLineStyle()));
            spinner5 = this.spnamen7;
            obj5 = arrayAdapter5.getItem(getLineStyle());
        }
        spinner5.setSelection(arrayAdapter5.getPosition((String) obj5));
        this.spnamen7.setOnItemSelectedListener(new ooOOOOoo(arrayAdapter5));
        ArrayAdapter arrayAdapter6 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, this.enemystatus);
        this.spnamen6.setAdapter((SpinnerAdapter) arrayAdapter6);
        if (getEnemyStatusStyle() == 100) {
            ESPSyncView.ChangeEnemyStatusStyle((String) arrayAdapter6.getItem(View.VISIBLE));
            spinner6 = this.spnamen6;
            obj6 = arrayAdapter6.getItem(View.VISIBLE);
        } else {
            ESPSyncView.ChangeEnemyStatusStyle((String) arrayAdapter6.getItem(getEnemyStatusStyle()));
            spinner6 = this.spnamen6;
            obj6 = arrayAdapter6.getItem(getEnemyStatusStyle());
        }
        spinner6.setSelection(arrayAdapter6.getPosition((String) obj6));
        this.spnamen6.setOnItemSelectedListener(new oO00OOO(arrayAdapter6));
        C1940g gVar = new C1940g(this, R.layout.spinner_value_layout, this.CrossName, this.Cross);
        this.spnamen8.setAdapter((SpinnerAdapter) gVar);
        if (getCross() == 100) {
            ESPSyncView.ChangeEnemyStatusStyle((String) gVar.getItem(View.VISIBLE));
            this.spnamen8.setSelection(arrayAdapter6.getPosition((String) gVar.getItem(View.VISIBLE)));
        } else {
            ESPSyncView.ChangeCross(getCross());
            this.spnamen8.setSelection(getCross());
        }
        this.spnamen8.setOnItemSelectedListener(new oOo00o0o());
        RelativeLayout relativeLayout = (RelativeLayout) this.mFloatingView4.findViewById(R.id.ColorPickerItemimage);
        ArrayAdapter arrayAdapter7 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, this.imagestyle);
        this.SpNamenitem.setAdapter((SpinnerAdapter) arrayAdapter7);
        if (getImageStyle() == 100) {
            ESPSyncView.ChangeImageStyle((String) arrayAdapter7.getItem(1));
            spinner7 = this.SpNamenitem;
            item = arrayAdapter7.getItem(1);
        } else if (getImageStyle() == 1) {
            ESPSyncView.ChangeImageStyle((String) arrayAdapter7.getItem(getImageStyle()));
            this.SpNamenitem.setSelection(arrayAdapter7.getPosition((String) arrayAdapter7.getItem(getImageStyle())));
            relativeLayout.setVisibility(View.VISIBLE);
            this.SpNamenitem.setOnItemSelectedListener(new oO0O00o0(arrayAdapter7, relativeLayout));
        } else {
            ESPSyncView.ChangeImageStyle((String) arrayAdapter7.getItem(getImageStyle()));
            spinner7 = this.SpNamenitem;
            item = arrayAdapter7.getItem(getImageStyle());
        }
        spinner7.setSelection(arrayAdapter7.getPosition((String) item));
        this.SpNamenitem.setOnItemSelectedListener(new oO0O00o0(arrayAdapter7, relativeLayout));
    }

    
    @SuppressLint({"InflateParams"})
    public void createOver5() {
        this.mFloatingView5 = LayoutInflater.from(this).inflate(R.layout.floatlog_carsjump, (ViewGroup) null);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, Build.VERSION.SDK_INT >= 26 ? WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY : WindowManager.LayoutParams.TYPE_PHONE, 8, 1);
        layoutParams.gravity = Gravity.TOP+Gravity.LEFT;
        WindowManager windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        this.mWindowManager5 = windowManager;
        windowManager.addView(this.mFloatingView5, layoutParams);
        new GestureDetector(this, new SingleTapConfirm());
        this.mFloatingView5.findViewById(R.id.relativeLayoutParent5).setOnTouchListener(new View$OnTouchListenerC1886e(layoutParams));
        ((ToggleButton) this.mFloatingView5.findViewById(R.id.JUMPSHOW)).setOnCheckedChangeListener(new C1919q());
    }

    
    @SuppressLint({"InflateParams"})
    public void createOver7() {
        this.mFloatingView7 = LayoutInflater.from(this).inflate(R.layout.floatlog_flashspeed, (ViewGroup) null);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, Build.VERSION.SDK_INT >= 26 ? WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY : WindowManager.LayoutParams.TYPE_PHONE, 8, 1);
        layoutParams.gravity = Gravity.TOP+Gravity.LEFT;
        WindowManager windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        this.mWindowManager7 = windowManager;
        windowManager.addView(this.mFloatingView7, layoutParams);
        new GestureDetector(this, new SingleTapConfirm());
        this.mFloatingView7.findViewById(R.id.relativeLayoutParent7).setOnTouchListener(new oOOO000o(layoutParams));
        ((ToggleButton) this.mFloatingView7.findViewById(R.id.FLASHSHOW)).setOnCheckedChangeListener(new oOo0o00());
    }

    
    @SuppressLint({"InflateParams"})
    public void createOver8() {
        this.mFloatingView8 = LayoutInflater.from(this).inflate(R.layout.floatlog_parachute, (ViewGroup) null);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, Build.VERSION.SDK_INT >= 26 ? WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY : WindowManager.LayoutParams.TYPE_PHONE, 8, 1);
        layoutParams.gravity = Gravity.TOP+Gravity.LEFT;
        WindowManager windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        this.mWindowManager8 = windowManager;
        windowManager.addView(this.mFloatingView8, layoutParams);
        new GestureDetector(this, new SingleTapConfirm());
        this.mFloatingView8.findViewById(R.id.relativeLayoutParent8).setOnTouchListener(new o0oO0Ooo(layoutParams));
        ((ToggleButton) this.mFloatingView8.findViewById(R.id.PARACHUTESHOW)).setOnCheckedChangeListener(new oOO00O0());
    }

    
    public int getAlertStyle() {
        return getSharedPreferences("espValue", 0).getInt("alertstyle", 100);
    }

    
    public int getBotbox() {
        return getSharedPreferences("espValue", 0).getInt("Botbox", 100);
    }

    
    public int getBothead() {
        return getSharedPreferences("espValue", 0).getInt("Bothead", 100);
    }

    
    public int getBotline() {
        return getSharedPreferences("espValue", 0).getInt("Botline", 100);
    }

    
    public int getColorAlert() {
        return getSharedPreferences("espValue", 0).getInt("ColorAlert", 100);
    }

    
    public int getColorAlertText() {
        return getSharedPreferences("espValue", 0).getInt("ColorAlertText", 100);
    }

    
    public int getColorBox() {
        return getSharedPreferences("espValue", 0).getInt("ColorBox", 100);
    }

    
    public int getColorCrosHair() {
        return getSharedPreferences("espValue", 0).getInt("ColorCrosHair", 100);
    }

    
    public int getColorHead() {
        return getSharedPreferences("espValue", 0).getInt("ColorHead", 100);
    }

    
    public int getColorLine() {
        return getSharedPreferences("espValue", 0).getInt("ColorLine", 100);
    }

    
    public int getColorSkel() {
        return getSharedPreferences("espValue", 0).getInt("ColorSkel", 100);
    }

    
    public boolean getConfig(String str) {
        return getSharedPreferences("espValue", 0).getBoolean(str, false);
    }

    
    public int getCross() {
        return getSharedPreferences("espValue", 0).getInt("Cross", 100);
    }

    
    public int getEnemyDistance() {
        return getSharedPreferences("espValue", 0).getInt("EnemyDistance", 100);
    }

    
    public int getEnemyDistanceText() {
        return getSharedPreferences("espValue", 0).getInt("EnemyDistanceText", 100);
    }

    
    public int getEnemyName() {
        return getSharedPreferences("espValue", 0).getInt("EnemyName", 100);
    }

    
    public int getEnemyNameText() {
        return getSharedPreferences("espValue", 0).getInt("EnemyNameText", 100);
    }

    
    public int getEnemyStatusStyle() {
        return getSharedPreferences("espValue", 0).getInt("EnemyStatusStyle", 100);
    }

    
    public int getEnemyWeapon() {
        return getSharedPreferences("espValue", 0).getInt("EnemyWeapon", 100);
    }

    
    public int getEnemyWeaponText() {
        return getSharedPreferences("espValue", 0).getInt("EnemyWeaponText", 100);
    }

    
    public int getFont() {
        return getSharedPreferences("espValue", 0).getInt("font", 100);
    }

    
    public int getFps() {
        return getSharedPreferences("espValue", 0).getInt("fps", 100);
    }

    
    public int getIDBgt() {
        return getSharedPreferences("espValue", 0).getInt("IDBgt", 100);
    }

    
    public int getIDtext() {
        return getSharedPreferences("espValue", 0).getInt("IDtext", 100);
    }

    
    public int getImageStyle() {
        return getSharedPreferences("espValue", 0).getInt("imagestyle", 100);
    }

    
    public int getInfoStyle() {
        return getSharedPreferences("espValue", 0).getInt("infostyle", 100);
    }

    
    public int getIntemImageClr(String str) {
        SharedPreferences sharedPreferences = getSharedPreferences("espValue", 0);
        return sharedPreferences.getInt("intemImageclr" + str, 100);
    }

    
    public int getIntemNameClr(String str) {
        SharedPreferences sharedPreferences = getSharedPreferences("espValue", 0);
        return sharedPreferences.getInt("intemNameclr" + str, 100);
    }

    
    public int getItemPosition() {
        return getSharedPreferences("espValue", 0).getInt("ItemPosition", 0);
    }

    
    public int getItemSize() {
        return getSharedPreferences("espValue", 0).getInt("ItemSize", 0);
    }

    
    public int getKnokStyle() {
        return getSharedPreferences("espValue", 0).getInt("knokstyle", 100);
    }

    
    public int getLineStyle() {
        return getSharedPreferences("espValue", 0).getInt("linestyle", 100);
    }

    
    public String getNameBot() {
        return getSharedPreferences("espValue", 0).getString("namebot", "Bot");
    }

    
    public int getPosition() {
        return getSharedPreferences("espValue", 0).getInt("position", 0);
    }

    
    public int getSize() {
        return getSharedPreferences("espValue", 0).getInt("size", 0);
    }

    
    public int getStrokeBox() {
        return getSharedPreferences("espValue", 0).getInt("StrokeBox", 2);
    }

    
    public int getStrokeCrosHair() {
        return getSharedPreferences("espValue", 0).getInt("StrokeCrosHair", 200);
    }

    
    public int getStrokeCrosHair2() {
        return getSharedPreferences("espValue", 0).getInt("StrokeCrosHair2", 0);
    }

    
    public int getStrokeLine() {
        return getSharedPreferences("espValue", 0).getInt("StrokeLine", 3);
    }

    
    public int getStrokeSkeleton() {
        return getSharedPreferences("espValue", 0).getInt("StrokeSkeleton", 3);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onClick(View view) {
    }

    @SuppressLint({"CutPasteId"})
    public void onCreate() {
        super.onCreate();
        Instance = this;
        createOver();
        createOver3();
        createOver4();
        this.logoView = this.mFloatingView3.findViewById(R.id.relativeLayoutParent);
        this.logoView2 = this.mFloatingView.findViewById(R.id.relativeLayoutParent2);
        this.espView = this.mFloatingView.findViewById(R.id.expanded_container);
        this.logoView3 = this.mFloatingView4.findViewById(R.id.custom);
        Init();
        //inj("nkr");
      /*  if(com.appfff.PPatcher.gameType==5)
            addItemsFromJSON2();
        else*/ // addItemsFromJSON();
    }
    

    public void onDestroy() {
        super.onDestroy();
        View view = this.mFloatingView;
        if (view != null) {
            this.mWindowManager.removeView(view);
        }
        View view2 = this.mFloatingView2;
        if (view2 != null) {
            this.mWindowManager2.removeView(view2);
        }
        View view3 = this.mFloatingView5;
        if (view3 != null) {
            this.mWindowManager5.removeView(view3);
        }
        View view4 = this.mFloatingView7;
        if (view4 != null) {
            this.mWindowManager7.removeView(view4);
        }
        View view5 = this.mFloatingView8;
        if (view5 != null) {
            this.mWindowManager8.removeView(view5);
        }
        View view22 = this.mFloatingView3;
        if (view22 != null) {
            this.mWindowManager3.removeView(view22);
        }
        if(process!=null)
            process.destroy();
        HideFloat();
    }

    
    public void setAlertStyle(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("alertstyle", i);
        edit.apply();
    }

    
    public void setBotbox(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("Botbox", i);
        edit.apply();
    }

    
    public void setBothead(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("Bothead", i);
        edit.apply();
    }

    
    public void setBotline(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("Botline", i);
        edit.apply();
    }

    
    public void setColorAlert(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("ColorAlert", i);
        edit.apply();
    }

    
    public void setColorAlertText(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("ColorAlertText", i);
        edit.apply();
    }

    
    public void setColorBox(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("ColorBox", i);
        edit.apply();
    }

    
    public void setColorCrosHair(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("ColorCrosHair", i);
        edit.apply();
    }

    
    public void setColorHead(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("ColorHead", i);
        edit.apply();
    }

    
    public void setColorLine(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("ColorLine", i);
        edit.apply();
    }

    
    public void setColorSkel(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("ColorSkel", i);
        edit.apply();
    }

    
    public void setCross(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("Cross", i);
        edit.apply();
    }

    
    public void setEnemyDistance(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("EnemyDistance", i);
        edit.apply();
    }

    
    public void setEnemyDistanceText(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("EnemyDistanceText", i);
        edit.apply();
    }

    
    public void setEnemyName(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("EnemyName", i);
        edit.apply();
    }

    
    public void setEnemyNameText(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("EnemyNameText", i);
        edit.apply();
    }

    
    public void setEnemyStatusStyle(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("EnemyStatusStyle", i);
        edit.apply();
    }

    
    public void setEnemyWeapon(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("EnemyWeapon", i);
        edit.apply();
    }

    
    public void setEnemyWeaponText(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("EnemyWeaponText", i);
        edit.apply();
    }

    
    public void setFont(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("font", i);
        edit.apply();
    }

    
    public void setFps(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("fps", i);
        edit.apply();
    }

    
    public void setIDBgt(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("IDBgt", i);
        edit.apply();
    }

    
    public void setIDtext(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("IDtext", i);
        edit.apply();
    }

    
    public void setImageStyle(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("imagestyle", i);
        edit.apply();
    }

    
    public void setInfoStyle(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("infostyle", i);
        edit.apply();
    }

    
    public void setIntemImageClr(int i, String str) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("intemImageclr" + str, i);
        edit.apply();
    }

    
    public void setIntemNameClr(int i, String str) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("intemNameclr" + str, i);
        edit.apply();
    }

    
    public void setItemPosition(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("ItemPosition", i);
        edit.apply();
    }

    
    public void setItemSIze(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("ItemSize", i);
        edit.apply();
    }

    
    public void setKnokStyle(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("knokstyle", i);
        edit.apply();
    }

    
    public void setLineStyle(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("linestyle", i);
        edit.apply();
    }

    
    public void setNamebot(String str) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putString("namebot", str);
        edit.apply();
    }

    
    public void setPosition(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("position", i);
        edit.apply();
    }

    
    public void setSize(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("size", i);
        edit.apply();
    }

    
    public void setStrokeBox(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("StrokeBox", i);
        edit.apply();
    }

    
    public void setStrokeCrosHair(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("StrokeCrosHair", i);
        edit.apply();
    }

    
    public void setStrokeCrosHair2(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("StrokeCrosHair2", i);
        edit.apply();
    }

    
    public void setStrokeLine(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("StrokeLine", i);
        edit.apply();
    }

    
    public void setStrokeSkeleton(int i) {
        SharedPreferences.Editor edit = getSharedPreferences("espValue", 0).edit();
        edit.putInt("StrokeSkeleton", i);
        edit.apply();
    }
}