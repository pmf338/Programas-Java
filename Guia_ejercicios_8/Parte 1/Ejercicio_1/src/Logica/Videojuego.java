package Logica;

//metodos en publico y atributos en privado por seguridad

public class Videojuego {
    
    private String codigo, titulo, consola,categoria;
    private int CantPlayers;

    public Videojuego() {
    }

    public Videojuego(String codigo, String titulo, String consola, String categoria, int CantPlayers) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.categoria = categoria;
        this.CantPlayers = CantPlayers;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCantPlayers() {
        return CantPlayers;
    }

    public void setCantPlayers(int CantPlayers) {
        this.CantPlayers = CantPlayers;
    }
    
    
    
}
