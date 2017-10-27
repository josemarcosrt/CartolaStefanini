package stefanini.cartona.com.br.cartolastefanini.adapter;

import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.ImageView;

import android.view.ViewGroup;
import android.view.View;

import java.util.List;
import android.app.Activity;

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

        abrNomeMandante.setText(partida.getClube_casa_id());
        abrNomeVisitante.setText(partida.getClube_visitante_id());
        datahorario.setText(partida.getPartida_data());

        local.setText(partida.getLocal());


        System.out.println("================abrNomeMandante   abrNomeMandante  abrNomeMandante========================");
        System.out.println(abrNomeMandante.getText().toString());
        System.out.println("========================================");

        switch(abrNomeMandante.getText().toString()){
            case "265":
                imagemMandanteEscudo.setImageResource(R.drawable.bahia_60x60);
            case "267":
                imagemMandanteEscudo.setImageResource(R.drawable.vasco_60x60);
                break;
            case "262":
                imagemMandanteEscudo.setImageResource(R.drawable.flamengo_60x60);
                break;
            case "264":
                imagemMandanteEscudo.setImageResource(R.drawable.corinthians_60x60);
                break;
            case "293":
                imagemMandanteEscudo.setImageResource(R.drawable.atleticopr);
                break;
            case "263":
                imagemMandanteEscudo.setImageResource(R.drawable.botafogo_60x60);
                break;
            case "283":
                imagemMandanteEscudo.setImageResource(R.drawable.cruzeiro_65);
                break;
            case "266":
                imagemMandanteEscudo.setImageResource(R.drawable.fluminense_60x60);
                break;
            case "275":
                imagemMandanteEscudo.setImageResource(R.drawable.palmeiras_60x60);
                break;
            case "284":
                imagemMandanteEscudo.setImageResource(R.drawable.gremio_60x60);
                break;
            case "277":
                imagemMandanteEscudo.setImageResource(R.drawable.santos_60x60);
                break;
            case "282":
                imagemMandanteEscudo.setImageResource(R.drawable.atletico_mg_60x60);
                break;
            case "292":
                imagemMandanteEscudo.setImageResource(R.drawable.sport65);
                break;
            case "294":
                imagemMandanteEscudo.setImageResource(R.drawable.coritiba65);
                break;
            case "276":
                imagemMandanteEscudo.setImageResource(R.drawable.sao_paulo_60x60);
                break;
            case "287":
                imagemMandanteEscudo.setImageResource(R.drawable.vitoria_60x60);
                break;
            case "303":
                imagemMandanteEscudo.setImageResource(R.drawable.ponte_preta_60x60);
                break;
            case "314":
                imagemMandanteEscudo.setImageResource(R.drawable.avai_60x60_);
                break;
            case "315":
                imagemMandanteEscudo.setImageResource(R.drawable.chape);
                break;
            case "373":
                imagemMandanteEscudo.setImageResource(R.drawable.atleticogo);
                break;

        }



        switch(abrNomeVisitante.getText().toString()){
            case "265":
                imagemVisitanteEscudo.setImageResource(R.drawable.bahia_60x60);
                break;
            case "267":
                imagemVisitanteEscudo.setImageResource(R.drawable.vasco_60x60);
                break;
            case "262":
                imagemVisitanteEscudo.setImageResource(R.drawable.flamengo_60x60);
                break;
            case "264":
                imagemVisitanteEscudo.setImageResource(R.drawable.corinthians_60x60);
                break;
            case "293":
                imagemVisitanteEscudo.setImageResource(R.drawable.atleticopr);
                break;
            case "263":
                imagemVisitanteEscudo.setImageResource(R.drawable.botafogo_60x60);
                break;
            case "283":
                imagemVisitanteEscudo.setImageResource(R.drawable.cruzeiro_65);
                break;
            case "266":
                imagemVisitanteEscudo.setImageResource(R.drawable.fluminense_60x60);
                break;
            case "275":
                imagemVisitanteEscudo.setImageResource(R.drawable.palmeiras_60x60);
                break;
            case "284":
                imagemVisitanteEscudo.setImageResource(R.drawable.gremio_60x60);
                break;
            case "277":
                imagemVisitanteEscudo.setImageResource(R.drawable.santos_60x60);
                break;
            case "282":
                imagemVisitanteEscudo.setImageResource(R.drawable.atletico_mg_60x60);
                break;
            case "276":
                imagemVisitanteEscudo.setImageResource(R.drawable.sao_paulo_60x60);
                break;
            case "292":
                imagemVisitanteEscudo.setImageResource(R.drawable.sport65);
                break;
            case "294":
                imagemVisitanteEscudo.setImageResource(R.drawable.coritiba65);
                break;
            case "287":
                imagemVisitanteEscudo.setImageResource(R.drawable.vitoria_60x60);
                break;
            case "303":
                imagemVisitanteEscudo.setImageResource(R.drawable.ponte_preta_60x60);
                break;
            case "314":
                imagemVisitanteEscudo.setImageResource(R.drawable.avai_60x60_);
                break;
            case "315":
                imagemVisitanteEscudo.setImageResource(R.drawable.chape);
                break;
            case "373":
                imagemVisitanteEscudo.setImageResource(R.drawable.atleticogo);
                break;
        }



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

    /*
        mapClube.put("265",catalog.clubes.getBahia());
        mapClube.put("363",catalog.clubes.getSaoPaulo());
        mapClube.put("287",catalog.clubes.getVitoria());
        mapClube.put("292",catalog.clubes.getSport());
        mapClube.put("294",catalog.clubes.getCoritiba());
        mapClube.put("303",catalog.clubes.getPontePreta());
        mapClube.put("314",catalog.clubes.getAvai());
        mapClube.put("315",catalog.clubes.getChapecoense());
        mapClube.put("373",catalog.clubes.getAtleticoGO());
        System.out.println(mapClube.get("363"));
  */




}
