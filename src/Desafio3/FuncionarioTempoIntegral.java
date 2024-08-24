package Desafio3;

public class FuncionarioTempoIntegral extends Funcionario {

	private String beneficios;
	
	FuncionarioTempoIntegral(String nome, double salario, String beneficios){
		super(nome, salario);
		this.beneficios = beneficios;
	}

	public String getBeneficios() {
		return beneficios;
	}

	@Override
	double calcularSalarioAnual() {
		return (salario * 12) * 1.10;
	}
}
