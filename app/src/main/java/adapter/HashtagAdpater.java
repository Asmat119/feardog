package adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.feardog.databinding.HashtagLayoutBinding;
import com.example.feardog.models.HashtagDataModel;

import java.util.ArrayList;


public class HashtagAdpater extends RecyclerView.Adapter<HashtagAdpater.ViewHolder> {

    HashtagLayoutBinding binding;
    ArrayList<HashtagDataModel> list;

    public HashtagAdpater(ArrayList<HashtagDataModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = HashtagLayoutBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        HashtagDataModel model = list.get(position);

        holder.binding.tvTravel.setText(model.getTvTravel());
        holder.binding.tvViews.setText(model.getTvViews());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        HashtagLayoutBinding binding;
        public ViewHolder(HashtagLayoutBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
