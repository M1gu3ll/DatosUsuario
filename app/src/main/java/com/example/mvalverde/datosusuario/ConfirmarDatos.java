package com.example.mvalverde.datosusuario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {

    TextView tvNombre, tvFecha, tvTelefono, tvEmail, tvDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        tvNombre = (TextView) findViewById(R.id.tvNombre);
        tvFecha = (TextView) findViewById(R.id.tvFecha);
        tvTelefono = (TextView) findViewById(R.id.tvTelefono);
        tvEmail = (TextView) findViewById(R.id.tvEmail);
        tvDescripcion = (TextView) findViewById(R.id.tvDescripcion);

        Bundle parametros = getIntent().getExtras();
        String Nombre = parametros.getString(getResources().getString(R.string.texto_nombre));
        String Fecha = parametros.getString(getResources().getString(R.string.texto_fecha));
        String Telefono = parametros.getString(getResources().getString(R.string.texto_telefono));
        String Email = parametros.getString(getResources().getString(R.string.texto_email));
        String Descripcion = parametros.getString(getResources().getString(R.string.texto_descripcion));

        tvNombre.setText(Nombre);
        tvFecha.setText(Fecha);
        tvTelefono.setText(Telefono);
        tvEmail.setText(Email);
        tvDescripcion.setText(Descripcion);
    }
}
