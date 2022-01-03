package Logica;

//Esta clase la utilizo para controlar a las demas clases y manejar los momentos en que las quiero utilizar
//se puede considerar un pivote
import Persistencia.ControladoraPersistencia;
import java.util.Date;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia ();
    
    //Si yo creo el metodo en la controladora este no debe estar en el paquete IGU
    
    public void altaProducto (int cod_prod, String nombre, int cant, String marca, String tipo, Date fecha_venc){
    
        Producto prod = new Producto ();
        prod.setCod_prod(cod_prod);
        prod.setNombre(nombre);
        prod.setCant(cant);
        prod.setMarca(marca);
        prod.setTipo(tipo);
        prod.setFecha_venc(fecha_venc);
        
        controlPersis.altaProducto(prod);
        
    }
}
