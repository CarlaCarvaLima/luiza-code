//Faça um programa que receba um número digitado pelo usuário e mostre o menu para selecionar o tipo de cálculo que
//deve ser realizado:
//        1. Raiz quadrada
//        2. A metade
//        3. 10% do número
//        4. O dobro
//        5. Sair
//        O algoritmo só deve terminar, se o usuário escolher a opção 5

import java.util.*;

public class DoWhile {
    public static void main(String[] args) {

        int opcao, num = 0;
        float resultado;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("\n-------Opções-------");
            System.out.println("1. Raíz Quadrada");
            System.out.println("2. Metade");
            System.out.println("3. 10 por cento");
            System.out.println("4. O dobro");
            System.out.println("5. SAIR");

            System.out.printf("Digite a opção desejada: ");
            opcao = entrada.nextInt();

            if(opcao == 5){
                System.out.printf("Você escolheu a opção SAIR. ");
            } else if(opcao == 0 || opcao > 5){
                System.out.printf("Oops...");
            } else {
                System.out.printf("Digite um número inteiro: ");
                num = entrada.nextInt();
            }

            switch (opcao){
                case 1:
                    resultado = (float) Math.sqrt(num);
                    System.out.printf("A raíz quadrada do valor informado é: " + resultado);
                    break;
                case 2:
                    resultado = (float) num/2;
                    System.out.printf("A divisão do valor informado por 2 é: " + resultado);
                    break;
                case 3:
                    resultado = (float) (num * 0.10);
                    System.out.printf("10 por cento do valor informado é: " + resultado);
                    break;
                case 4:
                    resultado = num * 2;
                    System.out.printf("O dobro do valor informado é: " + resultado);
                    break;
                case 5:
                    System.out.printf(" Programa finalizado!");
                    break;
                default:
                    System.out.printf(" Opção inválida.");
            }
        }while (opcao != 5);
    }
}
