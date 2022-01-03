package Logica;

public class Main {

    public static void main(String[] args) {
       
        Mascota mascotas [] = new Mascota [5]; //creo un vector que pueda contener atributos
                                               //del objeto mascota
        
        mascotas[0] =  new Mascota("Daisy", "perro", "femenino", "marron", "corto", "mixta");
        mascotas[1] = new Mascota("Turi", "perro", "masculino", "blanco", "enrulado", "Caniche");
        mascotas[2] = new Mascota("Piedrita", "gato", "masculino", "gris y negro", "corto", "Europeo comun");
        mascotas[3] = new Mascota("Pepo", "loro", "masculino", "verde y amarillo", "corto", "Loro Real");
        mascotas[4] = new Mascota("Negra", "perro", "femenino", "negro", "largo", "mixta");
        
        /*
        for(int i=0;i<mascotas.length;i++)
        {
            System.out.println("El nombre es  " + mascotas[i].getNombre() + ", la especie es  " + mascotas[i].getEspecie() + " y el sexo es " + mascotas[i].getSexo());
        }
        
        mascotas[2].setNombre("Chiquita");
        mascotas[3].setNombre("Pipo");
        
        for(int i=2;i<4;i++)
        {
            System.out.println("El nombre es  " + mascotas[i].getNombre() + ", la especie es  " + mascotas[i].getEspecie() + " y el sexo es " + mascotas[i].getSexo());
        }
        */
        
        for(int i=0;i<mascotas.length;i++)
        {
            if("perro".equals(mascotas[i].getEspecie()))
            {
            System.out.println("El nombre es  " + mascotas[i].getNombre() + ", la especie es  " + mascotas[i].getEspecie() + " y el sexo es " + mascotas[i].getSexo());

            }
            
        }
    }
    
}
