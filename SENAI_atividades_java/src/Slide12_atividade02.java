import java.util.Scanner;

public class Slide12_atividade02 {

static int numero;
static boolean parimpar;

    public static boolean verificarPar(int n) {
        if(n%2 == 1){
            System.out.println("O numero "+ n + " é impar.");
            parimpar = false;
        }else{
            System.out.println("O numero "+ n + " é par.");
            parimpar = true;
        }
        return parimpar;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero:");
        numero = ler.nextInt();
        verificarPar(numero);
    }
}
