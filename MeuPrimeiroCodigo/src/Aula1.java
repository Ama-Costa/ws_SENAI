import java.util.Scanner; // ESSA BIBLIOTECA É O QUE FAZ O
                          // COMANDO LEIA FUNCIONAR

public abstract class Aula1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in); // CRIA O COMANDO LEIA

        // DECLARAÇÃO DE VARIAVEIS
        int num1, num2, soma, sub; // VARIAVEL INT
        double nota, div, mult; // VARIAVEL REAL
        String nome; // VARIAVEL CARACTER

        System.out.println("Escreva seu nome:");
        nome = leia.nextLine(); // COMANDO LEIA
        System.out.println("Digite um valor para o numero 1:");
        num1 = leia.nextInt(); // COMANDO LEIA
        System.out.println("Digite um valor para o numero 2:");
        num2 = leia.nextInt(); // COMANDO LEIA
        System.out.println("Digite a nota: ");
        nota = leia.nextDouble(); // COMANDO LEIA

        // OPERAÇÕES
        soma = num1 + num2;
        sub = num1 - num2;
        div = num1 / num2;
        mult = num1 * num2;

        // EXIBIÇÃO DAS MENSAGENS
        System.out.println("Voce digitou o nome: " + nome);
        System.out.println("A soma dos valores " + num1 + " + "
                + num2 + " é " + soma);
        System.out.println("A subtração dos valores " + num1 + " - "
                + num2 + " é " + sub);
        System.out.println("A divisão dos valores " + num1 + " / "
                + num2 + " é " + div);
        System.out.println("A multiplicação dos valores " + num1 + " * "
                + num2 + " é " + mult);
        System.out.println("Você digitou a nota: " + nota);


        
    }
}
