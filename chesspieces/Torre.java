package chesspieces;

import TabuleiroJogo.Tabuleiro;
import chess.Color;
import chess.chesspiece;

public class Torre extends chesspiece {

    public Torre(Tabuleiro tabuleiro, Color color){
        super(tabuleiro,color);
    }

    @Override
    public String toString(){
        return "T";
    }

}

