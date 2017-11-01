package stefanini.cartona.com.br.cartolastefanini.entity;

import com.google.gson.annotations.SerializedName;

/**
 * Created by josemarcosramosteixeira on 10/23/17.
 */

public class Escudo {
    @SerializedName("60x60")
    public String formatacao60x60;
    @SerializedName("45x45")
    public String formatacao45x45;
    @SerializedName("30x30")
    public String formatacao30x30;

    public String getFormatacao60x60() {
        return formatacao60x60;
    }

    public void setFormatacao60x60(String formatacao60x60) {
        this.formatacao60x60 = formatacao60x60;
    }

    public String getFormatacao45x45() {
        return formatacao45x45;
    }

    public void setFormatacao45x45(String formatacao45x45) {
        this.formatacao45x45 = formatacao45x45;
    }

    public String getFormatacao30x30() {
        return formatacao30x30;
    }

    public void setFormatacao30x30(String formatacao30x30) {
        this.formatacao30x30 = formatacao30x30;
    }
}
