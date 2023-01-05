package adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.feardog.databinding.AccountBinding;
import com.example.feardog.models.AccountModel;


import java.util.ArrayList;


public class AccountAdapter extends RecyclerView.Adapter<AccountAdapter.ViewHolder> {
    AccountBinding binding;
    ArrayList<AccountModel> list;
    public AccountAdapter(ArrayList<AccountModel> list) {
        this.list = list;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = AccountBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        AccountModel model = list.get(position);
        holder.binding.imAvatar.setImageResource(model.getImAvatar());
        holder.binding.tvName.setText(model.getTvName());
        holder.binding.tvAcc.setText(model.getTvAcc());
        if(position==0){

        }
        if(position==1){
            holder.binding.cvBorder.setStrokeWidth(0);
        }
        else {
            holder.binding.tvLive.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

public class ViewHolder extends RecyclerView.ViewHolder {
    AccountBinding binding;

    public ViewHolder(AccountBinding itemView) {
        super(itemView.getRoot());
        binding = itemView;
    }
}

}
