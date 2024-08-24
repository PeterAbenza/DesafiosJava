package Desafio3;

public class Main {

	public static void main(String[] args) {

		FuncionarioTempoIntegral funcionarioPeter = new FuncionarioTempoIntegral("Peter Abenza", 3550.00,
				"Vale Alimentação");
		
		FuncionarioTemporario funcionarioJoão = new FuncionarioTemporario("João", 2330.00, 3);
		
		System.out.println("Salário Anual de João: " + funcionarioJoão.calcularSalarioAnual());
		System.out.println("Salário Anual de Peter: " + funcionarioPeter.calcularSalarioAnual());
	}
}