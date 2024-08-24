package Desafio2;

public class Main {
	
	public static void main(String[] args) {
		
		CartaoCredito pagamentoCredito = new CartaoCredito(2300.99, "43243242343", "Peter Abenza");
		CartaoDebito pagamentoDebito = new CartaoDebito(1640.99, "6746747646", "Carol Abenza");
		PayPal pagamentoPayPal = new PayPal(343.99, "Peter@gmail.com");
		
		pagamentoCredito.processar();
		pagamentoDebito.processar();
		pagamentoPayPal.processar();
	}
}
