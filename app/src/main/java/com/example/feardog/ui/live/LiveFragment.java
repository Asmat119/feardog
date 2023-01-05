package com.example.feardog.ui.live;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.feardog.R;
import com.example.feardog.databinding.FragmentLiveBinding;

public class LiveFragment extends Fragment {
    FragmentLiveBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentLiveBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}