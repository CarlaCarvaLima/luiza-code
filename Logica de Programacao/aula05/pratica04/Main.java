//Crie duas classes, uma chamada professor e outra aluno. Com os seguintes atributos:
//        × Professor: Nome, curso, cpf, salario, lista de alunos.
//        × Aluno: Nome, nota1, nota2.
//        Imprima na Main o nome do professor e seu curso.
//Na classe Professor faça um método para calcular o salário do professor. Para esse cálculo é necessário
//saber o valor da hora aula do professor e o número de aulas ministradas).
//        Salario = Valor hora aula * aula ministradas
//Agora, crie um método de calcularMedia na classe Aluno.
//Os valores da nota1 e nota2 serão informados pela pessoa usuária, juntamente com o nome do aluno.
//Na main, imprima o nome do aluno com a média final, e uma atribuição informando se o aluno foi "Aprovado" ou"Reprovado"
//        ( media >= 7, a aluna está aprovada)

package aula05.pratica04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int aulas;
        String nome;
        float nota1, nota2;

        Professor prof1 = new Professor("Taina", "Java", "123456789");
        Professor prof2 = new Professor("Luiza", "Angular", "987654321");

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        System.out.printf("\nProfessa %s, digite a quantidade de aulas lecionadas: ", prof1.getNome());
        aulas = entrada.nextInt();
        prof1.salario(aulas);
        System.out.printf("\nProfessa %s, digite a quantidade de aulas lecionadas: ", prof2.getNome());
        aulas = entrada.nextInt();
        prof2.salario(aulas);

        System.out.printf("\n-----Cálculando a média dos alunos-----");
        System.out.printf("\nInforme o nome do aluno: ");
        nome = entrada.next();
        System.out.printf("\nDigite a nota1 do aluno %s: ", nome);
        nota1 = entrada.nextFloat();
        System.out.printf("\nDigite a nota2 do aluno %s: ", nome);
        nota2 = entrada.nextFloat();
        aluno1.calculoMedia(nota1, nota2);

        System.out.printf("\nInforme o nome do aluno: ");
        nome = entrada.next();
        System.out.printf("\nDigite a nota1 do aluno %s: ", nome);
        nota1 = entrada.nextFloat();
        System.out.printf("\nDigite a nota2 do aluno %s: ", nome);
        nota2 = entrada.nextFloat();
        aluno2.calculoMedia(nota1, nota2);

    }
}
