package br.com.bytbank.banco.modelo;
/**Classe com modelo de Cliente com Set e Get dados cliente.
 * @author Victor Lacomb 
 */

public class Cliente {



	private String nome;
    private String cpf;
    private String profissao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    @Override
    	public String toString() {
    		// TODO Auto-generated method stub
    		return "Cliente Nome: " + this.getNome()  + " CPF: " + this.getCpf();
    	}


}
