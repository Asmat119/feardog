package adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.feardog.databinding.TravelGridLayoutBinding;
import com.example.feardog.models.TrendingTravelModel;


import java.util.ArrayList;

//
public class TopVideosAdapter extends RecyclerView.Adapter<TopVideosAdapter.ViewHolder> {
    TravelGridLayoutBinding binding;
    ArrayList<TrendingTravelModel> list;

    public TopVideosAdapter(ArrayList<TrendingTravelModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = TravelGridLayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.ivtravel.setImageResource(list.get(position).getIvtravel());
//        holder.binding.tvtravel.setText(list.get(position).getTvtravel());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TravelGridLayoutBinding binding;

        public ViewHolder(@NonNull TravelGridLayoutBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
