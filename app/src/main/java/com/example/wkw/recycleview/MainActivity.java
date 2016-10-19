package com.example.wkw.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView myRecycleView;
    private List<String> mDatas;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDatas();
        initViews();
        myAdapter = new MyAdapter(this,mDatas);
        myRecycleView.setAdapter(myAdapter);
        LinearLayoutManager linearLayouManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        myRecycleView.setLayoutManager(linearLayouManager);
        myRecycleView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST));
    }

    private void initViews() {
        myRecycleView = (RecyclerView) findViewById(R.id.recycleview);
    }

    private void initDatas() {
        mDatas = new ArrayList<>();
        for (int i = 'A'; i <= 'Z'; i ++){
            mDatas.add("" + (char)i);
        }
    }

}
