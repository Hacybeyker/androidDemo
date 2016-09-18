package com.example.hacybeyker.probandoandroid;

/**
 * Created by Hacybeyker on 6/09/2016.
 */
public class AlumnoDAO {
    private Alumno[] alumnos;
    private int cursor;

    public AlumnoDAO() {
        alumnos = getAlumnos();
        cursor = 0;
        RetornarAlumno();
    }

    public Alumno[] getAlumnos() {
        alumnos = new Alumno[]{
                new Alumno(1, "Carlos", "Osorio Perez", "72396372", "La esperanza parte alta"),
                new Alumno(2,"Janeth","Valencia Cerna","12345678","Calle los diamantes 1245"),
                new Alumno(3,"Benjamin","Suarez Osorio","87653241","Av el bebe 158"),
        };
        return alumnos;
    }

    public void Siguiente(){
        if (cursor < alumnos.length-1) cursor++;
    }

    public boolean MuevoSiguiente(){
        return cursor < alumnos.length-1;
    }

    public void Anterior(){
        if(cursor > 0) cursor--;
    }

    public boolean MuevoAnterior(){
        return cursor > 0;
    }

    public Alumno RetornarAlumno(){
        return alumnos[cursor];
    }

}
