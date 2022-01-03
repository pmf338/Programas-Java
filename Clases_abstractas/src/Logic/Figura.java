package Logic;


//al agregar la palabra clave absract la clase figura pasa a ser abstracta
//fijarse el cambio de color del icono de la clase figura

public abstract class Figura {
    
    //las clases abstractas no pueden tener variables privadas
    
    protected double x,y;
    
    //si yo no voy a instanciar objetos no tiene sentido que esta clase tenga constructores
    
    public abstract double calcularArea(); //metodo abstracto
    
    
}
