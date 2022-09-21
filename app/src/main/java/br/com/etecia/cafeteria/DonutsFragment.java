package br.com.etecia.cafeteria;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class DonutsFragment extends Fragment {


    RecyclerView lstDonuts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_donuts, container, false);

        lstDonuts = view.findViewById(R.id.lstCoffee);

        DonutsAdapter donutsAdapter = new DonutsAdapter();

        lstDonuts.setLayoutManager(new GridLayoutManager(getContext(), 2));

        lstDonuts.setHasFixedSize(true);

        lstDonuts.setAdapter(donutsAdapter);

        return view;
    }
}