package br.com.softdicas.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Tela2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        Log.v("Tela2", "::onCreate() sendo chamado");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.v("Tela2", "::onStart() sendo chamado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("Tela2", "::onResume() sendo chamado");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("Tela2", "::onPause() sendo chamado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("Tela2", "::onStop() sendo chamado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("Tela2", "::onDestroy() sendo chamado");
    }
}