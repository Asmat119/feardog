package adapter;


import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.feardog.databinding.TravelBinding;
import com.example.feardog.models.TrendingTravelModel;

import java.util.ArrayList;

//
public class TrendingTravelAdapter extends RecyclerView.Adapter<TrendingTravelAdapter.ViewHolder> {
    TravelBinding binding;
    ArrayList<TrendingTravelModel> list;

    public TrendingTravelAdapter(ArrayList<TrendingTravelModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = TravelBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.ivtravel.setImageResource(list.get(position).getIvtravel());
        holder.binding.tvtravel.setText(list.get(position).getTvtravel());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TravelBinding binding;

        public ViewHolder(@NonNull TravelBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
