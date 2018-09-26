package com.eury.exampleapp.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by euryperez on 9/26/18.
 * Property of Instacarro.com
 */
public class ViewholderWrapper<V extends View> extends RecyclerView.ViewHolder {

    private V view;

    public ViewholderWrapper(@NonNull V itemView) {
        super(itemView);
        this.view = itemView;
    }

    public V getView() {
        return view;
    }
}
