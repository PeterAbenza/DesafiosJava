package Desafio5;

public class Tarefa {

	private String descricao;
	private Prioridade prioridade;
	private Status status;
	private String dataDeVencimento;
	
	Tarefa(String descricao, Prioridade prioridade, Status status, String dataDeVencimento){
		this.descricao = descricao;
		this.prioridade = prioridade;
		this.status = status;
		this.dataDeVencimento = dataDeVencimento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Prioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getDataDeVencimento() {
		return dataDeVencimento;
	}

	public void setDataDeVencimento(String dataDeVencimento) {
		this.dataDeVencimento = dataDeVencimento;
	}

	
	@Override
	public String toString() {
		return "Tarefa [descricao=" + descricao + ", prioridade=" + prioridade + ", status=" + status
				+ ", dataDeVencimento=" + dataDeVencimento + "]";
	}

}
