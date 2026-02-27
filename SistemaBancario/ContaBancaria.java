package SistemaBancario;

public class ContaBancaria {
    public String nomeTitular;
    public String numeroConta;
    public double saldoConta;

    public ContaBancaria(String nomeTitular, String numeroConta, double saldoConta) {
        this.nomeTitular = nomeTitular;
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }

    public static depositar(double deposito) {
        this.saldoConta = this.saldoConta - deposito;
    }
}