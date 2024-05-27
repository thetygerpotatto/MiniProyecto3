import java.util.InputMismatchException;
import java.util.Scanner;

import controlador.ControladorJuego;
import modelo.Juego;

import vista.*;
//import vista.VistaJuegoGUI;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        VistaJuegoConsola vistaC = new VistaJuegoConsola();
        VistaJuego vistaG = new VistaJuegoGUI();
        Juego game = new Juego();
        while(true) {
            int op;
            System.out.println("    Piedra Papel o Tijera");
            System.out.println("1 - Para ver la interfaz de Consola");
            System.out.println("2 - Para ver la GUI");
            System.out.println("0 - Salir");
            try {
                op = scanner.nextInt() ;
                System.out.print("\033[H\033[2J");
                if (op < 0 || op > 2) {
                    System.out.println("Debe ingresar un numero entre [0,3]");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.print("\033[H\033[2J");
                System.out.println("Igrese un numero porfavor");
                scanner.next();
                continue;
            }
            
            if (op == 1) {
                ControladorJuego controlador = new ControladorJuego(game, vistaC);
            } else if (op == 2){
                ControladorJuego controlador = new ControladorJuego(game, vistaG);
            }

        }
        
    }
}
