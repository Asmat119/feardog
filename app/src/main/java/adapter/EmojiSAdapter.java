package adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.feardog.databinding.EmojiLayoutBinding;

import java.util.List;

public class EmojiSAdapter extends RecyclerView.Adapter<EmojiSAdapter.ViewHolder> {
    EmojiLayoutBinding binding;

    List<String> list;

    public EmojiSAdapter(List<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public EmojiSAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding= EmojiLayoutBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull EmojiSAdapter.ViewHolder holder, int position) {
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
