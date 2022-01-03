package ejercicio.pkg4;

import java.util.Scanner;


public class Ejercicio4 {

   
    public static void main(String[] args) {
        
       double sueldos[] = new double [2],suma=0,promedio=0;
       
       
       Scanner teclado = new Scanner (System.in);
       
       for(int i=0;i<sueldos.length;i++)
       {
           System.out.println("Ingrese un sueldo");
           sueldos[i] = teclado.nextDouble();
           
           suma+=sueldos[i]; //voy guardando 1x1 los sueldos y sumandolos cada vez que entra uno
           
           }
       
       promedio = suma/sueldos.length; //Hago el promedio dividiendo el total de los sueldos con la cantidad
        System.out.println("El promedio de los sueldos es de " + promedio);
        
    }
    
}
