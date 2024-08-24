package Desafio3;

public class FuncionarioTemporario extends Funcionario {

	private int duracaoContrato;
	
	FuncionarioTemporario(String nome, double salario, int duracaoContrato){
		super(nome, salario);
		this.duracaoContrato = Math.max(duracaoContrato, 1);  // Garantir que a duração seja positiva
	    // duracaoContrato > 0 ? duracaoContrato : 1 como se fosse if e else, condição ? valorSeVerdadeiro : valorSeFalso;
	}

	public int getDuracaoContrato() {
		return duracaoContrato;
	}

	@Override
	double calcularSalarioAnual() {
		return getSalario() * duracaoContrato;
	}
}
