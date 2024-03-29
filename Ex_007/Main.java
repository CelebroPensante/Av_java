package Ex_007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque meuEstoque = new Estoque();

        while (true) {
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Buscar produto");
            System.out.println("4. Atualizar produto");
            System.out.println("5. Gerar relatório do estoque");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.next();
                    System.out.print("Código: ");
                    String codigo = scanner.next();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    meuEstoque.adicionarProduto(new Produto(nome, codigo, preco, quantidade));
                    break;
                case 2:
                    System.out.print("Código do produto a remover: ");
                    codigo = scanner.next();
                    Produto produtoARemover = meuEstoque.buscarProduto(codigo);
                    if (produtoARemover != null) {
                        meuEstoque.removerProduto(produtoARemover);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Código do produto a buscar: ");
                    codigo = scanner.next();
                    Produto produtoBuscado = meuEstoque.buscarProduto(codigo);
                    if (produtoBuscado != null) {
                        System.out.println("Produto encontrado: " + produtoBuscado.getNome() + ", " + produtoBuscado.getPreco());
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Código do produto a atualizar: ");
                    codigo = scanner.next();
                    Produto produtoAAtualizar = meuEstoque.buscarProduto(codigo);
                    if (produtoAAtualizar != null) {
                        System.out.print("Novo preço: ");
                        preco = scanner.nextDouble();
                        System.out.print("Nova quantidade: ");
                        quantidade = scanner.nextInt();
                        produtoAAtualizar.setPreco(preco);
                        produtoAAtualizar.setQuantidade(quantidade);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 5:
                    meuEstoque.relatorioEstoque();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}