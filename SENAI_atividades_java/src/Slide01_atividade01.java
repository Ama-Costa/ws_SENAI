import java.util.Scanner;

public class Slide01_atividade01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float salario, total, horas;

        System.out.println("Digite o quanto um funcionário ganha por hora:");
        salario = ler.nextFloat();
        System.out.println("Quantas horas trabalhadas no mês pelo funcionário:");
        horas = ler.nextFloat();

        //OPERAÇÃO
        total = salario * horas;
        System.out.println("O salário do funcionário é de: R$" + String.format("%.2f", total));
    }
}
