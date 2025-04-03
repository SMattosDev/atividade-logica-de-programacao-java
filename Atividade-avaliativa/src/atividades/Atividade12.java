package atividades;
import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double metros;
        double centimetros;
        
        System.out.println("Digite a quantidade de centimetros: ");
       centimetros = scanner.nextDouble();
        
        metros = centimetros / 100;
        
        System.out.println("A quantidade de centimetros em metros e: "+metros);
    }
}
