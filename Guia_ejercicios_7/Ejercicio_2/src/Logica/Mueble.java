package Logica;

public class Mueble {
  
    String nombre,material;
    double alto,ancho;
    int cantidad;

    public Mueble() {
    }

    public Mueble(String nombre, String material, double alto, double ancho, int cantidad) {
        this.nombre = nombre;
        this.material = material;
        this.alto = alto;
        this.ancho = ancho;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    
}
