package controlador;

import modelo.Juego;
import vista.VistaJuego;
import vista.VistaJuegoConsola;
import vista.VistaJuegoGUI;

//import vista.VistaJuegoConsola;
//import vista.VistaJuegoGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorJuego implements ActionListener {

    public Juego juego;
    public VistaJuego vista;
    public VistaJuegoConsola vistaConsola;
    public VistaJuegoGUI vistaGUI;
    public Opciones opcion;
    public ControladorJuego(Juego juego, VistaJuego vista) {
        this.juego = juego;
        this.vista = vista;
    }
    public ControladorJuego(Juego juego, VistaJuegoConsola vista) {
        this.juego = juego;
        this.vistaConsola = vistaConsola;
    }
    public void mostrarInterfaz(){
        vista.mostrarVista(this);
    }
    public ControladorJuego(Juego juego, VistaJuegoGUI vista) {
        this.juego = juego;
        this.vistaGUI = vistaGUI;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
