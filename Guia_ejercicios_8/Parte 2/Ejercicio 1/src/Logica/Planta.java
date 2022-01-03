package Logica;

public class Planta {
    
    private String nombre,TieneHojas,clima;
    private String AltoTallo;

    public Planta() {
    }

    public Planta(String nombre, String TieneHojas, String clima, String AltoTallo) {
        this.nombre = nombre;
        this.TieneHojas = TieneHojas;
        this.clima = clima;
        this.AltoTallo = AltoTallo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTieneHojas() {
        return TieneHojas;
    }

    public void setTieneHojas(String TieneHojas) {
        this.TieneHojas = TieneHojas;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getAltoTallo() {
        return AltoTallo;
    }

    public void setAltoTallo(String AltoTallo) {
        this.AltoTallo = AltoTallo;
    }
    
    public void soyPlanta (String planta)
    {
        System.out.println("Soy planta");
    }
    
}
