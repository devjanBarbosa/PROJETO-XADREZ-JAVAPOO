package chess;

import TabuleiroJogo.Posicao;
import TabuleiroJogo.Tabuleiro;
import chesspieces.Rei;
import chesspieces.Torre;

public class Chessmatch {

    private Tabuleiro tabuleiro;

    public Chessmatch() {
        tabuleiro = new Tabuleiro(8, 8);
        inisetup();

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

    private void inisetup(){
        tabuleiro.colocarpeca(new Torre(tabuleiro, Color.WHITE), new Posicao(3, 0));
        tabuleiro.colocarpeca(new Rei(tabuleiro, Color.WHITE), new Posicao(3,0));
    }

}
