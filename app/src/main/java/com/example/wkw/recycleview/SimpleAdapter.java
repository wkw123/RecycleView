package com.example.wkw.recycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wkw on 2016/10/19.
 */

class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{
    private Context context;
    private List<String> myDatas;
    private LayoutInflater inflater;
    public MyAdapter(Context context, List<String> myDatas) {
        this.context = context;
        this.myDatas = myDatas;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item, parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(myDatas.get(position));
    }



    @Override
    public int getItemCount() {
        return myDatas.size();
    }
}


class MyViewHolder extends RecyclerView.ViewHolder{

    TextView textView;

    public MyViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.textview);
    }
}

