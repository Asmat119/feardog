package searchtab.ui.main;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;


import searchtab.ui.main.tabs.HashTabFragment;
import searchtab.ui.main.tabs.SoundTabFragment;
import searchtab.ui.main.tabs.TopFragmentTab;
import searchtab.ui.main.tabs.UserTabFragment;
import searchtab.ui.main.tabs.VideoTabFragment;

public class SectionsPagerAdapter extends FragmentStateAdapter {


    public SectionsPagerAdapter(@NonNull FragmentManager fm, Lifecycle lifecycle) {
        super(fm,lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position==0){
            return new TopFragmentTab();
        }
        else if(position==1){
            return new VideoTabFragment();

        }
        else if(position==2){
            return new UserTabFragment();

        }
        else if(position==3){
            return new HashTabFragment();

        }
        return new SoundTabFragment();
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}