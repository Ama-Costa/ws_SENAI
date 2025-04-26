import java.util.Scanner;

public class Slide01_atividade02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double custo, distribuidor, imposto, total;

        System.out.print("Digite o custo de fabrica do carro\nR$");
        custo = ler.nextFloat();
        // OPERAÇÕES
        distribuidor = custo * 0.28;
        imposto = custo * 0.45;
        total = custo + imposto + distribuidor;
        // MENSAGENS
        System.out.println("Taxa do distribuidor(28%) = R$" + distribuidor);
        System.out.println("Impostos(45%) = R$" + imposto);
        System.out.println("O total de custo do carro é de R$" + total);
    }
}
