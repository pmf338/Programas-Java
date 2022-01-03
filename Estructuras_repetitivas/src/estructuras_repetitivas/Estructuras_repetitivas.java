package estructuras_repetitivas;

import java.util.Scanner;


public class Estructuras_repetitivas {

    
    public static void main(String[] args) {
        
        // While controlado por contador
        /*
        int cont = 1;
        
        while(cont < 6)
        {
            System.out.println("Soy Pablo y estoy en la vuelta " + cont);
            //cont = cont + 1;
            cont++;
        }
        */
        
        //While controlado por centinela
        
        
        System.out.println("Ingrese un nombre");
        Scanner teclado = new Scanner (System.in); //Entrada por teclado
        String nombre = teclado.next();
        
        while(!nombre.equals("Pablo")) //Mientras el nombre sea diferente a Pablo
        {
            System.out.println("El nombre ingresado fue " + nombre);
            
            System.out.println("Ingrese un nombre");
            nombre = teclado.next();
        }
        
    }
    
        
        
        // Bucle for
        /*
        for(int i=1;i<6;i++)
        {
            System.out.println("Estoy en la vuelta  " + i);
            
        }
        */
}

