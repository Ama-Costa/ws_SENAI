import java.util.Scanner;

public class Slide01_atividade03 {
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    char sexo;

    System.out.println("Digite seu genêro(M/F):");
    sexo = ler.nextLine().charAt(0);
    if(sexo == 'M'){
        System.out.println("Seu genêro é masculino.");
    }else if(sexo == 'F'){
        System.out.println("Seu genêro é feminino.");
    }else {
        System.out.println("Genêro inválido.");
    }

}
}
