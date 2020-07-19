package piece;

import board.Tile;

import java.util.LinkedList;
import java.util.List;

public class Bishop extends Piece{

    public Bishop(Allegiance allegiance, int col, int row) {
        super(allegiance, col, row);
    }

    public List<Tile> legalMoves(Tile[][] chessBoard) {

       List<Tile> legalMoves = new LinkedList<Tile>();

       legalMoves.add((Tile) legalMovesLeftDown(chessBoard));
       legalMoves.add((Tile) legalMovesRightDown(chessBoard));
       legalMoves.add((Tile) legalMovesLeftUp(chessBoard));
       legalMoves.add((Tile) legalMovesRightUp(chessBoard));

        return legalMoves;
    }


}
