package Logica;


public class Main {

    public static void main(String[] args) {
        
        Videojuego game[] = new Videojuego [5];
        
        game[0] = new Videojuego("541", "God of War", "Playstation 4", "Accion", 1);
        game[1] = new Videojuego("354","Trails in the sky","PS Vita","JRPG",1);
        game[2] = new Videojuego("48A", "Mortal Kombat", "Playstation 4", "Pelea", 2);
        game[3] = new Videojuego("4AV","Fire Emblem","Nintendo Switch","Estrategia",1);
        game[4] = new Videojuego("A54","Super Smash Bros","Nintendo Switch","Pelea",4);
        
        for(int i=0;i<game.length;i++)
        {
            System.out.println("El juego se llama " + game[i].getTitulo() + ",se juega en " + game[i].getConsola() +
                    " y pueden jugar hasta  " + game[i].getCantPlayers() + " personas");
        }
        
        game[2].setTitulo("Street Fighter");
        game[2].setCantPlayers(1);
        game[3].setTitulo("Cuphead");
        game[3].setCantPlayers(2);
        
        for(int i=0;i<game.length;i++)
        {
            System.out.println("El juego se llama " + game[i].getTitulo() + ",se juega en " + game[i].getConsola() +
                    " y pueden jugar hasta  " + game[i].getCantPlayers() + " personas \n");
        }
        
        for (int i = 0;i<game.length; i++) 
        {
            if(game[i].getConsola().equals("Nintendo Switch"))
            {
                System.out.println("El juego se llama " + game[i].getTitulo() + ",se juega en " + game[i].getConsola() +
                    " y pueden jugar hasta  " + game[i].getCantPlayers() + " personas \n");
            }
            
        }
        
    }
    
}
