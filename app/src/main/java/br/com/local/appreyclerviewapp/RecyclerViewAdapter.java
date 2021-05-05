package br.com.local.appreyclerviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context mContext;
    private List<Livros> mData;

    //Construtor da classe RecyclerViewAdapter

    public RecyclerViewAdapter(Context mContext, List<Livros> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater mInflater = LayoutInflater.from(mContext);
        View view = mInflater.inflate(R.layout.cardview_item_livros, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tvTituloLivro.setText(mData.get(position).getTitulo());
        holder.imgLivro.setImageResource(mData.get(position).getMiniatura());


    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvTituloLivro;
        ImageView imgLivro;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTituloLivro = itemView.findViewById(R.id.id_lblTituloLivro);
            imgLivro = itemView.findViewById(R.id.id_imgLivro);
            cardView = itemView.findViewById(R.id.idCardView);
        }
    }
}
