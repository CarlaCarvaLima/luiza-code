//Escreva um programa que contenha uma lista com 5 nomes pré-cadastrados. O programa deverá dar ao usuário a opção de
//excluir um único nome da lista , com valores entre 1 e 5, exemplo ao lado. Feita a escolha do usuário pelo número
//correspondente ao nome, o programa deverá mostrar na tela os quatro nomes que restaram cadastrados na lista.
//   Ex.: Qual dos nomes abaixo você deseja excluir da lista?
//        1. Tainá
//        2. Stellinha
//        3. Tequillina
//        4. Pituzinho
//        5. Carla

package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaExcluir {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);

        int i, opcao;

        nomes.add("Carla");
        nomes.add("Helena");
        nomes.add("Safira");
        nomes.add("Yasmim");
        nomes.add("Eunice");

        System.out.printf("-----Lista de Nomes-----\n");
        System.out.println(nomes);

        System.out.printf("\nQual dos nomes abaixo você deseja excluir da lista?\n");
        for ( i = 0; i < nomes.size(); i++) {
            System.out.println((i + 1) + ". " + nomes.get(i));
        }

        System.out.printf("Digite a opção: ");
        opcao = entrada.nextInt();

        switch (opcao){
            case 1:
                System.out.printf("Você excluiu " + nomes.get(0));
                nomes.remove(0);
                break;
            case 2:
                System.out.printf("Você excluiu " + nomes.get(1));
                nomes.remove(1);
                break;
            case 3:
                System.out.printf("Você excluiu " + nomes.get(2));
                nomes.remove(2);
                break;
            case 4:
                System.out.printf("Você excluiu " + nomes.get(3));
                nomes.remove(3);
                break;
            case 5:
                System.out.printf("Você excluiu " + nomes.get(4));
                nomes.remove(4);
                break;
            default:
                System.out.printf("Oops...");
        }
        System.out.printf("\nNovo array: " + nomes);
    }
}
