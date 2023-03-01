import java.util.Scanner;
public class MainCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        System.out.print("Digite o primeiro valor: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double b = scanner.nextDouble();

        Calculadora.operacoes(operador, a, b);
        scanner.close();
    }
}