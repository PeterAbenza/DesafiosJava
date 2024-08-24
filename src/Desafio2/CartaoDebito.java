package Desafio2;

public class CartaoDebito extends Pagamento {
	private String numeroCartao;
	private String nomeTitular;
	
	public CartaoDebito(double valor, String numeroCartao, String nomeTitular) {
        super(valor);
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
    }

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	@Override
	void processar() {
		System.out.println("Processando pagamento com Cartão de Débito:");
        System.out.println("Número do cartão: " + numeroCartao);
        System.out.println("Nome do titular: " + nomeTitular);
        System.out.println("Valor: " + getValor());
	}
}
