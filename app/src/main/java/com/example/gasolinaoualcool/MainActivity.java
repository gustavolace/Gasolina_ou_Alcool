package com.example.gasolinaoualcool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPrecoAlcool;
    private EditText editPrecoGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editPrecoAlcool = findViewById(R.id.alcool);
        editPrecoGasolina = findViewById(R.id.gasolina);
        textResultado = findViewById(R.id.result);
    }

    public void calc(View view){
        Double precoAlcool =Double.parseDouble(editPrecoAlcool.getText().toString());
        Double precoGasolina =Double.parseDouble(editPrecoGasolina.getText().toString());
        Double resultado = precoAlcool/precoGasolina;

        //Se precoAlcool/precoGasolina > 0.7, melhor gasolina

        if(resultado >= 0.7) {
            textResultado.setText("Melhor Utilizar Gasolina");
        } else {
            textResultado.setText("Melhor Utilizar Alcool");
        }
    }
}