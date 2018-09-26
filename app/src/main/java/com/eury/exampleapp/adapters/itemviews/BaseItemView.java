package com.eury.exampleapp.adapters.itemviews;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by euryperez on 9/26/18.
 * Property of Instacarro.com
 */
public abstract class BaseItemView<T> extends LinearLayout {
    protected T item;

    public BaseItemView(Context context) {
        super(context);
        View view = LayoutInflater.from(context).inflate(getResLayout(), this, false);
        this.addView(view);
    }

    public void bind(T item) {
        this.item = item;
    }

    abstract @LayoutRes int getResLayout();
}
