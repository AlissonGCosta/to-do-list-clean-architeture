package br.costa.com.mapper;

import br.costa.com.Dto.request.TarefaDto;
import br.costa.com.entity.TarefaEntity;
import br.costa.com.entity.tarefaEnum.TarefaEnum;

public class TarefaMapper {
        public TarefaEntity toTarefaEntity(TarefaDto tarefaDto){

            return new TarefaEntity(
                    tarefaDto.getNome(),
                    tarefaDto.getDescricao()
            );

        }
}
