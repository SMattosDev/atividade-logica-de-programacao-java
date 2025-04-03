package atividades;
import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
     double minutos;
     double horas;
        
        System.out.println("Digite a quantidade de minutos: ");
       minutos = scanner.nextDouble();
        
        horas = minutos / 60;
        
        System.out.println("A quantidade de minutos em horas e: "+horas);
    
    }
}

