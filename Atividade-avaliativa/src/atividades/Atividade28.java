package atividades;
import java.util.Scanner;

public class Atividade28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aulas;
        System.out.println("Informe o total de aulas da disciplina no semestre: ");
        aulas = scanner.nextInt();

        double presencasMinimas = aulas * 0.75;
        System.out.println("O aluno precisa ter no mínimo " + presencasMinimas + " presenças para ser aprovado.");
        System.out.println("------------------------------------------------------------");

        System.out.println("Informe quantas aulas o aluno compareceu: ");
        int presencasAluno = scanner.nextInt();

        if (presencasAluno < presencasMinimas) {
            System.out.println("ALUNO RETIDO POR EXCEDER NÚMERO DE FALTAS.");
        } else {
            System.out.println("ALUNO APROVADO.");
        }

    }
}