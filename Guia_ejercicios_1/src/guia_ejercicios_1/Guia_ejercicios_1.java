package guia_ejercicios_1;


public class Guia_ejercicios_1 {

   
    public static void main(String[] args) {
        
        //Ejercicio 1
        
        /*
        double numero2 = 5;
        int numero = numero2;
        String palabra = "35";
        */
        
        //Ejercicio 2
        
        /*
        int numero = 20;
        int numero2 = 35;
        int backup = numero;
        
        System.out.println("El primer numero es:   " + numero + " y el segundo numero es:  " + numero2);
        
        numero = numero2;
        numero2 = backup;
        
        System.out.println("Una vez realizado el cambio el primer numero es:  " + numero + " y el segundo numero es:  " + numero2);
        
        */
        //Ejercicio 3
        
        /*
        String categoria = "";
        double sueldo = 0;
        
        if(categoria == "repositor")
        {
            sueldo = 15890 + (15890*0.10);
        }
            else if(categoria == "cajero")
            {
                sueldo = 25630.89;
            }
            else if(categoria == "supervisor")
            {
                sueldo =  35560.20 - (35560.20*0.11);
            }
            else
            {
                System.out.println("El valor ingresado no es valido");
            }
                
        System.out.printf("El sueldo es: %.2f %n",sueldo);
        */
        
        //Ejercicio 4
        
        /*
        int productos = 15;
        
        if(productos < 5)
        {
            System.out.println("No se permiten compras inferiores a 5 productos");
        
        }else if(productos <= 15)
            {
                System.out.println("El costo del envio es de $200");
            
            }else
                {
                    System.out.println("El envio es gratuito");
                }
        
        */
        
        //Ejercicio 5
        
        /*
        int edad = 10;
        
        if(edad >= 4 && edad <=6)
        {
            System.out.printf("Kinder" + "%n El horario es Lunes y Miercoles de 16 a 17 %n");
        
        }else if(edad>=6 && edad<=8)
            {
            System.out.printf("1st year" + "%n EL horario es Martes y Jueves de 16:30 a 17:30 %n");
            
            }else if(edad>=8 && edad <= 10)
                {
                    System.out.printf("2nd year" + "%n El horario es Martes y Jueves de 17:30 a 19 %n");
                
                }else if(edad>=10 && edad <= 13)
                    {
                        System.out.printf("3rd year" + "%n El horario es Lunes y Miércoles de 17 a 18:30 %n");
                        
                    }else
                        {
                            System.out.println("La edad ingresada no es valida");
                        }

        */
    }
    
}
