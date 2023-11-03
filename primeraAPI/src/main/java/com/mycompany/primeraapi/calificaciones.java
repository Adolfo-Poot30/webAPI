package com.mycompany.primeraapi;

public class calificaciones {
    private String asignatura;
    private int calificacion;
    
    public calificaciones(String asignatura, int calificacion){
        this.asignatura = asignatura;
        this.calificacion = calificacion;
    }
    
    public String getAsignatura(){
        return asignatura;
    }
    
    public int getCalificacion(){
        return calificacion;
    }
    
    public void setAsignatura(String asignatura){
        this.asignatura = asignatura;
    }
    
    public void setCalificacion(int calificacion){
        this.calificacion = calificacion;
    }
    
}
