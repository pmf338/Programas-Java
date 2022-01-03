
package Logica;

public class Main {

   
    public static void main(String[] args) {
        
        Mueble mueble1 = new Mueble("mesa", "hierro", 0.75, 1, 5);
        Mueble mueble2 = new Mueble("silla", "hierro", 0.75, 0.25, 8);
        Mueble mueble3 = new Mueble("escritorio", "hierro", 0.75, 1.35, 3);
        
        System.out.println(mueble1.getNombre() +" "+ mueble1.getMaterial());
        System.out.println(mueble2.getNombre() +" "+ mueble2.getMaterial());
        System.out.println(mueble3.getNombre() +" "+ mueble3.getMaterial());
        
        //modifico el valor del atributo material y lo muestro
        mueble1.setMaterial("madera");
        mueble2.setMaterial("madera");
        mueble3.setMaterial("madera");
        
        System.out.println(mueble1.getNombre() +" "+ mueble1.getMaterial());
        System.out.println(mueble2.getNombre() +" "+ mueble2.getMaterial());
        System.out.println(mueble3.getNombre() +" "+ mueble3.getMaterial());
        
        
    }
    
}
