package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.feardog.databinding.SoundBinding;
import java.util.ArrayList;

import model.AccountModel;
import model.SoundModel;

public class SoundAdapter extends RecyclerView.Adapter<SoundAdapter.ViewHolder> {
    SoundBinding binding;
    ArrayList<SoundModel> list;
    Context context;

    public SoundAdapter(ArrayList<SoundModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public SoundAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = SoundBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new SoundAdapter.ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SoundModel model = list.get(position);
        holder.binding.ivBk.setBackground(context.getDrawable(model.getIvBk()));
        holder.binding.tvSound.setText(model.getTvSname());
        holder.binding.tvViews.setText(model.getTvStrack());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        SoundBinding binding;

        public ViewHolder(SoundBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
