//Na main, crie três objetos Pessoa e para cada uma crie uma Conta.
//Faça operações de sacar e transferir dinheiro entre essas contas.
//No final, mostre as informações de cada cliente e sua respectiva conta.
//OBS.:O valor da operação de saque não é usado para transferência.
// Quando um cliente realiza uma transferência, ele acessa novamente a conta e o valor é debitado.

package aula05.pratica01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float valorSaque;
        float valorTransf;

        //criando cliente
        Pessoa clienteCarla = new Pessoa("Carla", "123456789", "Rua Carla");
        Pessoa clienteSafira = new Pessoa("Safira", "123456754", "Rua Safira");
        Pessoa clienteYasmim = new Pessoa("Yasmim", "987456321", "Rua Yasmim");

        // criando conta
        Conta contaCarla = new Conta(5000, 123, "Carla" );
        Conta contaYasmim = new Conta(500, 456, "Yasmim" );
        Conta contaSafira = new Conta(2000, 789, "Safira" );

        //add valores dos atributos de Pessoa
        clienteCarla.setConta(contaCarla);
        clienteSafira.setConta(contaSafira);
        clienteYasmim.setConta(contaYasmim);

        System.out.println("\nSaldo inicial nas contas: ");
        System.out.println(contaCarla.getDono() + ": R$" + contaCarla.getSaldo());
        System.out.println(contaSafira.getDono() + ": R$" + contaSafira.getSaldo());
        System.out.println(contaYasmim.getDono() + ": R$" + contaYasmim.getSaldo());

        //realizar saque
        System.out.printf("%s, informe o valor do saque: ", clienteCarla.getNome());
        valorSaque = entrada.nextFloat();
        clienteCarla.getConta().sacar(valorSaque);

        System.out.printf("%s, informe o valor do saque: ", clienteSafira.getNome());
        valorSaque = entrada.nextFloat();
        clienteSafira.getConta().sacar(valorSaque);

        System.out.printf("%s, informe o valor do saque: ", clienteYasmim.getNome());
        valorSaque = entrada.nextFloat();
        clienteYasmim.getConta().sacar(valorSaque);

      //tranferecia
        System.out.printf("Informe o valor da transferência de Carla para Safira: ");
        valorTransf = entrada.nextFloat();
        clienteCarla.getConta().sacar(valorTransf);
        clienteSafira.getConta().tranferencia(valorTransf);

        System.out.printf("Informe o valor da transferência de Safira para Yasmim: ");
        valorTransf = entrada.nextFloat();
        clienteSafira.getConta().sacar(valorTransf);
        clienteYasmim.getConta().tranferencia(valorTransf);

        System.out.printf("Informe o valor da transferência de Yasmim para Carla: ");
        valorTransf = entrada.nextFloat();
        clienteYasmim.getConta().sacar(valorTransf);
        clienteCarla.getConta().tranferencia(valorTransf);

        //imprimir saldos finais
        System.out.printf("\n%s tem um saldo de %f", clienteCarla.getNome(), clienteCarla.getConta().getSaldo());
        System.out.printf("\n%s tem um saldo de %f", clienteSafira.getNome(), clienteSafira.getConta().getSaldo());
        System.out.printf("\n%s tem um saldo de %f", clienteYasmim.getNome(), clienteYasmim.getConta().getSaldo());
    }
}
