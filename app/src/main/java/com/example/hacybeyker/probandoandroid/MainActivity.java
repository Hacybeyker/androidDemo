package com.example.hacybeyker.probandoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button botonAnterior, botonSiguiente;
    TextView textNombre,textApellido, textDni, textDireccion;
    ImageView imagen;
    AlumnoDAO alumnoDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonAnterior = (Button) findViewById(R.id.botonAnterior);
        botonSiguiente = (Button) findViewById(R.id.botonSiguiente);
        textNombre = (TextView) findViewById(R.id.textNombre);
        textApellido = (TextView) findViewById(R.id.textApellido);
        textDni = (TextView) findViewById(R.id.textDni);
        textDireccion = (TextView) findViewById(R.id.textDireccion);

        alumnoDAO = new AlumnoDAO();
        mostrarDatos();

        botonAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alumnoDAO.Anterior();
                mostrarDatos();
            }
        });
        botonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alumnoDAO.Siguiente();
                mostrarDatos();
            }
        });
    }

    private void mostrarDatos() {
        textNombre.setText(alumnoDAO.RetornarAlumno().getNombre());
        textApellido.setText(alumnoDAO.RetornarAlumno().getApellido());
        textDni.setText(alumnoDAO.RetornarAlumno().getDni());
        textDireccion.setText(alumnoDAO.RetornarAlumno().getDireccion());
        //imagen.setImageResource();
        botonAnterior.setEnabled(alumnoDAO.MuevoAnterior());
        botonSiguiente.setEnabled(alumnoDAO.MuevoSiguiente());
    }
}
