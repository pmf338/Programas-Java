
package Logica;

public class Auto extends Vehiculo{
    
    private String materialAsientos,cantCaballos;
    

    public Auto() {
    }

    public Auto(String materialAsientos, String cantCaballos, String patente, String numDeChasis, String motor, String color, String marca, String modelo, String cantAsientos) {
        super(patente, numDeChasis, motor, color, marca, modelo, cantAsientos);
        this.materialAsientos = materialAsientos;
        this.cantCaballos = cantCaballos;
    }

    public String getMaterialAsientos() {
        return materialAsientos;
    }

    public void setMaterialAsientos(String materialAsientos) {
        this.materialAsientos = materialAsientos;
    }

    public String getCantCaballos() {
        return cantCaballos;
    }

    public void setCantCaballos(String cantCaballos) {
        this.cantCaballos = cantCaballos;
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
    
        System.out.println("Hola soy un auto y mi marca es " + this.getMarca());
    }
    
}
