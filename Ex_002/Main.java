package Ex_002;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> biblioteca = new ArrayList<>();
        biblioteca.add(new Livro("o senhor dos aneis", "J.R.R. Tolkien", 1954));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o título do livro: ");
        String titulo = scanner.nextLine();

        for (Livro livro : biblioteca) {
            livro.exibirSeTituloCorresponder(titulo);
        }
    }
}
