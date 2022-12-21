package adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.feardog.databinding.TrendingliveBinding;

import java.util.ArrayList;

import model.TrendingLiveModel;

public class TrendingLiveAdapter extends RecyclerView.Adapter<TrendingLiveAdapter.ViewHolder> {
    TrendingliveBinding binding;
    ArrayList<TrendingLiveModel> list;

    public TrendingLiveAdapter(ArrayList<TrendingLiveModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public TrendingLiveAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = TrendingliveBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull TrendingLiveAdapter.ViewHolder holder, int position) {
        holder.binding.ivBack.setImageResource(list.get(position).getIvbak());
        holder.binding.ivAva.setImageResource(list.get(position).getIvAva());
        holder.binding.tvViewrs.setText(list.get(position).getTvViewrs());
        if(position==0){
            holder.binding.cvAdd.setVisibility(View.VISIBLE);
        }
        else {
            holder.binding.cvAdd.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TrendingliveBinding binding;

        public ViewHolder(@NonNull TrendingliveBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}

