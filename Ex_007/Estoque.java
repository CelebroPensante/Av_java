package Ex_007;


import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public Produto buscarProduto(String codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigo)) {
                return produto;
            }
        }
        return null;
    }

    public void relatorioEstoque() {
        double valorTotal = 0;
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome() + ", Código: " + produto.getCodigo() + ", Preço: " + produto.getPreco() + ", Quantidade: " + produto.getQuantidade());
            valorTotal += produto.getPreco() * produto.getQuantidade();
        }
        System.out.println("Valor total em estoque: " + valorTotal);
    }
}