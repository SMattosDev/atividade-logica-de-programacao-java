package atividades;
import java.util.Scanner;
public class Atividade20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, num3, num4;

        System.out.println("Digite um número: ");
        num1 = scanner.nextDouble();

        System.out.println("Digite outro número: ");
        num2 = scanner.nextDouble();

        System.out.println("Digite outro número: ");
        num3 = scanner.nextDouble();

        System.out.println("Digite outro número: ");
        num4 = scanner.nextDouble();

        double multiplicar = num1 * num1;
        double multiplicar2 = num2 * num2;
        double multiplicar3 = num3 * num3;
        double multiplicar4 = num4 * num4;

        double somar = (multiplicar + multiplicar2) + (multiplicar3 + multiplicar4);

        System.out.println("O resultado é: " + somar);
    }
}
