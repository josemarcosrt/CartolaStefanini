package stefanini.cartona.com.br.cartolastefanini.interfaces;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.Call;
import retrofit2.http.Path;

import stefanini.cartona.com.br.cartolastefanini.entity.ClubeEntity;

/**
 * Created by josemarcosramosteixeira on 10/24/17.
 */

public interface ClubeServices{

    @GET("buscarTodos")
    public Call<List<ClubeEntity>> buscarTodos();
    @GET("buscar/{id}")
    public Call<List<ClubeEntity>> buscarTodos(@Path("id")int id);

}
