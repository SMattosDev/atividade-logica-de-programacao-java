package atividades;
import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         int saldo = 20000;
         double saque;
         
         System.out.println("Digite um valor de saque: ");
         saque = scanner.nextDouble();
         
         double novoSaldo = saldo - saque;
         
        System.out.println("Seu saldo atual e: "+novoSaldo +"R$" );
         
    }
}
