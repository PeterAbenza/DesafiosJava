package Desafio4;

public class Carro extends Veiculo {

	private int quantidadePortas;
	
	Carro(String marca, String modelo, int ano, int quantidadePortas) {
		super(marca, modelo, ano);
		this.quantidadePortas = quantidadePortas;
	}
	
	public int getQuantidadePortas() {
		return quantidadePortas;
	}
	
	public void setQuantidadePortas(int quantidadePortas) { // set é obrigado a retornar void;
		this.quantidadePortas = quantidadePortas;
	}
	
	@Override
	void exibirDetalhes() {
		System.out.println("Marca: " + getMarca() + " Modelo: " + getModelo() 
		                   + " Ano: " + getAno() + " Portas: " + quantidadePortas);
	}
}
