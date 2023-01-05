package com.example.feardog.ui.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.feardog.R;
import com.example.feardog.databinding.FragmentQRCodeBinding;


public class QRCodeFragment extends Fragment {
    FragmentQRCodeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentQRCodeBinding.inflate(inflater, container, false);


        binding.btnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(QRCodeFragment.this,ScanQRCodeActivity.class));
                NavHostFragment.findNavController(getParentFragment()).navigate(R.id.action_QRCodeFragment_to_scanQRCodeFragment);
            }
        });
        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(QRCodeFragment.this).navigateUp();
            }
        });

        return  binding.getRoot();
    }
}