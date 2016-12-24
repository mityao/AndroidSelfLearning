package com.example.android.listviewtorecycleview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by mitya on 12/21/2016.
 */

public abstract class ViewHolderAdapter extends BaseAdapter{

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;
        if (convertView == null) {
            vh = onCreateViewHolder(parent, position);
            convertView = vh.view;
            vh.view.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        onBindViewHolder(vh, position);
        return convertView;
    }
    //定义了abstract抽象函数，只有定义没有实体，具体的交给孩子去实现，也就是TodoListAdapter
    protected abstract ViewHolder onCreateViewHolder(ViewGroup parent, int position);
    //onBindViewHolder把数据实现到界面上，填坑
    protected abstract void onBindViewHolder(ViewHolder viewHolder, int position);

    public static abstract class ViewHolder {
        protected View view;
        public ViewHolder(View view) {
            this.view = view;
        }
    }
}
