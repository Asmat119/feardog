package com.example.feardog.ui.search;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.feardog.R;
import com.example.feardog.databinding.FragmentDashboardBinding;
import com.example.feardog.models.TrendingLiveModel;
import com.example.feardog.models.TrendingStoryModel;
import com.example.feardog.models.TrendingTravelModel;


import java.util.ArrayList;
import java.util.List;

import adapter.TrendingAdapter;
import adapter.TrendingLiveAdapter;
import adapter.TrendingTravelAdapter;
import adapter.ViewPagerAdapter;


public class SearchFragment extends Fragment {

    private FragmentDashboardBinding binding;
    ArrayList<TrendingStoryModel> list;
    ArrayList<TrendingLiveModel> tlist ;
    ArrayList<TrendingTravelModel> trlist;
    ViewPager viewPagerSlider;
    List<Integer> images;
    ImageView dot;
    LinearLayout dotIndicator ;
    ViewPagerAdapter viewPagerAdapter;
    LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;


//    ViewPagerAdapter imageSliderAdapter;
    private static final int AUTO_SCROLL_INTERVAL = 5000; // 5 seconds
    private Handler handler;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SearchViewModel dashboardViewModel =
                new ViewModelProvider(this).get(SearchViewModel.class);

        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        images = new ArrayList<>();
        images.add(R.drawable.cover_image);
        images.add(R.drawable.slider1);
        images.add(R.drawable.slider2);
        images.add(R.drawable.slider3);
        images.add(R.drawable.slider1);
        images.add(R.drawable.slider2);
        images.add(R.drawable.slider3);
        dotscount = images.size();
        dots = new ImageView[dotscount];
//        handler = new Handler();
        sliderDotspanel = binding.dotIndicator;
        viewPagerSlider = binding.viewPager;
         viewPagerAdapter = new ViewPagerAdapter(getContext(),images);
        viewPagerSlider.setAdapter(viewPagerAdapter);




        for(int i = 0; i < dotscount; i++) {
            dots[i] = new ImageView(getContext());
            dots[i].setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.non_active_dot));
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(8, 0, 8, 0);
            sliderDotspanel.addView(dots[i], params);
        }
        dots[0].setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.active_dot));
//        handler.postDelayed(runnable, AUTO_SCROLL_INTERVAL);
        viewPagerSlider.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                for (int i = 0; i < dotscount; i++) {
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.non_active_dot));
                }
                dots[position].setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.active_dot));

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {
//                if (state == ViewPager.SCROLL_STATE_DRAGGING) {
//                    handler.removeCallbacks(runnable);
//                } else if (state == ViewPager.SCROLL_STATE_IDLE) {
//                    handler.postDelayed(runnable, AUTO_SCROLL_INTERVAL);
//                }

            }
        });
        binding.editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SearchFragment.this).navigate(R.id.action_navigation_search_to_searchItemFragment);
            }
        });

        RecyclerView recyclerView = binding.rv;
        RecyclerView rvLive = binding.rvLive;
        RecyclerView rvtravel = binding.rvtravel;
        list = new ArrayList<>();
        tlist = new ArrayList<>();
        trlist = new ArrayList<>();
        View root = binding.getRoot();
        init();
        TrendingAdapter adapter = new TrendingAdapter(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(adapter);
        TrendingLiveAdapter adapteLiver = new TrendingLiveAdapter(tlist);
        rvLive.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        rvLive.setAdapter(adapteLiver);

        TrendingTravelAdapter adaptertravel = new TrendingTravelAdapter(trlist);
        rvtravel.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        rvtravel.setAdapter(adaptertravel);


        binding.btnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_navigation_search_to_QRCodeFragment);
            }
        });

        return root;
    }

//
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            int currentPosition = viewPagerSlider.getCurrentItem();
            int newPosition = currentPosition+1;
            if (newPosition == images.size()) {
                newPosition = 0;
//                handler.postDelayed(runnable, AUTO_SCROLL_INTERVAL);
            }
            viewPagerSlider.setCurrentItem(newPosition, true);
//            handler.postDelayed(runnable, AUTO_SCROLL_INTERVAL);

        }
    };

    private void init() {

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
    }

//    @Override
//    public void onDestroyView() {
//        super.onDestroyView();
//        binding = null;
//    }

}