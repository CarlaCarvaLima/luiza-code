package pratica02;

public class Endereco {

    String logradouro;
    String cidade;
    String estado;

    public Endereco(){
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public void consultaLogradouro(){
        System.out.printf("\nLogradouro: %s", getLogradouro());
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
