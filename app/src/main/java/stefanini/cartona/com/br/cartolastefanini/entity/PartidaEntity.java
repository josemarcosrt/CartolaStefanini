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
    public String escudoTimeCasa;
    public String escudoTimeVisitante;


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

    public String getEscudoTimeCasa() {
        return escudoTimeCasa;
    }

    public void setEscudoTimeCasa(String escudoTimeCasa) {
        this.escudoTimeCasa = escudoTimeCasa;
    }

    public String getEscudoTimeVisitante() {
        return escudoTimeVisitante;
    }

    public void setEscudoTimeVisitante(String escudoTimeVisitante) {
        this.escudoTimeVisitante = escudoTimeVisitante;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PartidaEntity that = (PartidaEntity) o;

        if (partida_id != null ? !partida_id.equals(that.partida_id) : that.partida_id != null)
            return false;
        if (clube_casa_id != null ? !clube_casa_id.equals(that.clube_casa_id) : that.clube_casa_id != null)
            return false;
        if (clube_casa_posicao != null ? !clube_casa_posicao.equals(that.clube_casa_posicao) : that.clube_casa_posicao != null)
            return false;
        if (clube_visitante_id != null ? !clube_visitante_id.equals(that.clube_visitante_id) : that.clube_visitante_id != null)
            return false;
        if (aproveitamento_mandante != null ? !aproveitamento_mandante.equals(that.aproveitamento_mandante) : that.aproveitamento_mandante != null)
            return false;
        if (aproveitamento_visitante != null ? !aproveitamento_visitante.equals(that.aproveitamento_visitante) : that.aproveitamento_visitante != null)
            return false;
        if (clube_visitante_posicao != null ? !clube_visitante_posicao.equals(that.clube_visitante_posicao) : that.clube_visitante_posicao != null)
            return false;
        if (partida_data != null ? !partida_data.equals(that.partida_data) : that.partida_data != null)
            return false;
        if (local != null ? !local.equals(that.local) : that.local != null) return false;
        if (valida != null ? !valida.equals(that.valida) : that.valida != null) return false;
        if (placar_oficial_mandante != null ? !placar_oficial_mandante.equals(that.placar_oficial_mandante) : that.placar_oficial_mandante != null)
            return false;
        if (placar_oficial_visitante != null ? !placar_oficial_visitante.equals(that.placar_oficial_visitante) : that.placar_oficial_visitante != null)
            return false;
        if (url_confronto != null ? !url_confronto.equals(that.url_confronto) : that.url_confronto != null)
            return false;
        if (url_transmissao != null ? !url_transmissao.equals(that.url_transmissao) : that.url_transmissao != null)
            return false;
        if (escudoTimeCasa != null ? !escudoTimeCasa.equals(that.escudoTimeCasa) : that.escudoTimeCasa != null)
            return false;
        return escudoTimeVisitante != null ? escudoTimeVisitante.equals(that.escudoTimeVisitante) : that.escudoTimeVisitante == null;

    }

    @Override
    public int hashCode() {
        int result = partida_id != null ? partida_id.hashCode() : 0;
        result = 31 * result + (clube_casa_id != null ? clube_casa_id.hashCode() : 0);
        result = 31 * result + (clube_casa_posicao != null ? clube_casa_posicao.hashCode() : 0);
        result = 31 * result + (clube_visitante_id != null ? clube_visitante_id.hashCode() : 0);
        result = 31 * result + (aproveitamento_mandante != null ? aproveitamento_mandante.hashCode() : 0);
        result = 31 * result + (aproveitamento_visitante != null ? aproveitamento_visitante.hashCode() : 0);
        result = 31 * result + (clube_visitante_posicao != null ? clube_visitante_posicao.hashCode() : 0);
        result = 31 * result + (partida_data != null ? partida_data.hashCode() : 0);
        result = 31 * result + (local != null ? local.hashCode() : 0);
        result = 31 * result + (valida != null ? valida.hashCode() : 0);
        result = 31 * result + (placar_oficial_mandante != null ? placar_oficial_mandante.hashCode() : 0);
        result = 31 * result + (placar_oficial_visitante != null ? placar_oficial_visitante.hashCode() : 0);
        result = 31 * result + (url_confronto != null ? url_confronto.hashCode() : 0);
        result = 31 * result + (url_transmissao != null ? url_transmissao.hashCode() : 0);
        result = 31 * result + (escudoTimeCasa != null ? escudoTimeCasa.hashCode() : 0);
        result = 31 * result + (escudoTimeVisitante != null ? escudoTimeVisitante.hashCode() : 0);
        return result;
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
