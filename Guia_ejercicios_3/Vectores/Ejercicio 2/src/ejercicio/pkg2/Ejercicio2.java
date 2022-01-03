package ejercicio.pkg2;

import java.util.Scanner;


public class Ejercicio2 {

    
    public static void main(String[] args) {
        
        int numeros [] = new int [2];
        int max=0,min=0;
        
        Scanner teclado = new Scanner (System.in);
        
        for(int i=0;i<numeros.length;i++)
        {
            System.out.println("Ingrese el numero correspondiente a la posicion:  " + i);
            numeros[i] = teclado.nextInt();
        }
        
        for(int j=0;j<numeros.length;j++)
        {
            
            max = numeros[0];
            min = numeros[0];
            
            if(numeros[j]>max)
            {
                max = numeros[j];
            }
            
            if(numeros[j]<min)
            {
                min=numeros[j];
            }
        }
        
        System.out.println("El mayor numero es:  " + max);
        System.out.println("El menor numero es:  " + min);
    }
    
}
