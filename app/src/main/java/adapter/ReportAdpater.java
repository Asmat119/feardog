package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.feardog.databinding.ReportLayoutBinding;

import java.util.ArrayList;

public class ReportAdpater extends RecyclerView.Adapter<ReportAdpater.MyViewHolder> {

       ReportLayoutBinding binding;
       ArrayList<String> list;
       Context context;

    public ReportAdpater(ArrayList<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        binding = ReportLayoutBinding.inflate(LayoutInflater.from(viewGroup.getContext()),viewGroup,false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {

        holder.reportLayoutBinding.tvTitle.setText(list.get(i));
        if (i==0){
            holder.reportLayoutBinding.tvSubTitle.setVisibility(View.VISIBLE);
        }
        else {
            holder.reportLayoutBinding.tvSubTitle.setVisibility(View.GONE);
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ReportLayoutBinding reportLayoutBinding;
        public MyViewHolder(ReportLayoutBinding binding) {
            super(binding.getRoot());
            reportLayoutBinding = binding;
        }
    }
}
