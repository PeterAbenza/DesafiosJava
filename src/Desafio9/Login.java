package Desafio9;

import java.util.*;

public class Login {

	Usuarios usuarios = new Usuarios();
	Cadastro cadastro;
	
	public Login(Cadastro cadastro){
		this.cadastro = cadastro;
	}

	public boolean Logar() {
		Scanner entrada = new Scanner(System.in);

		while (true) {
			System.out.println("\nLogin cliente!");
			System.out.println("usuário:");
			String inputUsername = entrada.nextLine();

			System.out.println("senha:");
			String inputPassword = entrada.nextLine();
			
			boolean usuarioEncontrado = false;

			for (Usuarios usuario : cadastro.getUsuarios()) {
                if (usuario.getUsername().equals(inputUsername) && usuario.getPassword().equals(inputPassword)) {
                    System.out.println("Login realizado com sucesso!\n");
                    usuarioEncontrado = true;
                    break;
                }
            }
			
			if (usuarioEncontrado) {
                entrada.close();
                return true;
            } else {
                System.out.println("Usuário/senha incorretos");
                System.out.println("Digite 'cadastrar' para criar sua conta.");

                String opcao = entrada.nextLine();
                if (opcao.equalsIgnoreCase("cadastrar")) {
                    cadastro.Cadastrar();
                }
            }
		}
	}
}
