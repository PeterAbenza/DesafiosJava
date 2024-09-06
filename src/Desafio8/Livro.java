package Desafio8;

public class Livro {

	private String titulo;
	private String autor;
	private int anoPublicacao;
	private Genero genero;
	private int paginas;
	private double avaliacao;

	public Livro(String titulo, String autor, int anoPublicacao, Genero genero, int paginas, double avaliacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.genero = genero;
		this.paginas = paginas;
		this.avaliacao = avaliacao;
	}
	
	@Override
	public String toString() {
		return titulo;
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

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}
}
