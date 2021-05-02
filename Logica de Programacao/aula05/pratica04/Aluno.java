package aula05.pratica04;

public class Aluno {
    String nome;
    float nota1;
    float nota2;
    float media;

    public Aluno() { }

    public void calculoMedia(float nota1, float nota2){
        media = (nota1+nota2)/2;
        if (media >= 7){
            System.out.printf("\nAprovado!");
        }else{
            System.out.printf("\nReprovado... :(");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
}
