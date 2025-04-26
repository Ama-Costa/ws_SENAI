package Lista_Atividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista_3_Atividade_3 {

    public static List<Integer> filtrarPares(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<Integer>();
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                resultado.add(numero);
            }
        }
        System.out.println("Os números pares são: " + resultado);
        return resultado;
    }

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite 10 numeros inteiros:");
        for (int i = 0; i < 10; i++) {
            numeros.add(leia.nextInt());
        }
        filtrarPares(numeros);
    }
}
