package br.costa.com.application;

import br.costa.com.entity.TarefaEntity;
import br.costa.com.useCase.AdcionarListaTarefa;
import br.costa.com.useCase.CreateTarefa;

public class CreateTarefaImpl implements CreateTarefa {

    private final AdcionarListaTarefaImpl ad = new AdcionarListaTarefaImpl();

    @Override
    public TarefaEntity create(TarefaEntity tarefa) {


       ad.create(tarefa.getNome(), tarefa.getDescricao(),  tarefa.getTarefaEnum());


        return tarefa;

    }





}
