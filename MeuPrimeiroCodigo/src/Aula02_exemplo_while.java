import java.util.Scanner;

public class Aula02_exemplo_while {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int contador, opcao;

        for (contador = 1; contador <= 10; contador++) {
            System.out.println(contador);
        }

        contador = 1;
        while (contador <= 10) {
            System.out.println(contador);
            contador = contador + 1;
            // OU USAR 'CONTADOR++'';
        }

        contador = 1;
        do {
            System.out.println(contador);
            contador++;
        } while (contador <= 10);

        System.out.println("Digite um número:");
        opcao = ler.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu a opção 1");
                break;
            case 2:
                System.out.println("Você escolheu a opção 2");
                break;
            default:
                System.out.println("Você escolheu uma opção inválida.");
                break;
        }

    }
}
