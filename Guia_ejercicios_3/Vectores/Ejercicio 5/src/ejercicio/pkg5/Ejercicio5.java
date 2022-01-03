package ejercicio.pkg5;

import java.util.Scanner;


public class Ejercicio5 {

    
    public static void main(String[] args) {
      
        int cant = 3,min=0,max=0,j=0,i=0,posmax=-1,posmin=-1;
        String ciudades [] = new String [cant]; //vector para mis ciudades
        int minimas [] = new int [cant]; //vector para mis minimas
        int maximas [] = new int [cant]; //vector para mis maximas
        
        Scanner teclado = new Scanner (System.in);
        Scanner teclado2 = new Scanner (System.in); //creo dos teclado porque tengo que ingresar diferentes tipos de datos por cada vector
        
        //cargo mis tres vectores en una sola vuelta
        for(i=0;i<ciudades.length;i++)
        {
            System.out.println("Ingrese la ciudad en la posicion  " + i);
            ciudades[i]= teclado.nextLine();
            System.out.println("Ingrese la temperatura minima para la dicha ciudad");
            minimas[i] = teclado2.nextInt();
            System.out.println("Ingrese la temperatura maxima para la dicha ciudad");
            maximas[i] = teclado2.nextInt();
        }
        
        //determinar la minima
        min = minimas[0];
        
        for(i=0;i<minimas.length;i++)
        {
            if(minimas[i]<min)
            {
                min=minimas[i];
                posmin=i;
            }
        }
        
        //determinar la maxima
        
        max = maximas[0];
        
        for(j=0;j<maximas.length;j++)
        {
            if(maximas[j]>max)
            {
                max=maximas[j];
                posmax=j;
                
            }
        }
        
        System.out.println("La temperatura minima es:  " + min + " y corresponde a la ciudad de:  " + ciudades[posmin]);
        System.out.println("La temperatura maxima es:  " + max + " y corresponde a la ciudad de:  " + ciudades[posmax]);
    }
    
}
