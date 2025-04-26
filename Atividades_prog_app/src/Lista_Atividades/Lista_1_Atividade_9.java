package Lista_Atividades;

import java.util.Scanner;

public class Lista_1_Atividade_9 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade:");
        idade = leia.nextInt();

        if (idade <= 12) {
            System.out.println("Você é criança");
        } else if (idade >= 12 && idade <= 17) {
            System.out.println("Você é adolescente");
        } else if (idade >= 18 && idade <= 64) {
            System.out.println("Você é adulto");
        } else {
            System.out.println("Você é idoso");
        }
    }
}
