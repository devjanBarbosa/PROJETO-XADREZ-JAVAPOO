package TabuleiroJogo;

public class Peca {
	protected Posicao posicao;
	private Tabuleiro tabuleiro;

	public void peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

}
