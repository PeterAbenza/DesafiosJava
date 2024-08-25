package Desafio5;

import java.util.ArrayList;

public class GerenciadorDeTarefas {
	
	private ArrayList<Projeto> Projeto;
	
	public GerenciadorDeTarefas(){
		Projeto = new ArrayList<>();
	}
	
	public ArrayList<Projeto> getProjeto() {
		return Projeto;
	}

	public void setProjeto(ArrayList<Projeto> projeto) {
		Projeto = projeto;
	}
	
	public void addProjeto(Projeto projeto){
		Projeto.add(projeto);
	}
	
	public void removeProjeto(String projeto){
		Projeto.removeIf(Projeto -> Projeto.getNome().equalsIgnoreCase(projeto));
	}
	
    public void listaProjetos(){
    	for (Projeto projeto : Projeto) {
			System.out.println(projeto);
		}
	}

}
