package com.example.feardog;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.feardog.databinding.ActionLayputBinding;
import com.example.feardog.databinding.SocialLayoutBinding;

import java.util.ArrayList;

public class ActionAdapterClass extends RecyclerView.Adapter<ActionAdapterClass.ViewHolder> {


    ActionLayputBinding binding;
    ArrayList<ActionModel> list;
    Context context;

    public ActionAdapterClass(ArrayList<ActionModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ActionAdapterClass.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ActionLayputBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ActionAdapterClass.ViewHolder holder, int position) {
        ActionModel item = list.get(position);
        holder.binding.ivIcon.setImageResource(item.getIvIcon());
        holder.binding.ivText.setText(item.getIconName());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ActionLayputBinding binding;
        public ViewHolder(ActionLayputBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
