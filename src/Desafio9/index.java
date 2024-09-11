package Desafio9;

import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Cadastro cadastro = new Cadastro();
		Login login = new Login(cadastro);

		System.out.println("Digite 'login' ou 'cadastrar' para criar sua conta.");

		String sistema = entrada.nextLine();

		while (true) {
			if (sistema.equalsIgnoreCase("login")) {
				System.out.println("Iniciando o login...");
				login.Logar();
				break;
			} else if (sistema.equalsIgnoreCase("cadastrar")) {
				System.out.println("Iniciando o cadastro...");
				if (cadastro.Cadastrar()) {
					System.out.println("Agora acesse sua conta!");
					login.Logar();
					break;
				} else {
					System.out.println("Falha no cadastro.");
					break;
				}
			} else {
				System.out.println("Comando não reconhecido.");
				sistema = entrada.nextLine(); // Continuar pedindo entrada;
				break;
			}
		}
		
		entrada.close();
	}
}
