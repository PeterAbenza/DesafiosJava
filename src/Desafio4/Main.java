package Desafio4;

public class Main {

	public static void main(String[] args) {

		Carro carro = new Carro("HB20", "Hyundai", 2024, 4);
		Caminhao caminhao = new Caminhao("Volvo", "Volvo FMX", 2010, 1000.00);

		caminhao.exibirDetalhes();
		carro.exibirDetalhes();
	}
}
