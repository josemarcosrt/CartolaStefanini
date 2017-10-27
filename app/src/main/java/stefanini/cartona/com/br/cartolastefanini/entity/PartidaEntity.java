package stefanini.cartona.com.br.cartolastefanini.entity;

import java.util.List;

/**
 * Created by josemarcosramosteixeira on 10/24/17.
 */

public class PartidaEntity {

    public String partida_id;
    public String clube_casa_id;
    public String clube_casa_posicao;
    public String clube_visitante_id;
    public List<String> aproveitamento_mandante;
    public List<String> aproveitamento_visitante;
    public String clube_visitante_posicao;
    public String partida_data;
    public String local;
    public String valida;
    public String placar_oficial_mandante;
    public String placar_oficial_visitante;
    public String url_confronto;
    public String url_transmissao;


    public PartidaEntity() {

    }
    public PartidaEntity(String partida_id) {
        this.partida_id = partida_id;
    }

    public String getPartida_id() {
        return partida_id;
    }

    public void setPartida_id(String partida_id) {
        this.partida_id = partida_id;
    }

    public String getClube_casa_id() {
        return clube_casa_id;
    }

    public void setClube_casa_id(String clube_casa_id) {
        this.clube_casa_id = clube_casa_id;
    }

    public String getClube_casa_posicao() {
        return clube_casa_posicao;
    }

    public void setClube_casa_posicao(String clube_casa_posicao) {
        this.clube_casa_posicao = clube_casa_posicao;
    }

    public String getClube_visitante_id() {
        return clube_visitante_id;
    }

    public void setClube_visitante_id(String clube_visitante_id) {
        this.clube_visitante_id = clube_visitante_id;
    }

    public List<String> getAproveitamento_mandante() {
        return aproveitamento_mandante;
    }

    public void setAproveitamento_mandante(List<String> aproveitamento_mandante) {
        this.aproveitamento_mandante = aproveitamento_mandante;
    }

    public List<String> getAproveitamento_visitante() {
        return aproveitamento_visitante;
    }

    public void setAproveitamento_visitante(List<String> aproveitamento_visitante) {
        this.aproveitamento_visitante = aproveitamento_visitante;
    }

    public String getClube_visitante_posicao() {
        return clube_visitante_posicao;
    }

    public void setClube_visitante_posicao(String clube_visitante_posicao) {
        this.clube_visitante_posicao = clube_visitante_posicao;
    }

    public String getPartida_data() {
        return partida_data;
    }

    public void setPartida_data(String partida_data) {
        this.partida_data = partida_data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getValida() {
        return valida;
    }

    public void setValida(String valida) {
        this.valida = valida;
    }

    public String getPlacar_oficial_mandante() {
        return placar_oficial_mandante;
    }

    public void setPlacar_oficial_mandante(String placar_oficial_mandante) {
        this.placar_oficial_mandante = placar_oficial_mandante;
    }

    public String getPlacar_oficial_visitante() {
        return placar_oficial_visitante;
    }

    public void setPlacar_oficial_visitante(String placar_oficial_visitante) {
        this.placar_oficial_visitante = placar_oficial_visitante;
    }

    public String getUrl_confronto() {
        return url_confronto;
    }

    public void setUrl_confronto(String url_confronto) {
        this.url_confronto = url_confronto;
    }

    public String getUrl_transmissao() {
        return url_transmissao;
    }

    public void setUrl_transmissao(String url_transmissao) {
        this.url_transmissao = url_transmissao;
    }


    @Override
    public String toString() {
        return "PartidaEntity{" +
                "partida_id='" + partida_id + '\'' +
                ", clube_casa_id='" + clube_casa_id + '\'' +
                ", clube_casa_posicao='" + clube_casa_posicao + '\'' +
                ", clube_visitante_id='" + clube_visitante_id + '\'' +
                ", aproveitamento_mandante=" + aproveitamento_mandante +
                ", aproveitamento_visitante=" + aproveitamento_visitante +
                ", clube_visitante_posicao='" + clube_visitante_posicao + '\'' +
                ", partida_data='" + partida_data + '\'' +
                ", local='" + local + '\'' +
                ", valida='" + valida + '\'' +
                ", placar_oficial_mandante='" + placar_oficial_mandante + '\'' +
                ", placar_oficial_visitante='" + placar_oficial_visitante + '\'' +
                ", url_confronto='" + url_confronto + '\'' +
                ", url_transmissao='" + url_transmissao + '\'' +
                '}';
    }
}
