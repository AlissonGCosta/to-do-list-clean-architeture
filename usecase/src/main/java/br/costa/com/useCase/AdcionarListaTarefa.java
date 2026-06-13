package br.costa.com.useCase;

import br.costa.com.entity.ListaTarefasEntity;
import br.costa.com.entity.TarefaEntity;
import br.costa.com.entity.tarefaEnum.TarefaEnum;

public interface AdcionarListaTarefa {

    ListaTarefasEntity create(String Nome, String Descricao, TarefaEnum tarefaEnum);


}
