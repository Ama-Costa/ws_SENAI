import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Slide12_atividade05 {
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    ArrayList <Integer> listaNumeros = new ArrayList<>();
    int x;

    System.out.println("Digite 10 números inteiros:");
    for(x = 0; x <= 9; x++){
        listaNumeros.add(ler.nextInt());
    }
    System.out.println(listaNumeros);
    System.out.print("Maior valor: " + Collections.max(listaNumeros)+ "\n");
    System.out.print("Menor valor: " + Collections.min(listaNumeros)+ "\n");
}
}
