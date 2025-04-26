package Lista_Atividades;

import java.util.Scanner;;

public class Lista_1_Atividade_10 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double valor, total;
        int escolha, loop;

        do{
        System.out.println("Escolha a moeda para converter:");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Libra");
        escolha = leia.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Você escolheu dólar");
                System.out.println("1 BRL = 0.20 USD");
                System.out.println("Qual o valor deseja converter?");
                System.out.print("R$");
                valor = leia.nextDouble();

                total = 0.20 * valor;
                System.out.printf("Valor convertido para dólar: $%.2f\n", total);

                break;

            case 2:
                System.out.println("Você escolheu euro");
                System.out.println("1 BRL = 0.18 EUR");
                System.out.println("Qual o valor deseja converter?");
                System.out.print("R$");
                valor = leia.nextDouble();

                total = 0.18 * valor;
                System.out.printf("Valor convertido para euro: $%.2f\n", total);

                break;

            case 3:
                System.out.println("Você escolheu libra");
                System.out.println("1 BRL = 0.16 GBP");
                System.out.println("Qual o valor deseja converter?");
                System.out.print("R$");
                valor = leia.nextDouble();

                total = 0.16 * valor;
                System.out.printf("Valor convertido para libra: $%.2f\n", total);

                break;

            default:
                System.out.println("Escolha Inválida");
                break;
        }
        System.out.println("Deseja repetir?(1 = sim, 0 = não)");
        loop = leia.nextInt();
    }while(loop == 1);
    }
}
