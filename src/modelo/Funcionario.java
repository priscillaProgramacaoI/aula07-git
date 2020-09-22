package modelo;
public class Funcionario extends Pessoa{
	private Data dtAdm;
	private float salario;	
	public Funcionario(String nome, String cpf, Data dtN, Data adm, float s){
		super(nome, cpf, dtN);
		dtAdm = adm;
		salario = s;
	}
	public Funcionario(Pessoa p, Data adm, float sal ) {
		super(p.getNome(),p.getCpf(),p.getDtNasc());
		dtAdm = adm;
		salario = sal;
	}
	public Data getDtAdm() {
		return dtAdm;
	}
	public void setDtAdm(Data dtAdm) {
		this.dtAdm = dtAdm;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String toString(){
		return (super.toString() + "Data de admissão: " + dtAdm + "\nSalário: " + salario); 
	} 

}

