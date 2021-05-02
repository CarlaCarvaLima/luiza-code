//Na main, crie três objetos Pessoa e para cada uma crie uma Conta.
//Faça operações de sacar e transferir dinheiro entre essas contas.
//No final, mostre as informações de cada cliente e sua respectiva conta.
//OBS.:O valor da operação de saque não é usado para transferência.
// Quando um cliente realiza uma transferência, ele acessa novamente a conta e o valor é debitado.

package aula05.pratica01;

public class Pessoa {

    private String nome;
    private String cpf;
    private String endereco;

    public Pessoa(String nome , String cpf , String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    private Conta conta;

    public void addConta(Conta conta){
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
