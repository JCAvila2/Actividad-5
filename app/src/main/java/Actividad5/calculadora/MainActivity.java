package Actividad5.calculadora;

import static Actividad5.calculadora.R.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
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
    Button botonSuma, botonResta, botonMultiplicacion, botonDivision, botonLimpiar, botonCambiarSigno, botonElevar, botonBorrar, botonResultado;

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
                actualizarPantalla("1");
            }
        });
        boton2 = findViewById(id.button2);
        boton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                actualizarPantalla("2");
            }
        });
        boton3 = findViewById(id.button3);
        boton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                actualizarPantalla("3");
            }
        });
        boton4 = findViewById(id.button4);
        boton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                actualizarPantalla("4");
            }
        });
        boton5 = findViewById(id.button5);
        boton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                actualizarPantalla("5");
            }
        });
        boton6 = findViewById(id.button6);
        boton6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                actualizarPantalla("6");
            }
        });
        boton7 = findViewById(id.button7);
        boton7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                actualizarPantalla("7");
            }
        });
        boton8 = findViewById(id.button8);
        boton8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                actualizarPantalla("8");
            }
        });
        boton9 = findViewById(id.button9);
        boton9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                actualizarPantalla("9");
            }
        });
        boton0 = findViewById(id.button0);
        boton0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                actualizarPantalla("0");
            }
        });
        botonPunto = findViewById(id.button_punto);
        botonPunto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                actualizarPantalla(".");
            }
        });

        // Listener botones de operaciones (C, +, -, *, /, +/-, ^, ←)
        //Aqui ira el boton clear
        botonSuma = findViewById(id.buttonSum);
        botonSuma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                actualizarPantalla("+");
            }
        });
        botonResta = findViewById(id.buttonRest);
        botonResta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                actualizarPantalla("-");
            }
        });
        botonMultiplicacion = findViewById(id.buttonMult);
        botonMultiplicacion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                actualizarPantalla("*");
            }
        });
        botonDivision = findViewById(id.buttonDiv);
        botonDivision.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                actualizarPantalla("/");
            }
        });

        botonCambiarSigno = findViewById(id.buttonCambiarSigno);
        botonCambiarSigno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String p1Inversed= "";
                String p1 = "";
                String p2 = "";
                String valueToInvert = "";
                String signToAdd = "";
                boolean secondPart = false;
                for (int i = valor.length(); i >= 1; i--) {
                    if (!secondPart) {
                        if (((valor.charAt(i-1) + "").equals("+")) || ((valor.charAt(i-1) + "").equals("-")) || ((valor.charAt(i-1) + "").equals("*")) || ((valor.charAt(i-1) + "").equals("/"))) {
                            p1Inversed += ( valor.charAt(i-1) + "");
                            if (((valor.charAt(i-1) + "").equals("-"))) {
                                signToAdd = "+";
                            } else if (((valor.charAt(i-1) + "").equals("+"))) {
                                signToAdd = "-";
                            }
                            secondPart = true;
                        } else {
                            valueToInvert += valor.charAt(i-1);
                        }
                    } else {
                        p1Inversed += ( valor.charAt(i-1) + "");
                    }
                }
                if (signToAdd.equals("+")) {
                    p2 += "+";
                } else {
                    p2 += "-";
                }
                for (int j = p1Inversed.length() ; j >= 1; j--) { //invert 1 part
                    p1 += (p1Inversed.charAt(j-1) + "");
                }
                for (int i = valueToInvert.length(); i >= 1; i--) { // invert 2 part
                    p2 += (valueToInvert.charAt(i-1) + "");
                }
                valor = (p1 + "" + p2);
                valorPantallaUsuario = valor;
                pantalla.setText(valorPantallaUsuario);
                Log.i("BOTON", "+/-");
            }
        });

        botonElevar = findViewById(id.buttonElevar);
        botonElevar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                actualizarPantalla("^");
            }
        });
        //Aqui ira el boton de borrar

        // Listener boton boton de resultado (=)
        //Aqui
        

    }

    public void actualizarPantalla(String entrada) {
        pantalla.setTextColor(Color.BLACK);
        Log.i("BOTON", entrada);
        valor += entrada;
        switch (entrada) {
            case "+":
                valorPantallaUsuario += "+";
                limpiar = false;
                break;
            case "-":
                valorPantallaUsuario += "-";
                limpiar = false;
                break;
            case "/":
                valorPantallaUsuario += "÷";
                limpiar = false;
                break;
            case "*":
                valorPantallaUsuario += "×";
                limpiar = false;
                break;
            case "":
                valorPantallaUsuario = "";
                limpiar = false;
                break;
            case "^":
                valorPantallaUsuario += "^";
                limpiar = false;
                break;
            default:
                valorPantallaUsuario += entrada;
        }
        if (limpiar) {
            valor = entrada;
            valorPantallaUsuario = valor;
            limpiar = false;
        }
        pantalla.setText(valorPantallaUsuario);
    }
    
}