package piece;

import board.ChessBoard;
import board.Tile;

import java.util.LinkedList;
import java.util.List;

public abstract class Piece {

    protected Allegiance allegiance;
    protected int col;
    protected int row;

    public Piece(Allegiance allegiance, int col, int row) {
        this.allegiance = allegiance;
        this.col = col;
        this.row = row;
    }

    public Allegiance getAllegiance() {
        return allegiance;
    }

    public abstract List<Tile> legalMoves(Tile[][] chessBoard);

    public  List<Tile> legalMovesLeftUp(Tile[][] chessBoard) {

        List<Tile> legalMovesLeftUp = new LinkedList<Tile>();

        int row1 = row;
        int col1 = col;
        while (row1 >= 1 || col1 >= 1) {

            row1 = row1 - 1;
            col1 = col1 - 1;
            if (!chessBoard[col1][row1].isOccupiedTile()) {
                legalMovesLeftUp.add(chessBoard[col1][row1]);
            } else if (chessBoard[col1][row1].getPiece().getAllegiance() != allegiance) {
                legalMovesLeftUp.add(chessBoard[col1][row1]);
                break;
            } else break;;
        }

        return legalMovesLeftUp;
    }

    public  List<Tile> legalMovesRightUp(Tile[][] chessBoard) {

        List<Tile> legalMovesRightUp = new LinkedList<Tile>();

        int row1 = row;
        int col1 = col;
        while (row1 >= 1 || col1 < 7) {

            row1 = row1 - 1;
            col1 = col1 + 1;
            if (!chessBoard[col1][row1].isOccupiedTile()) {
                legalMovesRightUp.add(chessBoard[col1][row1]);
            } else if (chessBoard[col1][row1].getPiece().getAllegiance() != allegiance) {
                legalMovesRightUp.add(chessBoard[col1][row1]);
                break;
            } else break;
        }

        return legalMovesRightUp;
    }

    public  List<Tile> legalMovesRightDown(Tile[][] chessBoard) {

        List<Tile> legalMovesRightDown = new LinkedList<Tile>();

        int row1 = row;
        int col1 = col;
        while (row1 < 7 || col1 < 7) {

            row1 = row1 + 1;
            col1 = col1 + 1;
            if (!chessBoard[col1][row1].isOccupiedTile()) {

                legalMovesRightDown.add(chessBoard[col1][row1]);
            } else if (chessBoard[col1][row1].getPiece().getAllegiance() != allegiance) {

                legalMovesRightDown.add(chessBoard[col1][row1]);
                break;
            } else break;
        }

        return legalMovesRightDown;

    }

    public  List<Tile> legalMovesLeftDown(Tile[][] chessBoard) {

        List<Tile> legalMovesLeftDown = new LinkedList<Tile>();

        int row1 = row;
        int col1 = col;
        while (row1 < 7 || col1 >= 1) {

            row1 = row1 + 1;
            col1 = col1 - 1;
            if (!chessBoard[col1][row1].isOccupiedTile()) {

                legalMovesLeftDown.add(chessBoard[col1][row1]);
            }

            else if (chessBoard[col1][row1].getPiece().getAllegiance() != allegiance) {

                legalMovesLeftDown.add(chessBoard[col1][row1]);
                break;
            }
        }

        return legalMovesLeftDown;
    }

    public List<Tile> legalMovesLeft(Tile[][] chessBoard) {

        List<Tile> legalMovesLeft = new LinkedList<Tile>();

        int col1 = col;

        while (col1 >= 1) {

            col1 = col1 - 1;
            if(!chessBoard[col1][row].isOccupiedTile()) {

                legalMovesLeft.add(chessBoard[col1][row]);
            } else if (chessBoard[col1][row].getPiece().getAllegiance() != allegiance) {
                legalMovesLeft.add(chessBoard[col1][row]);
                break;
            } else break;
        }
        return legalMovesLeft;
    }

    public List<Tile> legalMovesRight(Tile[][] chessBoard) {

        List<Tile> legalMovesRight = new LinkedList<Tile>();

        int col1 = col;

        while (col1 < 7) {

            col1 = col1 + 1;
            if(!chessBoard[col1][row].isOccupiedTile()) {

                legalMovesRight.add(chessBoard[col1][row]);
            } else if (chessBoard[col1][row].getPiece().getAllegiance() != allegiance) {

                legalMovesRight.add(chessBoard[col1][row]);
                break;
            } else break;
        }

        return legalMovesRight;
    }

    public List<Tile> legalMovesUp(Tile[][] chessBoard) {

        List<Tile> legalMovesUp = new LinkedList<Tile>();

        int row1 = row;

        while (row1 >= 1) {

            row1 = row1 - 1;
            if(!chessBoard[col][row1].isOccupiedTile()) {
                legalMovesUp.add(chessBoard[col][row1]);
            } else if (chessBoard[col][row1].getPiece().getAllegiance() != allegiance) {
                legalMovesUp.add(chessBoard[col][row1]);
                break;
            } else break;
        }

        return legalMovesUp;
    }

    public List<Tile> legalMovesDown(Tile[][] chessBoard) {

        List<Tile> legalMovesDown = new LinkedList<Tile>();

        int row1 = row;

        while (row1 < 7) {

            row1 = row1 + 1;
            if(!chessBoard[col][row1].isOccupiedTile()) {
                legalMovesDown.add(chessBoard[col][row1]);
            } else if (chessBoard[col][row1].getPiece().getAllegiance() != allegiance) {

                legalMovesDown.add(chessBoard[col][row1]);
                break;
            } else break;
        }

        return legalMovesDown;
    }

    public void move(List<Tile> legalMoves, Tile[][] move) {
    // iksde
    }

}
