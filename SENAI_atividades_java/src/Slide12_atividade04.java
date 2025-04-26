import java.util.Scanner;

public class Slide12_atividade04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];
        int[] vetotal = new int[5];
        int contador;

        System.out.println("Digite 5 números para o primeiro vetor:");
        for (contador = 0; contador <= 4; contador++) {
            vet1[contador] = ler.nextInt();
        }
        System.out.println("Agora digite 5 números para o segundo vetor:");
        for (contador = 0; contador <= 4; contador++) {
            vet2[contador] = ler.nextInt();
        }
        for (contador = 0; contador <= 4; contador++) {// VETOR 3
            vetotal[contador] = vet1[contador] + vet2[contador];
        }
        //IMPRESSAO
        System.out.println();
        System.out.println("VETOR 1:");
        for (contador = 0; contador <= 4; contador++) {
            System.out.print(vet1[contador] + " ");
        }
        System.out.println();
        System.out.println("VETOR 2:");
        for (contador = 0; contador <= 4; contador++) {
            System.out.print(vet2[contador] + " ");
        }
        System.out.println();
        System.out.println("VETOR 3:");
        for (contador = 0; contador <= 4; contador++) {
            System.out.print(vetotal[contador] + " ");
        }

    }
}
