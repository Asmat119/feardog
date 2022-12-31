package searchtab.ui.main.tabs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.feardog.R;

import com.example.feardog.databinding.FragmentVideoTabBinding;

import java.util.ArrayList;


import adapter.TrendingTravelAdapter;

import model.TrendingTravelModel;

public class VideoTabFragment extends Fragment {
    FragmentVideoTabBinding binding;

    ArrayList<TrendingTravelModel> list;
    TrendingTravelAdapter trendingTravelAdapter;


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

        trendingTravelAdapter = new TrendingTravelAdapter(list);
        binding.rvVtab.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,false));
        binding.rvVtab.setHasFixedSize(true);
        binding.rvVtab.setAdapter(trendingTravelAdapter);


        return binding.getRoot();
    }
}