package pratica03_04;

public class Produto {

    long codigo;
    String nome;

    public Produto() {
    }

    public Produto(long codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}