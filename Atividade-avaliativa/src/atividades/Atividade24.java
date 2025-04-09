package atividades;
import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario;
        System.out.println("Insira seu salário: ");
        salario = scanner.nextDouble();

        double bonus = salario * 0.10;
        double salarioFinal = bonus + salario;
        System.out.println("Seu bônus é de: R$"+bonus);
        System.out.println("Seu salário final com bônus é: R$"+ salarioFinal);

    }
}
