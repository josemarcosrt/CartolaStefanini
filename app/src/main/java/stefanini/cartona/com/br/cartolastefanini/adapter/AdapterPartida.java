package stefanini.cartona.com.br.cartolastefanini.adapter;

import android.widget.BaseAdapter;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.ImageView;

import android.view.ViewGroup;
import android.view.View;

import java.util.List;
import android.app.Activity;

import retrofit2.Callback;
import stefanini.cartona.com.br.cartolastefanini.CartolaCatalog;
import stefanini.cartona.com.br.cartolastefanini.Partida;
import stefanini.cartona.com.br.cartolastefanini.R;
import stefanini.cartona.com.br.cartolastefanini.entity.PartidaEntity;

/**
 * Created by josemarcosramosteixeira on 10/24/17.
 */

public class AdapterPartida extends BaseAdapter {

    private final List<PartidaEntity> partidas;
    private final Activity act;

    public AdapterPartida(List<PartidaEntity> partidas, Activity act) {
        this.partidas = partidas;
        this.act = act;
    }

    @Override
    public int getCount() {
        return partidas.size();
    }

    @Override
    public Object getItem(int position) {
        return  partidas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //ArrayAdapter<Partida> adapter = new ArrayAdapter<Partida>(this,android.R.layout.l .simple_list_item_1,partidas);
        View view = act.getLayoutInflater().inflate(R.layout.lista_partida_personalizada, parent, false);
        PartidaEntity partida = partidas.get(position);

        //pegando as referências das Views
        ImageView imagemMandanteEscudo  = (ImageView) view.findViewById(R.id.lista_partida_personalizada_mandanteEscudo);
        ImageView imagemVisitanteEscudo = (ImageView) view.findViewById(R.id.lista_partida_personalizada_visitanteEscudo);
        TextView abrNomeMandante  = (TextView) view.findViewById(R.id.lista_partida_personalizada_abrNomeMandante);
        TextView abrNomeVisitante = (TextView) view.findViewById(R.id.lista_partida_personalizada_abrNameVisitante);
        TextView datahorario = (TextView) view.findViewById(R.id.lista_partida_personalizada_data);
        TextView local = (TextView) view.findViewById(R.id.lista_partida_personalizada_local);

        //populando as Views
        imagemMandanteEscudo.setImageResource(R.drawable.vasco_60x60);
        imagemVisitanteEscudo.setImageResource(R.drawable.vasco_60x60);

        abrNomeMandante.setText(partida.getClube_casa_id());
        abrNomeVisitante.setText(partida.getClube_visitante_id());
        datahorario.setText(partida.getPartida_data());

        local.setText(partida.getLocal());

        //https://s.glbimg.com/es/sde/f/equipes/2014/04/14/flamengo_60x60.png
        //imagem.setImageResource(R.drawable.java);

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
