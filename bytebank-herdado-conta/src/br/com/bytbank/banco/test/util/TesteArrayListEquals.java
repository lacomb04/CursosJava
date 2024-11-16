package br.com.bytbank.banco.test.util;

import java.util.ArrayList;

import br.com.bytbank.banco.modelo.Conta;
import br.com.bytbank.banco.modelo.ContaCorrente;
import br.com.bytbank.banco.modelo.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {
	ArrayList<Conta> lista = new ArrayList<Conta>();
		
	
		
		Conta cc = new ContaCorrente(11, 33);
		Conta cp = new ContaPoupanca(22,44);
		Conta cp1 = new ContaPoupanca(22,44);
		lista.add(cc);
		lista.add(cp);
		lista.remove(0);
		
		
		
		System.out.println(lista.contains(cp1));
		for(Object Conta : lista) {
			System.out.println(Conta);
		}
	}

}
