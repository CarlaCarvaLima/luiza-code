package pratica02;

public class Pessoa {

    String nome;
    Endereco endereco;
    String numero;

    public Pessoa(){
        this.nome = nome;
        this.endereco = endereco;
        this.numero = numero;
    }

    public void consultaNome(){
        System.out.printf("\nNome válido!");
    }

    public void consultaEndereco(){
        System.out.printf("\nEndereço valido");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
