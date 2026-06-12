package br.costa.com.Dto.request;

import br.costa.com.entity.tarefaEnum.TarefaEnum;

public class TarefaDto {
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

    public void setTarefaEnum(TarefaEnum tarefaEnum) {
        this.tarefaEnum = tarefaEnum;
    }
}
