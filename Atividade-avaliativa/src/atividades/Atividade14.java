package atividades;
import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
     double minutos;
     double horas;
        
        System.out.println("Digite a quantidade de horas: ");
       horas = scanner.nextDouble();
        
        minutos = horas * 60;
        
        System.out.println("A quantidade de horas em minutos e: "+minutos);
    
    }
}
