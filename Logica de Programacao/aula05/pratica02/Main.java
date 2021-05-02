//Crie duas classes, uma chamada professor e outra aluno. Com os seguintes atributos:
//        × Professor: Nome, curso, cpf, salario, lista de alunos.
//        × Aluno: Nome, nota1, nota2.
//        Imprima na Main o nome do professor e seu curso.

package aula05.pratica02;

public class Main {
    public static void main(String[] args) {

        Professor prof1 = new Professor("Taina", "Java", "123456789", 10000);
        Professor prof2 = new Professor("Luiza", "Angular", "987654321", 8000);

        System.out.printf("Professoras e seus cursos: ");
        System.out.printf("\nProfessa %s leciona o curso de %s.", prof1.getNome(), prof1.getCurso());
        System.out.printf("\nProfessa %s leciona o curso de %s.",  prof2.getNome(), prof2.getCurso());

    }
}
