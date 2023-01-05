package com.example.feardog.ui.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.example.feardog.databinding.FragmentSearchTab2Binding;

import com.google.android.material.tabs.TabLayout;


public class SearchTabFragment extends Fragment {
    FragmentSearchTab2Binding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= FragmentSearchTab2Binding.inflate(inflater,container,false);
        SearchViewPagerAdapter sectionsPagerAdapter = new SearchViewPagerAdapter(getChildFragmentManager(),getLifecycle());
        ViewPager2 viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.addTab(tabs.newTab().setText("Top"));
        tabs.addTab(tabs.newTab().setText("Videos"));
        tabs.addTab(tabs.newTab().setText("Users"));
        tabs.addTab(tabs.newTab().setText("Hashtags"));
        tabs.addTab(tabs.newTab().setText("Sounds"));
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                binding.viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        binding.viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabs.selectTab(tabs.getTabAt(position));
            }
        });
        return binding.getRoot();
    }
}