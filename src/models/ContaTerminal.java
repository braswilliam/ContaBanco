package models;

public class ContaTerminal {
    //atributes:
    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    //constructor
    public ContaTerminal() {
    }

    public ContaTerminal(Integer numero, String agencia, String nomeCliente, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    //getters and setters
    public Integer getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    //custom methods:
    public void deposit(double value) {
        this.saldo += value;
    }

    public void withdraw(double value) {
        this.saldo -= value;
    }

    //setSalto() visible only for this class:
    private void setSaldo(double value) {
        this.saldo += value;
    }

    public void transferValue(double value, ContaTerminal acount) {
        this.saldo -= value;
        acount.setSaldo(value);
    }
}
