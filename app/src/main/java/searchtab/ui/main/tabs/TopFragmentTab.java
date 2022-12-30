package searchtab.ui.main.tabs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
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
import model.HashtagDataModel;

public class TopFragmentTab extends Fragment {

    FragmentTopTabBinding binding;

    ArrayList<HashtagDataModel> list;
    HashtagAdpater adpater;

    /// Videos array and Adapter

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentTopTabBinding.inflate(inflater,container,false);
        list = new ArrayList<>();

        init();

        adpater = new HashtagAdpater(list);
        binding.rvHashtags.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false));
        binding.rvHashtags.setHasFixedSize(true);
        binding.rvHashtags.setAdapter(adpater);

        /// Videos Reycerview  should be set here




        return binding.getRoot();
    }

    private void init() {
        list.add(new HashtagDataModel("travel","2.4M Videos"));
        list.add(new HashtagDataModel("traveldiaries","2.35M Videos"));
        list.add(new HashtagDataModel("travellife","2.19M Videos"));

        /// Videos list should be set here



    }
}