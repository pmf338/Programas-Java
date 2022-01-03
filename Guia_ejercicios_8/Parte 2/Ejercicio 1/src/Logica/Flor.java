package Logica;

public class Flor extends Planta{  //con solo poner extends Planta, la clase Flor, ya hereda todos los atributos y metodos de esa clase
    
    private String colorPetalos,colorPisitilo,variedadFlor,estacion;
    private double promedioPetalos;

    public Flor() {
    }

    
    
    public Flor(String colorPetalos, String colorPisitilo, String variedadFlor, String estacion, double promedioPetalos, String nombre, String TieneHojas, String clima, String AltoTallo) {
        super(nombre, TieneHojas, clima, AltoTallo); //atributos heredados de la clase madre(Planta)
        this.colorPetalos = colorPetalos;
        this.colorPisitilo = colorPisitilo;
        this.variedadFlor = variedadFlor;
        this.estacion = estacion;
        this.promedioPetalos = promedioPetalos;
    }

    public String getColorPetalos() {
        return colorPetalos;
    }

    public void setColorPetalos(String colorPetalos) {
        this.colorPetalos = colorPetalos;
    }

    public String getColorPisitilo() {
        return colorPisitilo;
    }

    public void setColorPisitilo(String colorPisitilo) {
        this.colorPisitilo = colorPisitilo;
    }

    public String getVariedadFlor() {
        return variedadFlor;
    }

    public void setVariedadFlor(String variedadFlor) {
        this.variedadFlor = variedadFlor;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    public double getPromedioPetalos() {
        return promedioPetalos;
    }

    public void setPromedioPetalos(double promedioPetalos) {
        this.promedioPetalos = promedioPetalos;
    }
    
    @Override // anotacion que indica que voy a sobreescribir el metodo de la clase madre
    public void soyPlanta (String flor)
    {
        System.out.println("Hola soy una flor y mi nombre es " + flor);
    }
    
}
