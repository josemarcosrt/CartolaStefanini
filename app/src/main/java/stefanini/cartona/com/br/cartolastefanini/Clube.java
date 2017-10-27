package stefanini.cartona.com.br.cartolastefanini;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;



import retrofit2.http.GET;
import retrofit2.http.Path;
import stefanini.cartona.com.br.cartolastefanini.entity.ClubeEntity;

/**
 * Created by josemarcosramosteixeira on 10/23/17.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        //"clubes",
        "262"
})
public class Clube {

    //@JsonProperty("id")
    @SerializedName("id")
    public String id;
    @SerializedName("262")
    public ClubeEntity flamengo;
    @SerializedName("263")
    public ClubeEntity botafogo;
    @SerializedName("264")
    public ClubeEntity Corinthians;
    @SerializedName("265")
    public ClubeEntity bahia;
    @SerializedName("266")
    public ClubeEntity fluminense;
    @SerializedName("267")
    public ClubeEntity vasco;
    @SerializedName("275")
    public ClubeEntity palmeiras;
    @SerializedName("276")
    public ClubeEntity saoPaulo;
    @SerializedName("282")
    public ClubeEntity atleticoMg;
    @SerializedName("283")
    public ClubeEntity cruzeiro;
    @SerializedName("284")
    public ClubeEntity gremio;
    @SerializedName("287")
    public ClubeEntity vitoria;
    @SerializedName("292")
    public ClubeEntity sport;
    @SerializedName("293")
    public ClubeEntity atleticoPR;
    @SerializedName("294")
    public ClubeEntity coritiba;
    @SerializedName("303")
    public ClubeEntity pontePreta;
    @SerializedName("314")
    public ClubeEntity avai;
    @SerializedName("315")
    public ClubeEntity chapecoense;
    @SerializedName("373")
    public ClubeEntity AtleticoGO;


    public String getId() {
        return id;
    }

    public ClubeEntity getFlamengo() {
        return flamengo;
    }

    public void setFlamengo(ClubeEntity flamengo) {
        this.flamengo = flamengo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClubeEntity getBotafogo() {
        return botafogo;
    }

    public void setBotafogo(ClubeEntity botafogo) {
        this.botafogo = botafogo;
    }

    public ClubeEntity getCorinthians() {
        return Corinthians;
    }

    public void setCorinthians(ClubeEntity corinthians) {
        Corinthians = corinthians;
    }

    public ClubeEntity getBahia() {
        return bahia;
    }

    public void setBahia(ClubeEntity bahia) {
        this.bahia = bahia;
    }

    public ClubeEntity getFluminense() {
        return fluminense;
    }

    public void setFluminense(ClubeEntity fluminense) {
        this.fluminense = fluminense;
    }

    public ClubeEntity getVasco() {
        return vasco;
    }

    public void setVasco(ClubeEntity vasco) {
        this.vasco = vasco;
    }

    public ClubeEntity getPalmeiras() {
        return palmeiras;
    }

    public void setPalmeiras(ClubeEntity palmeiras) {
        this.palmeiras = palmeiras;
    }

    public ClubeEntity getSaoPaulo() {
        return saoPaulo;
    }

    public void setSaoPaulo(ClubeEntity saoPaulo) {
        this.saoPaulo = saoPaulo;
    }

    public ClubeEntity getAtleticoMg() {
        return atleticoMg;
    }

    public void setAtleticoMg(ClubeEntity atleticoMg) {
        this.atleticoMg = atleticoMg;
    }

    public ClubeEntity getCruzeiro() {
        return cruzeiro;
    }

    public void setCruzeiro(ClubeEntity cruzeiro) {
        this.cruzeiro = cruzeiro;
    }

    public ClubeEntity getGremio() {
        return gremio;
    }

    public void setGremio(ClubeEntity gremio) {
        this.gremio = gremio;
    }

    public ClubeEntity getVitoria() {
        return vitoria;
    }

    public void setVitoria(ClubeEntity vitoria) {
        this.vitoria = vitoria;
    }

    public ClubeEntity getSport() {
        return sport;
    }

    public void setSport(ClubeEntity sport) {
        this.sport = sport;
    }

    public ClubeEntity getAtleticoPR() {
        return atleticoPR;
    }

    public void setAtleticoPR(ClubeEntity atleticoPR) {
        this.atleticoPR = atleticoPR;
    }

    public ClubeEntity getCoritiba() {
        return coritiba;
    }

    public void setCoritiba(ClubeEntity coritiba) {
        this.coritiba = coritiba;
    }

    public ClubeEntity getPontePreta() {
        return pontePreta;
    }

    public void setPontePreta(ClubeEntity pontePreta) {
        this.pontePreta = pontePreta;
    }

    public ClubeEntity getAvai() {
        return avai;
    }

    public void setAvai(ClubeEntity avai) {
        this.avai = avai;
    }

    public ClubeEntity getChapecoense() {
        return chapecoense;
    }

    public void setChapecoense(ClubeEntity chapecoense) {
        this.chapecoense = chapecoense;
    }

    public ClubeEntity getAtleticoGO() {
        return AtleticoGO;
    }

    public void setAtleticoGO(ClubeEntity atleticoGO) {
        AtleticoGO = atleticoGO;
    }

    @Override
    public String toString() {
        return "Clube{" +
                "id='" + id + '\'' +
                ", flamengo=" + flamengo +
                ", botafogo=" + botafogo +
                ", Corinthians=" + Corinthians +
                ", bahia=" + bahia +
                ", fluminense=" + fluminense +
                ", vasco=" + vasco +
                ", palmeiras=" + palmeiras +
                ", saoPaulo=" + saoPaulo +
                ", atleticoMg=" + atleticoMg +
                ", cruzeiro=" + cruzeiro +
                ", gremio=" + gremio +
                ", vitoria=" + vitoria +
                ", sport=" + sport +
                ", atleticoPR=" + atleticoPR +
                ", coritiba=" + coritiba +
                ", pontePreta=" + pontePreta +
                ", avai=" + avai +
                ", chapecoense=" + chapecoense +
                ", AtleticoGO=" + AtleticoGO +
                '}';
    }
}
//    @JsonProperty("262")
//    public Time time262;
//    @JsonProperty("263")
//    public Time time263;
//
//    public Clube(Time time262, Time time263) {
//        this.time262 = time262;
//        this.time263 = time263;
//    }
//
//    public Time getTime262() {
//        return time262;
//    }
//
//    public void setTime262(Time time262) {
//        this.time262 = time262;
//    }
//
//    @Override
//    public String toString() {
//        return "Clube{" +
//                "time262=" + time262 +
//                ", time263=" + time263 +
//                '}';
//    }



    //@JsonProperty("clubes")
    //public List<String> 262;

    //@JsonProperty("nome")
    //public List<String> nome;

//    @JsonProperty("id")
//    public List<String> id;
//    @JsonProperty("nome")
//    public List<String> nome;

    //@JsonProperty("descricao")
    //public List<Descricao> descricao;

//    @JsonProperty("codico")
//    public String getCodico() {
//        return codico;
//    }
//    @JsonProperty("codico")
//    public void setCodico(String codico) {
//        this.codico = codico;
//    }
//
//    @JsonProperty("descricao")
//    public List<Descricao> getDescricao() {
//        return descricao;
//    }
//    @JsonProperty("descricao")
//    public void setDescricao(List<Descricao> descricao) {
//        this.descricao = descricao;
//    }

//Call<Endereço> getEndereco(@Path("cep") String cep);