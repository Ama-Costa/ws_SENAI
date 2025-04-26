package Lista_Atividades;

import java.util.Scanner;

public class Lista_1_Atividade_8 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int num1, num2, num3, aux;
        do {
            System.out.println("Digite o primeiro numero:");
            num1 = leia.nextInt();

            System.out.println("Digite o segundo numero:");
            num2 = leia.nextInt();

            System.out.println("Digite o terceiro numero:");
            num3 = leia.nextInt();

            if (num1 > num2) { // COMPARA O PRIMEIRO COM SEGUNDO
                aux = num1; // RECEBE O VALOR NUM1
                num1 = num2; // NUM1 RECEBE VALOR NUM2
                num2 = aux; // NUM2 RECEBE O VALOR NUM1
            }
            if (num1 > num3) { // COMPARA O PRIMEIRO COM O TERCEIRO
                aux = num3;
                num3 = num1;
                num1 = aux;
            }
            if (num2 > num3) { // COMPARA O SEGUNDO COM O TERCEIRO
                aux = num3;
                num3 = num2;
                num2 = aux;
            } // O MAIOR VALOR VAI ESTAR SEMPRE SENDO JOGADO PARA O NUM3
            System.out.println("CRESCENTE:" + num1 + ", " + num2 + ", " + num3);
            System.out.println("Deseja repetir?(1 = sim, 0 = não)");
            aux = leia.nextInt();
        } while (aux == 1);
    }
}
