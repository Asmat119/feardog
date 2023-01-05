package com.example.feardog.ui.chat.tabs;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.feardog.R;
import com.example.feardog.databinding.ItemLayoutBinding;
import com.example.feardog.models.ItemModel;

import java.util.ArrayList;

public class AllTabAdpater extends RecyclerView.Adapter<AllTabAdpater.ViewHolder> {
    ItemLayoutBinding binding;
    Context context;
    ArrayList<ItemModel> list;

    public AllTabAdpater(Context context, ArrayList<ItemModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ItemModel itemModel = list.get(position);

        if(position==4){
            holder.itemLayoutBinding.tvDay.setVisibility(View.VISIBLE);
        }
        if(position==0 || position==1 || position==5){
            holder.itemLayoutBinding.avatar1.setImageResource(itemModel.getImgAvatar1());
            holder.itemLayoutBinding.avatar2.setImageResource(itemModel.getImgAvatar2());
            holder.itemLayoutBinding.avatar2.setVisibility(View.VISIBLE);
            holder.itemLayoutBinding.tvFirstName.setText(itemModel.getTvFirstName());
            holder.itemLayoutBinding.tvSecondName.setText(itemModel.getTvSecondName());
            holder.itemLayoutBinding.tvFirstName.setVisibility(View.VISIBLE);
            holder.itemLayoutBinding.tvLikeVideo.setText(itemModel.getTvLikeVideo());
            holder.itemLayoutBinding.coverImage.setImageResource(itemModel.getEventImage());
            holder.itemLayoutBinding.coverImage.setVisibility(View.VISIBLE);
            holder.itemLayoutBinding.btnAdd.setVisibility(View.GONE);

        }
        else if (position==2 || position==4){
            holder.itemLayoutBinding.avatar1.setImageResource(itemModel.getImgAvatar1());
            holder.itemLayoutBinding.avatar2.setImageResource(itemModel.getImgAvatar2());
            holder.itemLayoutBinding.avatar2.setVisibility(View.GONE);
            holder.itemLayoutBinding.tvFirstName.setText(itemModel.getTvFirstName());
            holder.itemLayoutBinding.tvSecondName.setText(itemModel.getTvSecondName());
            holder.itemLayoutBinding.tvFirstName.setVisibility(View.GONE);
            holder.itemLayoutBinding.tvLikeVideo.setText(itemModel.getTvLikeVideo());
            holder.itemLayoutBinding.coverImage.setImageResource(itemModel.getEventImage());
            holder.itemLayoutBinding.coverImage.setVisibility(View.GONE);
            holder.itemLayoutBinding.btnAdd.setText(itemModel.getBtnText());
            holder.itemLayoutBinding.btnAdd.setElevation(0);
            holder.itemLayoutBinding.btnAdd.setStateListAnimator(null);


        }

        else {
            holder.itemLayoutBinding.avatar1.setImageResource(itemModel.getImgAvatar1());
            holder.itemLayoutBinding.avatar2.setImageResource(itemModel.getImgAvatar2());
            holder.itemLayoutBinding.avatar2.setVisibility(View.GONE);
            holder.itemLayoutBinding.tvFirstName.setText(itemModel.getTvFirstName());
            holder.itemLayoutBinding.tvSecondName.setText(itemModel.getTvSecondName());
            holder.itemLayoutBinding.tvFirstName.setVisibility(View.GONE);
            holder.itemLayoutBinding.tvLikeVideo.setText(itemModel.getTvLikeVideo());
            holder.itemLayoutBinding.coverImage.setImageResource(itemModel.getEventImage());
            holder.itemLayoutBinding.coverImage.setVisibility(View.GONE);
            holder.itemLayoutBinding.btnAdd.setText(itemModel.getBtnText());
            holder.itemLayoutBinding.btnAdd.setBackgroundColor(context.getColor(R.color.red));
            holder.itemLayoutBinding.btnAdd.setElevation(6);
            holder.itemLayoutBinding.btnAdd.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context,
                    R.navigation.mobile_navigation));
//            ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() {
//                @Override
//                public void getOutline(View view, Outline outline) {
//                    // Or read size directly from the view's width/height
//                    int size = context.getResources().getDimensionPixelSize(R.dimen.fabsize);
//                    outline.setOval(size, size, size, size);
//                }
//
//
//            };
//            holder.itemLayoutBinding.btnAdd.setOutlineProvider(viewOutlineProvider);


//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
//                holder.itemLayoutBinding.btnAdd.setOutlineAmbientShadowColor(ContextCompat.getColor(context, R.color.purple_500));
//                holder.itemLayoutBinding.btnAdd.setOutlineSpotShadowColor(ContextCompat.getColor(context, R.color.purple_500));
//            }



            holder.itemLayoutBinding.btnAdd.setTextColor(context.getColor(R.color.white));
        }


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemLayoutBinding itemLayoutBinding;
        public ViewHolder(ItemLayoutBinding binding) {
            super(binding.getRoot());
            itemLayoutBinding = binding;
        }
    }
}
