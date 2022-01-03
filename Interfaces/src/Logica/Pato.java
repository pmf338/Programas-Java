package Logica;

public class Pato extends Animal implements IVolador, IAcuatico{

   private int cantKmNada;
   private int cantKmCamina;
    
    @Override
    public void soyAnimal() {

        System.out.println("Hola soy un animal y soy un pato");
    }
    
    //metodos de las interfaces
    @Override
    public void volar() {

        System.out.println("Hola soy volador y vuelo al ras del agua");
    }

    @Override
    public void nadar() {
        
        System.out.println("Hola soy un pato y nado sobre el agua");
    }
    
}
