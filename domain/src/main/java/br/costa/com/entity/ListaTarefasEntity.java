package br.costa.com.entity;

import br.costa.com.entity.tarefaEnum.TarefaEnum;

import java.util.List;

public class ListaTarefasEntity {

    String nome;
    String descricao;
    TarefaEnum tarefaEnum;

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public TarefaEnum getTarefaEnum() {
        return tarefaEnum;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public void setTarefaEnum(TarefaEnum tarefaEnum) {
        this.tarefaEnum = tarefaEnum;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ListaTarefasEntity(String nome, TarefaEnum tarefaEnum, String descricao) {
        this.nome = nome;
        this.tarefaEnum = tarefaEnum;
        this.descricao = descricao;
    }
}
