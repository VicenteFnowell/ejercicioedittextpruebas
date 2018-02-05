package com.example.ejercicioedittextpruebas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

EditText etNombre,etApellidos,etEdad;
RadioGroup rgSexo;
Spinner spProvincias;
CheckBox cbEstudiante;
TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = (EditText)findViewById(R.id.etnombre);
        etApellidos = (EditText)findViewById(R.id.etapellido);
        etEdad = (EditText)findViewById(R.id.etedad);
        rgSexo = (RadioGroup) findViewById(R.id.rgsexo);
        spProvincias = (Spinner)findViewById(R.id.spprovincias);
        cbEstudiante = (CheckBox)findViewById(R.id.cbestudiante);
        tvResultado = (TextView)findViewById(R.id.tvresultado);


        //Rellenar Spinner
        String[] provincias={"Selecciona","Cádiz","Sevilla","Huelva","Granada","Málaga","Almería","Córdoba","Jaen"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,provincias);
        spProvincias.setAdapter(adaptador);




    }//Fin OnCreate


    public void Obtenerresultados (View view){

        //Recogemos el valor de los etnombre y apellidos
        String nombre = etNombre.getText().toString();
        String apellidos = etApellidos.getText().toString();
        String edad = etEdad.getText().toString();
        String provincia = spProvincias.getSelectedItem().toString();

        if(nombre.equals("")|| apellidos.equals("")|| edad.equals("")|| provincia.equals("Selecciona")){
            Toast.makeText(getApplicationContext(),"Debes rellenar los campos",Toast.LENGTH_LONG).show();
        }else {
            tvResultado.setText("Resultado: "+nombre+" "+apellidos+ " "+edad);
        }


    }



}//Fin Activity
