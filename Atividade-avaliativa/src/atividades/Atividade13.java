package atividades;
import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
     double metros;
     double km;
        
        System.out.println("Digite a quantidade de kilometros: ");
       km = scanner.nextDouble();
        
        metros = km * 1000;
        
        System.out.println("A quantidade de kilometros em metros e: "+metros);
    
    }
}
