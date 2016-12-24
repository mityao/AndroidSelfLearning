package com.example.android.listviewtorecycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.listviewtorecycleview.models.Todo;

import java.util.List;

/**
 * Created by mitya on 12/21/2016.
 */

public class TodoListAdapter extends ViewHolderAdapter{

    private Context context;
    private List<Todo> data;

    public TodoListAdapter(@NonNull Context context, List<Todo> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    protected ViewHolderAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.main_list_item, parent, false);
        return new TodoListViewHolder(view);
    }

    @Override
    protected void onBindViewHolder(ViewHolderAdapter.ViewHolder viewHolder, int position) {
        Todo todo = (Todo) getItem(position);
        ((TodoListViewHolder) viewHolder).todoText.setText(todo.text);
    }

    public static class TodoListViewHolder extends ViewHolderAdapter.ViewHolder {
        TextView todoText;

        public TodoListViewHolder(View view) {
            super(view);
            todoText = (TextView) view.findViewById(R.id.main_list_item_text);
        }
    }
}
