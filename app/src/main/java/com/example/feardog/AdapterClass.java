package com.example.feardog;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.feardog.databinding.FriendsLayoutBinding;

import java.util.ArrayList;
import java.util.List;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.ViewHolder> {


    FriendsLayoutBinding binding;
    ArrayList<itemClass> list;
    Context context;

    public AdapterClass(ArrayList<itemClass> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterClass.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = FriendsLayoutBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterClass.ViewHolder holder, int position) {
        holder.binding.ivUser.setImageResource(list.get(position).getUserImage());
        holder.binding.tvUserName.setText(list.get(position).getUserName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        FriendsLayoutBinding binding;
        public ViewHolder(FriendsLayoutBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
