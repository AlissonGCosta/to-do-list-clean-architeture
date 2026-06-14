package br.costa.com.application.usecaseimpl;

import br.costa.com.entity.TarefaEntity;
import br.costa.com.useCase.CreateTarefaUseCase;


public class CreateTarefaUseCaseImpl implements CreateTarefaUseCase {

    private final AdcionarListaTarefaUseCaseImpl ad;

    public CreateTarefaUseCaseImpl(AdcionarListaTarefaUseCaseImpl ad) {
        this.ad = ad;
    }


    @Override
    public TarefaEntity create(TarefaEntity tarefa) {

       ad.create(tarefa);

        return tarefa;

    }





}
