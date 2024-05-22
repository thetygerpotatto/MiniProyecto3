package controlador;

import modelo.Juego;
import vista.VistaJuego;
//import vista.VistaJuegoConsola;
//import vista.VistaJuegoGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorJuego implements ActionListener {

    public Juego juego;
    public VistaJuego vista;
    public Opciones opcion;
    public ControladorJuego(Juego juego, VistaJuego vista) {
        this.juego = juego;
        this.vista = vista;
    }

    public void mostrarInterfaz(){
        vista.mostrarVista(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
