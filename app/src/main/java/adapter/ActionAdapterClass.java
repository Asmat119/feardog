package adapter;


import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.feardog.databinding.ActionLayputBinding;

import java.util.ArrayList;

import model.ActionModel;

public class ActionAdapterClass extends RecyclerView.Adapter<ActionAdapterClass.ViewHolder> {


    ActionLayputBinding binding;
    ArrayList<ActionModel> list;
    Context context;
    utils.onClickListener onClickListener;

    public ActionAdapterClass(ArrayList<ActionModel> list, Context context,utils.onClickListener onClickListener) {
        this.list = list;
        this.context = context;
        this.onClickListener=onClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ActionLayputBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        ActionModel item = list.get(position);
        holder.binding.ivIcon.setImageResource(item.getIvIcon());
        holder.binding.ivText.setText(item.getIconName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickListener.onClickView(position,view);
            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ActionLayputBinding binding;
        public ViewHolder(ActionLayputBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
