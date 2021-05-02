//Crie uma classe para pessoa com as seguintes características:
//        - Atributos:
//          Nome, idade, CNH
//        - Metodos:
//          Dirigir, dormir, comer
package pratica01;

public class Pessoa {

    String nome;
    int idade;
    int CNH;

    public Pessoa(){
        this.nome = nome;
        this.idade = idade;
        this.CNH = CNH;
    }

    void dormir(){
        System.out.printf("\nZZzzzZZzzZZz...");
    }

    void comer(){
        System.out.printf("\nComendo batata frita!");
    }

    void dirigir(){
        System.out.printf("\nDirigindo!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCNH() {
        return CNH;
    }

    public void setCNH(int CNH) {
        this.CNH = CNH;
    }
}
