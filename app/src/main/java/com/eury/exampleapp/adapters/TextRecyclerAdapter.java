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
public class TextRecyclerAdapter extends BaseRecyclerAdapter<String, TextItemView> {
    public TextRecyclerAdapter(Context context, List<String> items) {
        super(context, items);
    }

    @Override
    TextItemView onCreateItemView(ViewGroup parent, int viewType) {
        return new TextItemView(context);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewholderWrapper<TextItemView> textItemViewViewholderWrapper, int position) {
        String item = items.get(position);

        TextItemView itemView = textItemViewViewholderWrapper.getView();
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        itemView.bind(item);
    }
}
