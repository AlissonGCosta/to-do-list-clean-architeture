package br.costa.com;

import br.costa.com.Dto.request.TarefaDto;
import br.costa.com.application.usecaseimpl.AdcionarListaTarefaUseCaseImpl;
import br.costa.com.application.usecaseimpl.CreateTarefaUseCaseImpl;
import br.costa.com.application.usecaseimpl.ListarTarefasUseCaseImpl;
import br.costa.com.mapper.TarefaMapper;


import java.util.Scanner;


public class ToDoList {

    static void main() {

        AdcionarListaTarefaUseCaseImpl banco = new AdcionarListaTarefaUseCaseImpl();

        CreateTarefaUseCaseImpl createTarefaUseCase = new CreateTarefaUseCaseImpl(banco);
        ListarTarefasUseCaseImpl listarTarefasUseCase = new ListarTarefasUseCaseImpl(banco);


        TarefaDto tarefaDto = new TarefaDto();
        TarefaMapper tarefaMapper = new TarefaMapper();


        Scanner sc = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {

            System.out.println("Escolha uma das opções abaixo: " +
                    "\n 1 - Adcionar Tarefas" +
                    "\n 2 - Listar tarefas ja Adcionadas" +
                    "\n 0 - Sair");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    String continuarMenuAdcionar = "S";

                    while (continuarMenuAdcionar.equalsIgnoreCase("s")) {



                        System.out.println("Digite o nome do tarefa: ");
                        tarefaDto.setNome(sc.nextLine()) ;

                        System.out.println("Digite o descricao do tarefa: ");
                        tarefaDto.setDescricao(sc.nextLine());

                        createTarefaUseCase.create(tarefaMapper.toTarefaEntity(tarefaDto));

                        System.out.println("deseja continuar? (S/N)");
                        continuarMenuAdcionar = sc.next();
                        sc.nextLine();

                        if(continuarMenuAdcionar.equalsIgnoreCase("N")) {
                            continuarMenuAdcionar = "N";
                        }
                    }
                    break;

                case 2:

                    listarTarefasUseCase.listarTarefas();

                    break;

                case 0:
                    System.out.println("Saindo do Programa");
                    continuar = false;



            }
        }




    }
}
