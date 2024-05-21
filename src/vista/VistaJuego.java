package vista;

import controlador.ControladorJuego;

public interface VistaJuego {
    public void mostrarVista(ControladorJuego controlador);
    public int opcionP1();
    public int opcionCPU();
    public void mostrarGanador(String ganador);
}
