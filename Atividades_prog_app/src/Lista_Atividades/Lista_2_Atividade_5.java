package Lista_Atividades;

import java.util.Scanner;

public class Lista_2_Atividade_5 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        double num1, num2, num3, total;
        String operacao;

        do {
            System.out.println("Digite o primeiro número:");
            num1 = leia.nextInt();

            System.out.println("Digite o segundo número");
            num2 = leia.nextInt();
            leia.nextLine(); // consome a quebra de linha

            System.out.println("Digite o simbolo da operação que deseja realizar:");
            System.out.println("(+, -, * ou /)");
            System.out.println("Digite qualquer outra coisa para sair.");
            operacao = leia.nextLine();

            switch (operacao) {
                case "+":
                    total = num1 + num2;
                    System.out.println("Você escolheu adição");
                    System.out.println(num1 + " + " + num2);
                    System.out.println("O resultado é " + total);

                    break;
                case "-":
                    total = num1 - num2;
                    System.out.println("Você escolheu subtração");
                    System.out.println(num1 + " - " + num2);
                    System.out.println("O resultado é " + total);

                    break;
                case "*":
                    total = num1 * num2;
                    System.out.println("Você escolheu multiplicação");
                    System.out.println(num1 + " * " + num2);
                    System.out.println("O resultado é " + total);

                    break;
                case "/":
                    total = num1 / num2;
                    System.out.println("Você escolheu divisão");
                    System.out.println(num1 + " / " + num2);
                    System.out.println("O resultado é " + total);

                    break;

                default:
                    System.out.println("operação inválida");
                    break;
            }
            System.out.println("Deseja repetir?(1 = sim ; 0 = não)");
            num3 = leia.nextInt();
        } while (num3 == 1);


    }
}
