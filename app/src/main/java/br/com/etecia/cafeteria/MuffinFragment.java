package br.com.etecia.cafeteria;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MuffinFragment extends Fragment {

    RecyclerView lstMuffin;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_muffin, container, false);

        lstMuffin = view.findViewById(R.id.lst);

        DonutsAdapter donutsAdapter = new DonutsAdapter();

        lstMuffin.setLayoutManager(new GridLayoutManager(getContext(), 2));

        lstMuffin.setHasFixedSize(true);

        lstMuffin.setAdapter(donutsAdapter);

        return view;
    }
}