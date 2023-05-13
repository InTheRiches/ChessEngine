public class ChessBoard {
    private String[][] board = new String[8][8];

    public ChessBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = " ";
            }
        }

        for (int i = 0; i < 8; i++) {
            board[1][i] = "P";
            board[6][i] = "P";
        }

        board[0][0] = "R";
        board[0][1] = "N";
        board[0][2] = "B";
        board[0][3] = "Q";
        board[0][4] = "K";
        board[0][5] = "B";
        board[0][6] = "N";
        board[0][7] = "R";

        board[7][0] = "R";
        board[7][1] = "N";
        board[7][2] = "B";
        board[7][3] = "Q";
        board[7][4] = "K";
        board[7][5] = "B";
        board[7][6] = "N";
        board[7][7] = "R";
    }

    public boolean 

    public String toFEN() {
        String fen = "";
        for (int i = 0; i < 8; i++) {
            int empty = 0;
            for (int j = 0; j < 8; j++) {
                if (board[i][j].equals(" ")) {
                    empty++;
                } else {
                    if (empty > 0) {
                        fen += empty;
                        empty = 0;
                    }
                    fen += board[i][j];
                }
            }
            if (empty > 0) {
                fen += empty;
            }
            if (i < 7) {
                fen += "/";
            }
        }
        return fen;
    }
}