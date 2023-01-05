package com.example.feardog.ui.search.tabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;


import com.example.feardog.R;
import com.example.feardog.databinding.FragmentVideoTabBinding;
import com.example.feardog.models.TrendingTravelModel;

import java.util.ArrayList;

import adapter.TopVideosAdapter;
import utils.GridSpacingItemDecoration;


public class VideoTabFragment extends Fragment {
    FragmentVideoTabBinding binding;

    ArrayList<TrendingTravelModel> list;
    TopVideosAdapter topVideosAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentVideoTabBinding.inflate(inflater,container,false);
        list= new ArrayList<>();


        list.add(new TrendingTravelModel(R.drawable.cover_1_,"2.8k"));
        list.add(new TrendingTravelModel(R.drawable.cover_1_,"298.1k"));
        list.add(new TrendingTravelModel(R.drawable.cover_1_,"67.5k"));
        list.add(new TrendingTravelModel(R.drawable.cover_1_,"22.4k"));
        list.add(new TrendingTravelModel(R.drawable.cover_2_,"987.9k"));
        list.add(new TrendingTravelModel(R.drawable.card_11,"987.9k"));
        list.add(new TrendingTravelModel(R.drawable.card_1,"987.9k"));
        list.add(new TrendingTravelModel(R.drawable.card_2,"987.9k"));
        list.add(new TrendingTravelModel(R.drawable.card_3,"987.9k"));
        list.add(new TrendingTravelModel(R.drawable.card_4,"987.9k"));
        list.add(new TrendingTravelModel(R.drawable.card_5,"987.9k"));

        topVideosAdapter = new TopVideosAdapter(list);
        binding.rvVtab.setLayoutManager(new GridLayoutManager(getContext(),3, LinearLayoutManager.VERTICAL,false));
        binding.rvVtab.addItemDecoration(new GridSpacingItemDecoration(3, 0, false));
        binding.rvVtab.setHasFixedSize(true);
        binding.rvVtab.setAdapter(topVideosAdapter);

        return binding.getRoot();
    }
}