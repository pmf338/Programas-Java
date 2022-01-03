package excepciones;

public class Excepciones {

    public static void main(String[] args) {

        //ejemplo de division por cero
        /*
        try{
        int numero = 35/0;
        }
        catch(Exception e ){ //variable auxiliar de tipo Exception donde voy a guardar
                             //la excepcion que me tire el error de dividir por cero
            
            //si se produce la excepcion y la capture
            System.out.println("No podes dividir por cero");
            
        }
        
        System.out.println("Ya paso el catch");
         */
        //ejemplo de desbordamiento
        int vector[] = {58, 96, 35};
        
        try {
            System.out.println("El numero de la posicion 4 es:  " + vector[3]);
        } catch (Exception e) {
            System.out.println("Entre a la excepcion");
        }
            System.out.println("Esto paso despues");
    }

}
