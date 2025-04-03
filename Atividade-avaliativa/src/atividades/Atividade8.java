package atividades;
import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double numUm;
        double numDois;
        
        System.out.println("Digite o primeiro valor: ");
        numUm = scanner.nextDouble();
        
         System.out.println("Digite o segundo valor: ");
        numDois = scanner.nextDouble();
        
        
        double somar = numUm + numDois;
        double subtrair = numUm - numDois;
        double multiplicar = numUm * numDois;
        double dividir = numUm /numDois;
        
        System.out.println("O resultado da soma e: " +somar);
        System.out.println("O resultado da subtacao e: " +subtrair);
        System.out.println("O resultado da multiplicacao e: " +multiplicar);
        System.out.println("O resultado da divisao e: " +dividir);
    
    }
}
