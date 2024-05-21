package modelo;

public class Juego
{   
    //?Estas son las opciones que recibe el constructor
    // * P1 es el jugador y cpu la maquina
    public int opcionP1, opcionCPU; 

    public Juego()
    {
        // *constructor
    }

    public Juego(int opcionP1, int opcionCPU)
    {
        this.opcionP1 = opcionP1;
        this.opcionCPU = opcionCPU;
    }

    // *opcionP1
    public int getOpcionP1()
    {
        return opcionP1;
    }

    public void setOpcionP1()
    {
        this.opcionP1 = opcionP1;
    }

    // *opcionCPU

    public int getOpcionCPU()
    {
        return opcionCPU;
    }

    public void setOpcionCPU()
    {
        this.opcionCPU = opcionCPU;
    }

    //? Aqui iran los metodos que permiten el funcinamiento de la logica del juego

    /*
      metodos logica
     */
}
