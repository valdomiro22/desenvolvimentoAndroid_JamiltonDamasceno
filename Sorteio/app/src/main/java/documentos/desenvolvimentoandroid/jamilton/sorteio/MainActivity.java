package documentos.desenvolvimentoandroid.jamilton.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void sortear(View view) {
        TextView executar = findViewById(R.id.textoResultado);

        int numeroSelecionado = new Random().nextInt(11);


        executar.setText("Numero selecionado: " + numeroSelecionado);

    }
}