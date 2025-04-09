package atividades;
import java.util.Scanner;
public class Atividade21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorPeca;
        int quantidadePecasvendidas;

        System.out.println("Informe quanto custa uma peça: ");
        valorPeca = scanner.nextDouble();

        System.out.println("Informe quantas peças você vendeu: ");
        quantidadePecasvendidas = scanner.nextInt();

        double valorTotal = valorPeca * quantidadePecasvendidas;
        double comissao = valorTotal * 0.05;

        System.out.println("Sua comissão é de: "+ comissao);
    }
}
