package Logica;

public class Moto extends Vehiculo{
    
    private String cilindrada,materialManubrio;

    public Moto() {
    }

    public Moto(String cilindrada, String materialManubrio, String patente, String numDeChasis, String motor, String color, String marca, String modelo, String cantAsientos) {
        super(patente, numDeChasis, motor, color, marca, modelo, cantAsientos);
        this.cilindrada = cilindrada;
        this.materialManubrio = materialManubrio;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getMaterialManubrio() {
        return materialManubrio;
    }

    public void setMaterialManubrio(String materialManubrio) {
        this.materialManubrio = materialManubrio;
    }

    @Override
    public String getPatente() {
        return patente;
    }

    @Override
    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String getNumDeChasis() {
        return numDeChasis;
    }

    @Override
    public void setNumDeChasis(String numDeChasis) {
        this.numDeChasis = numDeChasis;
    }

    @Override
    public String getMotor() {
        return motor;
    }

    @Override
    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getCantAsientos() {
        return cantAsientos;
    }

    @Override
    public void setCantAsientos(String cantAsientos) {
        this.cantAsientos = cantAsientos;
    }
    
    @Override
   public void SoyVehi (){
    
        System.out.println("Hola soy una moto y mi cilindrada es " + this.getCilindrada());
    }
    
}
