package chesspieces;

import TabuleiroJogo.Tabuleiro;
import chess.Color;
import chess.chesspiece;

public class Rei extends chesspiece {

    public Rei(Tabuleiro tabuleiro, Color color){
        super(tabuleiro,color);
    }

    @Override
    public String toString(){
        return "R";
    }

}

