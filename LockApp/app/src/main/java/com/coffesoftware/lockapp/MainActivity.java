package com.coffesoftware.lockapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Integer contador;
    Integer intentos;
    String patron;
    Toast toast;
    Button boton11;
    Button boton12;
    Button boton13;
    Button boton21;
    Button boton22;
    Button boton23;
    Button boton31;
    Button boton32;
    Button boton33;
    ControllerActivity controllerActivity = new ControllerActivity();

    /**
     *
     * @param savedInstanceState
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton11 = (Button) findViewById(R.id.boton11);
        boton12 = (Button) findViewById(R.id.boton12);
        boton13 = (Button) findViewById(R.id.boton13);
        boton21 = (Button) findViewById(R.id.boton21);
        boton22 = (Button) findViewById(R.id.boton22);
        boton23 = (Button) findViewById(R.id.boton23);
        boton31 = (Button) findViewById(R.id.boton31);
        boton32 = (Button) findViewById(R.id.boton32);
        boton33 = (Button) findViewById(R.id.boton33);
        patron =new String("0");
        intentos = 2;
        contador = 0;

    }

    /**
     *
     * @param view
     */

    public void validarUsuario(View view){


        concatenarValorBoton(view);

        if (contador<4){
            toast = Toast.makeText(getApplicationContext(), "Debes presionar por lo menos 4 nodos, máximo 9",Toast.LENGTH_SHORT);
            toast.show();
        }
        if(contador==8){
            //toast = Toast.makeText(getApplicationContext(), "Son 9",Toast.LENGTH_SHORT);
            //toast.show();
            //System.out.println(patron);

            switch (patron){
                case "0111111111" :
                    toast = Toast.makeText(getApplicationContext(), "BIENVENIDO", Toast.LENGTH_LONG);
                    toast.show();
                    siguienteActivity(view,"Pedro");
                    break;

                case "0123456789" :
                    toast = Toast.makeText(getApplicationContext(), "BIENVENIDA", Toast.LENGTH_LONG);
                    toast.show();
                    siguienteActivity(view,"Ana");
                    break;
                case "0987654321" :
                    toast = Toast.makeText(getApplicationContext(), "BIENVENIDO", Toast.LENGTH_LONG);
                    toast.show();
                    siguienteActivity(view,"Héctor");
                    break;

                default: toast = Toast.makeText(getApplicationContext(), "PATRÓN INCORRECTO", Toast.LENGTH_LONG);
                    toast.show();
                    nuevoIntento(view);
            }
        }
        contador++;






    }

    /**
     *
     * @param view
     */
    public void concatenarValorBoton(View view){
        switch(view.getId()){
            case R.id.boton11:

                patron += "1";
                break;

            case R.id.boton12:
                patron += "2";
                break;

            case R.id.boton13:
                patron += "3";
                break;

            case R.id.boton21:
                patron += "4";
                break;

            case R.id.boton22:
                patron += "5";
                break;

            case R.id.boton23:
                patron += "6";
                break;

            case R.id.boton31:
                patron += "7";
                break;

            case R.id.boton32:
                patron += "8";
                break;

            case R.id.boton33:
                patron += "9";
                break;

            default: throw new RuntimeException("error");
        }
    }

    /**
     *
     * @param view
     */
    public void nuevoIntento(View view){
        patron =new String("0");
        intentos -= 1;
        contador = -1;
    }

    public void siguienteActivity(View view, String nombref){
        Intent i = new Intent(this,WelcomeActivity.class);
        i.putExtra("nombref",nombref); //"nombref" es la llave
        startActivity(i);
    }

}
