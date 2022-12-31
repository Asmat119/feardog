package searchtab.ui.main.tabs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.feardog.R;
import com.example.feardog.databinding.FragmentHashTabBinding;

import java.util.ArrayList;

import adapter.HashtagAdpater;
import model.HashtagDataModel;

public class HashTabFragment extends Fragment {
    FragmentHashTabBinding binding;
    ArrayList<HashtagDataModel> list;
    HashtagAdpater hashtagAdpater;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHashTabBinding.inflate(inflater,container,false);
        list= new ArrayList<>();


        list.add(new HashtagDataModel("travel","2.4M Videos"));
        list.add(new HashtagDataModel("traveldiaries","2.35M Videos"));
        list.add(new HashtagDataModel("worldtravel","300.8k Videos"));
        list.add(new HashtagDataModel("holidaytravel","2.4M Videos"));
        list.add(new HashtagDataModel("traveldiaries","2.35M Videos"));
        list.add(new HashtagDataModel("travellife","2.19M Videos"));
        list.add(new HashtagDataModel("weekendtravel","23.4M Videos"));
        list.add(new HashtagDataModel("traveldiaries","2.35M Videos"));
        list.add(new HashtagDataModel("travellife","2.19M Videos"));
        list.add(new HashtagDataModel("traveling","200M Videos"));
        list.add(new HashtagDataModel("traveldiaries","500.3k Videos"));



        hashtagAdpater = new HashtagAdpater(list);
        binding.rvHashtag.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false));
        binding.rvHashtag.setHasFixedSize(true);
        binding.rvHashtag.setAdapter(hashtagAdpater);

        return binding.getRoot();
    }
}