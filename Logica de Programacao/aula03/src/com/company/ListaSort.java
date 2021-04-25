//Escreva um programa que cadastra em uma lista numérica de valores inteiros 10 números inteiros
//aleatórios entre 10 e 100. Ao final, o programa deverá detectar na lista qual o maior número
// inteiro sorteado e mostrá-lo ao usuário.

package com.company;

public class ListaSort {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        int i, maior = 10;

        for ( i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (10 + Math.random() * (100 - 10 + 1));
            System.out.println("Número " + (i + 1) + ": " + numbers[i]);

            if (numbers[i] >=  maior) {
                maior = numbers[i];
            }
        }
        System.out.printf("\nO maior valor é: " + maior);
    }
}
        //Math.random(); gerar um número aleatório entre 0 e 1:  0.3626841286896576
        //10 + Math.random(); 10 passa a ser o valor mínimo: 10.221288735789287
        //(10 + Math.random() * (100 - 10 + 1)); valores entre 10 e 100: 46.20975245272557, 81.05277367474477
        //sem o + 1, ele só vai mostrar números entre 10 e 99
        //(int)(10 + Math.random() * (100 - 10 + 1)); tirar o ponto flutuante

