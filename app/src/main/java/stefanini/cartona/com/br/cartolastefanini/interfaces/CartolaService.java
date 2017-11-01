package stefanini.cartona.com.br.cartolastefanini.interfaces;

import retrofit2.http.GET;
import retrofit2.Call;
import stefanini.cartona.com.br.cartolastefanini.entity.CartolaCatalog;

/**
 * Created by josemarcosramosteixeira on 10/23/17.
 */

public interface CartolaService {

    public static final String BASE_URL = "https://api.cartolafc.globo.com/";

    @GET("partidas")
    Call<CartolaCatalog> listCartola();

    @GET("clubes")
    Call<CartolaCatalog> listClubes();

}
