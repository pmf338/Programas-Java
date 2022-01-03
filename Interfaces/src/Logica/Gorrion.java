
package Logica;

public class Gorrion extends Animal implements IVolador{

    private int cantPlumas;
    private String colorPlumas;
    
    //metodos de la clase abstracta
    @Override
    public void soyAnimal() {
    
        System.out.println("Soy un animal, soy un gorrion");
    }

    //metodos de la interfaz
    @Override
    public void volar() {

        System.out.println("Hola soy un gorrion y vuelo bajito");
    }
    
}
