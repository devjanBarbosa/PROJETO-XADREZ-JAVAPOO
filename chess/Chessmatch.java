package chess;

import TabuleiroJogo.Tabuleiro;

public class Chessmatch {

    private Tabuleiro tabuleiro;

    public Chessmatch() {
        tabuleiro = new Tabuleiro(8, 8);

    }

    public chesspiece[][] getPieces() {
        chesspiece[][] mat = new chesspiece[tabuleiro.getLinha()][tabuleiro.getColuna()];

        for (int i = 0; i < tabuleiro.getLinha(); i++) {
            for (int j = 0; j < tabuleiro.getColuna(); j++) {
                mat[i][j] = (chesspiece) tabuleiro.pecas[i][j];

            }
        }
        return mat;
    }

}
