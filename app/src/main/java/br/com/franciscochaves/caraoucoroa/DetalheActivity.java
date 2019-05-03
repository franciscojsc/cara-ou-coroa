package br.com.franciscochaves.caraoucoroa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {

    private ImageView imagem;
    private ImageView botaoVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_detalhe);

        imagem = findViewById(R.id.image_moeda_cara_coroa);
        botaoVoltar = findViewById(R.id.image_botao_voltar);

        String opcao = getIntent().getStringExtra("opcao");
        if(opcao.equals("coroa")){
            imagem.setImageResource(R.drawable.moeda_coroa);
        }else{
            imagem.setImageResource(R.drawable.moeda_cara);
        }

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
