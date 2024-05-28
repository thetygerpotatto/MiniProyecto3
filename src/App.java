import controlador.ControladorJuego;
import modelo.Juego;

import vista.*;
//import vista.VistaJuegoGUI;

public class App {
    public static void main(String[] args) throws Exception {
        //VistaJuegoConsola vista = new VistaJuegoConsola();
        VistaJuego vista = new VistaJuegoGUI();
        Juego game = new Juego();
        ControladorJuego controlador = new ControladorJuego(game, vista);
        
    }
}
