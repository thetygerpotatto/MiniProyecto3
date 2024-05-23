import controlador.ControladorJuego;
import modelo.Juego;

import vista.VistaJuegoConsola;
//import vista.VistaJuegoGUI;

public class App {
    static int keepGoing = -1;
    public static void main(String[] args) throws Exception {
        System.out.println("BIENVENIDO A PIEDRA PAPEL O TIJERA \n\nINGRESA UN NUMERO DEL 1 AL 3 PARA JUGAR\n(0 para salir)");
        do {
            Juego modelo = new Juego();
            
            modelo.vs();
            modelo.DeterminarGanador();
            keepGoing = modelo.x;
        } while (keepGoing != 0);
        System.out.println("------------------------------------------\nBYE BYE ;3 ");
        //Consola o GUi
        //VistaJuegoConsola vista = new VistaJuegoConsola();
        //VistaJuegoConsola vista = new VistaJuegoGUI();
        //ControladorJuego controlador = new ControladorJuego(modelo, vista);
        //controlador.mostrarInterfaz();
    }
}
