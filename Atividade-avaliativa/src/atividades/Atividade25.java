package atividades;
import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int velocidade;
        System.out.println("Digite um valor de velocidade: ");
        velocidade = scanner.nextInt();

        if (velocidade <=90){
            System.out.println("VELOCIDADE DO AUTOMÓVEL ESTÁ ABAIXO DO LIMITE DA VIA");
        }else {
            System.out.println("REGISTRO DE INFRAÇÃO POR EXCESSO DE VELOCIDADE AO PERMITIDO NA VIA!");
        }
    }
}
