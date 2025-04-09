package atividades;
import java.util.Scanner;
public class Atividade29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int frequenciaCardiaca;

        System.out.println("Digite o valor da sua freqência cardíaca: ");
        frequenciaCardiaca = scanner.nextInt();

        if (frequenciaCardiaca < 60){
            System.out.println("BRADIQUICARDIA");
        } else if (frequenciaCardiaca >= 60  && frequenciaCardiaca < 100) {
            System.out.println("NORMOCARDIA");
        } else if (frequenciaCardiaca >= 100) {
            System.out.println("TAQUICARDIA");
        }

    }
}
