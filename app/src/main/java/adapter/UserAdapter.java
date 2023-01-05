package adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.feardog.databinding.UsersBinding;
import com.example.feardog.models.UserModel;

import java.util.ArrayList;


public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    UsersBinding binding;
    ArrayList<UserModel> list;
    public UserAdapter(ArrayList<UserModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = UsersBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        UserModel model = list.get(position);
        holder.binding.imAvatar.setImageResource(model.getIvAvatar());
        holder.binding.tvName.setText(model.getTvName());
        holder.binding.tvUserName.setText(model.getTvUserName());

        if(position==0 || position==1 || position ==3 ){
            holder.binding.cvBorder.setStrokeWidth(0);
            holder.binding.cvBorder.setMinimumWidth(48);
            holder.binding.cvBorder.setMinimumHeight(48);
//            holder.binding.imAvatar.setPadding(0,0,0,0);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        UsersBinding binding;
        public ViewHolder(UsersBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
