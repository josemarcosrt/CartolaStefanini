package stefanini.cartona.com.br.cartolastefanini;

/**
 * Created by josemarcosramosteixeira on 10/25/17.
 */

public class Time {

    public String id;
    public String nome;
    public String abreviacao;
    public String posicao;

    public Time(String id, String nome, String abreviacao, String posicao) {
        this.id = id;
        this.nome = nome;
        this.abreviacao = abreviacao;
        this.posicao = posicao;
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
}
