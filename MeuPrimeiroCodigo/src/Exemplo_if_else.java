import java.util.Scanner;

public class Exemplo_if_else {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String aluno, curso;
        float media, frequencia;

        System.out.println("Digite o nome do aluno:");
        aluno = ler.nextLine();
        System.out.println("Digite a média final do aluno:");
        media = ler.nextFloat();
        System.out.println("Digite a frequencia do aluno:");
        frequencia = ler.nextFloat();
        // OPERADOR LOGICO (E), NO VISUAL CODE USA-SE (&&)
        if (media >= 7 && frequencia >= 75) { // SE MEDIA 7 OU MAIS 'E' FREQUENCIA 75 OU MAIS
            System.out.println("O aluno " + aluno + " está aprovado.");

        } else {
            System.out.println("O aluno " + aluno + " está reprovado.");

        }

        System.out.println("Qual o curso o aluno está cursando:");
        curso = ler.next();
        if((curso.equals("Engenharia")) || (curso.equals("Fisica"))){
            System.out.println("O aluno " + aluno + " está aprovado.");
        } else {
            System.out.println("O aluno " + aluno + " está reprovado.");
        }
    }
}
