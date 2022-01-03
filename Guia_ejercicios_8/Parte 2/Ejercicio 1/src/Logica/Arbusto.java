package Logica;

public class Arbusto extends Planta{
    
    private double ancho;
    private String esDomestico,variedad,colorHojas,sePodaONo;

    public Arbusto() {
    }

    
    
    public Arbusto(double ancho, String esDomestico, String variedad, String colorHojas, String sePodaONo, String nombre, String TieneHojas, String clima, String AltoTallo) {
        super(nombre, TieneHojas, clima, AltoTallo);
        this.ancho = ancho;
        this.esDomestico = esDomestico;
        this.variedad = variedad;
        this.colorHojas = colorHojas;
        this.sePodaONo = sePodaONo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(String esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public String getSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(String sePodaONo) {
        this.sePodaONo = sePodaONo;
    }
    
    
    @Override
    public void soyPlanta (String arbusto)
    {
        System.out.println("Hola soy un arbusto y el color de mis hojas es " + arbusto);
    }
    
}

