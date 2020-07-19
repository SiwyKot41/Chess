package piece;

import board.Tile;

import java.util.LinkedList;
import java.util.List;

public abstract class Knight extends Piece{

    public Knight(Allegiance allegiance, int col, int row) {
        super(allegiance,col,row);
    }

    @Override
    public List<Tile> legalMoves(Tile[][] chessBoard) {

        List<Tile> legalMoves = new LinkedList<Tile>();

        if (!chessBoard[col - 1][row - 2].isOccupiedTile() || chessBoard[col - 1][row - 2].getPiece().getAllegiance() != allegiance && (col - 1 >= 0 && row - 2 >= 0)) {
            legalMoves.add(chessBoard[col - 1][row - 2]);
        }

        if (!chessBoard[col + 1][row - 2].isOccupiedTile() || chessBoard[col + 1][row - 2].getPiece().getAllegiance() != allegiance && (col + 1 < 8 && row - 2 >= 0)) {
            legalMoves.add(chessBoard[col + 1][row - 2]);
        }

        if (!chessBoard[col - 2][row - 1].isOccupiedTile() || chessBoard[col - 2][row - 1].getPiece().getAllegiance() != allegiance && (col - 2 >= 0 && row - 1 >= 0)) {
            legalMoves.add(chessBoard[col - 2][row - 1]);
        }

        if (!chessBoard[col + 2][row - 1].isOccupiedTile() || chessBoard[col + 2][row - 1].getPiece().getAllegiance() != allegiance && (col + 2 < 8 && row - 1 >= 0)) {
            legalMoves.add(chessBoard[col + 2][row - 1]);
        }

        if (!chessBoard[col + 2][row + 1].isOccupiedTile() || chessBoard[col + 2][row + 1].getPiece().getAllegiance() != allegiance &&  (col + 2 < 8 && row + 1 < 8)) {
            legalMoves.add(chessBoard[col + 2][row + 1]);
        }

        if (!chessBoard[col - 2][row + 1].isOccupiedTile() || chessBoard[col - 2][row + 1].getPiece().getAllegiance() != allegiance && (col - 2 >= 0 && row + 1 < 8)) {
            legalMoves.add(chessBoard[col - 2][row + 1]);
        }

        if (!chessBoard[col + 1][row + 2].isOccupiedTile() || chessBoard[col + 1][row + 2].getPiece().getAllegiance() != allegiance && (col + 1 < 8 && row + 2 < 8)) {
            legalMoves.add(chessBoard[col + 1][row + 2]);
        }

        if (!chessBoard[col - 1][row + 2].isOccupiedTile() || chessBoard[col - 1][row + 2].getPiece().getAllegiance() != allegiance && (col - 1 >= 0 && row + 2 < 8)) {
            legalMoves.add(chessBoard[col - 1][row + 2]);
        }

        return legalMoves;
    }
}
