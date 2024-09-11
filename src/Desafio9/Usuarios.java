package Desafio9;

public class Usuarios {
	private String username;
	private String password;

	public Usuarios(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public Usuarios() {
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
}
