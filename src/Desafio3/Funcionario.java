package Desafio3;

public abstract class Funcionario {

	String nome;
	double salario;
	
	Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}
	
	abstract double calcularSalarioAnual();
}
