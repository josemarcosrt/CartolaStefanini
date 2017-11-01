package stefanini.cartona.com.br.cartolastefanini.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import stefanini.cartona.com.br.cartolastefanini.R;

/**
 * Created by josemarcosramosteixeira on 10/31/17.
 */

public class PartidaViewHolder extends RecyclerView.ViewHolder {

    final ImageView imagemMandanteEscudo;
    final ImageView imagemVisitanteEscudo;
    final TextView abrNomeMandante;
    final TextView abrNomeVisitante;
    final TextView datahorario;
    final TextView local;

    public PartidaViewHolder(View view) {
        super(view);
        imagemMandanteEscudo  = (ImageView) view.findViewById(R.id.lista_partida_personalizada_mandanteEscudo);
        imagemVisitanteEscudo = (ImageView) view.findViewById(R.id.lista_partida_personalizada_visitanteEscudo);
        abrNomeMandante       = (TextView) view.findViewById(R.id.lista_partida_personalizada_abrNomeMandante);
        abrNomeVisitante      = (TextView) view.findViewById(R.id.lista_partida_personalizada_abrNameVisitante);
        datahorario           = (TextView) view.findViewById(R.id.lista_partida_personalizada_data);
        local                 = (TextView) view.findViewById(R.id.lista_partida_personalizada_local);
    }

}
