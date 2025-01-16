package com.example.calculadoraj;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onSubmitClick(View view) {
        TextInputEditText primerNumero = findViewById(R.id.primerNumero);
        TextInputEditText segundoNumero = findViewById(R.id.segundoNumero);
        TextView resultadoText = findViewById(R.id.textResultado);
        TextView infoText = findViewById(R.id.infoText);

        float numero1 =0;
        float numero2 =0;

        if (!String.valueOf(primerNumero.getText()).equals("")
            &&
            !String.valueOf(segundoNumero.getText()).equals("")
        ){
            numero1 = Float.parseFloat(String.valueOf(primerNumero.getText()));
            numero2 = Float.parseFloat(String.valueOf(segundoNumero.getText()));

            float result = numero1 + numero2;
            resultadoText.setText(result+"");
            infoText.setText("");
        } else {
            resultadoText.setText("");
            infoText.setText("Faltan numeros");
        }
    }
}