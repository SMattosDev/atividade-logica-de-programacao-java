
package atividades;
import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        
        double peso;
        double altura;
   
        
        System.err.println("Informe seu peso: ");
        peso = scanner.nextDouble();
        
           System.err.println("Informe sua altura: ");
            altura = scanner.nextDouble();
            
                 double imc = peso /(altura * altura);
                 
                 System.out.println("O seu IMC e: " + imc);
    }
}
