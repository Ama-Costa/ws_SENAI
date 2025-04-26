package Lista_Atividades;

import java.util.Scanner;

public class Lista_1_Atividade_5 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int nota, loop;
        do {
            System.out.println("Digite a nota(0 até 100):");
            nota = leia.nextInt();

            if (nota < 60) {
                System.out.println("Nota F (Reprovado)");
            } else if (nota >= 60 && nota <= 69) {
                System.out.println("Nota D (Insatisfatório)");
            } else if (nota >= 70 && nota <= 79) {
                System.out.println("Nota C (Satisfatório)");
            } else if (nota >= 80 && nota <= 89) {
                System.out.println("Nota B (Bom)");
            } else {
                System.out.println("Nota A (Excelente)");
            }
            System.out.println("Deseja repetir? (1 = sim, 0 não)");
            loop = leia.nextInt();
        } while (loop == 1);
    }
}
