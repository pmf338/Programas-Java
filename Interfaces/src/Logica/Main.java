package Logica;

public class Main {

   
    public static void main(String[] args) {
        
        System.out.println("-----------MONO--------");
        Mono mono = new Mono();
        mono.soyAnimal();
        
        System.out.println("---------PATO---------");
        Pato pato = new Pato();
        pato.soyAnimal();
        pato.volar();
        pato.nadar();
        
        System.out.println("---------TIBURON--------");
        Tiburon tibu = new Tiburon();
        tibu.soyAnimal();
        tibu.nadar();
        
        System.out.println("---------GORRION---------");
        Gorrion gorri = new Gorrion();
        gorri.soyAnimal();
        gorri.volar();
    }
    
}
