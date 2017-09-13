package com.coffesoftware.lockapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ControllerActivity extends AppCompatActivity {

    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     *
     * @param intentos
     * @return
     */
    public boolean comprobarIntentos(Integer intentos){
            if(intentos<2){
                return true;
            }
            else{
                return false;
            }

    }



}
