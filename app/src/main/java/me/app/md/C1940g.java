package me.app.md;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class C1940g extends ArrayAdapter<String> {
    private final String[] contentArray;
    private final Context ctx;
    private final Integer[] imageArray;

    public C1940g(Context context, int i, String[] strArr, Integer[] numArr) {
        super(context, (int) R.layout.spinner_value_layout, (int) R.id.spinnerTextView, strArr);
        this.ctx = context;
        this.contentArray = strArr;
        this.imageArray = numArr;
    }

    public View getCustomView(int i, View view, ViewGroup viewGroup) {
        View inflate = ((LayoutInflater) this.ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.spinner_value_layout, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.spinnerTextView);
        textView.setText(this.contentArray[i]);
        textView.setTextSize(16.0f);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.spinnerImages);
        imageView.setImageResource(this.imageArray[i].intValue());
        imageView.setColorFilter(-65536, PorterDuff.Mode.SRC_ATOP);
        return inflate;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return getCustomView(i, view, viewGroup);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return getCustomView(i, view, viewGroup);
    }
}
