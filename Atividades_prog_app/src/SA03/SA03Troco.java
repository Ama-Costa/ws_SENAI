import java.util.Scanner;

public class SA03Troco {

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
        System.out.printf("Troco: R$ %.2f\n", troco); // VALOR ORIGINAL DO TROCO
        arredondar(troco);

    }

    public static void arredondar(double redondo) {
        redondo = Math.round(redondo * 100.0) / 100.0;
        troco = redondo;
    }

    public static void calculo(double[] notas, double[] moedas) {
        // NOTAS
        int qtd = 0;
        while (troco >= 2) {
            for (int x = 0; x <= 6;) {
                if (troco >= notas[x]) {
                    troco = troco - notas[x];
                    arredondar(troco);
                    qtd++;
                } else {
                    if (qtd > 0) {
                        System.out.printf(qtd + " Nota: R$ %.2f\n", notas[x]);
                    }
                    x++;
                    qtd = 0;
                }
            }
        }
        // MOEDAS
        qtd = 0;
        while (troco >= 0.05) {
            for (int x = 0; x <= 4;) {
                if (troco >= moedas[x]) {
                    troco = troco - moedas[x];
                    arredondar(troco);
                    qtd++;
                } else {
                    if (qtd > 0) {
                        System.out.printf(qtd + " Moeda: R$ %.2f\n", moedas[x]);
                    }
                    x++;
                    qtd = 0;
                }
            }

        }
    }

    public static void main(String[] args) {

        double[] notas = { 200, 100, 50, 20, 10, 5, 2 };
        double[] moedas = { 1, 0.50, 0.25, 0.10, 0.05 };

        while (true) {
            entrada();
            calculo(notas, moedas);
            System.out.print("\nDeseja realizar outra compra? (S/N): ");
            leia.nextLine();
            String loop = leia.nextLine();
            if (!loop.equalsIgnoreCase("s")) {
                if (!loop.equalsIgnoreCase("n")) {
                    System.out.println("Opção invalida!");
                    break;
                }
                break;
            }
        }
    }
}