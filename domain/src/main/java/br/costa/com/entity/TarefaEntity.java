package br.costa.com.entity;

import br.costa.com.entity.tarefaEnum.TarefaEnum;

import java.util.ArrayList;
import java.util.List;

public class TarefaEntity {
    private String nome;
    private String descricao;
    private TarefaEnum tarefaEnum;
    private List<TarefaEntity> tarefas = new ArrayList<>();


    public List<TarefaEntity> getTarefas() {
        return tarefas;
    }

    public void adicionarTarefa(TarefaEntity tarefa) {
        this.tarefas.add(tarefa);
    }

    public void setTarefas(List<TarefaEntity> tarefas) {
        this.tarefas = tarefas;
    }

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



    public TarefaEntity(String nome, String descricao) {
        this.descricao = descricao;
        this.nome = nome;
        this.tarefaEnum = TarefaEnum.ABERTA;
    }

    public TarefaEntity() {
    }
}
