package stefanini.cartona.com.br.cartolastefanini;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.Call;


import stefanini.cartona.com.br.cartolastefanini.entity.ClubeEntity;
import stefanini.cartona.com.br.cartolastefanini.entity.PartidaEntity;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Created by josemarcosramosteixeira on 10/23/17.
 */
//
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//        "partidas",
//        "clubes"
//})


public class CartolaCatalog {


    @JsonProperty("partidas")
    public List<PartidaEntity> partidas;
    //public Clube clube;

    //@JsonProperty("clubes")
    //@GET("users/{user}/repos")
    //Call<List<Clube>> listRepos(@Path("id") String id);
    @JsonProperty("clubes")
    public Clube clubes;

    //public List<Clube> clubes;
    @JsonProperty("rodada")
    public String rodada;

    @Override
    public String toString() {
        return "CartolaCatalog{" +
                "partidas=" + partidas +
                ", clubes=" + clubes +
                ", rodada='" + rodada + '\'' +
                '}';
    }
}
