package stefanini.cartona.com.br.cartolastefanini.entityview;

/**
 * Created by josemarcosramosteixeira on 10/25/17.
 */

public class ItemListViewClube {

    private String texto;
    private int iconeRid;

    public ItemListViewClube()
    {
    }

    public ItemListViewClube(String texto, int iconeRid)
    {
        this.texto = texto;
        this.iconeRid = iconeRid;
    }

    public int getIconeRid()
    {
        return iconeRid;
    }

    public void setIconeRid(int iconeRid)
    {
        this.iconeRid = iconeRid;
    }

    public String getTexto()
    {
        return texto;
    }

    public void setTexto(String texto)
    {
        this.texto = texto;
    }
}
