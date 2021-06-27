package br.ufjf.dcc196.matheus.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText valor1;
    private EditText valor2;
    private TextView resultado;
    private RadioGroup grupoOperacao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1 = findViewById(R.id.valor1);
        valor2 = findViewById(R.id.valor2);
        resultado = findViewById(R.id.Resultado);
        grupoOperacao = findViewById(R.id.grupoOperacao);
    }
    public void calcula(View view){
        Double v1 = Double.parseDouble(valor1.getText().toString());
        Double v2= Double.parseDouble(valor2.getText().toString());
        Double r=0.0;
        // calcula
        switch (grupoOperacao.getCheckedRadioButtonId()){
                case R.id.Soma:
                    r = v1+v2;
                    resultado.setText(r.toString());
                    valor1.setText(r.toString());
                    break;
                case R.id.subtracao:
                    r= v1-v2;
                    resultado.setText(r.toString());
                    valor1.setText(r.toString());
                    break;
                case R.id.multiplicacao:
                    r= v1*v2;
                    resultado.setText(r.toString());
                    valor1.setText(r.toString());
                    break;
                case R.id.divisao:
                    try {
                        r= v1/v2;
                        resultado.setText(r.toString());
                        valor1.setText(r.toString());
                    }catch (ArithmeticException e) {
                        resultado.setText("Divisão por 0 invalida.");

                    }
                    break;
                default:
                    resultado.setText("Digite dois numeros.");
            }


        }


}

