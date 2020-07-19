package board;

public class ChessBoard {

    private Tile[][] chessBoard;
    public ChessBoard() {

        chessBoard = new Tile[8][8];
        for (int y = 0; y < 8; y++) {


            for (int x =0; x < 8; x++) {
             chessBoard[x][y] = new Tile(x,y);
            }
        }
    }


}
