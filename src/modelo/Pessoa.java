package modelo;
public class Pessoa{
	private String nome, cpf;
	private Data dtNasc;
	public Pessoa(String n, String cpf, Data d){
		nome = n;
		this.cpf = cpf;
		dtNasc = d;	
	}
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
	public Data getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(Data dtNasc) {
		this.dtNasc = dtNasc;
	}
	public String toString(){
		return ("\nNome: " +nome+ "\nCPF: " + cpf +
		     "\nData de nascimento: "+ dtNasc+"\n");
	}

}
