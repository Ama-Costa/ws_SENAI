import java.util.Scanner;

public class teste {

    static double troco, valorCompra, valorPago;
    static Scanner leia = new Scanner(System.in);

    public static void entrada() { // CONFERIR SE O PAGAMENTO FOI SUFICIENTE
        do {
            System.out.print("Valor Total das Compras: R$ ");
            valorCompra = leia.nextDouble();
            System.out.print("Valor Recebido: R$ ");
            valorPago = leia.nextDouble();

            troco = valorCompra - valorPago;

            if (troco > 0) {
                System.out.printf("Pagamento insuficiente!\nFaltou R$%.2f\ntente novamente\n", troco);
            }
        } while (troco > 0);

        troco = Math.abs(troco);
        arredondar(troco);
        System.out.println("Troco: R$ " + troco); // VALOR ORIGINAL DO TROCO
    }

    public static void arredondar(double redondo) {
        redondo = Math.round(redondo * 100.0) / 100.0;
        troco = redondo;
    }

    public static void calculo(double[] notas, double[] moedas) {
        // NOTAS
        int qtd = 0;
        int x = 0;
        while (troco >= 2) {
            if (troco >= notas[x]) {
                troco = troco - notas[x];
                arredondar(troco);
                qtd++;
            } else {
                if (qtd > 0) {
                    System.out.printf(qtd + " Nota: R$ %.2f\n", notas[x]);
                }
                qtd = 0;
                x++;
            }
        }
        // MOEDAS
        qtd = 0;
        x = 0;
        while (troco >= 0.05) {
            if (troco >= moedas[x]) {
                troco = troco - moedas[x];
                arredondar(troco);
                qtd++;
            } else {
                if (qtd > 0) {
                    System.out.printf(qtd + " Moeda: R$ %.2f\n", moedas[x]);
                }
                qtd = 0;
                x++;
            }
        }
    }

    public static void main(String[] args) {

        double[] notas = { 200, 100, 50, 20, 10, 5, 2 };
        double[] moedas = { 1, 0.50, 0.25, 0.10, 0.05 };

        entrada();
        calculo(notas, moedas);
    }
}
