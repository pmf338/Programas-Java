package Logica;

public class Tiburon extends Animal implements IAcuatico{

       private int CantDientes;
       private String tipoDeMordida;
    
    @Override
    public void soyAnimal() {

            System.out.println("Hola soy un animal y soy un tiburon");
    }

    @Override
    public void nadar() {

            System.out.println("Hola soy un tiburon y nado debajo del agua");
    }
    
}
