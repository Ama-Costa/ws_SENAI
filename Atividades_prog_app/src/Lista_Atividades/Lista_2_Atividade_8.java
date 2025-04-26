package Lista_Atividades;

import java.util.Random;
import java.util.Scanner;

public class Lista_2_Atividade_8 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Random aleatorio = new Random();

        int sorteio = aleatorio.nextInt(100) + 1;// GARANTE QUE VAI SER DO 0 ATE 100

        System.out.println("Um número de 1 ate 100 foi sorteado!");
        System.out.println("Digite algum número para tentar acertar:");
        int chute = leia.nextInt();
        while (chute != sorteio) {
            if(chute < sorteio) {
                System.out.println("Errou! O número sorteado é maior!");
                System.out.println("Tente novamente!");
            }else{
                System.out.println("Errou! O número sorteado é menor!");
                System.out.println("Tente novamente!");
            }
            chute = leia.nextInt();
        }
        System.out.println("ACERTOU!");
    }
}
