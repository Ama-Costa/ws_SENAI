import java.util.Scanner;

public class Atividade_final_semestre1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] matricula = new int[4];
        String[] nome = new String[4];
        double[] notaArit = new double[4];
        double[][] notaPonderada = new double[4][4];
        int[] pesoNota = new int[4];
        double[] mediaAri = new double[4];
        double[] mediaPon = new double[4];
        int[] falta = new int[4];
        String status;
        double total = 0;
        double totalPon = 0;
        int contador, contador2;

        //CADASTRO DO ALUNO E NOTAS
        for (contador = 1; contador < 4; contador++) {
            System.out.println("Digite a matricula do " + contador +"° aluno:");
            matricula[contador] = ler.nextInt();
            ler.nextLine(); // LIMPA TEXTO
            System.out.println("Digite o nome do " + contador + "° aluno:");
            nome[contador] = ler.nextLine();

            //MEDIA ARITMETICA
            for(contador2 = 1; contador2 < 4; contador2++){
                System.out.println("Digite a " + contador2 + "° nota do aluno ");
                notaArit[contador2] = ler.nextDouble();
                total = notaArit[contador2] + total;
            }  
            mediaAri[contador] = total / 3;
            total = 0;
            System.out.println("Digite o número de faltas do aluno(0 - 10)");
            falta[contador] = ler.nextInt();
            System.out.println("\n");

            //MEDIA PONDERADA
            System.out.println("MEDIA PONDERADA");
            for(contador2 = 1; contador2 < 4; contador2++){
                System.out.println("Digite a " + contador2 + "° nota do aluno ");
                notaPonderada[contador][contador2] = ler.nextDouble();
                System.out.println("Digite o peso da " + contador2 + " nota");
                pesoNota[contador2] = ler.nextInt();
                totalPon = pesoNota[contador2] + totalPon;
                System.out.println("\n");
            }
                //MEDIA
                for(contador2 = 1; contador2 < 4; contador2++){
                    mediaPon[contador] = (notaPonderada[contador][contador2] * pesoNota[contador2]) + mediaPon[contador];
                }
                mediaPon[contador] = mediaPon[contador] / totalPon;
            
        }
        //IMPRESSAO NA TELA
        for (contador = 1; contador < 4; contador++) {
            System.out.println("MATRICULA " + contador +": " + matricula[contador]);
            System.out.println("NOME " + contador + ": " + nome[contador]);
            System.out.println("MÉDIA DO ALUNO " + nome[contador] + ": " + mediaAri[contador]);
            System.out.println("FREQUENCIA DE FALTAS: " + (falta[contador] * 10) + "%\n");
            System.out.println("MEDIA PONDERADA = " + mediaPon[contador]);
        }

    }
}
