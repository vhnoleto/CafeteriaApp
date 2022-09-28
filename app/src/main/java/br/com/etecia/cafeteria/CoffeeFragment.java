package br.com.etecia.cafeteria;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class CoffeeFragment extends Fragment {

    RecyclerView lstCoffee;
    List<Coffee> cafeLista;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_coffee, container, false);

        lstCoffee = view.findViewById(R.id.lstCoffee);

        lstCoffee.setLayoutManager(new GridLayoutManager(getContext(), 2));

        lstCoffee.setHasFixedSize(true);

        cafeLista = new ArrayList<>();
        cafeLista.add(new Coffee("Café Preto",
                "R$" + "2.20",
                R.drawable.coffee,
                "Café",
                2
                ));
        cafeLista.add(new Coffee("Café", "R$" + "2.20", R.drawable.coffee, "Café Tradicional", 4));
        CoffeeAdapter coffeeAdapter = new CoffeeAdapter(getContext(), cafeLista);
        lstCoffee.setAdapter(coffeeAdapter);

        return view;
    }
}