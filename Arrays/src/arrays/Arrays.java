package arrays;

import java.util.Scanner;


public class Arrays {

    
    public static void main(String[] args) {
       
        /*
        int numeros [] = new int [4];
        
        numeros [0] = 15;
        numeros [1] = 35;
        numeros [2] = 28;
        numeros [3] = 48;
        
        for(int i=0;i<numeros.length;i++ )
        {
            System.out.println("Estoy en el indice:  " + i + " el numero que esta guardado es el:   " + numeros [i]);
            
        }
        */
        
        
        /*
        
        // declaracion y asignacion de mi vector
        int numeros [] = new int [4];
        
        Scanner teclado = new Scanner (System.in);
        
        
        //cargo mi vector
        for(int i=0;i<numeros.length;i++)
        {
            System.out.println("Ingrese el valor que quiere guardar en la posicion del indice " + i);
             numeros [i] = teclado.nextInt();
        }
        
        
        //recorrido para mostrar lo que tiene guardado
        for(int i=0;i<numeros.length;i++)
        {
            System.out.println("Estoy en el indice:  " + i + " el numero que esta guardado es el:  " + numeros[i]);
        }
        
        */
        
        //declaracion y asignacion de matrices
        
        int matriz [][] = new int [4][4];
        
        
        //recorrido y carga
        Scanner teclado = new Scanner (System.in);
        
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                    System.out.println("Estoy en la fila " + i + " cruce con columna " + j);
                    matriz [i][j] = teclado.nextInt();
                    
            }
        }
    }
    
}
