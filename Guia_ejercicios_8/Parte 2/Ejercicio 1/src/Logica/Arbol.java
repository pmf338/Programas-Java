package Logica;

public class Arbol extends Planta{
    
    private String variedad,tipoTronco,color,tipoHoja;
    private double radioTronco;

    public Arbol() {
    }

    
    
    public Arbol(String variedad, String tipoTronco, String color, String tipoHoja, double radioTronco, String nombre, String TieneHojas, String clima, String AltoTallo) {
        super(nombre, TieneHojas, clima, AltoTallo);
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.color = color;
        this.tipoHoja = tipoHoja;
        this.radioTronco = radioTronco;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoTronco() {
        return tipoTronco;
    }

    public void setTipoTronco(String tipoTronco) {
        this.tipoTronco = tipoTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoHoja() {
        return tipoHoja;
    }

    public void setTipoHoja(String tipoHoja) {
        this.tipoHoja = tipoHoja;
    }

    public double getRadioTronco() {
        return radioTronco;
    }

    public void setRadioTronco(double radioTronco) {
        this.radioTronco = radioTronco;
    }
    
    
    @Override
    public void soyPlanta (String arbol)
    {
        System.out.println("Hola soy un arbol y mi variedad es " + arbol );
    }
    
}
