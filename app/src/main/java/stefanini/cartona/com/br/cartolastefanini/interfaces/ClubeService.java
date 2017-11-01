package stefanini.cartona.com.br.cartolastefanini.interfaces;

import java.util.List;

import stefanini.cartona.com.br.cartolastefanini.entity.CartolaCatalog;
import stefanini.cartona.com.br.cartolastefanini.entity.ClubeEntity;

/**
 * Created by josemarcosramosteixeira on 11/1/17.
 */

public interface ClubeService {

    public List<ClubeEntity> popularListClubles(CartolaCatalog catalog);
    public List<ClubeEntity> ordenaListClubles(List<ClubeEntity> listaClubes);
}