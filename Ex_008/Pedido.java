package Ex_008;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Pizza> pizzas;
    private String enderecoEntrega;

    public Pedido(String enderecoEntrega) {
        this.pizzas = new ArrayList<>();
        this.enderecoEntrega = enderecoEntrega;
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void removerPizza(Pizza pizza) {
        pizzas.remove(pizza);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Pizza pizza : pizzas) {
            valorTotal += pizza.getValor();
        }
        return valorTotal;
    }

    public void detalhesPedido() {
        System.out.println("Pizzas no pedido:");
        for (Pizza pizza : pizzas) {
            System.out.println(pizza.getNome() + " - " + pizza.getValor());
        }
        System.out.println("Valor total: " + calcularValorTotal());
    }

    private String formaPagamento;

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public String getEnderecoEntrega() {
        return this.enderecoEntrega;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getFormaPagamento() {
        return this.formaPagamento;
    }
}