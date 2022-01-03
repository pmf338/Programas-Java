
package Logica;

public class Camion extends Vehiculo{
    
    private boolean tieneAcoplado;
    private String cantEjes;

    public Camion() {
    }

    public Camion(boolean tieneAcoplado, String cantEjes, String patente, String numDeChasis, String motor, String color, String marca, String modelo, String cantAsientos) {
        super(patente, numDeChasis, motor, color, marca, modelo, cantAsientos);
        this.tieneAcoplado = tieneAcoplado;
        this.cantEjes = cantEjes;
    }

    public boolean isTieneAcoplado() {
        return tieneAcoplado;
    }

    public void setTieneAcoplado(boolean tieneAcoplado) {
        this.tieneAcoplado = tieneAcoplado;
    }

    public String getCantEjes() {
        return cantEjes;
    }

    public void setCantEjes(String cantEjes) {
        this.cantEjes = cantEjes;
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
    
        System.out.println("Hola soy un camion y mi cantidad de ejes es " + this.getCantEjes());
    }
    
}
