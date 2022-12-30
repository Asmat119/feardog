package searchtab.ui.main.tabs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.feardog.R;
import com.example.feardog.databinding.FragmentTopTabBinding;

import java.util.ArrayList;
import java.util.List;

import adapter.HashtagAdpater;
import adapter.TrendingTravelAdapter;
import model.HashtagDataModel;
import model.TrendingTravelModel;

public class TopFragmentTab extends Fragment {

    FragmentTopTabBinding binding;

    ArrayList<HashtagDataModel> list;
    HashtagAdpater adpater;
    TrendingTravelAdapter travelAdapter;
    ArrayList<TrendingTravelModel> tlist;

    /// Videos array and Adapter

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentTopTabBinding.inflate(inflater,container,false);
        list = new ArrayList<>();
        tlist= new ArrayList<>();

        init();

        adpater = new HashtagAdpater(list);
        binding.rvHashtags.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false));
        binding.rvHashtags.setHasFixedSize(true);
        binding.rvHashtags.setAdapter(adpater);

        travelAdapter = new TrendingTravelAdapter(tlist);
        binding.rvVideos.setLayoutManager(new GridLayoutManager(getContext(),3,LinearLayoutManager.VERTICAL,false));
        binding.rvVideos.setHasFixedSize(true);
        binding.rvVideos.setAdapter(travelAdapter);

        /// Videos Reycerview  should be set here

        return binding.getRoot();
    }

    private void init() {
        list.add(new HashtagDataModel("travel","2.4M Videos"));
        list.add(new HashtagDataModel("traveldiaries","2.35M Videos"));
        list.add(new HashtagDataModel("travellife","2.19M Videos"));

        tlist.add(new TrendingTravelModel(R.drawable.cover_2_, "12.3k "));
        tlist.add(new TrendingTravelModel(R.drawable.cover, "16.3k "));
        tlist.add(new TrendingTravelModel(R.drawable.cover_2_, "14.3k "));
        tlist.add(new TrendingTravelModel(R.drawable.cover, "12.3k "));
        tlist.add(new TrendingTravelModel(R.drawable.cover_2_, "17.3k "));
        tlist.add(new TrendingTravelModel(R.drawable.cover, "12.3k "));
        /// Videos list should be set here



    }
}