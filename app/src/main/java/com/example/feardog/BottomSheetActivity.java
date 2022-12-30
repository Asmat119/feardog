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
    ArrayList<itemClass> itemClasses ;
    ArrayList<SocialModel> socialItem;
    ArrayList<ActionModel> actionItem;
    RecyclerView rvProfile, rvSocial, rvAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBottomSheetBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
         rvProfile= binding.rvProfile;
         rvSocial= binding.rvSocial;
         rvAction= binding.rvAction;
         itemClasses = new ArrayList<>();
         socialItem = new ArrayList<>();
         actionItem= new ArrayList<>();

         setData();
         setAdapter();
    }

    private void setAdapter() {
        rvProfile.setHasFixedSize(true);
        rvProfile.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        AdapterClass adapterClass = new AdapterClass(itemClasses,this);
        rvProfile.setAdapter(adapterClass);

        SocialAdapterClass socialAdapterClass = new SocialAdapterClass(socialItem,this);
        LinearLayoutManager manager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        manager.setStackFromEnd(true);
        rvSocial.setLayoutManager(manager);
        rvSocial.setAdapter(socialAdapterClass);

        ActionAdapterClass actionAdapterClass = new ActionAdapterClass(actionItem,this);
        LinearLayoutManager manager2 = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        rvAction.setHasFixedSize(true);
        rvAction.setLayoutManager(manager2);
        rvAction.setAdapter(actionAdapterClass);
    }

    private void setData() {

        itemClasses.add(new itemClass("Annette Black",R.drawable.regular1));
        itemClasses.add(new itemClass("Annette Black",R.drawable.james));
        itemClasses.add(new itemClass("Annette Black",R.drawable.jenny));
        itemClasses.add(new itemClass("Annette Black",R.drawable.kris));
        itemClasses.add(new itemClass("Annette Black",R.drawable.regular));
        itemClasses.add(new itemClass("Annette Black",R.drawable.ann));
        socialItem.add(new SocialModel(ContextCompat.getColor(this,R.color.red),R.drawable.union,"Share link"));
        socialItem.add(new SocialModel(ContextCompat.getColor(this,R.color.color_telegram),R.drawable.frame,"Telegram "));
        socialItem.add(new SocialModel(ContextCompat.getColor(this,R.color.fb_color),R.drawable.fb,"Viber"));
        socialItem.add(new SocialModel(ContextCompat.getColor(this,R.color.color_viber),R.drawable.viber,"Facebook"));
        socialItem.add(new SocialModel(ContextCompat.getColor(this,R.color.sms_color),R.drawable.sms,"Sms"));
        socialItem.add(new SocialModel(ContextCompat.getColor(this,R.color.twitter_color),R.drawable.sms,"Twitter"));
        actionItem.add(new ActionModel(R.drawable.flag,"Report"));
        actionItem.add(new ActionModel(R.drawable.slash,"Not Interested"));
        actionItem.add(new ActionModel(R.drawable.impo,"Save Video"));
        actionItem.add(new ActionModel(R.drawable.grid___03,"Duet"));
        actionItem.add(new ActionModel(R.drawable.bookmark,"Bookmark"));
    }

}

