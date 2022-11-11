package TabuleiroJogo;

public class Tabuleiro {
	private int coluna;
	private int linha;
	private Peca[][] pecas;

	public Tabuleiro(int linha, Peca[][] pecas) {
		super();
		this.linha = linha;
		this.coluna = coluna;
		pecas = new Peca[linha][coluna];
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

}
