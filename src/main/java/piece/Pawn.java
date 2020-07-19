package piece;

import board.Tile;

import java.util.LinkedList;
import java.util.List;

public class Pawn extends Piece {


    public Pawn(Allegiance allegiance, int col, int row) {
        super(allegiance, col, row);
    }

    public List<Tile> legalMoves(Tile[][] chessBoard) {

        List<Tile> legalMoves = new LinkedList<Tile>();
        if (chessBoard[col - 1][row - 1].isOccupiedTile() && chessBoard[col - 1][row - 1].getPiece().getAllegiance() != allegiance && (col - 1 >= 0 && row - 1 >= 0)) {
            legalMoves.add(chessBoard[col - 1][row - 1]);
        }

        if (chessBoard[col + 1][row - 1].isOccupiedTile() && chessBoard[col + 1][row - 1].getPiece().getAllegiance() != allegiance && (col + 1 < 8 && row - 1 >= 0)) {
            legalMoves.add(chessBoard[col + 1][row - 1]);
        }

        if (!chessBoard[col][row - 1].isOccupiedTile() &&  row - 1 >= 0) {
            legalMoves.add(chessBoard[col][row - 1]);
        }

        return legalMoves;
    }

}
