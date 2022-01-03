package Logica;

public class Main {

    public static void main(String[] args) {
        
        
        
        
        Planta vecplanta[] = new Planta [7];
        
        Flor flor = new Flor("Verde", "Verde", "Rosa", "primavera", 5, "Rosa", "Si", "calido", "0.5");
        Flor flor2 = new Flor("amarillo", "verde", "fasfa", "verano", 6, "asfas", "si", "calido", "2");
        Flor flor3 = new Flor("rojo", "marron", "pokjp", "otoño", 2, "roie", "no", "templado", "1");
        Arbol arbol = new Arbol("kdpoas", "delgado", "verde", "adas", 0.9, "oko", "si", "frio", "1");
        Arbol arbol2 = new Arbol("Roble", "grueso", "marron", "seca", 2, "Roble", "si", "frio", "5");
        Arbol arbol3 = new Arbol("kgosd", "kfka", "rojo", "kkcoa", 1, "ppc", "no", "templado", "3");
        Arbusto arbusto = new Arbusto(1, "no", "dkpa", "verde", "si", "vbdf", "si", "templado", "0.8");
        
        
        vecplanta[0] = flor;
        vecplanta[1] = flor2;
        vecplanta[2] = flor3;
        vecplanta[3] = arbol;
        vecplanta[4] = arbol2;
        vecplanta[5] = arbol3;
        vecplanta[6] = arbusto;
        
        
        
        //llamo al metodo soyPlanta desde los objetos de las clases hijas
        
        /*
        flor.soyPlanta(flor.getNombre());
        arbol.soyPlanta(arbol.getVariedad());
        arbusto.soyPlanta(arbusto.getColorHojas());
        */
        
        for (int i=0;i<vecplanta.length;i++) {
            
               vecplanta[i].soyPlanta(flor.getNombre());
               vecplanta[i].soyPlanta(arbol.getVariedad());
               vecplanta[i].soyPlanta(arbusto.getColorHojas());
            
        }
    }
    
}
