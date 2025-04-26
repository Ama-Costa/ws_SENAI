package Lista_Atividades;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Lista_3_Atividade_1 {

    // METODO
    public static double calcularMedia(List<Integer> numeros) {
        vf = listaNumeros.size();
        media = total / vf;
        System.out.println("A média é: " + media);
        return media;
    }

    // LISTA "numeros" CRIADA
    static ArrayList<Integer> listaNumeros = new ArrayList<>();
    static double media, total;
    static int vf;

    // CODIGO PRINCIPAL
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite 5 numeros:");

        for (int i = 1; i <= 5; i++) {
            vf = leia.nextInt();
            listaNumeros.add(vf);
            total = total + vf;
        }
        System.out.println(listaNumeros);
        calcularMedia(listaNumeros);
    }
}
