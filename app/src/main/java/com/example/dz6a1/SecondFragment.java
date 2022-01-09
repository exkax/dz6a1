package com.example.dz6a1;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dz6a1.databinding.FragmentFirstBinding;
import com.example.dz6a1.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment<onClick> extends Fragment implements  Listenner{

    private ArrayList<Model> data = new ArrayList<>();
    private FragmentSecondBinding binding;
    private RecyclerView recyclerView;
    private Adapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapter = new Adapter();
        adapter.setListenner(data, this);
        binding.recycler2.setAdapter(adapter);

    }

    private void loadData() {
        data = new ArrayList<>();
        data.add(new Model("1", "Rosyln", "Twilight", 3.14));
        data.add(new Model("2", "Rosyln", "Twilight", 3.14));
        data.add(new Model("3", "Rosyln", "Twilight", 3.14));
        data.add(new Model("4", "Rosyln", "Twilight", 3.14));
        data.add(new Model("5", "Rosyln", "Twilight", 3.14));
        data.add(new Model("6", "Rosyln", "Twilight", 3.14));
        data.add(new Model("7", "Rosyln", "Twilight", 3.14));
        data.add(new Model("8", "Rosyln", "Twilight", 3.14));
        data.add(new Model("9", "Rosyln", "Twilight", 3.14));
        data.add(new Model("10", "Rosyln", "Twilight", 3.14));


    }

    @Override
    public void onClick(Model model) {
        Intent intent = new Intent(getActivity(), SecondActivity.class);
        intent.putExtra("key", model.getSong());
        startActivity(intent);
    }
    }
