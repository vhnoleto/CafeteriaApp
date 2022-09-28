package br.com.etecia.cafeteria;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CoffeeAdapter extends RecyclerView.Adapter<CoffeeAdapter.ViewHolder> {

    private Context mContext;
    private List<Coffee> mData;

    public CoffeeAdapter(Context mContext, List<Coffee> mData){
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public CoffeeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        view = inflater.inflate(R.layout.modelo, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CoffeeAdapter.ViewHolder holder, int position) {
        holder.nomeCafe.setText(mData.get(position).getTitulo());
        holder.fotoCafe.setImageResource(mData.get(position).getFoto());
        holder.descricaoCafe.setText(mData.get(position).getDesc());
        holder.favcafe.setImageResource(mData.get(position).getRating());
        holder.cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void OnClick(View view){}
                                           }


        );


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView nomeCafe;
        ImageView fotoCafe;
        TextView descricaoCafe;
        View notaCafe;
        ImageView favcafe;
        CardView cardView;

        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            nomeCafe = itemView.findViewById(R.id.cafeTitulo);
            fotoCafe = itemView.findViewById(R.id.cafeImg);
            descricaoCafe = itemView.findViewById(R.id.cafeDescricao);
            notaCafe = itemView.findViewById(R.id.Cafenota);
            favcafe = itemView.findViewById(R.id.imgfavorite);
            cardView = itemView.findViewById(R.id.modeloItem);
        }
    }

}
