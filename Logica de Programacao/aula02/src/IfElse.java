//Escreva um algoritmo que leia o peso e a altura de um usuário e informe o peso ideal pelo cálculo do Índice de
//Massa Corpórea (IMC). O cálculo é obtido pela divisão entre o valor do seu peso e o quadrado do valor da sua altura.

// Condiçôes:
//abaixo do peso <19,1
//peso normal 19,1 - 25,8
//marginalmente acima do peso 25,8 - 27,3
//acima do peso ideal 27,3 - 32,3
//obeso >32,3

import java.util.*;

public class IfElse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Informe o seu peso em KG: ");
        float peso = entrada.nextFloat();

        System.out.printf("Informe a sua altura em metros: ");
        float altura = entrada.nextFloat();

        float imc = (float) (peso / Math.pow(altura , 2.0));

        System.out.printf("O seu IMC é: %.2f" , imc);

        if (imc < 19.1) {
            System.out.printf(" e você está abaixo do peso ideal");
        } else if (imc >= 19.1 && imc <= 25.8) {
            System.out.printf(" e você está no peso ideal");
        } else if (imc > 25.8 && imc <= 27.3) {
            System.out.printf(" e você está marginalmente acima do peso ideal");
        } else if (imc > 27.3 && imc <= 32.3) {
            System.out.printf(" e você está acima do peso ideal");
        } else if (imc > 32.3) {
            System.out.printf(" e você está obeso");
        }
    }
}
