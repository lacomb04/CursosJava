package br.com.bytbank.banco.modelo;

public class GuardadordeReferencias {
	private Object[] referencias;
	private int posicaoLivre;
	
	public GuardadordeReferencias() {
		this.referencias = new Object[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Object ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeselementos() {
		// TODO Auto-generated method stub
		return this.posicaoLivre;
	}
	
	public Object getReferencias(int posicao) {
		return referencias[posicao];
	}
	
	
	
}
