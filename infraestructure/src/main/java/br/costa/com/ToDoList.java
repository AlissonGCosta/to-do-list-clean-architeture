package br.costa.com;

import br.costa.com.application.CreateTarefaImpl;
import br.costa.com.entity.TarefaEntity;

import java.util.Scanner;


public class ToDoList {

    static void main() {

        CreateTarefaImpl createTarefa = new CreateTarefaImpl();


        Scanner sc = new Scanner(System.in);

        String nome;
        String descricao;

        System.out.println("Digite o nome do tarefa: ");
        nome = sc.nextLine();

        System.out.println("Digite o descricao do tarefa: ");
        descricao = sc.nextLine();

        createTarefa.create();

    }
}
