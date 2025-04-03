
package atividades;
import java.util.Scanner;

public class Atividade1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double numeroUm;
        double numeroDois;
        double somar;
        double multiplicar;
        
        System.out.println("Digite um numero: ");
        numeroUm = scanner.nextDouble();
        
        System.out.println("Digite o segundo numero: ");
        numeroDois = scanner.nextDouble();
        
        somar = numeroUm + numeroDois;
        
        System.out.println("Sua soma e: "+somar);
        
        multiplicar = numeroUm * somar;
        System.out.println(" Sua multiplicação e: " + multiplicar);
    }
    
}