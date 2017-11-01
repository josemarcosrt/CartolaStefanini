package stefanini.cartona.com.br.cartolastefanini.entity;


import stefanini.cartona.com.br.cartolastefanini.entity.Clube;
import stefanini.cartona.com.br.cartolastefanini.entity.PartidaEntity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by josemarcosramosteixeira on 10/23/17.
 */

public class CartolaCatalog {

    @JsonProperty("partidas")
    public List<PartidaEntity> partidas;
    @JsonProperty("clubes")
    public Clube clubes;
    @JsonProperty("rodada")
    public String rodada;

}
