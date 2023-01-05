package adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.feardog.databinding.EmojiLayoutBinding;

import java.util.List;

public class EmojisAdapter extends RecyclerView.Adapter<EmojisAdapter.ViewHolder> {
    EmojiLayoutBinding binding;

    List<String> list;

    public EmojisAdapter(List<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding= EmojiLayoutBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.ivEmoji.setText(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        EmojiLayoutBinding binding;
        public ViewHolder(EmojiLayoutBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
