package Ex_008;

import java.util.List;

public class Pizza {
    private String nome;
    private double valor;

    public Pizza(String nome, double valor ) {
        this.nome = nome;
        this.valor = valor;
    }

    public Pizza(String string, double d, String string2, String string3, String string4) {

    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}