package br.com.bytbank.banco.test;

import br.com.bytbank.banco.modelo.Conta;
import br.com.bytbank.banco.modelo.ContaCorrente;
import br.com.bytbank.banco.modelo.GuardadordeReferencias;

public class TesteGuardadorRef {

	public static void main(String[] args) {
		GuardadordeReferencias guardador = new GuardadordeReferencias();
		
		Conta cc = new ContaCorrente(111, 22);
		
		
		guardador.adiciona(cc);
	
		
		int tamanho = guardador.getQuantidadeselementos();
		System.out.println(tamanho);
		System.out.println(guardador.getReferencias(0));
	}

}
