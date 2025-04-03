package atividades;
import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double litros;
        double mililitros;
        
        System.out.println("Digite a quantidade de litros: ");
        litros = scanner.nextDouble();
        
        mililitros = litros * 1000;
        
        System.out.println("A quantidade de litros em mililimetros e: "+mililitros);
      
    }
}
