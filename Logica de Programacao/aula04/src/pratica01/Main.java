//Crie uma classe para pessoa com as seguintes características:
//        - Atributos:
//          Nome, idade, CNH
//        - Metodos:
//          Dirigir, dormir, comer

package pratica01;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Carla");
        pessoa.setIdade(28);
        pessoa.setCNH(12345678);

        System.out.printf("O nome da pessoa é %s. Sua idade é %d anos e sua CNH é %d.", pessoa.getNome(),
                pessoa.getIdade(), pessoa.getCNH());
        System.out.printf("\nMétodo comer: ");
        pessoa.comer();
        System.out.printf("\nMérodo dirigir: ");
        pessoa.dirigir();
        System.out.printf("\nMétodo dormir: ");
        pessoa.dormir();
    }
}
