package atividades;
import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        double metros;
        double centimetros;
        
        System.out.println("Digite a quantidade de metros: ");
       metros = scanner.nextDouble();
        
        centimetros = metros * 1000;
        
        System.out.println("A quantidade de metros em centimetros e: "+centimetros);
    }
}
