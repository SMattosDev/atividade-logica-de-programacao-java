package atividades;
import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double litros;
        double mililitros;
        
        System.out.println("Digite a quantidade de mililitros: ");
       mililitros = scanner.nextDouble();
        
        litros = mililitros / 1000;
        
        System.out.println("A quantidade de mililitros em litros e: "+litros);
    }
}
