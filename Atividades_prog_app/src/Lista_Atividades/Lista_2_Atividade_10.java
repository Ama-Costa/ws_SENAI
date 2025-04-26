package Lista_Atividades;

import java.util.Random;
import java.util.Scanner;

public class Lista_2_Atividade_10 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Random gerador = new Random();
        int pc = gerador.nextInt(10);

        int jogador, vf;

        System.out.println("Escolha:\n1 - PAR\n2 - IMPAR");
        jogador = leia.nextInt();
        switch (jogador) {
            case 1:
                System.out.println("Você escolheu par\nDigite um número para jogar:");
                jogador = leia.nextInt();
                System.out.println("O computador escolheu: " + pc);
                System.out.println("TOTAL = " + (jogador + pc));
                vf = jogador + pc;
                vf = vf % 2;
                if (vf == 0) {
                    System.out.println("Você ganhou!");
                } else {
                    System.out.println("Você perdeu!");
                }
                break;

            case 2:
                System.out.println("Você escolheu impar\nDigite um número para jogar:");
                jogador = leia.nextInt();
                System.out.println("O computador escolheu: " + pc);
                System.out.println("TOTAL = " + (jogador + pc));
                vf = jogador + pc;
                vf = vf % 2;
                if (vf == 0) {
                    System.out.println("Você perdeu!");
                } else {
                    System.out.println("Você ganhou!");
                }

                break;

        }
    }
}

