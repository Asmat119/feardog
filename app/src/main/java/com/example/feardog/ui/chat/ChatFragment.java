package com.example.feardog.ui.chat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import com.example.feardog.R;
import com.example.feardog.databinding.FragmentChatBinding;
import com.google.android.material.tabs.TabLayout;

public class ChatFragment extends Fragment {
    FragmentChatBinding binding;
    private int[] tabIcons = {
            R.drawable.tab_chat_,
            R.drawable.tab_heart,
            R.drawable.tab_chat,
            R.drawable.tab_user
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentChatBinding.inflate(inflater,container,false);
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        ChatViewPagerAdapter adapter = new ChatViewPagerAdapter(fragmentManager, getLifecycle());
        ViewPager2 viewPager = binding.viewPager;
        viewPager.setAdapter(adapter);
        TabLayout tabs = binding.tabs;

        tabs.addTab(tabs.newTab().setText("All  "));
        tabs.addTab(tabs.newTab().setText("Likes  "));
        tabs.addTab(tabs.newTab().setText("Comments  "));
        tabs.addTab(tabs.newTab().setText("Followers  "));
//        tabs.setPadding(12,0,12,0);

        setupTabIcons();
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
        return  binding.getRoot();

    }
    private void setupTabIcons() {
        binding.tabs.getTabAt(0).setIcon(tabIcons[0]);
        binding.tabs.getTabAt(1).setIcon(tabIcons[1]);
        binding.tabs.getTabAt(2).setIcon(tabIcons[2]);
        binding.tabs.getTabAt(3).setIcon(tabIcons[3]);

    }
}