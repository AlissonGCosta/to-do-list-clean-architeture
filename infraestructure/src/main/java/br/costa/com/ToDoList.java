package br.costa.com;

import br.costa.com.Dto.request.TarefaDto;
import br.costa.com.application.CreateTarefaImpl;
import br.costa.com.entity.TarefaEntity;
import br.costa.com.mapper.TarefaMapper;

import java.util.Scanner;


public class ToDoList {

    static void main() {

        CreateTarefaImpl createTarefa = new CreateTarefaImpl();
        TarefaDto tarefaDto = new TarefaDto();
        TarefaMapper tarefaMapper = new TarefaMapper();

        Scanner sc = new Scanner(System.in);

        String continuar = "S";

        while (continuar.equalsIgnoreCase("s")) {



            System.out.println("Digite o nome do tarefa: ");
            tarefaDto.setNome(sc.nextLine()) ;

            System.out.println("Digite o descricao do tarefa: ");
            tarefaDto.setDescricao(sc.nextLine());

            createTarefa.create(tarefaMapper.toTarefaEntity(tarefaDto));

            System.out.println("deseja continuar? (S/N)");
            continuar = sc.next();
            sc.nextLine();

            if(continuar.equalsIgnoreCase("N")) {
               continuar = "N";
            }
        }


    }
}
