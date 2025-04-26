import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Listas {
public static void main(String[] args) {
    ArrayList<Integer> listaNotas = new ArrayList<>();
    Scanner ler = new Scanner(System.in);

    System.out.println("Digite uma nota:");
    listaNotas.add(ler.nextInt());
    System.out.println(listaNotas);

    listaNotas.add(10);
    listaNotas.add(7);
    listaNotas.add(0,9);//POSICAO , VALOR
    System.out.println(listaNotas);
    System.out.println(listaNotas.size()); //TAMANHO DA LISTA
    System.out.println(listaNotas.isEmpty()); // VOLTA VERDADEIRO OU FALSO SE VAZIO
    listaNotas.clear();// LIMPA A LISTA
    System.out.println(listaNotas.isEmpty());
    System.out.println(Collections.max(listaNotas));
    System.out.println(Collections.min(listaNotas));
    Collections.sort(listaNotas);
    System.out.println(listaNotas);
    
}
}
