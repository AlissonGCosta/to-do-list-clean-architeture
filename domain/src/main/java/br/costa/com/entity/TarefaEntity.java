package br.costa.com.entity;

import br.costa.com.entity.tarefaEnum.TarefaEnum;

public class TarefaEntity {
    private String nome;
    private String descricao;
    private TarefaEnum tarefaEnum;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TarefaEnum getTarefaEnum() {
        return tarefaEnum;
    }



    public TarefaEntity(String descricao, String nome) {
        this.descricao = descricao;
        this.nome = nome;
        this.tarefaEnum = TarefaEnum.ABERTA;
    }

    public TarefaEntity() {
    }
}
