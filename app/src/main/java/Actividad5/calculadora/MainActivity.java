package Actividad5.calculadora;

import static Actividad5.calculadora.R.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    // Variables
    ConstraintLayout layout;
    TextView pantalla;
    String valor = "", valorPantallaUsuario = "";
    boolean limpiar;

    // Variables de botones
    Button boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, boton0, botonPunto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Iniciacion de variables
        layout = findViewById(id.layout_main);
        pantalla = findViewById(id.pantalla);


        // Listeners de botones de numeros (1, 2, 3, 4, 5, 6, 7, 8, 9, 0, .)
        boton1 = findViewById(id.button1);
        boton1.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
                Log.i("BOTON", "1");
               // falta metodo para actualizar la pantalla
           }
        });
        boton2 = findViewById(id.button2);
        boton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.i("BOTON", "2");
                // falta metodo para actualizar la pantalla
            }
        });
        boton3 = findViewById(id.button3);
        boton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.i("BOTON", "3");
                // falta metodo para actualizar la pantalla
            }
        });
        boton4 = findViewById(id.button4);
        boton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.i("BOTON", "4");
                // falta metodo para actualizar la pantalla
            }
        });
        boton5 = findViewById(id.button5);
        boton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.i("BOTON", "5");
                // falta metodo para actualizar la pantalla
            }
        });
        boton6 = findViewById(id.button6);
        boton6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.i("BOTON", "6");
                // falta metodo para actualizar la pantalla
            }
        });
        boton7 = findViewById(id.button7);
        boton7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.i("BOTON", "7");
                // falta metodo para actualizar la pantalla
            }
        });
        boton8 = findViewById(id.button8);
        boton8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.i("BOTON", "8");
                // falta metodo para actualizar la pantalla
            }
        });
        boton9 = findViewById(id.button9);
        boton9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.i("BOTON", "9");
                // falta metodo para actualizar la pantalla
            }
        });
        boton0 = findViewById(id.button0);
        boton0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.i("BOTON", "0");
                // falta metodo para actualizar la pantalla
            }
        });
        botonPunto = findViewById(id.button_punto);
        botonPunto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Log.i("BOTON", ".");
                // falta metodo para actualizar la pantalla
            }
        });









    }
}