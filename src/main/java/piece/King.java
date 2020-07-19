package piece;

import board.Tile;

import java.util.LinkedList;
import java.util.List;

public class King extends Piece {

    public King(Allegiance allegiance, int col, int row) {
        super(allegiance,col,row);
    }

    @Override
    public List<Tile> legalMoves(Tile[][] chessBoard) {

        List<Tile> legalMoves = new LinkedList<Tile>();

        for (int y = row - 1; y <= row + 1 && y < 8 && y >= 0; y++) {

            for (int x = col - 1; x <= col + 1 && x < 8 && x >= 0; x++) {

                if (!chessBoard[x][y].isOccupiedTile() || chessBoard[x][x].getPiece().getAllegiance() != allegiance) {

                    legalMoves.add(chessBoard[x][y]);

                }

            }

        }

        return legalMoves;

    }

}
