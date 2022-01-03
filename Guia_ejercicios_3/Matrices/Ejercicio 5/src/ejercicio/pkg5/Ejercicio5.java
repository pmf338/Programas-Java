package ejercicio.pkg5;

import java.util.Scanner;


public class Ejercicio5 {

    
    public static void main(String[] args) {
        
        String destinos [] = {"Rio de Janeiro","Cancún","Madrid","Roma","Milán","Iguazú"};
        String horarios [] = {"Mañana","Mediodia","Noche"};
        int asientos [][] = new int [6][3];
        int i,j,destino=-1,horario=-1,pasajes=-1;
        String venta = "";
        
        
        Scanner teclado = new Scanner (System.in);
        
        //cargo la matriz asientos
        for(i=0;i<6;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println("Ingrese la cantidad de asientos disponibles para destino " + destinos[i] + " en el horario " + horarios[j]);
                asientos[i][j] = teclado.nextInt();
            }
        }
        
       
         //hago pedidos hasta que quiera finalizar la operacion con la palabra finish
        while(!venta.equals("finish"))
         {
        
        //pido por teclado el destino del viaje, el horario y la cantidad de pasajes
        System.out.println("Ingrese el numero del destino al que quiere dirigirse");
        destino = teclado.nextInt();
        System.out.println("Ingrese el numero del horario en el que quiera viajar");
        horario = teclado.nextInt();
        System.out.println("Ingrese la cantidad de pasajes que desea solicitar");
        pasajes = teclado.nextInt();
        
        
        if(asientos[destino][horario]>=pasajes)
        {
            System.out.println("Su reserva fue realizada con éxito");
            asientos[destino][horario]-=pasajes;
        }else
            {
                System.out.println("Disculpe, no se pudo completar su operacón debido a que no hay asientos disponibles");
            }
            
            System.out.println("Si desea finalizar la operación escriba la palabra finish, si desea continuar aprete enter");
            venta= teclado.nextLine();
        
        }
        
        
        //muestro la matriz asientos
        /*
        for(i=0;i<6;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.printf("%5d ",asientos[i][j]);
                
            }
            System.out.println();
        }

*/
    }
    
}
