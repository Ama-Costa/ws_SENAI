import java.util.Scanner;

public class Slide01_atividade04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String aluno;
        double nota1, nota2, nota3, media;

        // ENTRADA DE INFORMAÇÃO
        System.out.println("Digite o nome do aluno:");
        aluno = ler.nextLine();
        System.out.println("Digite a primeira nota:");
        nota1 = ler.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = ler.nextDouble();
        System.out.println("Digite a terceira nota:");
        nota3 = ler.nextDouble();

        // OPERAÇÃO
        media = (nota1 + nota2 + nota3) / 3;

        // PARA ESCOLHER QUANTAS CASAS DEPOIS DA VIRUGULA USE
        // STRING.FORMAT("%.'numero de casas'F")
        System.out.println("A média do aluno " + aluno + " é " + String.format("%.1f", media));

        if (media > 7) {
            System.err.println("O aluno " + aluno + " está aprovado.");
        }else if(media >= 5 && media <= 7){
            System.out.println("O aluno " + aluno + " está em exame.");
        }else{
            System.out.println("O aluno " + aluno + " está reprovado.");
        }

    }
}
