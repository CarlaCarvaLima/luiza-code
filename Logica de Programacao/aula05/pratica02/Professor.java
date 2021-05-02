package aula05.pratica02;

public class Professor {
    String nome;
    String curso;
    String cpf;
    int salario;
    String[] listaAlunos;

    public Professor(String nome, String curso, String cpf, int salario) {
        this.nome = nome;
        this.curso = curso;
        this.cpf = cpf;
        this.salario = salario;
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

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String[] getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(String[] listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
}
