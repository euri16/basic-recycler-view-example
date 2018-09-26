package com.eury.exampleapp.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.eury.exampleapp.adapters.itemviews.TextItemView;

import java.util.List;

/**
 * Created by euryperez on 9/26/18.
 * Property of Instacarro.com
 */
public abstract class BaseRecyclerAdapter<T, V extends View> extends RecyclerView.Adapter<ViewholderWrapper<V>> {

    Context context;

    List<T> items = null;

    protected BaseRecyclerAdapter(Context context, List<T> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items != null ? items.size() : 0;
    }

    @NonNull
    @Override
    public ViewholderWrapper<V> onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewholderWrapper(onCreateItemView(viewGroup, i));
    }

    abstract V onCreateItemView(ViewGroup parent, int viewType);
}
