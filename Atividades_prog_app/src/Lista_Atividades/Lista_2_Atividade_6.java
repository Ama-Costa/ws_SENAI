package Lista_Atividades;

import java.util.Scanner;

public class Lista_2_Atividade_6 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int n, i, a = 0, b = 1, c;

        System.out.println("Digite o número de sequências de Fibonacci que deseja ver:");
        n = leia.nextInt();

        for(i = 0; i <= n; i++){
            c = b + a;
            a = b;
            b = c;
            System.out.print(b + " ");
        }
    }
}
