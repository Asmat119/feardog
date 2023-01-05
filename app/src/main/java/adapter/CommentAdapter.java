package adapter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.feardog.R;
import com.example.feardog.databinding.CommentsBinding;
import com.example.feardog.models.BottomCommentDataModel;
import com.example.feardog.models.CommentDataModel;

import java.util.List;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.ViewModel>{

    CommentsBinding binding;
    List<BottomCommentDataModel> itemList;
    List<CommentDataModel> chidlList;
    Context context;
    boolean isClicked = false;




    public CommentAdapter(List<BottomCommentDataModel> itemList, Context context) {
        this.itemList = itemList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = CommentsBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewModel(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewModel holder, int position) {
        BottomCommentDataModel model = itemList.get(position);

        holder.binding.imAvatar.setImageResource(model.getIvAvatar());
        holder.binding.tvMessage.setText(model.getTvMessage());
        holder.binding.tvDay.setText(model.getTvDay());
        holder.binding.tvUserName.setText(model.getTvUserName());
        chidlList= model.getList();
        String text = "<font color=#000000>"+holder.binding.tvMessage.getText()+"</font> <font color=#6C7989>Reply</font>";
        holder.binding.tvMessage.setText(Html.fromHtml(text));

        boolean isExpandable = model.isExpandable();

        holder.binding.tvIconHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                   isClicked = !isClicked;
                   if(isClicked){
                       holder.binding.tvIconHeart.setImageResource(R.drawable.heart___small);
                       holder.binding.tvIconHeart.setImageTintList(ColorStateList.valueOf(context.getColor(R.color.red)));
                   }
                else {
                    holder.binding.tvIconHeart.setImageResource(R.drawable.heart);
                    holder.binding.tvIconHeart.setImageTintList(null);
                }

            }
        });

        if(model.isCreator()){
            holder.binding.cvBorder.setStrokeWidth(2);
            holder.binding.tvCreator.setVisibility(View.VISIBLE);
        }
        else {
            holder.binding.cvBorder.setStrokeWidth(0);
            holder.binding.tvCreator.setVisibility(View.GONE);
        }
        holder.binding.expandedLayout.setVisibility(isExpandable ? View.VISIBLE: View.GONE);
        if(isExpandable){
            holder.binding.tvView.setCompoundDrawablesWithIntrinsicBounds(null,null,context.getResources().getDrawable(R.drawable.ic_baseline_keyboard_arrow_up_24),null);
        }
        else {
            holder.binding.tvView.setCompoundDrawablesWithIntrinsicBounds(null,null,context.getResources().getDrawable(R.drawable.ic_baseline_keyboard_arrow_down_24),null);
        }
        NestedCommentAdapter adapter = new NestedCommentAdapter(chidlList,context);
        holder.binding.childRecyclerView.setLayoutManager(new LinearLayoutManager(holder.itemView.getContext()));
        holder.binding.childRecyclerView.setHasFixedSize(true);
        holder.binding.childRecyclerView.setAdapter(adapter);

        holder.binding.tvView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model.setExpandable(!model.isExpandable());
                chidlList= model.getList();
                notifyItemChanged(holder.getAdapterPosition());
            }
        });



    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ViewModel extends RecyclerView.ViewHolder {
        CommentsBinding binding;
        public ViewModel(@NonNull CommentsBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }

}
