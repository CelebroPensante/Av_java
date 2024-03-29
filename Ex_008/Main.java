package Ex_008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar pizzas
        Pizza pizza1 = new Pizza("Calabresa", 30.0);
        Pizza pizza2 = new Pizza("Margherita", 30.0);
        Pizza pizza3 = new Pizza("Frango com Catupiry", 30.0);

        // Criar pedido
        Pedido pedido = new Pedido(null);

        while (true) {
            System.out.println("----- MENU -----");
            System.out.println("1. Adicionar pizza ao pedido");
            System.out.println("2. Remover pizza do pedido");
            System.out.println("3. Exibir detalhes do pedido");
            System.out.println("4. Concluir pedido");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(" ----- SABORES -----");
                    System.out.println("1. Calabresa");
                    System.out.println("2. Margherita");
                    System.out.println("3. Frango com Catupiry");
                    System.out.print("Escolha uma pizza: ");
                    int pizzaEscolhida = scanner.nextInt();
                    switch (pizzaEscolhida) {
                        case 1:
                            pedido.adicionarPizza(pizza1);
                            break;
                        case 2:
                            pedido.adicionarPizza(pizza2);
                            break;
                        case 3:
                            pedido.adicionarPizza(pizza3);
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                case 2:
                    System.out.println("1. Calabresa");
                    System.out.println("2. Margherita");
                    System.out.println("3. Frango com Catupiry");
                    System.out.print("Escolha uma pizza: ");
                    pizzaEscolhida = scanner.nextInt();
                    switch (pizzaEscolhida) {
                        case 1:
                            pedido.removerPizza(pizza1);
                            break;
                        case 2:
                            pedido.removerPizza(pizza2);
                            break;
                        case 3:
                            pedido.removerPizza(pizza3);
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                case 3:
                    pedido.detalhesPedido();
                    break;
                case 4:
                    System.out.print("Digite o endereço de entrega: ");
                    scanner.nextLine(); // Consume newline left-over
                    String endereco = scanner.nextLine();
                    pedido.setEnderecoEntrega(endereco);

                    System.out.println("Escolha a forma de pagamento:");
                    System.out.println("1. Dinheiro");
                    System.out.println("2. Cartão");
                    int pagamento = scanner.nextInt();
                    switch (pagamento) {
                        case 1:
                            pedido.setFormaPagamento("Dinheiro");
                            break;
                        case 2:
                            pedido.setFormaPagamento("Cartão");
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }

                    System.out.println("----- RESUMO DO PEDIDO -----");
                    pedido.detalhesPedido();
                    System.out.println("Endereço de entrega: " + pedido.getEnderecoEntrega());
                    System.out.println("Forma de pagamento: " + pedido.getFormaPagamento());
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}