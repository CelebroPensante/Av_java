package Ex_002;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void exibirInfo() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano de Publicação: " + this.ano);
    }

    public void exibirSeTituloCorresponder(String titulo) {
        if (this.titulo.equalsIgnoreCase(titulo)) {
            exibirInfo();
        }
    }
}