package utils;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.core.content.ContextCompat;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.feardog.R;
import com.example.feardog.databinding.FragmentShareBottomSheetBinding;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;

import adapter.ActionAdapterClass;
import adapter.ProfileAdapterClass;
import adapter.SocialAdapterClass;
import model.ActionModel;
import model.ProfileClass;
import model.SocialModel;

public class ShareBottomSheet extends BottomSheetDialogFragment implements onClickListener{
    FragmentShareBottomSheetBinding binding;
    
    ArrayList<ProfileClass> itemClasses ;
    ArrayList<SocialModel> socialItem;
    ArrayList<ActionModel> actionItem;
    RecyclerView rvProfile, rvSocial, rvAction;
    NavController navCo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentShareBottomSheetBinding.inflate(inflater,container,false);
        View view = binding.getRoot();
        rvProfile= binding.rvProfile;
        rvSocial= binding.rvSocial;
        rvAction= binding.rvAction;
        itemClasses = new ArrayList<>();
        socialItem = new ArrayList<>();
        actionItem= new ArrayList<>();
        setData();
        setAdapter();

        return  view;
    }
    @Override public int getTheme() {
        return R.style.CustomBottomSheetDialog;
    }
    private void setAdapter() {
        rvProfile.setHasFixedSize(true);
        rvProfile.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL,false));
        ProfileAdapterClass adapterClass = new ProfileAdapterClass(itemClasses,getContext());
        rvProfile.setAdapter(adapterClass);

        SocialAdapterClass socialAdapterClass = new SocialAdapterClass(socialItem,getContext());
        LinearLayoutManager manager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        manager.setStackFromEnd(true);
        rvSocial.setLayoutManager(manager);
        rvSocial.setAdapter(socialAdapterClass);

        ActionAdapterClass actionAdapterClass = new ActionAdapterClass(actionItem,getContext(),this::onClickView);
        LinearLayoutManager manager2 = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        rvAction.setHasFixedSize(true);
        rvAction.setLayoutManager(manager2);
        rvAction.setAdapter(actionAdapterClass);
    }

    private void setData() {

        itemClasses.add(new ProfileClass("Annette Black",R.drawable.regular_4));
        itemClasses.add(new ProfileClass("Annette Black",R.drawable.regular));
        itemClasses.add(new ProfileClass("Annette Black",R.drawable.regular_2));
        itemClasses.add(new ProfileClass("Annette Black",R.drawable.regular_3));
        itemClasses.add(new ProfileClass("Annette Black",R.drawable.regular));
        itemClasses.add(new ProfileClass("Annette Black",R.drawable.regular_5));

        socialItem.add(new SocialModel(ContextCompat.getColor(getContext(),R.color.red),R.drawable.union,"Share link"));
        socialItem.add(new SocialModel(ContextCompat.getColor(getContext(),R.color.color_telegram),R.drawable.frame,"Telegram "));
        socialItem.add(new SocialModel(ContextCompat.getColor(getContext(),R.color.fb_color),R.drawable.fb,"Viber"));
        socialItem.add(new SocialModel(ContextCompat.getColor(getContext(),R.color.color_viber),R.drawable.viber,"Facebook"));
        socialItem.add(new SocialModel(ContextCompat.getColor(getContext(),R.color.sms_color),R.drawable.sms,"Sms"));
        socialItem.add(new SocialModel(ContextCompat.getColor(getContext(),R.color.twitter_color),R.drawable.twitter_2,"Twitter"));

        actionItem.add(new ActionModel(R.drawable.flag,"Report"));
        actionItem.add(new ActionModel(R.drawable.slash,"Not\nInterested"));
        actionItem.add(new ActionModel(R.drawable.impo,"Save\nVideo"));
        actionItem.add(new ActionModel(R.drawable.grid___03,"Duet"));
        actionItem.add(new ActionModel(R.drawable.bookmark,"Bookmark"));
    }

    @Override
    public void onClickView(int pos,View view) {
        Toast.makeText(getContext(), "Clicked "+pos, Toast.LENGTH_SHORT).show();
        if(pos==0){
            NavHostFragment.findNavController(this).navigate(R.id.action_shareBottomSheet_to_reposrtFragment);
//            Navigation.findNavController(requireActivity(),R.id.nav_host_fragment_activity_main).navigate(R.id.action_shareBottomSheet_to_QRCodeFragment);
        }
    }
}