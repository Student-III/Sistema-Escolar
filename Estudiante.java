
package com.mycompany.sistemaescolar;

public class Estudiante {
    private String name;
    private int edad;
    private String anno;
    private float nota;
    
    public Estudiante(String name,int edad,String anno,float nota){
        if (name==null || name.isBlank()==true){
            throw new UnsupportedOperationException("Intoduzca una nombre valido");
        }
        this.name=name;
        if (edad<0 || edad>150){
            throw new UnsupportedOperationException("Intoduzca una edad valida");
        }
        this.edad=edad;
        if(anno == null){
            throw new UnsupportedOperationException("Intoduzca una anno valido");
        }
        this.anno=anno;
        if(nota<1 || nota>=6){
            throw new UnsupportedOperationException("Intoduzca una nota valida");
        }
        this.nota=nota;
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

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    
}
