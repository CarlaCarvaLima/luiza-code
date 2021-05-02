//Desenvolva o seguinte relacionamento:

// ------------ Pessoa------------ |
// nome: String                    |
// endereco: Endereco              | ------->  | --------- Endereco ---------- |
// numero: String                  |           | logradouro: String            |
// --------------------------------|           | cidade: Strintg               |
// consultaEndereco() : Endereco   |           | estado: String                |
// consultaNome() : String         |           |-------------------------------|
//                                             | consultaLogradouro() : String |

// Pessoa vai ter um objeto do tipo Endereço
// Lembre-se de criar os construtores parametrizados

//A classe Compra vai conter um objeto do tipo Pessoa e outro do tipo Produto.
//Será possível comprar acessando o método comprar, passando como parâmetro dois objetos, um do tipo
//Pessoa e outro do tipo Produto.

//Agora desenvolva a classe Main:
//× Inicialmente, a classe deve criar 2 objetos do tipo Produto (crie os objetos com as informações que desejar)
//× O usuário faz um cadastro (criando um objeto do tipo Pessoa)
//× Logo após, o usuário seleciona entre os 2 produtos cadastrados anteriormente
//× Dependendo da escolha, é acessado o método comprar da classe Compra, e passado como parâmetro o objeto Pessoa que
// ele cadastrou e o do Produto escolhido
//× Logo após, é exibido no console ao usuário uma mensagem de confirmação, exibindo o nome dele e do produto comprado
// (acesso ao método verificarCompra()) e finaliza a aplicação

package pratica03_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);
        int confirma;
        Produto produto1=new Produto(150,"Celular");
        Produto produto2 = new Produto(500,"PlayStation5");
        Compra compra = new Compra();

        System.out.printf("Por favor, insira o seu nome: ");
        String nome= entrada.next();
        System.out.printf("\nInsira seu logradouro: ");
        String logradouro = entrada.next();
        System.out.printf("\nInsira seu número: ");
        String num = entrada.next();
        System.out.printf("\nInsira a sua cidade: ");
        String cidade = entrada.next();
        System.out.printf("\nInsira o seu estado: ");
        String estado = entrada.next();

        Endereco endereco = new Endereco();
        endereco.setLogradouro(logradouro);
        endereco.setCidade(cidade);
        endereco.setEstado(estado);

        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setNumero(num);
        pessoa.setEndereco(endereco);

        System.out.printf("\nOlá %s! Digite 1 ou 2 para selecionar um produto.", pessoa.getNome());
        System.out.printf("\n Os produtos são:\n 1. %s\n 2. %s\n", produto1.getNome(), produto2.getNome());
        int prod= entrada.nextInt();

        switch (prod){
            case 1:
                compra.comprar(pessoa,produto1);
                System.out.printf("\nVocê confirma a compra?");
                System.out.printf("\n Digite 1 para 'Sim' ou 2 para 'Não'.");
                confirma = entrada.nextInt();
                compra.verificarCompra(confirma);
                System.out.printf("\nUhuuuu %s! Você realizou a compra de um %s.",pessoa.getNome(),produto1.getNome());
                break;
            case 2:
                compra.comprar(pessoa,produto2);
                System.out.println("\nVocê confirma a compra?");
                System.out.printf("\nDigite 1 para 'Sim' ou 2 para 'Não'.");
                confirma = entrada.nextInt();
                compra.verificarCompra(confirma);
                System.out.printf("\nUhuuuu %s! Você realizou a compra de um %s", pessoa.getNome(),produto2.getNome());
                break;
            default:
                System.out.printf("\nOops...algo deu errado... :(");
        }
    }
}
