package br.costa.com.application;

import br.costa.com.entity.ListaTarefasEntity;
import br.costa.com.entity.tarefaEnum.TarefaEnum;
import br.costa.com.useCase.AdcionarListaTarefa;

import java.util.ArrayList;
import java.util.List;

public class AdcionarListaTarefaImpl implements AdcionarListaTarefa {


    List<ListaTarefasEntity> tarefas = new ArrayList<>();

    @Override
    public ListaTarefasEntity create(String nome, String descricao, TarefaEnum tarefaEnum) {

        ListaTarefasEntity listaTarefa = new ListaTarefasEntity( nome, tarefaEnum, descricao);

        this.tarefas.add(listaTarefa);

       for(ListaTarefasEntity listaTarefaEntity : tarefas) {
           System.out.println(listaTarefaEntity.getNome() + " - " + listaTarefaEntity.getDescricao() + " - " + listaTarefaEntity.
                   getTarefaEnum());
       }
        return listaTarefa;
    }
}
