package Lista_Atividades;

import java.util.Scanner;

public class Lista_2_Atividade_7 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int loop = 0;

        do {
        System.out.println("Digite o número para ver a tabuada");
        int n = leia.nextInt();

            for (int i = 1; i <= 10; i++) {
                int total = n * i;
                System.out.println(n + " x " + i + " = " + total);
            }
            System.out.println("Deseja continuar? (1 = sim, 0 = não)");
            loop = leia.nextInt();
        }while(loop == 1);
    }
}
