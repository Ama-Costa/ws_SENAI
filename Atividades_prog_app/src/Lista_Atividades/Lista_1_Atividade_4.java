package Lista_Atividades;

import java.util.Scanner;

public class Lista_1_Atividade_4 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double peso, altura, IMC;
        int loop;

        do {
            System.out.println("Digite o seu peso em Kg:");
            peso = leia.nextDouble();
            System.out.println("Digite sua altura:");
            altura = leia.nextDouble();

            IMC = peso / Math.pow(altura, 2);
            System.out.printf("Seu IMC é de: %.2f\n", IMC);

            if (IMC < 18.5) {
                System.out.println("Você está abaixo do peso ideal!");
            } else if (IMC >= 18.5 && IMC <= 25) {
                System.out.println("Você está no peso ideal!");
            } else if (IMC > 25 && IMC <= 30) {
                System.out.println("Você está com sobrepeso!");
            } else {
                System.out.println("Você está obeso!");
            }
            // IMC = 0 > 18,5 ABAIXO DO PESO IDEAL
            // IMC = 18,5 > 25 PESO IDEAL
            // IMC = 25 > 30 SOBREPESO
            // IMC = 30 > OBESO
            System.out.println("Deseja repetir? (1 = sim, 0 não)");
            loop = leia.nextInt();
        } while (loop == 1);
    }
}
