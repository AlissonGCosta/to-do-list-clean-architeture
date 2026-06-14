package br.costa.com.application.usecaseimpl;

import br.costa.com.useCase.ListarTarefasUseCase;




public class ListarTarefasUseCaseImpl implements ListarTarefasUseCase {

   private final AdcionarListaTarefaUseCaseImpl adcionarListaTarefaUseCaseImpl;

    public ListarTarefasUseCaseImpl(AdcionarListaTarefaUseCaseImpl adcionarListaTarefaUseCaseImpl) {
        this.adcionarListaTarefaUseCaseImpl = adcionarListaTarefaUseCaseImpl;
    }


    @Override
    public void listarTarefas() {

        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("Listando tarefas ja Adcionadas");

        for (var tarefa : adcionarListaTarefaUseCaseImpl.getTarefas()) {
            System.out.println("++++++++++++++++++++++++++++");
            System.out.println("Nome: " + tarefa.getNome()
                    + " | Descrição: " + tarefa.getDescricao()
                    + "| Estado: " + tarefa.getTarefaEnum());

        }

    }
}
