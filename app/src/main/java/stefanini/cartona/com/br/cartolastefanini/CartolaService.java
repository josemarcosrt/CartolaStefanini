package stefanini.cartona.com.br.cartolastefanini;

import com.google.gson.annotations.SerializedName;

import retrofit2.http.GET;
import retrofit2.Call;
/**
 * Created by josemarcosramosteixeira on 10/23/17.
 */

public interface CartolaService {

    //https://api.cartolafc.globo.com/partidas
    public static final String BASE_URL = "https://api.cartolafc.globo.com/";


    @GET("partidas")
    Call<CartolaCatalog> listCartola();

    //@GET("clubes")
    //@SerializedName("clubes")
    @GET("clubes")
    Call<CartolaCatalog> listClubes();

}
