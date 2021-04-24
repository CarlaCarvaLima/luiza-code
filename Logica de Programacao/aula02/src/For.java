//Faça um algoritmo que mostre os números que são divisíveis de um número digitado pelo usuário. Além
//desse número, o usuário deve indicar também o número inicial e final da busca.
//        Exemplo:
//        Número divisíveis por: 9
//        De 30 até 238


        import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        int num, ini, fim;
        int count;

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite um número inteiro: ");
        num = entrada.nextInt();
        System.out.printf("Digite o início do intervalo: ");
        ini = entrada.nextInt();
        System.out.printf("Digite o final do intervalo: ");
        fim = entrada.nextInt();

        for(count = ini; count <= fim ; count++){
            if(count%num == 0){
                System.out.printf("O número %d é divisível por: %d \n", count, num);
            }
        }
    }
}
