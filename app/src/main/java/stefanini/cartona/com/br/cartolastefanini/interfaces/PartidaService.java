package stefanini.cartona.com.br.cartolastefanini.interfaces;

import java.util.List;
import java.util.Map;

import stefanini.cartona.com.br.cartolastefanini.entity.CartolaCatalog;
import stefanini.cartona.com.br.cartolastefanini.entity.ClubeEntity;
import stefanini.cartona.com.br.cartolastefanini.entity.PartidaEntity;

/**
 * Created by josemarcosramosteixeira on 11/1/17.
 */

public interface PartidaService {

    public List<PartidaEntity> popularListPartidas(CartolaCatalog catalog, Map<String, ClubeEntity> mapClube);
    public ClubeEntity findClubeById(String id, Map<String, ClubeEntity> mapClube);
    public Map<String, ClubeEntity> popularMapClubles(CartolaCatalog catalog);
    public List<ClubeEntity> popularListClubles(CartolaCatalog catalog);
    public List<PartidaEntity> ordenaListPartidas(List<PartidaEntity> listaPartidas);
    public String convertDataStringBr(String data);
}