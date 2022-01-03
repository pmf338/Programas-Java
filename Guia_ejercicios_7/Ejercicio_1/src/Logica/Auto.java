package Logica;


public class Auto {
    
    String color,marca,modelo,patente;
    int cantPuertas;
    
    //constructor vacio

    public Auto() {
    }
    
    
    
    //constructor por parametros

    public Auto(String color, String marca, String modelo, String patente, int cantPuertas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.cantPuertas = cantPuertas;
    }
    
    
    //metodos

    
    //por cada atributo de la clase debe haber un setter y un getter
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }
    
}
