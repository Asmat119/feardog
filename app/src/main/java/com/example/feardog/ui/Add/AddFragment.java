package com.example.feardog.ui.Add;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.feardog.databinding.FragmentNotificationsBinding;


public class AddFragment extends Fragment {

    private FragmentNotificationsBinding binding;
//    ArrayList<ItemModel> list;
//    AllTabAdpater adpater;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AddViewModel notificationsViewModel =
                new ViewModelProvider(this).get(AddViewModel.class);

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
//        list = new ArrayList<>();
//
//        list.add(new ItemModel(R.drawable.avatar_f,R.drawable.avatar_g_,"armholegetaway","mixtapenegative","liked your video ・ 20m","",R.drawable.cover));
//        list.add(new ItemModel(R.drawable.avatar,R.drawable.avatar_1,"appendageducktail, asideposes","sermonpetted","liked your video ・ 1h","",R.drawable.cover_1_));
//        list.add(new ItemModel(R.drawable.avatar_3,0,"asideposes","","started following you ・ 1h","Friends",0));
//        list.add(new ItemModel(R.drawable.avatar,0,"appendageducktail","","started following you ・ 1h","Follow",0));
//        list.add(new ItemModel(R.drawable.avatar5,0,"kneadgenes","","started following you ・ 9h","Friends",0));
//        list.add(new ItemModel(R.drawable.avatar6,R.drawable.avatar_4,"asideposes, kneadgenes","16 more","liked your video ・ 12h","",R.drawable.cover_2_));
//        list.add(new ItemModel(R.drawable.avatar6,0,"sermonpetted","","started following you ・ 14h","Friends",0));
//


        final TextView textView = binding.textNotifications;
        notificationsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}