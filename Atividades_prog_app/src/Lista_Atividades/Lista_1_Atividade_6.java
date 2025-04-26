package Lista_Atividades;

import java.util.Scanner;

public class Lista_1_Atividade_6 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int escolha, loop;
        double area, altura, raio, base; 
do{
        System.out.println("Escolha qual forma geométrica você deseja calcular a área:");
        System.out.println("1 - Circulo");
        System.out.println("2 - Retângulo");
        System.out.println("3 - Triângulo");
        escolha = leia.nextInt();

        switch (escolha) {
            case 1: // CIRCULO, A = π.R²
            System.out.println("Você escolheu circulo");
            System.out.println("Digite o raio do circulo:");
            raio = leia.nextDouble();
            area = Math.PI * Math.pow(raio, 2);
            System.out.printf("RESULTADO = %.2f\n", area);

                break;

            case 2: // RETANGULO, A = B * H
            System.out.println("Você escolheu retângulo");
            System.out.println("Digite a altura do retângulo:");
            altura = leia.nextDouble();
            System.out.println("Digite a base do retângulo:");
            base = leia.nextDouble();
            area = base * altura;
            System.out.println("RESULTADO = " + area);

                break;

            case 3: // TRIANGULO, A = (B * H) / 2
            System.out.println("Você escolheu triângulo");
            System.out.println("Digite a base do triângulo:");
            base = leia.nextDouble();
            System.out.println("Digite a altura do triângulo:");
            altura = leia.nextDouble();
            area = (base * altura) / 2;
            System.out.printf("RESULTADO = %.2f\n", area);

                break;

            default:
            System.out.println("Escolha Inválida");
                break;
        }
        System.out.println("Deseja repetir? (1 = sim, 0 = não)");
        loop = leia.nextInt();
    }while(loop == 1);
    }
}
