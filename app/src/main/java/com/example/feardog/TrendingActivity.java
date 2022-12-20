package com.example.feardog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.feardog.databinding.ActivityTrendingBinding;
import com.example.feardog.databinding.TrendingstoriesBinding;

import java.util.ArrayList;

import adapter.TrendingAdapter;
import model.TrendingStoryModel;

public class TrendingActivity extends AppCompatActivity {

     ActivityTrendingBinding binding;
     ArrayList<TrendingStoryModel> list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTrendingBinding.inflate(getLayoutInflater());
        RecyclerView recyclerView = binding.rv;
        list = new ArrayList<>();

        list.add(new TrendingStoryModel(R.drawable.story___larger,R.drawable.jenny,"Jenyy"));
        list.add(new TrendingStoryModel(R.drawable.travel,R.drawable.regular,"Hamza"));
        list.add(new TrendingStoryModel(R.drawable.live___larger,R.drawable.ann,"Anny"));
        list.add(new TrendingStoryModel(R.drawable.story___larger,R.drawable.kris,"Kris"));
        list.add(new TrendingStoryModel(R.drawable.story___larger,R.drawable.jones,"Jones"));

        TrendingAdapter adapter = new TrendingAdapter(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(adapter);


        setContentView(binding.getRoot());
    }
}