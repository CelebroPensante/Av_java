package Ex_005;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int velocidade;

    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidade = 0;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade: " + velocidade);
    }

    public int getVelocidade() {
        return velocidade;
    }
    
    public void acelerar() {
        velocidade += 5;
    }

    public void frear() {
        velocidade -= 5;
    }
}