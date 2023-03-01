import java.util.Scanner;

public class Calculadora {

    public static void operacoes(char operador, double primeiroValor, double segundoValor){
        double calculo;
        switch (operador){
            case '+':
                calculo = primeiroValor + segundoValor;
                break;
            case '-':
                calculo = primeiroValor - segundoValor;
                break;
            case '*':
                calculo = primeiroValor * segundoValor;
                break;
            case '/':
                calculo = primeiroValor / segundoValor;
                break;
            default:
                throw new IllegalArgumentException("Operador inválido!");
        }
        mostrarResultado(primeiroValor, operador, segundoValor, calculo);
    }

    public static void mostrarResultado(double a, char operador, double b, double resultado){
        System.out.printf("%.1f %s %.1f = %.1f", a, operador, b, resultado).toString();

    }
}
