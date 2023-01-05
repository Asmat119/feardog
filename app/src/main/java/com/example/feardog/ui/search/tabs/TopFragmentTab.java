package com.example.feardog.ui.search.tabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;


import com.example.feardog.R;
import com.example.feardog.databinding.FragmentTopTabBinding;
import com.example.feardog.models.AccountModel;
import com.example.feardog.models.HashtagDataModel;
import com.example.feardog.models.SoundModel;
import com.example.feardog.models.TrendingTravelModel;

import java.util.ArrayList;

import adapter.AccountAdapter;
import adapter.HashtagAdpater;
import adapter.SoundAdapter;
import adapter.TopVideosAdapter;
import adapter.TrendingTravelAdapter;
import utils.GridSpacingItemDecoration;


public class TopFragmentTab extends Fragment {

    FragmentTopTabBinding binding;

    ArrayList<HashtagDataModel> list;
    HashtagAdpater adpater;
    TrendingTravelAdapter travelAdapter;
    TopVideosAdapter topVideosAdapter;
    ArrayList<TrendingTravelModel> tlist;

    AccountAdapter accountAdapter;
    ArrayList<AccountModel> alist;


    SoundAdapter soundAdapter;
    ArrayList<SoundModel> slist;
    /// Videos array and Adapter
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentTopTabBinding.inflate(inflater,container,false);
        list = new ArrayList<>();
        tlist= new ArrayList<>();
        alist= new ArrayList<>();
        slist = new ArrayList<>();

        init();

        adpater = new HashtagAdpater(list);
        binding.rvHashtags.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false));
        binding.rvHashtags.setHasFixedSize(true);
        binding.rvHashtags.setAdapter(adpater);
        binding.tvHash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                NavHostFragment.findNavController(TopFragmentTab.this).navigate(R.id.action_searchItemFragment_to_scanQRCodeFragment);
            }
        });

        topVideosAdapter = new TopVideosAdapter(tlist);
        binding.rvVideos.setLayoutManager(new GridLayoutManager(getContext(),3,LinearLayoutManager.VERTICAL,false));
        binding.rvVideos.addItemDecoration(new GridSpacingItemDecoration(3, 0, false));
        binding.rvVideos.setAdapter(topVideosAdapter);

        accountAdapter = new AccountAdapter(alist);
        binding.rvAccount.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        binding.rvAccount.setHasFixedSize(true);
        binding.rvAccount.setAdapter(accountAdapter);


        soundAdapter = new SoundAdapter(slist,getContext());
        binding.rvSound.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager. VERTICAL,false));
        binding.rvSound.setHasFixedSize(true);
        binding.rvSound.setAdapter(soundAdapter);

        /// Videos Reycerview  should be set here

        return binding.getRoot();
    }

    private void init() {
        list.add(new HashtagDataModel("travel","2.4M Videos"));
        list.add(new HashtagDataModel("traveldiaries","2.35M Videos"));
        list.add(new HashtagDataModel("travellife","2.19M Videos"));

        tlist.add(new TrendingTravelModel(R.drawable.cover_2_, "12.3k "));
        tlist.add(new TrendingTravelModel(R.drawable.cover, "16.3k "));
        tlist.add(new TrendingTravelModel(R.drawable.cover_2_, "14.3k "));
        tlist.add(new TrendingTravelModel(R.drawable.cover, "12.3k "));
        tlist.add(new TrendingTravelModel(R.drawable.cover_2_, "17.3k "));
        tlist.add(new TrendingTravelModel(R.drawable.cover, "12.3k "));


        alist.add(new AccountModel(R.drawable.ann, "Annette Black", "@unstylishhelper"));
        alist.add(new AccountModel(R.drawable.james, "Jerome Bell", "@catchablesadly"));
        alist.add(new AccountModel(R.drawable.jenny, "Jenny Fox", "@calamarislider"));

        slist.add(new SoundModel(R.drawable.playback, "Travel Time", "Vivamus Lectus"));
        slist.add(new SoundModel(R.drawable.plazback2, "Travel Story", "Orci Eget"));
        alist.add(new AccountModel(R.drawable.ann, "Annette Black", "@unstylishhelper"));
        alist.add(new AccountModel(R.drawable.james, "Jerome Bell", "@catchablesadly"));
        alist.add(new AccountModel(R.drawable.jenny, "Jenny Fox", "@calamarislider"));
        slist.add(new SoundModel(R.drawable.playback, "Travel Time", "Vivamus Lectus"));
        slist.add(new SoundModel(R.drawable.plazback2, "Travel Story", "Orci Eget"));




        /// Videos list should be set here



    }
}