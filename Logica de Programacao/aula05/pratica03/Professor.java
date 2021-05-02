package aula05.pratica03;

public class Professor {
    String nome;
    String curso;
    String cpf;
    int hora = 29;
    String[] listaAlunos;
    private float salario;

    public Professor(String nome, String curso, String cpf) {
        this.nome = nome;
        this.curso = curso;
        this.cpf = cpf;
    }

    public void salario( float aulas){
        salario = hora * aulas;
        System.out.printf("Seu salário é: R$" + salario);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String[] getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(String[] listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
}
