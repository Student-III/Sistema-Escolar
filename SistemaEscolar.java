
package com.mycompany.sistemaescolar;

import java.util.ArrayList;

public class SistemaEscolar {
    
    public static void main(String[] args) {
      
        ArrayList<Estudiante> est= new ArrayList<>();
        Estudiante e1= new Estudiante("Leo       ",21,"2do",  4.2f);
        Estudiante e2= new Estudiante("Dan carlos",21,"3ro",  3.5f);
        Estudiante e3= new Estudiante("Marianelys",21,"1ro",  5.0f);
      //Estudiante e4= new Estudiante("", 21, "2do", 4.2f);
      //Estudiante e5= new Estudiante("Pepe", -1, "2do", 4.2f);
      //Estudiante e6= new Estudiante("Miguel", 151, "2do", 4.2f);
        est.add(e1);
        est.add(e2);
        est.add(e3);
        //est.add(e4);
        //est.add(e5);
        //est.add(e6);
        LinkedList<Profesor> profesor=new LinkedList<>();
        Profesor p1 =new Profesor("Lucian",30,"Base de datos");
        Profesor p2 =new Profesor("Marcos",28,"Estructura de datos");
        Profesor p3 =new Profesor("Dariel",32,"Calculo 1");
      //Profesor p4 =new Profesor("", 30, "Base de datos");
      //Profesor p5 =new Profesor("Lucian", 30, "");
      //Profesor p6 =new Profesor("Dariel",180,"Calculo 1");
        profesor.add(p1);
        profesor.add(p2);
        profesor.add(p3);
        //profesor.add(p4);
        //profesor.add(p5);
        //profesor.add(p6);
         for (int i = 0; i < est.size(); i++){
        System.out.println("Nombre de estudiante:"+est.get(i).getName()+" Edad:"+est.get(i).getEdad()+" Anno:"+est.get(i).getAnno()+" Nota:"+est.get(i).getNota());
         }
        for (int i = 0; i < profesor.size(); i++) {
            System.out.println("Nombre de profesores:"+profesor.get(i).getName()+" Edad:"+profesor.get(i).getEdad()+" Asignatura:"+profesor.get(i).getAsignatura());
        }
        
    }
    
}
