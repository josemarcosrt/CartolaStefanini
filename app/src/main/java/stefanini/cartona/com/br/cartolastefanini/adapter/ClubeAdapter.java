package stefanini.cartona.com.br.cartolastefanini.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;

import stefanini.cartona.com.br.cartolastefanini.R;
import stefanini.cartona.com.br.cartolastefanini.entity.ClubeEntity;

import java.util.List;
import android.view.ViewGroup;

import android.support.v7.widget.RecyclerView;
import android.content.Context;
import android.view.View;

import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by josemarcosramosteixeira on 10/30/17.
 */

public class ClubeAdapter extends RecyclerView.Adapter  {

    public static String TAG = ClubeAdapter.class.getSimpleName();
    private final List<ClubeEntity> clubes;
    private Context context;
    private Activity act;

    public ClubeAdapter(List<ClubeEntity> livros) {
        this.clubes = livros;
        this.context = context;
    }
    public ClubeAdapter(List<ClubeEntity> clubes, Activity act) {
        this.clubes = clubes;
        this.act = act;
    }


    public void addFlower(ClubeEntity flower) {
        clubes.add(flower);
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_clube_personalizada, parent, false);
        ClubeViewHolder holder = new ClubeViewHolder(row);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {

        ClubeViewHolder holder = (ClubeViewHolder) viewHolder;
        ClubeEntity clube  =  clubes.get(position) ;
        //demais campos
        holder.nomeClube.setText(clube.getNome());
        holder.posicao.setText(clube.getPosicao());
        Picasso.with(holder.itemView.getContext()).load(clube.escudo.getFormatacao60x60()).into(holder.escudo);
    }
    @Override
    public int getItemCount() {
        return 9;//clubes.size();
    }

}
