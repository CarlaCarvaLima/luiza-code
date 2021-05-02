//Na main, crie três objetos Pessoa e para cada uma crie uma Conta.
//Faça operações de sacar e transferir dinheiro entre essas contas.
//No final, mostre as informações de cada cliente e sua respectiva conta.
//OBS.:O valor da operação de saque não é usado para transferência.
// Quando um cliente realiza uma transferência, ele acessa novamente a conta e o valor é debitado.

package aula05.pratica01;

public class Conta {

        private float saldo;
    private int numero;
    private String dono;

    public Conta(int saldo , int numero , String dono) {
        this.saldo = saldo;
        this.numero = numero;
        this.dono = dono;
    }

    public boolean sacar(float valorSaque){
        if (valorSaque <= this.saldo){
            this.saldo = saldo - valorSaque;
            return true;
        }
        return false;
    }

    public boolean tranferencia(float valor){
        if (valor <= this.saldo){
            this.saldo = saldo + valor;
            return true;
        }else{
            return false;
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
}
