package br.com.bytbank.banco.test;

import br.com.bytbank.banco.modelo.CalculadorDeImposto;
import br.com.bytbank.banco.modelo.Cliente;
import br.com.bytbank.banco.modelo.ContaCorrente;
import br.com.bytbank.banco.modelo.ContaPoupanca;
import br.com.bytbank.banco.modelo.SeguroDeVida;
import br.com.bytbank.banco.modelo.Conta;

public class TesteArrayReferencia {

	public static void main(String[] args) {
		Cliente cli1 = new Cliente();
		cli1.setNome("Victor lacomb");
		cli1.setCpf("12248474660");
		cli1.setProfissao("Programador");
		
		Object[] contas = new Object[5];
		ContaCorrente cc1 = new ContaCorrente(111, 222);
		ContaPoupanca cc2 = new ContaPoupanca(321, 444);
		cc1.setTitular(cli1);
		contas[0] = cc1;
		contas[1] = cc2;
		contas[2] = cli1;
		
		System.out.println(contas[2]);
		System.out.println(contas.length);
	

	}

}
