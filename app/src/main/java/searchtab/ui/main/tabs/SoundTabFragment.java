package searchtab.ui.main.tabs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.feardog.R;
import com.example.feardog.databinding.FragmentSoundTabBinding;
import com.example.feardog.databinding.FragmentVideoTabBinding;

import java.util.ArrayList;

import adapter.SoundAdapter;
import adapter.TrendingTravelAdapter;
import model.SoundModel;

public class SoundTabFragment extends Fragment {
    FragmentSoundTabBinding binding;
    ArrayList<SoundModel> slist;
    SoundAdapter soundAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSoundTabBinding.inflate(inflater,container,false);
        slist= new ArrayList<>();

        slist.add(new SoundModel(R.drawable.playback, "Travel Time", "Vivamus Lectus"));
        slist.add(new SoundModel(R.drawable.plazback2, "Travel Story", "Orci Eget"));
        slist.add(new SoundModel(R.drawable.playback, "Travel Time", "Vivamus Lectus"));
        slist.add(new SoundModel(R.drawable.plazback2, "Travel Story", "Orci Eget"));
        slist.add(new SoundModel(R.drawable.playback, "Travel Time", "Vivamus Lectus"));
        slist.add(new SoundModel(R.drawable.plazback2, "Travel Story", "Orci Eget"));
        slist.add(new SoundModel(R.drawable.playback, "Travel Time", "Vivamus Lectus"));
        slist.add(new SoundModel(R.drawable.plazback2, "Travel Story", "Orci Eget"));
        slist.add(new SoundModel(R.drawable.playback, "Travel Time", "Vivamus Lectus"));


        soundAdapter = new SoundAdapter(slist,  getContext() );
        binding.rvStab.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false));
        binding.rvStab.setHasFixedSize(true);
        binding.rvStab.setAdapter(soundAdapter);


        return binding.getRoot();

    }
}