package Logica;

public class Main {


    public static void main(String[] args) {
        
        Auto auto1 = new Auto("cuero", "5", "AD51", "1564", "faf", "Negro", "Lotus", "gdgd", "4");
        Auto auto2 = new Auto("cuero duro", "5", "BA54", "4654", "ojfa", "rojo", "Ferrari", "ngr", "2");
        Auto auto3 = new Auto("acero", "6", "WT89", "4931", "jrt", "Naranja", "Mclaren", "pom", "2");
        Moto moto1 = new Moto("2", "acero", "BT59", "485", "koop", "verde", "lpl", "mva", "1");
        Moto moto2 = new Moto("4", "acero", "PQ16", "4564", "gbgw", "rojo", "nnf", "vvs", "2");
        Moto moto3 = new Moto("2", "hierro", "VQ54", "723", "motor", "azul", "gsp", "gma", "1");
        Colectivo cole1 = new Colectivo(false, true, "cole1", "col", "1", "coelc", "azul", "das", "lpld", "42");
        Colectivo cole2 = new Colectivo(true, true, "cole2", "TE39", "498", "colea", "rojo", "lpa", "vzg", "35");
        Camion camion = new Camion(true, "5", "cam", "565", "cami", "gris", "camion", "pep", "2");
        
        Vehiculo vehiculo [] = new Vehiculo [9];
        
        vehiculo[0] = auto1;
        vehiculo[1] = auto2;
        vehiculo[2] = auto3;
        vehiculo[3] = moto1;
        vehiculo[4] = moto2;
        vehiculo[5] = moto3;
        vehiculo[6] = cole1;
        vehiculo[7] = cole2;
        vehiculo[8] = camion;
        
        for (int i = 0; i < vehiculo.length; i++) {
            
            vehiculo[i].SoyVehi();
            
        }
    }
    
}
