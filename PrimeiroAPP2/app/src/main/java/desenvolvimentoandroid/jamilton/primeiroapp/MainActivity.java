package desenvolvimentoandroid.jamilton.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void alterarTexto(View view) {

        TextView texto = findViewById(R.id.textoExibicao);

        texto.setText("Jamiltam Damasceno");

    }
}