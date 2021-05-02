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

package pratica02;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Endereco end = new Endereco();

        pessoa.setNome("Carla");
        pessoa.setNumero("114");

        end.setLogradouro("Rua Maria Zintl");
        end.setCidade("Guarulhos");
        end.setEstado("São Paulo");

        System.out.printf("%s mora na %s, número %s, na cidade de %s, no estado de %s.", pessoa.getNome(), end.getLogradouro(),
                pessoa.getNumero(), end.getCidade(), end.getEstado());

        System.out.printf("\nMétodo consultaNome(): ");
        pessoa.consultaNome();
        System.out.printf("\nMétodo consultaEndereco: ");
        pessoa.consultaEndereco();
        System.out.printf("\nMétodo consultaLogradouro: ");
        end.consultaLogradouro();
    }
}
