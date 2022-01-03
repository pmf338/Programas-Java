
package Logica;

public class Colectivo extends Vehiculo{
    
    private boolean aptoDiscapa,lectorSube;
    private String tipoColectivo;

    public Colectivo() {
    }

    public Colectivo(boolean aptoDiscapa, boolean lectorSube, String tipoColectivo, String patente, String numDeChasis, String motor, String color, String marca, String modelo, String cantAsientos) {
        super(patente, numDeChasis, motor, color, marca, modelo, cantAsientos);
        this.aptoDiscapa = aptoDiscapa;
        this.lectorSube = lectorSube;
        this.tipoColectivo = tipoColectivo;
    }

    public boolean isAptoDiscapa() {
        return aptoDiscapa;
    }

    public void setAptoDiscapa(boolean aptoDiscapa) {
        this.aptoDiscapa = aptoDiscapa;
    }

    public boolean isLectorSube() {
        return lectorSube;
    }

    public void setLectorSube(boolean lectorSube) {
        this.lectorSube = lectorSube;
    }

    public String getTipoColectivo() {
        return tipoColectivo;
    }

    public void setTipoColectivo(String tipoColectivo) {
        this.tipoColectivo = tipoColectivo;
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
    
        System.out.println("Hola soy un colectivo y mi cantidad de asientos es " + this.getCantAsientos());
    }
    
}
