package Lista_Atividades;

import java.util.Scanner;

public class Lista_2_Atividade_1 {

    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        int num, total = 0;

        do{
        System.out.println("Digite números inteiros, quando quiser parar digite um número negativo:");
        num = leia.nextInt();
        if(num >= 0){
        total = total + num; 
        }   

        }while(num >= 0);
        System.out.println("O total é = " + total);
    } 
}
