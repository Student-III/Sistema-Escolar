
package com.mycompany.sistemaescolar;

public class Profesor {
    private String name;
    private int edad;
    private String asignatura;
    
    public Profesor (String name, int edad,String asignatura){
        if (name==null || name.isBlank()==true){
            throw new UnsupportedOperationException("Intoduzca una nombre valido");
        }
        this.name=name;
         if (edad<0 || edad>150){
            throw new UnsupportedOperationException("Intoduzca una edad valida");
        }
        this.edad=edad;
        if(asignatura==null){
            throw new UnsupportedOperationException("Intoduzca una asignatura valida");
        }
        this.asignatura=asignatura;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    
    
    
}
