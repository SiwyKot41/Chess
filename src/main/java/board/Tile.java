package board;

import piece.Piece;

public class Tile {

    private int row;
    private int col;
    private Piece piece;


    public Tile(int col, int row) {
        this.col = col;
        this.row = row;
        piece = null;
    }

    public Piece getPiece() {
        return piece;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }


    public boolean isOccupiedTile() {
        if( piece == null) return false;
        else return true;
    }


}


