package Logica;

public class Vehiculo {
    
    String patente,numDeChasis,motor,color,marca,modelo;
    String cantAsientos;

    public Vehiculo() {
    }

    public Vehiculo(String patente, String numDeChasis, String motor, String color, String marca, String modelo, String cantAsientos) {
        this.patente = patente;
        this.numDeChasis = numDeChasis;
        this.motor = motor;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.cantAsientos = cantAsientos;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getNumDeChasis() {
        return numDeChasis;
    }

    public void setNumDeChasis(String numDeChasis) {
        this.numDeChasis = numDeChasis;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

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

    public String getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(String cantAsientos) {
        this.cantAsientos = cantAsientos;
    }
    
    public void SoyVehi (){
    
        System.out.println("Hola soy un vehiculo");
    }
    
    
            
    
}
