package Lista_Atividades;

import java.util.Scanner;

public class Lista_1_Atividade_1 {

    public static void main(String[] args) {

        int numero = 1;

        Scanner leia = new Scanner(System.in);

        while (numero != 0) {
            System.out.println("Digite um número inteiro:");
            numero = leia.nextInt();

            if (numero == 0) {
                System.out.println("O número é 0");
            } else if (numero > 0) {
                System.out.println("O número é positivo");
            } else {
                System.out.println("O número é negativo");
            }
        }
    }
}
