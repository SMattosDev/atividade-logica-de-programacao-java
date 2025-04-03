package atividades;
import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        
          Scanner scanner = new Scanner(System.in);
    
         double salarioFixo = 2000;
         double bonus = 100;
         int automoveisVendidos;
    
        System.out.println("Digite quantos automoveis voce vendeu: ");
        automoveisVendidos = scanner.nextInt();
        
        double salarioFinal = (bonus * automoveisVendidos + salarioFixo);
        
        System.out.println("Seu salario final e: "+salarioFinal);
      
    }
  
}