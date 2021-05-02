//Crie duas classes, uma chamada professor e outra aluno. Com os seguintes atributos:
//        × Professor: Nome, curso, cpf, salario, lista de alunos.
//        × Aluno: Nome, nota1, nota2.
//        Imprima na Main o nome do professor e seu curso.
//Na classe Professor faça um método para calcular o salário do professor. Para esse cálculo é necessário
//saber o valor da hora aula do professor e o número de aulas ministradas).
//        Salario = Valor hora aula * aula ministradas

package aula05.pratica03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int aulas;

        Professor prof1 = new Professor("Taina", "Java", "123456789");
        Professor prof2 = new Professor("Luiza", "Angular", "987654321");

        System.out.printf("\nProfessa %s, digite a quantidade de aulas lecionadas: ", prof1.getNome());
        aulas = entrada.nextInt();
        prof1.salario(aulas);
        System.out.printf("\nProfessa %s, digite a quantidade de aulas lecionadas: ", prof2.getNome());
        aulas = entrada.nextInt();
        prof2.salario(aulas);
    }
}
