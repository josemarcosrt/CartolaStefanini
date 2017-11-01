package stefanini.cartona.com.br.cartolastefanini.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.ImageView;


import java.util.List;

import stefanini.cartona.com.br.cartolastefanini.R;
import stefanini.cartona.com.br.cartolastefanini.entity.ClubeEntity;

/**
 * Created by josemarcosramosteixeira on 10/30/17.
 */

/*


*/

public class ClubeViewHolder extends RecyclerView.ViewHolder {

    final ImageView escudo;
    final TextView nomeClube;
    final TextView posicao;

    public ClubeViewHolder(View view) {
        super(view);
        escudo = (ImageView) view.findViewById(R.id.lista_clube_personalizada_escudo);
        nomeClube = (TextView) view.findViewById(R.id.lista_clube_personalizada_nome);
        posicao = (TextView) view.findViewById(R.id.lista_clube_personalizada_posicao);
    }

}
