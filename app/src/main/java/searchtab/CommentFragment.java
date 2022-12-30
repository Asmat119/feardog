package searchtab;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.feardog.AdapterClass;
import com.example.feardog.R;
import com.example.feardog.databinding.FragmentCommentBinding;


import java.util.ArrayList;
import java.util.List;

import adapter.BottomCommentDataModel;
import adapter.CommentAdapter;
import adapter.CommentDataModel;
import adapter.EmojiSAdapter;

public class CommentFragment extends AppCompatActivity  {

    FragmentCommentBinding binding;
    List<CommentDataModel> childList;
    List<BottomCommentDataModel> list;
    List<String> emojiList;
    CommentAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentCommentBinding.inflate(getLayoutInflater());
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

        EmojiSAdapter emojiSAdapter = new EmojiSAdapter(emojiList);
        binding.rvEmoji.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        binding.rvEmoji.setHasFixedSize(true);
        binding.rvEmoji.setAdapter(emojiSAdapter);




          childList.add(new CommentDataModel("travelguru","2d","It’s a sectet :)",R.drawable.ann,false));
          childList.add(new CommentDataModel("travelguru","2d","It’s a sectet :)",R.drawable.kris,true));
          childList.add(new CommentDataModel("travelguru","2d","It’s a sectet :)",R.drawable.ann,false));
          list.add(new BottomCommentDataModel(childList,"travelguru","1w","In integer suspendisse ridiculus vulputate  tortor egestas",R.drawable.kris,true));

        list.add(new BottomCommentDataModel(childList,"travelguru","1w","In integer suspendisse ridiculus vulputate  tortor egestas",R.drawable.kris,false));

        adapter = new CommentAdapter(list,this);
        binding.rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        binding.rv.setHasFixedSize(true);
        binding.rv.setAdapter(adapter);

        setContentView(binding.getRoot());
    }
}