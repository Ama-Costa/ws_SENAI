package Lista_Atividades;

import java.util.Scanner;
import java.util.ArrayList;

public class Lista_1_Atividade_7 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int num1, num2, vf, contador, i;

        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();

        System.out.println("Digite o primeiro número:");
        num1 = leia.nextInt();
        System.out.println("Digite o segundo número:");
        num2 = leia.nextInt();

        for (contador = num1; contador <= num2; contador++) {
            vf = contador % 2;// VERIFICA SE É PAR OU IMPAR | 1 é impar, 0 é par
            if (vf == 1) {
                impar.add(contador);
            } else {
                par.add(contador);
            }
        }
        System.out.println("Números impares:" + impar);
        System.out.println("Números pares:" + par);
    
    }
}
