
package Logic;

//es obligatorio que la clases hijas de una clase abstracta hereden los metodos
//de la clase madre

public class Circulo extends Figura{

    //variable global
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
    //metodo heredado de la clase abstracta figura
    @Override
    public double calcularArea() {
        
        //variables locales
        double pi = 3.14;
        double resultado = pi * radio * radio;
        
        return resultado;
    }
    
}
