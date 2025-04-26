import java.util.Scanner;

public class Aula02_atividade02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double num, media;
        int contador;

        contador = 0;
        media = 0;
        System.out.println("Digite um numero:");
        num = ler.nextDouble();

        while(num >= 1) {
            contador++;
            media = media + num;
            System.out.println("Digite outro número:");
            num = ler.nextDouble();
        } 

        System.out.println("Foram digitados " + contador + " números.");
        media = media / contador;
        if(media > 0){
        System.out.println("A média é " + String.format("%.1f", media));
        }else{
            System.out.println("A média é zero.");
        }
    }
}
