package adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.feardog.databinding.RecentLayoutBinding;

import java.util.ArrayList;


public class RecentAdapter extends RecyclerView.Adapter<RecentAdapter.ViewHolder> {
    RecentLayoutBinding binding;
    ArrayList<String> list;
    public RecentAdapter(ArrayList<String> list) {
        this.list = list;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = RecentLayoutBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.tvTime.setText(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

public class ViewHolder extends RecyclerView.ViewHolder {
    RecentLayoutBinding binding;

    public ViewHolder(RecentLayoutBinding itemView) {
        super(itemView.getRoot());
        binding = itemView;
    }
}

}
