package Lista_Atividades;

import java.util.Scanner;

public class Lista_2_Atividade_3 {

    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        int senha, tentativa = 0;

        while(tentativa < 3){
            System.out.println("Digite sua senha:");
            senha = leia.nextInt();

            if(senha == 12345){
                System.out.println("Acesso Permitido");
                tentativa = 5;
            }
            tentativa++;
        }
        if (tentativa == 3) {
            System.out.println("Acesso Negado");
        }
    }
}
