package Logica;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

   
    public static void main(String[] args) {
        
        //creo la lista en el orden fifo(first input first outpot)
        //List<Persona> lista = new ArrayList<Persona> ();
        List<Persona> lista = new LinkedList<Persona> ();
        
        Persona per1 = new Persona("Hola","Chau",16);
        Persona per2 = new Persona("Auron","Play",32);
        Persona per3 = new Persona("El","Rubius",31);
        
        
        //---------------Linked List-----------------
        lista.add(per1);
        //para agregar despues
        lista.add(per3);
        //para agregar al principio de la lista
        lista.add(0,per2);
        
        //para recorrer
        
        for(Persona per : lista){ 
                                  
            System.out.println("Nombre :  " + per.getNombre());
        }
        
        
        
        
        
        
        
        
        
        
        /*
        //------------- Array list--------------------
        
        //agrego los objetos a la lista
        lista.add(per1);
        lista.add(per2);
        lista.add(per3);
        
        //formas de recorrer la lista
        
        //primera forma(en esta no me importa el indice
        for(Persona per : lista){ //por cada persona que yo tenga en esta lista
                                  
            System.out.println("Nombre :  " + per.getNombre());
        }
        
        //segunda forma(en esta busco por indice)
        for(int i=0; i<lista.size();i++){
            
            System.out.println("Nombre :  " + lista.get(i).getNombre()); 
            
        }
        */
    }   
    
}
