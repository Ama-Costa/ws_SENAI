import java.util.Scanner;

public class Slide12_atividade01 {

    //ESCOPO GLOBAL
    static String nome;

    //FUNÇÃO
    public static String saudacao(String n){
        System.out.println("Olá, " + n + "! Bem-vindo(a)!");
return n;
    }
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Digite seu nome:");
    nome = ler.nextLine();
    saudacao(nome);
}
}
