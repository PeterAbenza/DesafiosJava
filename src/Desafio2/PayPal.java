package Desafio2;

public class PayPal extends Pagamento {

	private String email;
	
	public PayPal(double valor, String email) {
		super(valor);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	@Override
	void processar() {
		System.out.println("Processando pagamento com PayPal:");
        System.out.println("Número do cartão: " + email);
        System.out.println("Valor: " + getValor());
	}
}
