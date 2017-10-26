package stefanini.cartona.com.br.cartolastefanini.entity;

import java.io.Serializable;

/**
 * Created by josemarcosramosteixeira on 10/24/17.
 */

public class ClubeEntity implements Serializable{

    public String id;
    public String escudo;
    public String nomeClube;
    public String posicao;

    public ClubeEntity() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    public String getNomeClube() {
        return nomeClube;
    }

    public void setNomeClube(String nomeClube) {
        this.nomeClube = nomeClube;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "ClubeEntity{" +
                "id='" + id + '\'' +
                ", escudo='" + escudo + '\'' +
                ", nomeClube='" + nomeClube + '\'' +
                ", posicao='" + posicao + '\'' +
                '}';
    }
}


