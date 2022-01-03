package ejercicio.pkg1;

import java.util.Scanner;


public class Ejercicio1 {

  
    public static void main(String[] args) {
        
      int matriz_cincos [][] = new int [4][5];
      int i,j;
      
      
      Scanner teclado = new Scanner (System.in);
      
      for(i=0;i<4;i++)
      {
          for(j=0;j<5;j++)
          {
              System.out.println("Ingrese un cinco para ingresar en la matriz");
              matriz_cincos[i][j] = teclado.nextInt();
              
              if(matriz_cincos[i][j]== 5)
              {
                  
              }else
                {
                    System.out.println("El valor ingresado no es valido");
                    j--;
                }
               
          }
      }
      
      
        for(i=0;i<4;i++)
      {
          for(j=0;j<5;j++)
          {
              System.out.printf("%5d ",matriz_cincos[i][j]);
          }
          System.out.println();
      }
    
      
    }
    
}
