import java.util.Scanner;

public class Slide12_atividade03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] numeros = new int[5];
        int contadorx, contadory, aux;

        for (contadorx = 0; contadorx <= 4; contadorx++) {
            System.out.println("Digite um numero: ");
            numeros[contadorx] = ler.nextInt();
        }
       
        // CRESCENTE
        for (contadorx = 0; contadorx <= 4; contadorx++) {
            for (contadory = 0; contadory <= 4; contadory++) {
                if (contadorx <= 4) {
                    if (numeros[contadorx] < numeros[contadory]) {
                        aux = numeros[contadorx];
                        numeros[contadorx] = numeros[contadory];
                        numeros[contadory] = aux;
                    }
                }
            }
        }
        System.out.println("CRESCENTE");// EXIBIR MENSAGEM
        for (contadorx = 0; contadorx <= 4; contadorx++) {
            System.out.print(numeros[contadorx] + " ");
        }
        // DECRESCENTE
        for (contadorx = 0; contadorx <= 4; contadorx++) {
            for (contadory = 0; contadory <= 4; contadory++) {
                if (contadorx <= 4) {
                    if (numeros[contadorx] > numeros[contadory]) {
                        aux = numeros[contadorx];
                        numeros[contadorx] = numeros[contadory];
                        numeros[contadory] = aux;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("DECRESCENTE");
        for (contadorx = 0; contadorx <= 4; contadorx++) {
            System.out.print(numeros[contadorx] + " ");
        }
        System.out.println();
    }
}
