package stefanini.cartona.com.br.cartolastefanini.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.ArrayList;


import stefanini.cartona.com.br.cartolastefanini.Clube;
import stefanini.cartona.com.br.cartolastefanini.Partida;
import stefanini.cartona.com.br.cartolastefanini.R;
import stefanini.cartona.com.br.cartolastefanini.entity.ClubeEntity;
import stefanini.cartona.com.br.cartolastefanini.entityview.ItemListViewClube;

/**
 * Created by josemarcosramosteixeira on 10/24/17.
 */

public class AdapterClube extends BaseAdapter {

    private final List<ClubeEntity> clubes;
    private final Activity act;
    private ArrayList<ItemListViewClube> itens;

    //public AdapterClube(List<ClubeEntity> clubes, ArrayList<ItemListViewClube> itens, Activity act) {
     public AdapterClube(List<ClubeEntity> clubes, Activity act) {
        this.clubes = clubes;
        this.itens = itens;
        this.act = act;
    }

    @Override
    public int getCount() {
        return clubes.size();
        //return itens.size();
    }

    @Override
    public Object getItem(int position) {

        //return itens.get(position);
        return clubes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = act.getLayoutInflater().inflate(R.layout.lista_clube_personalizada, parent, false);
        ClubeEntity clube = clubes.get(position);
        //pegando as referências das Views
        ImageView escudo  = (ImageView) view.findViewById(R.id.lista_clube_personalizada_escudo);
        TextView nomeClube = (TextView) view.findViewById(R.id.lista_clube_personalizada_nome);
        TextView posicao  = (TextView) view.findViewById(R.id.lista_clube_personalizada_posicao);

        //Categoria categoria = curso.getCategoria();

        //populando as Views
        //escudo.setText(partida.getLocal());
        nomeClube.setText(clube.getNomeClube());
        posicao.setText(clube.getPosicao());
        //escudo.setImageResource(R.drawable.vasco_60x60);

        if (clube.getNomeClube().equals("Vasco")) {
            escudo.setImageResource(R.drawable.vasco_60x60);
            //escudo.setImageS setImageResource("https://s.glbimg.com/es/sde/f/equipes/2016/07/29/Vasco-65.png")
        } else if (clube.getNomeClube().equals("Flamengo")) {
            escudo.setImageResource(R.drawable.flamengo_60x60);
        } else if (clube.getNomeClube().equals("Corinthians")) {
            escudo.setImageResource(R.drawable.corinthians_60x60);
        }else if (clube.getNomeClube().equals("atletico")) {
            escudo.setImageResource(R.drawable.atletico_mg_60x60);
        }else if (clube.getNomeClube().equals("botafogo")) {
            escudo.setImageResource(R.drawable.botafogo_60x60);
        }else if (clube.getNomeClube().equals("cruzeiro")) {
            escudo.setImageResource(R.drawable.cruzeiro_65);
        }else if (clube.getNomeClube().equals("fluminense")) {
          escudo.setImageResource(R.drawable.fluminense_60x60);
        }else if (clube.getNomeClube().equals("palmeiras")) {
          escudo.setImageResource(R.drawable.palmeiras_60x60);
        }else if (clube.getNomeClube().equals("gremio")) {
            escudo.setImageResource(R.drawable.gremio_60x60);
        }else if (clube.getNomeClube().equals("santos")) {
          escudo.setImageResource(R.drawable.santos_60x60);
        }


        //Essa lista deve mostrar a posição, o escudo e o nome do clube.
        //- A lista deve permitir uma ordenação crescente ou decrescente.
        return view;
    }


//    @Override
//    public int getCount() {
//        return partidas.size();
//    }
//    @Override
//    public Object getItem(int position) {
//        return partidas.get(position);
//        //return 0;
//    }

}
