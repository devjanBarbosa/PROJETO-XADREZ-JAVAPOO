package aplicattion;

import javax.swing.event.SwingPropertyChangeSupport;

import TabuleiroJogo.Posicao;
import chess.Chessmatch;

public class Programa {

	public static void main(String[] args) {

		Chessmatch chessmatch = new Chessmatch();
		UI.printTabuleiro(chessmatch.getPieces());

	}

}
