package stefanini.cartona.com.br.cartolastefanini.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by josemarcosramosteixeira on 10/24/17.
 */

public class ClubeEntity implements Serializable{

    @SerializedName("id")
    public String id;
    @SerializedName("escudos")
    public Escudo escudo;
    @SerializedName("nome")
    public String nome;
    @SerializedName("posicao")
    public String posicao;
    @SerializedName("abreviacao")
    public String abreviacao;

    public ClubeEntity(String nome, String posicao) {
        this.nome = nome;
        this.posicao = posicao;
    }

    public ClubeEntity() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }

    @Override
    public String toString() {
        return "ClubeEntity{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", posicao='" + posicao + '\'' +
                ", abreviacao='" + abreviacao + '\'' +
                ", escudo=" + escudo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClubeEntity that = (ClubeEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (escudo != null ? !escudo.equals(that.escudo) : that.escudo != null) return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (!posicao.equals(that.posicao)) return false;
        return abreviacao != null ? abreviacao.equals(that.abreviacao) : that.abreviacao == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (escudo != null ? escudo.hashCode() : 0);
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + posicao.hashCode();
        result = 31 * result + (abreviacao != null ? abreviacao.hashCode() : 0);
        return result;
    }


}


