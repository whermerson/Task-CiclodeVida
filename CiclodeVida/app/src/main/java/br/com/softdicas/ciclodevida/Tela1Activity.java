package br.com.softdicas.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class Tela1Activity extends AppCompatActivity {

    Button btnAbrirNovaTela;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
        Log.v("Tela1", "::onCreate() sendo chamado");

        btnAbrirNovaTela = findViewById(R.id.btnAbrirNovaTela);
        intent = new Intent(this, Tela2Activity.class);
        btnAbrirNovaTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent);

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.v("Tela1", "::onStart() sendo chamado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("Tela1", "::onResume() sendo chamado");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("Tela1", "::onPause() sendo chamado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("Tela1", "::onStop() sendo chamado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("Tela1", "::onDestroy() sendo chamado");
    }
}