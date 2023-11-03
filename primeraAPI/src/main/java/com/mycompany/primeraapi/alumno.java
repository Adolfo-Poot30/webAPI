package com.mycompany.primeraapi;

public class alumno {
    String id;
    String Nombre;
    calificaciones[] listaCalificaciones = new calificaciones[3];
    
    public alumno(String id, String nombre, calificaciones[] lista){
        this.Nombre = nombre;
        this.listaCalificaciones = lista;
        this.id = id;
    }
    
    public String getID(){
        return id;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public calificaciones[] getCalificaciones(){
        return listaCalificaciones;
    }
    
    public void setID(String id){
        this.id = id;
    }
    
    public void setNombre(String nombre){
        this.Nombre = nombre;
    }
    
    public void setCalificaciones(calificaciones[] lista){
        this.listaCalificaciones = lista;
    }
}
