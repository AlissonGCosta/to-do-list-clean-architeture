package br.costa.com.mapper;

import br.costa.com.Dto.request.TarefaDto;
import br.costa.com.entity.TarefaEntity;


public class TarefaMapper {
        public TarefaEntity toTarefaEntity(TarefaDto tarefaDto){

            return new TarefaEntity(
                    tarefaDto.getNome(),
                    tarefaDto.getDescricao()
            );

        }
}
