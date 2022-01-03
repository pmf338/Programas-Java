package ejercicio.pkg2;

import java.util.Scanner;

public class Ejercicio2 {

    
    public static void main(String[] args) {
       
        int matriz_unos[][] = new int [6][6];
        int i=0,j=0,flag=0;
        
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Ingrese un 1 para insertar en la matriz");
        matriz_unos[i][j] = teclado.nextInt();
        
        while(matriz_unos[i][j]==1 && i<matriz_unos.length-1) //Ingreso el primer valor y compruebo si es 1
        {                                                     //ademas me fijo si el indice no sobrepasa la matriz                  
            flag=1;
            i++;
            j++;
            System.out.println("Ingrese otro 1 para insertar en la matriz");
            matriz_unos[i][j] = teclado.nextInt();
            
        }
        
        if(flag==0)  //si la bandera sigue en 0 significa que el valor ingresado no fue 1 ya que no entro al while
        {
            System.out.println("La matriz no es valida, ingrese nuevamente");
            matriz_unos[i][j] = teclado.nextInt();
            
            //reintento el nuevo valor ingresado
            while(matriz_unos[i][j]==1 && i<matriz_unos.length-1) 
            {                                                                       
            flag=1;
            i++;
            j++;
            System.out.println("Ingrese otro 1 para insertar en la matriz");
            matriz_unos[i][j] = teclado.nextInt();
            
            }
        }
        
         for(i=0;i<6;i++)   //muestro la matriz
      {
          for(j=0;j<6;j++)
          {
              System.out.printf("%5d ",matriz_unos[i][j]);
          }
          System.out.println();
      }
         
    }
    
}
