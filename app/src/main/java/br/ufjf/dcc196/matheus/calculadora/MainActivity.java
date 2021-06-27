package br.ufjf.dcc196.matheus.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText valor1;
    private EditText valor2;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcula(View view){
        valor1 = findViewById(R.id.valor1);
        Double v1 = Double.parseDouble(valor1.getText().toString());
        valor2 = findViewById(R.id.valor2);
        Double v2= Double.parseDouble(valor2.getText().toString());
        // calcula
        resultado = findViewById(R.id.Resultado);
        Double r= v1+v2;
        resultado.setText(r.toString());


    }

}

