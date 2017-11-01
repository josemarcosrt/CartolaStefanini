package stefanini.cartona.com.br.cartolastefanini.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

import stefanini.cartona.com.br.cartolastefanini.R;
import stefanini.cartona.com.br.cartolastefanini.entity.PartidaEntity;

/**
 * Created by josemarcosramosteixeira on 10/31/17.
 */

public class PartidaAdapter extends RecyclerView.Adapter   {

    public static String TAG = PartidaAdapter.class.getSimpleName();
    private final List<PartidaEntity> partidas;
    private Context context;
    private Activity act;

    public PartidaAdapter(List<PartidaEntity> partidas) {
        this.partidas = partidas;
        this.context = context;
    }
    public PartidaAdapter(List<PartidaEntity> partidas, Activity act) {
        this.partidas = partidas;
        this.act = act;
    }

    public void addFlower(PartidaEntity partida) {
        partidas.add(partida);
        notifyDataSetChanged();
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_partida_personalizada, parent, false);
        PartidaViewHolder holder = new PartidaViewHolder(row);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {


        PartidaViewHolder holder = (PartidaViewHolder) viewHolder;
        PartidaEntity partida =  partidas.get(position);

        Picasso.with(holder.itemView.getContext()).load(partida.getEscudoTimeCasa()).into(holder.imagemMandanteEscudo);
        Picasso.with(holder.itemView.getContext()).load(partida.getEscudoTimeVisitante()).into(holder.imagemVisitanteEscudo);
        holder.abrNomeMandante.setText(partida.getClube_casa_id());
        holder.abrNomeVisitante.setText(partida.getClube_visitante_id());
        holder.datahorario.setText(partida.getPartida_data());
        holder.local.setText(partida.getLocal());

    }
    @Override
    public int getItemCount() {
        return partidas.size();
    }

}
