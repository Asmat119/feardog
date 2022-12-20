package com.example.feardog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.feardog.databinding.ActivityBottomSheetBinding;
import com.example.feardog.databinding.BottomsheetBinding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BottomSheetActivity extends AppCompatActivity {
    ActivityBottomSheetBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBottomSheetBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        RecyclerView recyclerView
                = binding.rvProfile;
        // Create and set the layout manager
        // For the RecyclerView.
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true);


        ArrayList<itemClass> itemClasses = new ArrayList<>();
        ArrayList<SocialModel> socialItem = new ArrayList<>();

        itemClasses.add(new itemClass("Annette Black",R.drawable.regular1));
        itemClasses.add(new itemClass("Annette Black",R.drawable.james));
        itemClasses.add(new itemClass("Annette Black",R.drawable.jenny));
        itemClasses.add(new itemClass("Annette Black",R.drawable.kris));
        itemClasses.add(new itemClass("Annette Black",R.drawable.regular));
        itemClasses.add(new itemClass("Annette Black",R.drawable.ann));
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        Collections.reverse(itemClasses);
        AdapterClass adapterClass = new AdapterClass(itemClasses,this);
        recyclerView.setAdapter(adapterClass);

        socialItem.add(new SocialModel(ContextCompat.getColor(this,R.color.red),R.drawable.union,"Share link"));
        socialItem.add(new SocialModel(ContextCompat.getColor(this,R.color.color_telegram),R.drawable.frame,"Telegram "));
        socialItem.add(new SocialModel(ContextCompat.getColor(this,R.color.fb_color),R.drawable.fb,"Viber"));
        socialItem.add(new SocialModel(ContextCompat.getColor(this,R.color.color_viber),R.drawable.viber,"Facebook"));
        socialItem.add(new SocialModel(ContextCompat.getColor(this,R.color.sms_color),R.drawable.sms,"Sms"));
        socialItem.add(new SocialModel(ContextCompat.getColor(this,R.color.twitter_color),R.drawable.twitter2,"Twitter"));
        Collections.reverse(socialItem);
        SocialAdapterClass socialAdapterClass = new SocialAdapterClass(socialItem,this);
       LinearLayoutManager manager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true);
       manager.setStackFromEnd(true);
       binding.rvSocial.setLayoutManager(manager);
       binding.rvSocial.setAdapter(socialAdapterClass);


    }
}

