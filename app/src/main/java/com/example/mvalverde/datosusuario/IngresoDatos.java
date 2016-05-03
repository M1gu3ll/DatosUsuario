package com.example.mvalverde.datosusuario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class IngresoDatos extends AppCompatActivity {

    Button siguiente;
    TextView edtNombre, edtTelefono, edtEmail, edtDescripcion;
    DatePicker dtpFecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso_datos);

        edtNombre = (TextView) findViewById(R.id.edtNombre);
        dtpFecha = (DatePicker) findViewById(R.id.dtpFecha);
        edtTelefono = (TextView) findViewById(R.id.edtTelefono);
        edtEmail = (TextView) findViewById(R.id.edtEmail);
        edtDescripcion = (TextView) findViewById(R.id.edtDescripcion);
        siguiente = (Button) findViewById(R.id.btnSiguiente);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IngresoDatos.this, ConfirmarDatos.class);
                intent.putExtra(getResources().getString(R.string.texto_nombre), edtNombre.getText().toString());
                intent.putExtra(getResources().getString(R.string.texto_telefono), edtTelefono.getText().toString());
                intent.putExtra(getResources().getString(R.string.texto_email), edtEmail.getText().toString());
                intent.putExtra(getResources().getString(R.string.texto_descripcion), edtDescripcion.getText().toString());
                intent.putExtra(getResources().getString(R.string.texto_fecha), dtpFecha.getDayOfMonth() + "/" + dtpFecha.getMonth() + "/" + dtpFecha.getYear());
                startActivity(intent);
            }
        });

    }
}
