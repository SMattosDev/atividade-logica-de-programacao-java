package atividades;
import java.util.Scanner;

public class Atividade30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int frequenciaRespiratoria;

        System.out.print("Digite o valor da sua frequência respiratória: ");
        frequenciaRespiratoria = scanner.nextInt();

        if (frequenciaRespiratoria < 12) {
            System.out.println("BRADIPNEIA");
        } else if (frequenciaRespiratoria >= 60 && frequenciaRespiratoria <= 100) {
            System.out.println("EUPNEIA");
        } else if (frequenciaRespiratoria >= 100) {
            System.out.println("TAQUIPNEIA");
        }
    }
}
