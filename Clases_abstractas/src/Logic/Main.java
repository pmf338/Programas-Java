package Logic;

//cuando necesito una plantilla de una clase madre para que todas sus hijas
//utilicen con los mismos metodos o caracteristicas principales, por ejemplo
//los atributos y no necesito instanciar esa clase madre, utilizo clases abstractas

public class Main {

    
    public static void main(String[] args) {
        
        Cuadrado cuad = new Cuadrado (10);
        double areaCuadrado = cuad.calcularArea();
        
        System.out.println("El resultado del area del cuadrado es:  " + areaCuadrado);
        
        Triangulo trian = new Triangulo (2,5);
        double areaTriangulo = trian.calcularArea();
        System.out.println("El resultado del area del triangulo es:  " + areaTriangulo);
        
    }
    
}
