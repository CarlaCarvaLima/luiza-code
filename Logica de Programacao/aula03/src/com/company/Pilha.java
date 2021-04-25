//Escreva um programa que receba cinco nomes diferentes do usuário. Todos os nomes deverão ser armazenados em um
//ArrayList tipado para Strings. O programa deverá mostrar os nomes cadastrados em ordem inversa a qual foram
// cadastrados, ou seja, do último para o primeiro.

package com.company;

import java.util.*;

public class Pilha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<String> nomes = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            System.out.printf("Insira um nome: ");
            String nome = entrada.nextLine();
            nomes.add(nome);
        }

        System.out.println("Nomes : " + nomes);

        Collections.reverse(nomes);

        System.out.println("\nNomes inverso: " + nomes);

    }
}
