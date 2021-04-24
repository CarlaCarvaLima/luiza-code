//Escreva um algoritmo que leia o peso e a altura de um usuário e informe o seu Índice de Massa
//Corpórea (IMC). O cálculo é obtido pela divisão entre o valor do seu peso e o quadrado do valor da sua altura.

package com.company;

import java.util.Scanner;

public class IMC {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Informe o seu peso em KG: ");
        float peso = entrada.nextFloat();

        System.out.printf("Informe a sua altura em metros: ");
        float altura = entrada.nextFloat();

        float imc = peso / (altura * altura);

        System.out.printf("O seu IMC é: " + imc);

    }
}
