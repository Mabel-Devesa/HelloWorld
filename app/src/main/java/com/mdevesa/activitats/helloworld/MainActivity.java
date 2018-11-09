package com.mdevesa.activitats.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);
        boton = (Button) findViewById(R.id.boton);

        boton.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                text.setText("Hola Mundo!");
                text.setVisibility(View.VISIBLE);
            }
        });

    }

}
