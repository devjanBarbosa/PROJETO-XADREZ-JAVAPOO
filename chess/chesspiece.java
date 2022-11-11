package chess;

import TabuleiroJogo.Peca;
import TabuleiroJogo.Tabuleiro;

public class chesspiece extends Peca {

    private Color color;

    public chesspiece(Tabuleiro tabuleiro, Color color) {
        super(tabuleiro);
        this.color = color;

    }
}
