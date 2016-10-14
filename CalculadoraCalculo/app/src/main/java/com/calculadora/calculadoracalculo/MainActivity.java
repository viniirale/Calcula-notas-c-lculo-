package com.calculadora.calculadoracalculo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText txtTeste1;
    private EditText txtTeste2;
    private EditText txtProva1;
    private EditText txtProva2;
    private Button btnCalcular;
    private TextView txtMediaFinal;
    private double Teste1;
    private double Teste2;
    private double Prova1;
    private double Prova2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        txtTeste1 = (EditText) findViewById(R.id.txtTeste1);
        txtTeste2 = (EditText) findViewById(R.id.txtTeste2);
        txtProva1 = (EditText) findViewById(R.id.txtProva1);
        txtProva2 = (EditText) findViewById(R.id.txtProva2);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        txtMediaFinal = (TextView) findViewById(R.id.txtMediaFinal);

        btnCalcular.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Teste1 = Double.parseDouble(txtTeste1.getText().toString());
                Teste2 = Double.parseDouble(txtTeste2.getText().toString());
                Prova1 = Double.parseDouble(txtProva1.getText().toString());
                Prova2 = Double.parseDouble(txtProva2.getText().toString());

                Double media = calcularMedia(Teste1, Teste2, Prova1, Prova2);
                txtMediaFinal.setText(media.toString());
            }
        });

    }

    private double calcularMedia(double Teste1, double Teste2, double Prova1, double Prova2) {
        double mediaFinal =(((Teste1*0.3)+(Prova1*0.7))+ ((Teste2*0.3)+(Prova2*0.7)))/2;
        return mediaFinal;
    }

}