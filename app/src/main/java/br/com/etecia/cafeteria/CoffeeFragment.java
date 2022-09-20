package br.com.etecia.cafeteria;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class CoffeeFragment extends Fragment {

    RecyclerView lstCoffee;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_coffee, container, false);

        lstCoffee = view.findViewById(R.id.lstCoffee);

        CoffeeAdapter coffeeAdapter = new CoffeeAdapter();

        lstCoffee.setLayoutManager(new GridLayoutManager(getContext(), 2));

        lstCoffee.setHasFixedSize(true);

        lstCoffee.setAdapter(coffeeAdapter);

        return view;
    }
}