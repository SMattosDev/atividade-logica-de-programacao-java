package atividades;
import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double dolar;
        
        System.out.println("Digite um valor em dolares");
        dolar = scanner.nextDouble();
        
        double conversor = dolar * 5.37;
        
            System.out.println("O valor em reais e: "+conversor);
    }
}
