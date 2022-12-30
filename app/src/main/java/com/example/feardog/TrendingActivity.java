package com.example.feardog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.feardog.databinding.ActivityTrendingBinding;

import java.util.ArrayList;

import adapter.TrendingAdapter;
import adapter.TrendingLiveAdapter;
import adapter.TrendingTravelAdapter;
import model.TrendingLiveModel;
import model.TrendingStoryModel;
import model.TrendingTravelModel;

public class TrendingActivity extends AppCompatActivity {

     ActivityTrendingBinding binding;
     ArrayList<TrendingStoryModel> list;
     ArrayList<TrendingLiveModel> tlist ;
     ArrayList<TrendingTravelModel> trlist;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTrendingBinding.inflate(getLayoutInflater());
        RecyclerView recyclerView = binding.rv;
        RecyclerView rvLive = binding.rvLive;
        RecyclerView rvtravel = binding.rvtravel;
        list = new ArrayList<>();
        tlist = new ArrayList<>();
        trlist = new ArrayList<>();

        list.add(new TrendingStoryModel(R.drawable.story___larger,R.drawable.jenny,"Jenyy"));
        list.add(new TrendingStoryModel(R.drawable.travel,R.drawable.regular,"Hamza"));
        list.add(new TrendingStoryModel(R.drawable.live___larger,R.drawable.ann,"Anny"));
        list.add(new TrendingStoryModel(R.drawable.story___larger,R.drawable.kris,"Kris"));
        list.add(new TrendingStoryModel(R.drawable.story___larger,R.drawable.jones,"Jones"));

        tlist.add(new TrendingLiveModel(R.drawable.story___larger,R.drawable.jenny,"Jenyy"));
        tlist.add(new TrendingLiveModel(R.drawable.travel,R.drawable.regular,"Hamza"));
        tlist.add(new TrendingLiveModel(R.drawable.live___larger,R.drawable.ann,"Anny"));
        tlist.add(new TrendingLiveModel(R.drawable.story___larger,R.drawable.kris,"Kris"));
        tlist.add(new TrendingLiveModel(R.drawable.story___larger,R.drawable.jones,"Jones"));

        trlist.add(new TrendingTravelModel(R.drawable.travel,"213.3k"));
        trlist.add(new TrendingTravelModel(R.drawable.story___larger,"411k"));
        trlist.add(new TrendingTravelModel(R.drawable.live___larger,"5678k"));
        trlist.add(new TrendingTravelModel(R.drawable.travel,"288k"));

        TrendingAdapter adapter = new TrendingAdapter(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(adapter);

        TrendingLiveAdapter adapteLiver = new TrendingLiveAdapter(tlist);
        rvLive.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        rvLive.setAdapter(adapteLiver);

        TrendingTravelAdapter adaptertravel = new TrendingTravelAdapter(trlist);
        rvtravel.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        rvtravel.setAdapter(adaptertravel);

        setContentView(binding.getRoot());
    }
}