package Ex_005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a marca do carro:");
        String marca = scanner.nextLine();

        System.out.println("Digite o modelo do carro:");
        String modelo = scanner.nextLine();

        System.out.println("Digite o ano do carro:");
        int ano = scanner.nextInt();

        System.out.println("Digite a placa do carro:");
        String placa = scanner.nextLine();

        // Cria um novo objeto Carro com as informações fornecidas pelo usuário
        Carro meuCarro = new Carro(marca, modelo, ano, placa);
        while (true) {
            meuCarro.exibirInformacoes();

            System.out.println("Digite 1 para aumentar a velocidade ou 2 para diminuir a velocidade ou 3 para sair:");
            String acao = scanner.nextLine();

            if (acao.equals("1")) {
                meuCarro.acelerar();
            } else if (acao.equals("2")) {
                if (meuCarro.getVelocidade() <= 0) {
                    System.out.println("O carro já está parado.");
                } else {
                    meuCarro.frear();
                }
            } else if (acao.equals("3")) {
                break;
            }
        }

        scanner.close();
    }
}

