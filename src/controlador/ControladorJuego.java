package controlador;

import modelo.Juego;
import vista.VistaJuego;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorJuego implements ActionListener {

    public Juego juego;
    public VistaJuego vista;
    public Opciones opcion;

    public ControladorJuego(Juego juego, VistaJuego vista) {
        this.juego = juego;
        this.vista = vista;
        this.vista.mostrarVista(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Opciones op = vista.getOpcionP1();
        
        juego.setPlayerOption(op);
        vista.mostrarGanador(juego.getWinner(), juego.getCpuOpMsg());
    }
}
