package atividades;
import java.util.Scanner;

public class Atividade26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double seuPeso;
        double pesoMaximoCategoria;

        System.out.println("Insira seu peso: ");
        seuPeso = scanner.nextDouble();

        System.out.println("Insira o peso máximo permitido para sua categoria: ");
        pesoMaximoCategoria = scanner.nextDouble();

        if(seuPeso <= pesoMaximoCategoria){
            System.out.println("O lutador está com peso dentro do permitido para sua categoria");
        }else {
            System.out.println("O lutador está com peso acima do permitido para sua categoria");
        }
    }
}
