
package atividades;
import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
         int anoNascimento;
         int anoAtual = 2025;
         int idade;
         
         System.out.println("Digite seu ano de nascimento: ");
         anoNascimento = scanner.nextInt();
         
         idade = 2025 - anoNascimento;
         
         System.out.println("Sua idade e: " +idade);
    }
}
