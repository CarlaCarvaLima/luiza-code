//Declare os seguintes vetores e faça um programa para que seja informado quantos dia tem cada mês.
//        Ex. "O mês de Janeiro tem 31 dias"

package com.company;

public class ForEach {

    public static void main(String[] args) {

        String arrMes[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int arrDia[] = {31,28,31,30,31,30,31,31,30,31,30,31};

        for(int i = 0; i < arrMes.length; i++ ){
            System.out.printf("\nO mês de %s tem %d dias", arrMes[i], arrDia[i]);
        }

        for (String value : arrMes) { // for each
            System.out.printf("\nMês de %s", value);
        }
    }
}
