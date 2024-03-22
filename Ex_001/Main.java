import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = leitor.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = leitor.nextDouble();

        System.out.println("Escolha a operação desejada:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        int opcao = leitor.nextInt();

        double resultado = 0;
        switch (opcao) {
            case 1:
                resultado = Calculadora.adicionar(num1, num2);
                break;
            case 2:
                resultado = Calculadora.subtrair(num1, num2);
                break;
            case 3:
                resultado = Calculadora.multiplicar(num1, num2);
                break;
            case 4:
                resultado = Calculadora.dividir(num1, num2);
                if (Double.isNaN(resultado)) {
                    System.out.println("A divisão não é possível (divisão por zero).");
                    return;
                }
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("O resultado é: " + resultado);
    }
}