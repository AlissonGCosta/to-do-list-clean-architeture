package br.costa.com.application.usecaseimpl;

import br.costa.com.entity.TarefaEntity;
import br.costa.com.useCase.AdcionarListaTarefaUseCase;

import java.util.ArrayList;
import java.util.List;

public class AdcionarListaTarefaUseCaseImpl implements AdcionarListaTarefaUseCase {


    private List<TarefaEntity> tarefas = new ArrayList<>();


    @Override
    public TarefaEntity create(TarefaEntity tarefa) {


        tarefas.add(tarefa);

        return tarefa;
    }

    public List<TarefaEntity> getTarefas() {

        return tarefas;
    }
}
