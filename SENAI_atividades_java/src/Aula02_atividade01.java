import java.util.Scanner;

public class Aula02_atividade01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double total, descfun, descvip;
        int codigo;

        System.out.print("Digite o valor total da compra\nR$");
        total = ler.nextDouble();
        System.out.print("Digite o codigo da compra: ");
        codigo = ler.nextInt();

        switch (codigo) {
            case 1: // CLIENTE COMUM
                System.out.print("O valor total da compra é de R$" + total);
                System.out.println();
                break;
            case 2: // FUNCIONARIO
                descfun = total * 0.10;
                total = total - descfun;
                System.out.println("Desconto de funcionário aplicado(10%)");
                System.out.print("O valor total da compra é de R$" + String.format("%.2f", total));
                System.out.println();
                break;
            case 3: // CLIENTE VIP
                descvip = total * 0.05;
                total = total - descvip;
                System.out.println("Desconto cliente VIP aplicado(5%)");
                System.out.print("O valor total da compra é de R$" + String.format("%.2f", total));
                System.out.println();
                break;
            default: // CODIGO INVÁLIDO
                System.out.println("Codigo inválido");
                System.out.print("O valor total da compra é de R$" + total);
                System.out.println();
                break;
        }
    }
}
