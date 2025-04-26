package Lista_Atividades;

import java.util.Random;
import java.util.Scanner;

public class Lista_2_Atividade_9 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Random aleatorio = new Random();

        int pc = aleatorio.nextInt(3) + 1;
        int loop = 1, jogador, pontoJogador = 0, pontoPC = 0;

        System.out.println("PEDRA / PAPEL / TESOURA");

        while (loop == 1) {
            System.out.println("Digite a sua opção:");
            System.out.println("1 - PEDRA");
            System.out.println("2 - PAPEL");
            System.out.println("3 - TESOURA");
            System.out.println("4 - Sair");
            jogador = leia.nextInt();

            switch (jogador) {
                case 1: //JOGADOR PEDRA
                    System.out.println("Você escolheu PEDRA");
                    pc = aleatorio.nextInt(3) + 1;
                    if (pc == 2) {
                        System.out.println("O Computador escolheu PAPEL");
                        System.out.println("Papel vence Pedra");
                        pontoPC++;

                        System.out.println();

                        System.out.println("PLACAR");
                        System.out.println("Jogador: " + pontoJogador + " pontos");
                        System.out.println("PC: " + pontoPC + " pontos");

                        System.out.println();

                    } else if (pc == 3) {
                        System.out.println("O Computador escolheu TESOURA");
                        System.out.println("Pedra vence Tesoura");
                        pontoJogador++;

                        System.out.println();

                        System.out.println("PLACAR");
                        System.out.println("Jogador: " + pontoJogador + " pontos");
                        System.out.println("PC: " + pontoPC + " pontos");

                        System.out.println();

                    } else {
                        System.out.println("O Computador escolheu PEDRA");
                        System.out.println("EMPATE");

                        System.out.println();

                        System.out.println("PLACAR");
                        System.out.println("Jogador: " + pontoJogador + " pontos");
                        System.out.println("PC: " + pontoPC + " pontos");

                        System.out.println();
                    }

                    break;

                case 2: //JOGADOR PAPEL
                    System.out.println("Você escolheu PAPEL");
                    pc = aleatorio.nextInt(3) + 1;
                    if (pc == 2) {
                        System.out.println("O Computador escolheu PAPEL");
                        System.out.println("EMPATE");

                        System.out.println();

                        System.out.println("PLACAR");
                        System.out.println("Jogador: " + pontoJogador + " pontos");
                        System.out.println("PC: " + pontoPC + " pontos");

                        System.out.println();

                    } else if (pc == 3) {
                        System.out.println("O Computador escolheu TESOURA");
                        System.out.println("Tesoura vence Papel");
                        pontoPC++;

                        System.out.println();

                        System.out.println("PLACAR");
                        System.out.println("Jogador: " + pontoJogador + " pontos");
                        System.out.println("PC: " + pontoPC + " pontos");

                        System.out.println();

                    } else {
                        System.out.println("O Computador escolheu PEDRA");
                        System.out.println("Papel vence Pedra");
                        pontoJogador++;

                        System.out.println();

                        System.out.println("PLACAR");
                        System.out.println("Jogador: " + pontoJogador + " pontos");
                        System.out.println("PC: " + pontoPC + " pontos");

                        System.out.println();
                    }
                    break;

                case 3: //JOGADOR TESOURA
                    System.out.println("Você escolheu TESOURA");
                    pc = aleatorio.nextInt(3) + 1;
                    if (pc == 2) {
                        System.out.println("O Computador escolheu PAPEL");
                        System.out.println("Tesoura vence Papel");
                        pontoJogador++;

                        System.out.println();

                        System.out.println("PLACAR");
                        System.out.println("Jogador: " + pontoJogador + " pontos");
                        System.out.println("PC: " + pontoPC + " pontos");

                        System.out.println();

                    } else if (pc == 3) {
                        System.out.println("O Computador escolheu TESOURA");
                        System.out.println("EMPATE");

                        System.out.println();

                        System.out.println("PLACAR");
                        System.out.println("Jogador: " + pontoJogador + " pontos");
                        System.out.println("PC: " + pontoPC + " pontos");

                        System.out.println();

                    } else {
                        System.out.println("O Computador escolheu PEDRA");
                        System.out.println("Pedra vence Tesoura");
                        pontoPC++;

                        System.out.println();

                        System.out.println("PLACAR");
                        System.out.println("Jogador: " + pontoJogador + " pontos");
                        System.out.println("PC: " + pontoPC + " pontos");

                        System.out.println();
                    }

                    break;

                default:
                    System.out.println("Jogo finalizado!");
                    System.out.println("PLACAR");
                    System.out.println("Jogador: " + pontoJogador + " pontos");
                    System.out.println("PC: " + pontoPC + " pontos");
                    loop = 0;
                    break;
            }


        }
    }
}
