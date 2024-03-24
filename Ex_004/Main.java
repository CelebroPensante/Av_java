
package Ex_004;

import java.util.ArrayList;
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                ArrayList<Jogador> jogadores = new ArrayList<>();
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the number of players: ");
                int numPlayers = scanner.nextInt();

                for (int i = 0; i < numPlayers; i++) {
                    System.out.println("Enter player details:");

                    System.out.print("Name: ");
                    String name = scanner.next();

                    System.out.print("Score: ");
                    int score = scanner.nextInt();

                    System.out.print("Level: ");
                    int level = scanner.nextInt();

                    Jogador jogador = new Jogador(name, score, level);
                    jogadores.add(jogador);
                }

                // Search for specific player information
                System.out.print("Enter the name of the player to search: ");
                String searchName = scanner.next();

                for (Jogador jogador : jogadores) {
                    if (jogador.getNome().equals(searchName)) {
                        jogador.exibirInformacoes();
                        break;
                    }
                }
            }
        }
