package com.example.calculadorak

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.example.calculadorak.ui.theme.CalculadoraKTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalculadoraKTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    App(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun App(modifier: Modifier = Modifier) {
    var primerNumero by remember { mutableStateOf("") }
    var segundoNumero by remember { mutableStateOf("") }
    var resultado by remember { mutableFloatStateOf(0f) }
    var info by remember { mutableStateOf("") }

    Box(
        modifier = Modifier.padding(6.dp, top = 24.dp)
    ){
        Text(
            text = "Calculadora",
            modifier = modifier
        )
        Column {
            TextField(
                modifier = Modifier.fillMaxWidth().padding(end = 6.dp),
                value = primerNumero,
                onValueChange = { newText ->
                    if (newText.toFloatOrNull() != null) {
                        primerNumero = newText
                    }
                },
                label = { Text("Introduce un número") },
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Decimal)
            )
            Text(
                text = "+",
                modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally) // Center it horizontally

            )
            TextField(
                modifier = Modifier.fillMaxWidth().padding(end = 6.dp),
                value = segundoNumero,
                onValueChange = { newText ->
                    if (newText.toFloatOrNull() != null) {
                        segundoNumero = newText
                    }
                },
                label = { Text("Introduce un número") },
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Decimal)
            )
            Button(
                onClick ={
                    try{
                        resultado = primerNumero.toFloat() + segundoNumero.toFloat()
                        info=""
                    }  catch (e: NumberFormatException) {
                        info = "Faltan numeros"
                    }
                }
            ){
                Text(text = "Sumar")
            }
            if(info != ""){
                Text(text = info)
            }
            Text("Resultado:")
            Text(text = resultado.toString())
        }
    }
}


