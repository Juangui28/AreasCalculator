package com.juanguillermo.areascalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText base,altura;
    TextView resultado;
    Button calculo;
    float result;

    //Metodo para obtener al dar click
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asignamos los valores
        base = findViewById(R.id.sideOne);
        altura = findViewById(R.id.sideTwo);
        resultado = findViewById(R.id.result);
        calculo = findViewById(R.id.calular);

        calculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Convertimos un float a un text
                float valueOne = Float.parseFloat(base.getText().toString());
                float valueTwo = Float.parseFloat(altura.getText().toString());

                result = (valueOne * valueTwo)/2;
                //Convertimos un float a un string
                resultado.setText("El area es: "+String.valueOf(result));
            }
        });
    }
}