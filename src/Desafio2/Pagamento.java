package Desafio2;

public abstract class Pagamento {
	
	private double valor;
	
	public Pagamento(double valor) {
        this.valor = valor;
    }

	public double getValor() {
		return valor;
	}
	
	abstract void processar(); // - Método abstrato que será implementado pelas subclasses
}
