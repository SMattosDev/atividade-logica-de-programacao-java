package atividades;
import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
     double minutos;
     double segundos;
        
        System.out.println("Digite a quantidade de segundos: ");
       segundos = scanner.nextDouble();
        
        minutos = segundos * 60;
        
        System.out.println("A quantidade de minutos em segundos e: "+segundos);
    
    }
}