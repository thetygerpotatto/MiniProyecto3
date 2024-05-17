package model;


public class GameBoard {
    Mark Table [][] = new Mark[3][3];
    
    public Mark[][] getTable() {
        return Table;
    }


    public void setTable(Mark[][] table) {
        Table = table;
    }

    public void changeTable(Mark[][] table) {
        setTable(table);
    }

    public GameBoard() {

    }
}
