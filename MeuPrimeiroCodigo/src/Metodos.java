public class Metodos {

    // ESCOPO GLOBAL
    static double num1, num2, resultado;

    // MÉTODO SEM RETORNO (VOID) SEM PARAMETRO = PROCEDIMENTO S/ PARAMETRO
    public static void soma() {
        resultado = num1 + num2;
    }

    // METODO SEM RETORNO (VOID) COM PARAMETRO = PROCEDIMENTO C/ PARAMETRO
    public static void subtracao(double x, double y) { // VARIAVEIS LOCAIS
        resultado = x - y;
    }

    //METODO COM RETORNO (TIPO) SEM PARAMETRO = FUNCAO S/ PARAMETRO
    public static double multiplicacao(){
        return num1 * num2;
    }

    //METODO COM RETORNO (TIPO) COM PARAMETRO = FUNCAO C/ PARAMETRO
    public static double divisao(double n1, double n2){//VARIAVEIS LOCAIS OU PARAMETRO?
        return n1 / n2;
    }
    //CODIGO PRINCIPAL
    public static void main(String[] args) {
        num1 = 10;
        num2 = 5;
        soma();
        System.out.println(resultado);
        subtracao(num1, num2);
        System.out.println(resultado);
        System.out.println(multiplicacao());
        System.out.println(divisao(num1, num2));
    }
}