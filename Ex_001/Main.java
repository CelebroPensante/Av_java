import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = leitor.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = leitor.nextDouble();

        System.out.println("A soma é: " + Calculadora.adicionar(num1, num2));
        System.out.println("A subtração é: " + Calculadora.subtrair(num1, num2));
        System.out.println("A multiplicação é: " + Calculadora.multiplicar(num1, num2));
        double resultadoDivisao = Calculadora.dividir(num1, num2);
        if (Double.isNaN(resultadoDivisao)) {
            System.out.println("A divisão não é possível (divisão por zero).");
        } else {
            System.out.println("A divisão é: " + resultadoDivisao);
        }
    }
}