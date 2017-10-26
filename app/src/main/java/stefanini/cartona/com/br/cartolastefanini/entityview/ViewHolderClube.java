package stefanini.cartona.com.br.cartolastefanini.entityview;

import stefanini.cartona.com.br.cartolastefanini.R;

import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
/**
 * Created by josemarcosramosteixeira on 10/25/17.
 */

public class ViewHolderClube {
    final TextView nome;
    final TextView posicao;


    public ViewHolderClube(View view) {
        ImageView escudo  = (ImageView) view.findViewById(R.id.lista_clube_personalizada_escudo);
        nome = (TextView) view.findViewById(R.id.lista_clube_personalizada_nome);
        posicao = (TextView) view.findViewById(R.id.lista_clube_personalizada_posicao);
    }
}
