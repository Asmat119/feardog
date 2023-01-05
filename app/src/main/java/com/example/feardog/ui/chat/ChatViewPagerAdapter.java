package com.example.feardog.ui.chat;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.feardog.ui.chat.tabs.AllTabsFragmnet;


public class ChatViewPagerAdapter extends FragmentStateAdapter {


    public ChatViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {


        if (position==0){
            return new AllTabsFragmnet();
        }
        else if(position==1){
            return new AllTabsFragmnet();

        }
        else if(position==2){
            return new AllTabsFragmnet();

        }
        return new AllTabsFragmnet();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}