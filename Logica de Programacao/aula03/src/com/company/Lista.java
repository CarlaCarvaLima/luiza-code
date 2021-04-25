//Escreva um programa que adote um ArrayList como estrutura padrão de armazenamento de dados.
//O programa deverá cadastrar (sem interação do usuário), 10 valores de qualquer tipo dentro da lista
//(String, int, char, double, etc). Ao final, o programa deverá mostrar os valores cadastrados.

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List dados = new ArrayList();

        dados.add("Carla");
        dados.add("Helena");
        dados.add("Safira");
        dados.add("Yasmim");
        dados.add(10);
        dados.add(50.6);
        dados.add(567.65);
        dados.add("A");
        dados.add("B");
        dados.add("LuizaCode");

        System.out.printf("----------Dados----------");

        for ( Object dado : dados ) {
            System.out.printf("\nA informação da vez é: " + dado);
        }
    }
}
