
package atividades;
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
    
        double peso;
    
        System.out.println("Informe seu peso: ");
        peso = scanner.nextDouble();
        
        double qtAgua = peso * 0.040;
        
        System.out.println("A quantidade de agua que voce deve beber e: " +qtAgua);
    }
}
