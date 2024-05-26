package vista;

import controlador.*;

public interface VistaJuego {
    public void mostrarVista(ControladorJuego controlador);
    public Opciones getOpcionP1();
    public void mostrarGanador(String ganador, String cpuSelection);
    public Opciones Selection = null;
}
