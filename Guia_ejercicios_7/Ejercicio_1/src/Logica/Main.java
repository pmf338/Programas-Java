package Logica;


public class Main {

 
    public static void main(String[] args) {
        
        //instancio un objeto auto con valores
        Auto auto = new Auto ("rojo", "Ferrari", "F430", "AG 338 FE", 2);
        Auto auto2 = new Auto ("naranja", "Mclaren", "570S", "AR 440 YT", 2);
        Auto auto3 = new Auto ("rojo", "Alfa Romeo", "Giulia", "FE 886 RA", 4);
    
        //instancio un objeto auto vacio
        Auto auto4 = new Auto();
        
        //obtengo los atributos del objeto auto con el get y los muestro
        System.out.println("La marca del primer auto es  " + auto.getMarca() + ", el modelo es  " + auto.getModelo() + " y la patente es  " + auto.getPatente());
        System.out.println("La marca del segundo auto es " + auto2.getMarca() + ", el modelo es " + auto2.getModelo() + " y la patente es " + auto2.getPatente());
        System.out.println("La marca del tercer auto es  " + auto3.getMarca() + ", el modelo es " + auto3.getModelo() + " y la patente es " + auto3.getPatente());
    
        //trato de obtener la marca del auto creado sin parametros
        System.out.println("La marca del auto4 es " + auto4.getMarca()); //obtendre un valor null
    }
    
}
