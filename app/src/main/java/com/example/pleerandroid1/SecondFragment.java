package com.example.pleerandroid1;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pleerandroid1.databinding.FragmentSecondBinding;

import java.io.Serializable;
import java.util.ArrayList;


public class SecondFragment extends Fragment implements  OnClickListener {
    private FragmentSecondBinding binding;
    private ArrayList<ModelForPlear> data;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        AdapterMusic adapterMusic = new AdapterMusic(data, this);
        binding.recyclerView.setAdapter(adapterMusic);


    }

    private void loadData() {
        data = new ArrayList<>();
        data.add(new ModelForPlear("Тима Беларусский", "ок", 1, "4:32"));
        data.add(new ModelForPlear("Xcho", "Memorise", 2, "3:32"));
        data.add(new ModelForPlear("Shir", "Ты Моё", 3, "5:32"));
        data.add(new ModelForPlear("Alexsandra Stan", "Ecoute", 4, "3:31"));
        data.add(new ModelForPlear("Rauf Faik", " Если тебе будеть грустно ", 5, "3:12"));
        data.add(new ModelForPlear("Al fakher", " Я влюбился тебя шахризад", 6, "3:08"));
        data.add(new ModelForPlear("Janga", "Малыш", 7, "2:44"));
        data.add(new ModelForPlear("Xcho", "London", 8, "2:47"));
        data.add(new ModelForPlear("Hensy", "поболело и прошло", 9, "2:36"));
        data.add(new ModelForPlear("Enrasta", "Алый закать", 10, "3:30"));

    }

    @Override
    public void onClick(ModelForPlear modelForPlear) {
        Intent intent = new Intent(requireActivity(), DataAcktivity.class);
        intent.putExtra("text", (Serializable) modelForPlear.getPersonName());
        startActivity(intent);

    }
}