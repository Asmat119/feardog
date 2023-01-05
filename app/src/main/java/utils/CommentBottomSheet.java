package utils;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.feardog.R;
import com.example.feardog.databinding.FragmentCommentBottomSheetBinding;
import com.example.feardog.models.BottomCommentDataModel;
import com.example.feardog.models.CommentDataModel;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;
import java.util.List;

import adapter.CommentAdapter;
import adapter.EmojisAdapter;

public class CommentBottomSheet extends BottomSheetDialogFragment {
    FragmentCommentBottomSheetBinding binding;

    List<CommentDataModel> childList;
    List<BottomCommentDataModel> list;
    List<String> emojiList;
    CommentAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentCommentBottomSheetBinding.inflate(inflater,container,false);
        childList = new ArrayList<>();
        list = new ArrayList<>();
        emojiList = new ArrayList<>();

        emojiList.add("\uD83D\uDC4D");
        emojiList.add("\uD83D\uDC4E");
        emojiList.add("\uD83C\uDF89");
        emojiList.add("\uD83D\uDE0D");
        emojiList.add("\uD83C\uDF77");
        emojiList.add("\uD83D\uDE2E");
        emojiList.add("\uD83C\uDF89");
        emojiList.add("\uD83D\uDD25");
        emojiList.add("\uD83D\uDC4F");
        emojiList.add("\uD83D\uDE31");
        emojiList.add("\uD83D\uDCAF");
        emojiList.add("\uD83D\uDE25");

        EmojisAdapter emojiSAdapter = new EmojisAdapter(emojiList);
        binding.rvEmoji.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        binding.rvEmoji.setHasFixedSize(true);
        binding.rvEmoji.setAdapter(emojiSAdapter);




        childList.add(new CommentDataModel("travelguru","2d","It’s a sectet :)",R.drawable.ann,false));
        childList.add(new CommentDataModel("travelguru","2d","It’s a sectet :)",R.drawable.kris,true));
        childList.add(new CommentDataModel("travelguru","2d","It’s a sectet :)",R.drawable.ann,false));
        list.add(new BottomCommentDataModel(childList,"travelguru","1w","In integer suspendisse ridiculus vulputate  tortor egestas",R.drawable.kris,true));

        list.add(new BottomCommentDataModel(childList,"travelguru","1w","In integer suspendisse ridiculus vulputate  tortor egestas",R.drawable.kris,false));

        adapter = new CommentAdapter(list,getContext());
        binding.rv.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false));
        binding.rv.setHasFixedSize(true);
        binding.rv.setAdapter(adapter);
        return binding.getRoot();
    }
    @Override public int getTheme() {
        return R.style.CustomBottomSheetDialog;
    }
}