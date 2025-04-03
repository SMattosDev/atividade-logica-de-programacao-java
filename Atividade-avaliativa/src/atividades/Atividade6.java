package atividades;
import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        
        double salarioFixo = 4500;
        double bonus = 200;
        int bug;
        
        System.out.println("Digite quantos bugs voce resolveu: ");
        bug = scanner.nextInt();
        
        double salarioFinal = (bonus * bug + salarioFixo);
        
        System.out.println("Seu salario final e: "+salarioFinal);
    }
}
