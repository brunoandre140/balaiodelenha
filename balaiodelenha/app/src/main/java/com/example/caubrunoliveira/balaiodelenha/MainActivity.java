package com.example.caubrunoliveira.balaiodelenha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    private Button btCalcular;
    private EditText consumoTotal;
    private EditText couvertArtistico;
    private EditText dividir;

    private EditText contaTotal;
    private EditText taxa;
    private EditText finalPessoa;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btCalcular = findViewById(R.id.bt_calcular);
        consumoTotal = findViewById(R.id.edt_consumo);
        couvertArtistico = findViewById(R.id.edt_couvert_artistico);
        dividir = findViewById(R.id.edt_dividir);
        contaTotal = findViewById(R.id.edt_conta_total);
        taxa = findViewById(R.id.edt_servico);
        finalPessoa = findViewById(R.id.edt_valor_pessoa);


        btCalcular.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                double consumo = Double.parseDouble(consumoTotal.getText().toString());
                double couvert = Double.parseDouble(couvertArtistico.getText().toString());
                double cTotal = (consumo + couvert);
                double servico = (cTotal)*0.1;
                double totalFinal = cTotal+servico;
                double totalPessoa = totalFinal/Double.parseDouble(dividir.getText().toString());

                contaTotal.setText(String.valueOf(totalFinal));
                taxa.setText(String.valueOf(servico));
                finalPessoa.setText(String.valueOf(totalPessoa));

            }
        });


    }


}