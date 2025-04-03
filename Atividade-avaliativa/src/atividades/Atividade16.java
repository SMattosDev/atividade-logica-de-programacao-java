package atividades;
import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
     double minutos;
     double segundos;
        
        System.out.println("Digite a quantidade de segundos: ");
       segundos = scanner.nextDouble();
        
        minutos = segundos / 60;
        
        System.out.println("A quantidade de segundos em minutos e: "+minutos);
    
    }
}