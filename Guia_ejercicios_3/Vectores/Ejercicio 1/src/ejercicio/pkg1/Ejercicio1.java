package ejercicio.pkg1;

import java.util.Scanner;


public class Ejercicio1 {

   
    public static void main(String[] args) {
       
        String nombres [] = new String [2]; //vector para los nombres
        
        Scanner teclado = new Scanner (System.in);
        
        for(int i=0; i<nombres.length; i++)  //for para ingresar los datos
        {
            System.out.println("Ingrese el nombre de la posicion:  " + i);
            nombres[i] = teclado.nextLine(); //Ingreso por teclado para strings (con el nextLine me toma mas de una palabra
        }
        
        for(int j=0;j<nombres.length;j++)
        {
            System.out.println("Los nombres ingresados son:  " + nombres[j] + "\n");
        }
    }
    
}
