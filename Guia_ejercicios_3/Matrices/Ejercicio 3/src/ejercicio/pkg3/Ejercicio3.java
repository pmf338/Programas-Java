package ejercicio.pkg3;

import java.util.Scanner;

public class Ejercicio3 {

    
    public static void main(String[] args) {
        
       String matriz_perros [][] = new String [3][3];
       int i=0,j=0,flag=0;
       String raza = "";
       
       Scanner teclado = new Scanner (System.in);
       
       //carga de la matriz
       for(i=0;i<matriz_perros.length;i++) 
       {
           for(j=0;j<matriz_perros.length;j++)
           {
               System.out.println("Ingrese una raza de perro");
               matriz_perros[i][j] = teclado.nextLine();
           }
       }
       
       //busqueda de la raza en la matriz
        System.out.println("Ingrese la raza de perro que quiera buscar en la matriz");
        raza = teclado.nextLine();
        
        for(i=0;i<matriz_perros.length;i++) 
       {
           for(j=0;j<matriz_perros.length;j++)
           {
               if(matriz_perros[i][j].equals(raza))
               {
                   flag = 1;
                   System.out.println("La raza " + raza + " se encontro en la posicion " + i +" de la matriz");
               }
           }
       }
        //Si la raza no esta guardada en la matriz
        if(flag==0)
        {
            System.out.println("La raza ingresada no se encuentra en la matriz");
        }
    }
    
}
