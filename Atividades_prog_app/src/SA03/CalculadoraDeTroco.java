import java.util.Scanner;

public class CalculadoraDeTroco { //CODIGO DO VITOR

    static double[] notas_moedas = {100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05, 0.01};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
wrfwfwfwf
        while (continuar) {
            System.out.print("Digite o valor total da compra: R$ ");
            double valor_compra = scanner.nextDouble();
            System.out.print("Digite o valor recebido do cliente: R$ ");
            double valor_recebido = scanner.nextDouble();

            if (valor_recebido >= valor_compra) {
                double troco = valor_recebido - valor_compra;
                System.out.printf("Troco: R$ %.2f%n", troco);
                calcularTroco(troco);
            } else {
                System.out.println("O valor recebido é menor que o valor da compra.");
            }

            System.out.print("Deseja calcular o troco para outra compra? (s/n): ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

             System.out.println("Sistema de troco encerrado. Obrigado!");
                scanner.close();
    }
    
    public static void calcularTroco(double troco) {
            System.out.println("Notas e moedas necessárias para o troco:");

        for (double nota_moeda : notas_moedas) {
            if (troco >= nota_moeda) {
                int quantidade = (int) (troco / nota_moeda);
                troco -= quantidade * nota_moeda;
                troco = Math.round(troco * 100.0) / 100.0; 

                if (quantidade > 0) {
                    if (nota_moeda >= 1) {
                        System.out.println(quantidade + " nota(s) de R$ " + (int) nota_moeda);
                    } else {
                        System.out.println(quantidade + " moeda(s) de R$ " + String.format("%.2f", nota_moeda));
                    }
                }
            }
        }
    }
}
