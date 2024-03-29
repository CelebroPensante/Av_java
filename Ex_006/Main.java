package Ex_006;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria uma nova agenda
        Agenda minhaAgenda = new Agenda();

        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Remover contato");
            System.out.println("3 - Buscar contato");
            System.out.println("4 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do contato:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o telefone do contato:");
                    String telefone = scanner.nextLine();
                    Contato novoContato = new Contato(nome, telefone);
                    minhaAgenda.adicionarContato(novoContato);
                    System.out.println("Contato adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o nome do contato a ser removido:");
                    String nomeRemover = scanner.nextLine();
                    Contato contatoRemover = minhaAgenda.buscarContato(nomeRemover);
                    if (contatoRemover != null) {
                        minhaAgenda.removerContato(contatoRemover);
                        System.out.println("Contato removido com sucesso!");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Digite o nome do contato a ser buscado:");
                    String nomeBuscar = scanner.nextLine();
                    Contato contatoBuscado = minhaAgenda.buscarContato(nomeBuscar);
                    if (contatoBuscado != null) {
                        System.out.println("Contato encontrado: " + contatoBuscado.getNome() + ", " + contatoBuscado.getTelefone());
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}