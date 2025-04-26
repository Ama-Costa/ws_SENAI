package Lista_Atividades;

import java.util.Scanner;

public class Lista_2_Atividade_2 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int contador = 0, num, vf, impar = 0, par = 0;

        while(contador <= 9){
            System.out.println("Digite um número inteiro:");
            num = leia.nextInt();
            vf = num % 2;

            if (vf == 1) { // IMPAR
                impar = impar + 1;
            } else { // PAR
                par = par + 1;
            }
            contador++;
        }
        System.out.println("Quantidade de números digitados:");
        System.out.println("Par: " + par);
        System.out.println("Impar: " + impar);
    }

}
