package modelo;
import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

import controlador.Opciones;

public class Juego{   
    //?Estas son las opciones que recibe el constructor
    // * P1 es el jugador y cpu la maquina
    public Opciones opcionP1, opcionCPU;
    static int isPlaying = -1;
    public int x;
    String won;

    public Juego(){
        this.opcionP1 = generarOpcionPLYR();
        this.opcionCPU = generarOpcionCPU();
        this.won = won;

    }

    public Juego(Opciones opcionP1, Opciones opcionCPU){

        this.opcionP1 = generarOpcionPLYR();
        this.opcionCPU = generarOpcionCPU();
    }
    //Generador de un numero random
    public int RandomInt(){
        Random random = new Random();
        int randNum = random.nextInt(3) + 1;
        return randNum;
    }

    public Opciones generarOpcionCPU(){
        int y = RandomInt();
        switch(y) {
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
    public Opciones generarOpcionPLYR(){
        Scanner scanner = new Scanner(System.in);
        x = -1;
        
        try {
            System.out.println("---------------------------------------------\n1 = PIERDA \n2 = PAPEL \n3 = TIJERA");
            x = scanner.nextInt();
            switch(x) {
                case 0:
                isPlaying = 0;
                case 1:
                opcionP1 = Opciones.PIEDRA;
                break;
                case 2:
                opcionP1 = Opciones.PAPEL;
                break;
                case 3:
                opcionP1 = Opciones.TIJERA;
                break;
                default:
                throw new IllegalStateException("Valor inesperado: " + x);
            }
        } catch (Exception e) {
            System.out.println("No diferencias el 1 2 o 3?, vuelve a escoger");
        }  
        
        return opcionP1;
    }

    public void rock(){

        if(opcionCPU == Opciones.TIJERA){
            won = "Ganaste";
        }else if(opcionCPU == Opciones.PAPEL){
            won = "<:( PIERDES <:(";
        }

    }
    public void papper(){

        if(opcionCPU == Opciones.PIEDRA){
            won = "Ganaste";
        }else if(opcionCPU == Opciones.TIJERA){
            won = "<:( PIERDES <:(";
        }
   
    }
    public void scisor(){

        if(opcionCPU == Opciones.PAPEL){
            won = "Ganaste";
        }else if(opcionCPU == Opciones.PIEDRA){
            won = "<:( PIERDES <:(";
        }

    }
    public void vs(){

        //Se comparan las 3 posibles elecciones del jugador con las 2 posibles de la maquina
        //por defecto si eligen igual empatan
        if (opcionCPU == opcionP1) {
            
            won = "Empate, juega de nuevo";
            
        }else if(opcionP1 == null){
            won = "Selección de jugador inválida";
        }else{

            if (opcionP1 == Opciones.PIEDRA){
                rock();
                
            }else if (opcionP1 == Opciones.PAPEL) {
                papper();

            }else if (opcionP1 == Opciones.TIJERA) {
                scisor();
            }
            
            
        }
    }
    public void DeterminarGanador(){
        System.out.println("CPU : " + opcionCPU);
        System.out.println("PLAYER : " + opcionP1);
        System.out.println(won);
    }
}
