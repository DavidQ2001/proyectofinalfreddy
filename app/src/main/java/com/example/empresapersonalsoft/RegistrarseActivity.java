package com.example.empresapersonalsoft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrarseActivity extends AppCompatActivity {

    EditText jetusuario,jetcorreo,jetnombre,jetclave;
    CheckBox jcbactivo;
    String usuario,correo,nombre,clave,url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);
        //Asociar objetos java con los del xml
        getSupportActionBar().hide();
        jetusuario = findViewById(R.id.etusuario);
        jetcorreo = findViewById(R.id.etcorreo);
        jetnombre = findViewById(R.id.etnombre);
        jetclave= findViewById(R.id.etclave);
        jcbactivo = findViewById(R.id.cbactivo);
    }

    public void Consultar(View view){
        usuario = jetusuario.getText().toString();
        if(usuario.isEmpty()){
            Toast.makeText(this, "Usuario requerido", Toast.LENGTH_SHORT).show();
            jetusuario.requestFocus();
        }else{
            url = "http://172.16.62.247:80/Empresa6/consulta.php?usr=" + usr;
            jrq = new JsonObjectRequest(Request.Method.GET, url, null, this, this);
            rq.add(jrq);

        }


    }
}