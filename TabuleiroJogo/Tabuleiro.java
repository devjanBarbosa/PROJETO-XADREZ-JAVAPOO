package TabuleiroJogo;

import javax.swing.text.Position;

public class Tabuleiro {
	private int coluna;
	private int linha;
	public Peca[][] pecas;

	public Tabuleiro(int linha, int coluna) {
		if(linha < 1 || coluna < 1){
			throw new TabuleiroException("ERRO AO CRIAR O TABULEIRO: DEVE TER PELO MENOS 1 LINHA E 1 COLUNA");
		}
		this.linha = linha;
		this.coluna = coluna;
		pecas = new Peca[linha][coluna];
	}

	public int getColuna() {
		return coluna;
	}


	public int getLinha() {
		return linha;
	}

	public Peca peca(int linha, int coluna){
		if(!posicaoexiste(linha, coluna)){
			throw new TabuleiroException("Posicao invalida");
		}
		return pecas[linha][coluna];
	}

	public Peca peca(Posicao posicao){
		if(!posicaoexiste(posicao)){
			throw new TabuleiroException("Posicao invalida");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}

	public void colocarpeca(Peca peca, Posicao posicao){
		if (tempeca(posicao)){
			throw new TabuleiroException("TEM UMA PECA AKI");
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = 	posicao;
	}
	
	private boolean posicaoexiste(int linha, int coluna){
		return linha >= 0 && linha < linha && coluna >= 0 && coluna < coluna;
	}

	public boolean posicaoexiste(Posicao posicao){
		return posicaoexiste(posicao.getLinha(), posicao.getColuna());
	}

	public boolean tempeca(Posicao posicao){
		if(!posicaoexiste(posicao)){
			throw new TabuleiroException("Posicao inexistente");
		}
		return peca(posicao) != null;
	}

}
