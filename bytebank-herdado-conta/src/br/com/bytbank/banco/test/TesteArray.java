package br.com.bytbank.banco.test;

public class TesteArray {

	public static void main(String[] args) {

	int[] idades = new int[5];
	boolean[] nomes = new boolean[5];
	System.out.println(nomes[0]);
	for(int i = 0; i < idades.length; i++) {
		idades[i] = i*i;
	}
	
	for (int i = 0; i<idades.length; i++) {
		System.out.println(idades[i]);
	}
	
	}

}
