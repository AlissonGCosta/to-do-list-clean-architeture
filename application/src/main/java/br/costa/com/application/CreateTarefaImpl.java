package br.costa.com.application;

import br.costa.com.entity.TarefaEntity;
import br.costa.com.useCase.CreateTarefa;

public class CreateTarefaImpl implements CreateTarefa {

    @Override
    public TarefaEntity create(TarefaEntity tarefa) {

        tarefa.setNome(tarefa.getNome());
        tarefa.setDescricao(tarefa.getDescricao());

        System.out.println(tarefa.getNome());
        System.out.println(tarefa.getDescricao());

        return tarefa;

    }





}
