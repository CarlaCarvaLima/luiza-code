// Faça um programa que leia as duas notas de um aluno, calcule a média nas notas e informe se o aluno foi
// aprovado (média >= 7) ou se ele foi reprovado (média < 7).

import java.util.*;

public class While {
    public static void main(String[] args) {
        double nota1, nota2, media;
        int qtdeAprovado = 0;
        int qtdeReprovado = 0;
        String validacao = "sim";

        Scanner teclado = new Scanner(System.in);

        while (validacao.equals("sim")) {
            System.out.printf("Informe nota 1: ");
            nota1 = teclado.nextDouble();
            System.out.printf("Informe nota 2: ");
            nota2 = teclado.nextDouble();

            System.out.println("Existem mais alunos? ");
            System.out.printf("Digite 'sim' para continuar ou 'nao' para finalizar: ");
            validacao = teclado.next();

            media = (nota1 + nota2) / 2;

            if (media >= 7) {
                qtdeAprovado++;
            } else {
                qtdeReprovado++;
            }
        }

        System.out.println("Alunos aprovados: " + qtdeAprovado);
        System.out.println("Alunos reprovados: " + qtdeReprovado);
    }
}
