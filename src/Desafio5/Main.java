package Desafio5;

public class Main {

	public static void main(String[] args) {
		
		GerenciadorDeTarefas gerenciadorDeTarefas = new GerenciadorDeTarefas();

		Projeto limparCasa = new Projeto("Limpar Casa");
		Tarefa tarefaCasa = new Tarefa("Limpar cozinha", Prioridade.MEDIA, Status.EM_ANDAMENTO, "Hoje!");
		Tarefa tarefaCasa2 = new Tarefa("Limpar Sala", Prioridade.ALTA, Status.EM_ANDAMENTO, "Hoje!");
		
		limparCasa.addTarefa(tarefaCasa);
		limparCasa.addTarefa(tarefaCasa2);
		
		Projeto limparFora = new Projeto("Limpar fora");
		Tarefa tarefaFora = new Tarefa("Limpar garagem", Prioridade.ALTA, Status.EM_ANDAMENTO, "Hoje!");
		Tarefa tarefaFora2 = new Tarefa("Limpar casa do cachorro", Prioridade.BAIXA, Status.CONCLUIDA, "Hoje!");
		
		limparFora.addTarefa(tarefaFora);
		limparFora.addTarefa(tarefaFora2);
		
		limparFora.listarTarefas();
		
		gerenciadorDeTarefas.addProjeto(limparCasa);
		gerenciadorDeTarefas.addProjeto(limparFora);
		
		gerenciadorDeTarefas.listaProjetos();
	}
}
