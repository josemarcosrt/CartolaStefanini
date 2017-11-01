package stefanini.cartona.com.br.cartolastefanini.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import stefanini.cartona.com.br.cartolastefanini.entity.CartolaCatalog;
import stefanini.cartona.com.br.cartolastefanini.entity.ClubeEntity;
import stefanini.cartona.com.br.cartolastefanini.entity.PartidaEntity;

import stefanini.cartona.com.br.cartolastefanini.interfaces.PartidaService;
import stefanini.cartona.com.br.cartolastefanini.utils.*;

/**
 * Created by josemarcosramosteixeira on 10/31/17.
 */

public class ServicePartidas implements PartidaService{

    private static ServicePartidas instance = null;
    private ServicePartidas(){}

    public static synchronized ServicePartidas getInstancia(){
        if(instance == null){
            instance = new ServicePartidas();
        }
        return instance;
    }
    // Popular lista de partidas partidas
    public List<PartidaEntity> popularListPartidas(CartolaCatalog catalog, Map<String, ClubeEntity> mapClube) {

        List<PartidaEntity> listaPartidas = new ArrayList();
        ClubeEntity clubeCasa = new ClubeEntity();
        ClubeEntity clubeVisitante = new ClubeEntity();
        for (PartidaEntity p : catalog.partidas) {
            PartidaEntity partida = new PartidaEntity();

            partida.setPartida_data(convertDataStringBr(p.getPartida_data()));
            partida.setLocal(p.getLocal());

            clubeCasa = findClubeById(p.getClube_casa_id(), mapClube);
            partida.setClube_casa_id(clubeCasa.getAbreviacao());
            partida.setEscudoTimeCasa(clubeCasa.escudo.getFormatacao60x60());

            clubeVisitante = findClubeById(p.getClube_visitante_id(), mapClube);
            partida.setClube_visitante_id(clubeVisitante.getAbreviacao());
            partida.setEscudoTimeVisitante(clubeVisitante.escudo.getFormatacao60x60());

            listaPartidas.add(partida);

        }
        return listaPartidas;
    }

    // Achando clube no mapa
    public ClubeEntity findClubeById(String id, Map<String, ClubeEntity> mapClube) {
        ClubeEntity clube = new ClubeEntity();
        clube = (ClubeEntity) mapClube.get(id);
        return clube;
    }
    // Mapeia chave e objetos de clubes, mais facil achar um clube do que procurar um clube
    public Map<String, ClubeEntity> popularMapClubles(CartolaCatalog catalog) {

        Map<String, ClubeEntity> mapClube = new HashMap<String, ClubeEntity>();
        mapClube.put("262", catalog.clubes.getFlamengo());
        mapClube.put("263", catalog.clubes.getBotafogo());
        mapClube.put("264", catalog.clubes.getCorinthians());
        mapClube.put("265", catalog.clubes.getBahia());
        mapClube.put("266", catalog.clubes.getFluminense());
        mapClube.put("267", catalog.clubes.getVasco());
        mapClube.put("275", catalog.clubes.getPalmeiras());
        mapClube.put("276", catalog.clubes.getSaoPaulo());
        mapClube.put("277", catalog.clubes.getSantos());
        mapClube.put("282", catalog.clubes.getAtleticoMg());
        mapClube.put("283", catalog.clubes.getCruzeiro());
        mapClube.put("284", catalog.clubes.getGremio());
        mapClube.put("287", catalog.clubes.getVitoria());
        mapClube.put("292", catalog.clubes.getSport());
        mapClube.put("293", catalog.clubes.getAtleticoPR());
        mapClube.put("294", catalog.clubes.getCoritiba());
        mapClube.put("303", catalog.clubes.getPontePreta());
        mapClube.put("314", catalog.clubes.getAvai());
        mapClube.put("315", catalog.clubes.getChapecoense());
        mapClube.put("373", catalog.clubes.getAtleticoGO());
        return mapClube;
    }
    // Popular list segundo os objetos capiturados de clubes no endpoint
    public List<ClubeEntity> popularListClubles(CartolaCatalog catalog) {
        List<ClubeEntity> listaClubes = new ArrayList();
        listaClubes.add(catalog.clubes.getFlamengo());
        listaClubes.add(catalog.clubes.getBotafogo());
        listaClubes.add(catalog.clubes.getCorinthians());
        listaClubes.add(catalog.clubes.getBahia());
        listaClubes.add(catalog.clubes.getFluminense());
        listaClubes.add(catalog.clubes.getVasco());
        listaClubes.add(catalog.clubes.getPalmeiras());
        listaClubes.add(catalog.clubes.getSaoPaulo());
        listaClubes.add(catalog.clubes.getAtleticoMg());
        listaClubes.add(catalog.clubes.getCruzeiro());
        listaClubes.add(catalog.clubes.getGremio());
        listaClubes.add(catalog.clubes.getVitoria());
        listaClubes.add(catalog.clubes.getSport());
        listaClubes.add(catalog.clubes.getAtleticoPR());
        listaClubes.add(catalog.clubes.getCoritiba());
        listaClubes.add(catalog.clubes.getPontePreta());
        listaClubes.add(catalog.clubes.getAvai());
        listaClubes.add(catalog.clubes.getChapecoense());
        listaClubes.add(catalog.clubes.getAtleticoGO());
        return listaClubes;
    }

    // ordenacao de datas por parametros datas
    public List<PartidaEntity> ordenaListPartidas(List<PartidaEntity> listaPartidas) {
        ComparatorPartidaEntity crescente1 = new ComparatorPartidaEntity();
        Collections.sort(listaPartidas, crescente1);
        return listaPartidas;
    }

    // CONVERTE A DATA PADRAO AMERICANO DO endPoint EM PORTUGUES  dd-MM-yyyy HH:mm:ss
    public String convertDataStringBr(String data) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date data1 = null;
        try {
            data1 = sdf.parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat out = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String result = out.format(data1);
        return result;
    }

}
