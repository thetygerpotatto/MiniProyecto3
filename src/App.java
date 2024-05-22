import controlador.ControladorJuego;
import modelo.Juego;
import vista.VistaJuegoConsola;
//import vista.VistaJuegoGUI;

public class App {
    public static void main(String[] args) throws Exception {
        Juego modelo = new Juego();
        //Consola o GUi
        VistaJuegoConsola vista = new VistaJuegoConsola();
        //VistaJuegoConsola vista = new VistaJuegoGUI();
        ControladorJuego controlador = new ControladorJuego(modelo, vista);
        //controlador.mostrarInterfaz();
    }
}
