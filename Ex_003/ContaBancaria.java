package Ex_003;

public class ContaBancaria {
    private String numeroConta;
    private String nomeTitular;
    private double saldo;

    // Construtor
    public ContaBancaria(String numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
    }

    // Método para obter o número da conta
    public String getNumeroConta() {
        return numeroConta;
    }

    // Método para obter o nome do titular
    public String getNomeTitular() {
        return nomeTitular;
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar dinheiro
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque não realizado. Saldo insuficiente ou valor inválido.");
        }
    }

    // Método para obter o saldo
    public double getSaldo() {
        return saldo;
    }
}