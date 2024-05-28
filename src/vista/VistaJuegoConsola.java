package vista;

import java.util.InputMismatchException;
import java.util.Scanner;

import controlador.ControladorJuego;
import controlador.Opciones;

public class VistaJuegoConsola implements VistaJuego {
    
    Scanner scanner;
    int input = -1;

    public VistaJuegoConsola() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void mostrarVista(ControladorJuego controlador) {
        while (true) {
            while(true) {
                System.out.println("        Bienvenido a Piedra Papel o Tijera");
                System.out.println("1 - Piedra");
                System.out.println("2 - Papel");
                System.out.println("3 - Tijera");
                System.out.println("0 - Salir");
                try {
                    input = scanner.nextInt() ;
                    System.out.print("\033[H\033[2J");
                    if (input < 0 || input > 3) {
                        System.out.println("Debe ingresar un numero entre [0,3]");
                        continue;
                    }
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("\033[H\033[2J");
                    System.out.println("Igrese un numero porfavor");
                    scanner.next();
                    continue;
                }
            }
            if (input == 0) break;
            controlador.actionPerformed(null);
        }
    }

    @Override
    public Opciones getOpcionP1() {
        Opciones op = null;

        switch (input) {
            case 1:
                op = Opciones.PIEDRA;
                break;
            case 2:
                op = Opciones.PAPEL;
                break;
            case 3:
                op = Opciones.TIJERA;
                break;
            case 0:
                break;
            default:
                break;
        }
        

        return op;
    }

    @Override
    public void mostrarGanador(String ganador, String cpuSelection) {
        System.out.println("La cpu elegio " + cpuSelection);
        System.out.println(ganador);
    }
    
}
