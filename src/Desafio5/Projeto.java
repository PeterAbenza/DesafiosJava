package Desafio5;

import java.util.ArrayList;

public class Projeto {

	private String nome;
	private ArrayList<Tarefa> Tarefas;

	Projeto(String nome) {
		this.nome = nome;
		Tarefas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void addTarefa(Tarefa tarefa) {
		Tarefas.add(tarefa);
	}

	public ArrayList<Tarefa> getTarefa() {
		return Tarefas;
	}

	public void setTarefa(ArrayList<Tarefa> tarefa) {
		Tarefas = tarefa;
	}

	public void listarTarefas() {
		for (Tarefa tarefa : Tarefas) {
			System.out.println(tarefa);
		}
	}
	
	@Override
	public String toString() {
		return String.format("Projeto: %s\nTarefas:\n%s", nome, Tarefas);
	}
}
