package atividades;
import java.util.Scanner;

public class Atividade27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aulas;
        System.out.println("informe quantas aulas no total terá a sua disciplina durante um semestre: ");
        aulas = scanner.nextInt();

        double presencasMinimas = aulas * 0.75;
        System.out.println("O aluno precisa ter no mínimo " + presencasMinimas + " presenças para ser aprovado.");

    }
}
