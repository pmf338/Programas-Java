
package ejercicio.pkg4;

import java.util.Scanner;


public class Ejercicio4 {

    
    public static void main(String[] args) {
        
        double notas [][] = new double [4][4];
        int i,j;
        double suma=0;
        
        Scanner teclado = new Scanner (System.in);
        //carga de la matriz
        for(i=0;i<4;i++)
        {
            System.out.println("Ingrese las tres notas para el alumno: " + i);
            for(j=0;j<3;j++)
            {
            notas [i][j] = teclado.nextDouble();
            
            //voy sumando en cada vuelta cada nota para desp sacar el promedio
            suma = suma + notas[i][j];
            }
            
            notas[i][3] = suma / 3; //guardo el promedio de notas en la ultima columna
            suma = 0; //reseteo el sumador por cada vuelta
        }
        
        //recorrer y mostrar las notas
        for(i=0;i<4;i++)
        {
            System.out.println("Las notas y promedio del alumno " + i + " son: ");
            
           for(j=0;j<4;j++)
           {
               System.out.println(notas[i][j]);
           }
        }
    }   
}
