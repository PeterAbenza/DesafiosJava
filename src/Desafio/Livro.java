package Desafio;

public class Livro {

	private String titulo;
	private String autor;
	private int anoPublicacao;
	private boolean disponivel; // - Indica se o livro está disponível para empréstimo;

	public Livro(String titulo, String autor, int anoPublicacao, boolean disponivel) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.disponivel = disponivel;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public void emprestar() {
		if (disponivel) {
			disponivel = false;
		} else {
			System.out.println("O livro já está emprestado.");
		}
	}

	public void devolver() {
		disponivel = true;
	}
	
	@Override
    public String toString() {
        return String.format("Título: %s, Autor: %s, Ano de Publicação: %d, Disponível: %s",
                titulo, autor, anoPublicacao, disponivel ? "Sim" : "Não");
    }
}
