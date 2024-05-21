package modelo;

import java.util.Random;

import controlador.Opciones;

public class Juego{   
    //?Estas son las opciones que recibe el constructor
    // * P1 es el jugador y cpu la maquina
    public Opciones opcionP1, opcionCPU;
    

    public Juego(){
        // *constructor
    }

    public Juego(Opciones opcionP1, Opciones opcionCPU){
        this.opcionP1 = opcionP1;
        this.opcionCPU = opcionCPU;
    }

    //Generador de un numero random
    public int RandomInt(){
        Random random = new Random();
        int randNum = random.nextInt(3) + 1;
        return randNum;
    }

    public Opciones generarOpcionCPU(){
        int x = RandomInt();
        switch(x) {
            case 1:
                opcionCPU = Opciones.PIEDRA;
                break;
            case 2:
                opcionCPU = Opciones.PAPEL;
                break;
            case 3:
                opcionCPU = Opciones.TIJERA;
                break;
            default:
                throw new IllegalStateException("Valor inesperado: " + x);
        }
        return opcionCPU;
    }

    public void DeterminarGanador(){
        
    }


}
