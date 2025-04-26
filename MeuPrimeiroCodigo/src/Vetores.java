import java.util.Scanner;

public class Vetores {
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    //nota: vet[1..5] de inteiro
    int[] nota = new int[5];
    int contador;

    for(contador = 0; contador <= 4; contador++){
        System.out.println("Digite uma nota:");
        nota[contador] = ler.nextInt();
    }
    
}
}