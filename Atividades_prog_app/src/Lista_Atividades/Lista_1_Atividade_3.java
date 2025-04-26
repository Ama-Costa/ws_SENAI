package Lista_Atividades;

import java.util.Scanner;

public class Lista_1_Atividade_3 {

    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        int ano, vf4 = 4, total4;
        double vf400 = 400, total400;

        System.out.println("Digite o número do ano:");
        ano = leia.nextInt();
        total4 = ano % vf4; //VERIFICA SE O RESTO É 0
        System.out.println(total4);// EXIBE O RESTO DA DIVISÃO


        //FALTA FAZER A VERIFICAÇÃO DA DIVISAO POR 400
        total400 = ano % vf400;
        System.out.println(total400);

        if(total4 == 0){
            System.out.println("O ano " + ano + " é bissexto");
        }else{
            System.out.println("O ano " + ano + " não é bissexto");
        }

    } 
}
