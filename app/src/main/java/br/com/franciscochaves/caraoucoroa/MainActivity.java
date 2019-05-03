package br.com.franciscochaves.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView botaoJogar;
    private String[] opcao = {"cara", "coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);


        botaoJogar = findViewById(R.id.image_btn_jogar);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random random = new Random();
                int numeroAleatorio = random.nextInt(2);//0-1

                Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
                intent.putExtra("opcao", opcao[numeroAleatorio]);

                startActivity(intent);

            }
        });
    }
}
