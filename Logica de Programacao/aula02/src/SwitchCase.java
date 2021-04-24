//Implemente um programa que leia o código do item pedido, a quantidade e calcule o valor a ser pago por aquele lanche
//imprimindo ao usuário uma msg específica para cada item. Considere que a cada execução somente será calculado um item.

//        PRODUTO                    COD       R$
//        cachorro quente ---------- 100 ----- 1,20
//        bauru simples ------------ 101 ----- 1,30
//        bauru com ovo ------------ 102 ----- 1,50
//        hambúrguer --------------- 103 ----- 1,20
//        cheeseburguer ------------ 104 ----- 1,30
//        refrigerante ------------- 105 ----- 1,00

import java.util.*;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cod;
        int qnt;
        float total = 0;

        System.out.printf("Digite o código do produto: ");
        cod = entrada.nextInt();

        switch (cod){
            case 100:
                System.out.printf("Você pediu um Cachorro quente.\n");
                System.out.printf("Informe quantos você vai querer: ");
                qnt = entrada.nextInt();
                total = (float) (qnt * (1.2));
                System.out.printf("O valor total do seu pedido é: R$" + total);
                break;
            case 101:
                System.out.printf("Você pediu um Bauru simples.\n");
                System.out.printf("Informe quantos você vai querer: ");
                qnt = entrada.nextInt();
                total = (float) (qnt*(1.30));
                System.out.printf("O valor total do seu pedido é: R$" + total);
                break;
            case 102:
                System.out.printf("Você pediu um Bauru com ovo.\n");
                System.out.printf("Informe quantos você vai querer: ");
                qnt = entrada.nextInt();
                total = (float) (qnt*(1.50));
                System.out.printf("O valor total do seu pedido é: R$" + total);
                break;
            case 103:
                System.out.printf("Você pediu um Hamburguer.\n");
                System.out.printf("Informe quantos você vai querer: ");
                qnt = entrada.nextInt();
                total = (float) (qnt*(1.20));
                System.out.printf("O valor total do seu pedido é: R$" + total);
                break;
            case 104:
                System.out.printf("Você pediu um Cheeseburguer.\n");
                System.out.printf("Informe quantos você vai querer: ");
                qnt = entrada.nextInt();
                total = (float) (qnt*(1.30));
                System.out.printf("O valor total do seu pedido é: R$" + total);
                break;
            case 105:
                System.out.printf("Você pediu um Refrigerante.\n");
                System.out.printf("Informe quantos você vai querer: ");
                qnt = entrada.nextInt();
                total = qnt*1;
                System.out.printf("O valor total do seu pedido é: R$" + total);
                break;
            default:
                System.out.printf("Código não cadastrado...");
        }
    }
}
