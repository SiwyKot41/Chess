package piece;

import board.Tile;

import java.util.LinkedList;
import java.util.List;

public class Rook extends Piece {

    public Rook(Allegiance allegiance, int col, int row) {
        super(allegiance, col, row);
    }

    public List<Tile> legalMoves(Tile[][] chessBoard) {

        List<Tile> legalMoves = new LinkedList<Tile>();

        legalMoves.add((Tile) legalMovesLeft(chessBoard));
        legalMoves.add((Tile) legalMovesRight(chessBoard));
        legalMoves.add((Tile) legalMovesUp(chessBoard));
        legalMoves.add((Tile) legalMovesDown(chessBoard));


        return legalMoves;
    }
}
