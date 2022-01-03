package ejercicio.pkg3;

import java.util.Scanner;


public class Ejercicio3 {

   
    public static void main(String[] args) {
        
       int numeros[] = new int [15], cont=0;
       
       
       Scanner teclado = new Scanner (System.in);
       
       for(int i=0; i<numeros.length;i++) //Ingreso los valores y al mismo tiempo me fijo si el valor ingresado es igual a 3
       {
           System.out.println("Ingrese un numero");
           numeros[i]= teclado.nextInt();
           
           if(numeros[i]== 3)
           {
               cont++;
           }
       }
       
        System.out.println("La cantidad de veces que el numero 3 fue ingresado son:  " + cont);
    }
    
}
