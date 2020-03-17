package dominios;

public class Dominio3 {

    private String cpf;
    private String placa;

    public Dominio3(String cpf, String placa) {
        this.cpf = cpf;
        this.placa = placa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
