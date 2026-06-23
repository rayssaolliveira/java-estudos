package List;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // Atributo

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));

    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
            tarefaList.removeAll(tarefasParaRemover);
        }
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {

        // Testando a lista de tarefas

        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("o número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Estudar Java Collections");
        listaTarefa.adicionarTarefa("Estudar Java POO");
        listaTarefa.adicionarTarefa("Estudar API");

        System.out.println("o número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        // Obtendo descrição das Tarefas

        listaTarefa.obterDescricoesTarefas();

        // Excluindo Tarefas

        listaTarefa.removerTarefa("Estudar Java POO");
        System.out.println("o número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

    }
}
