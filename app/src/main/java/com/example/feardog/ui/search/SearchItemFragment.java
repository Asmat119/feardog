package com.example.feardog.ui.search;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewpager.widget.ViewPager;

import com.example.feardog.databinding.FragmentSearchItemBinding;


public class SearchItemFragment extends Fragment {
    FragmentSearchItemBinding binding;
    ViewPager viewPager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSearchItemBinding.inflate(inflater,container,false);
        binding.editText.requestFocus();


        binding.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String value=charSequence.toString();
                if (value.isEmpty()){
                  binding.viewFlipper.setDisplayedChild(0);
                    binding.appBar.setElevation(2);
                }
                else {
                    binding.viewFlipper.setDisplayedChild(1);
                    binding.appBar.setElevation(0);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SearchItemFragment.this).navigateUp();
            }
        });
        return binding.getRoot();
    }
}