package stefanini.cartona.com.br.cartolastefanini.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import stefanini.cartona.com.br.cartolastefanini.interfaces.ClubeService;

import stefanini.cartona.com.br.cartolastefanini.entity.CartolaCatalog;
import stefanini.cartona.com.br.cartolastefanini.entity.ClubeEntity;
import stefanini.cartona.com.br.cartolastefanini.utils.*;

/**
 * Created by josemarcosramosteixeira on 10/31/17.
 */

public class ServiceClubes implements ClubeService {

    private static ServiceClubes instance = null;
    private ServiceClubes(){}
    public static synchronized ServiceClubes getInstancia(){
        if(instance == null){
            instance = new ServiceClubes();
        }
        return instance;
    }

    public List<ClubeEntity> popularListClubles(CartolaCatalog catalog ){
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

    public List<ClubeEntity> ordenaListClubles(List<ClubeEntity> listaClubes){

        Comparator crescente1 = new ComparatorClubeEntity();
        Comparator decrescente1 = Collections.reverseOrder(crescente1);
        // Em ordem crescente do início do mandato
        Collections.sort(listaClubes,crescente1);
        //System.out.println(listaClubes);
        // Em ordem decrescente do fim do mandato
        //Collections.sort(listaClubes, decrescente1);
        //System.out.println(listaClubes);
        return listaClubes;
    }


}
