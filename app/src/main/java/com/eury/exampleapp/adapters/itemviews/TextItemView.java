package com.eury.exampleapp.adapters.itemviews;

import android.content.Context;
import android.widget.TextView;

import com.eury.exampleapp.R;

/**
 * Created by euryperez on 9/26/18.
 * Property of Instacarro.com
 */
public class TextItemView extends BaseItemView<String> {

    TextView tvText;

    public TextItemView(Context context) {
        super(context);

        tvText = findViewById(R.id.tvText);
    }

    @Override
    public void bind(String item) {
        super.bind(item);

        tvText.setText(item);
    }

    @Override
    int getResLayout() {
        return R.layout.itv_text;
    }
}
