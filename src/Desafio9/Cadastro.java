package Desafio9;

import java.util.*;

public class Cadastro {

	private List<Usuarios> usuarios = new ArrayList<>(); // Use ArrayList para permitir adições

	public boolean Cadastrar() {
		System.out.println("\nSistema cadastro!");
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		while (true) {
			System.out.println("Digite o nome de usuário: (deve ter no mínimo 5 caracteres.)");
			String inputUsername = entrada.nextLine();

			System.out.println("Digite a senha: (ter no mínimo 5 caracteres.)");
			String inputPassword = entrada.nextLine();

			if (inputUsername == null || inputUsername.trim().isEmpty() || inputPassword == null
					|| inputPassword.trim().isEmpty()) {

				System.out.println("Nome de usuário devem ter no mínimo 5 caracteres.");
				continue;
			}

			if (inputUsername.length() < 5 || inputPassword.length() < 5) {
				System.out.println("senha ou usuário deve ter no mínimo 5 caracteres.");
				continue;
			}

			usuarios.add(new Usuarios(inputUsername, inputPassword));
			System.out.println("Cadastro concluído com sucesso!\n");
			break;
		}

		return true;
	}

	public List<Usuarios> getUsuarios() {
		return usuarios;
	}
}
