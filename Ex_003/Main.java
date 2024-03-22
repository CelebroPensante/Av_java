package Ex_003;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(new ContaBancaria("123", "João Silva"));
        contas.add(new ContaBancaria("456", "Maria Santos"));
        // Adicione mais contas conforme necessário

        Scanner scanner = new Scanner(System.in);
        ContaBancaria contaAtual = null;

        while (true) {
            System.out.println("===Escolha uma operação===");
            System.out.println("|1 - Selecionar conta    |");
            System.out.println("|2 - Depósito            |");
            System.out.println("|3 - Saque               |");
            System.out.println("|4 - Saldo               |");
            System.out.println("|5 - Sair                |");
            System.out.println("==========================");
            int operacao = scanner.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Digite o número da conta: ");
                    String numeroConta = scanner.next();
                    for (ContaBancaria conta : contas) {
                        if (conta.getNumeroConta().equals(numeroConta)) {
                            contaAtual = conta;
                            System.out.println("Conta selecionada: " + contaAtual.getNomeTitular());
                            break;
                        }
                    }
                    if (contaAtual == null) {
                        System.out.println("Conta não encontrada.");
                    }
                    break;
                case 2:
                    if (contaAtual != null) {
                        System.out.println("Digite o valor a depositar: ");
                        double valorDeposito = scanner.nextDouble();
                        contaAtual.depositar(valorDeposito);
                    } else {
                        System.out.println("Nenhuma conta selecionada.");
                    }
                    break;
                case 3:
                    if (contaAtual != null) {
                        System.out.println("Digite o valor a sacar: ");
                        double valorSaque = scanner.nextDouble();
                        contaAtual.sacar(valorSaque);
                    } else {
                        System.out.println("Nenhuma conta selecionada.");
                    }
                    break;
                case 4:
                    if (contaAtual != null) {
                        System.out.println("Saldo atual: " + contaAtual.getSaldo());
                    } else {
                        System.out.println("Nenhuma conta selecionada.");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Operação inválida.");
            }
        }
    }
}