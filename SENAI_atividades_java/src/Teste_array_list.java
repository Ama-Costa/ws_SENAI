import java.util.ArrayList;
import java.util.List;

public class Teste_array_list {
    public static void main(String[] args) {

        //APENAS TESTADO ARRAY E LISTA
        ArrayList<String> lista = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();

        lista.add("Ana");
        lista.add("Bob");
        lista.add("Leo");
        lista.add("Douglas");
        System.out.println(lista.size());
        System.out.println(lista.get(0));
        lista.remove(1);
        System.out.println(lista.size());
        System.out.println(lista.get(1));

        System.out.println("Lista 2:");
        lista2.add("Joana");
        lista2.add("Paulo");
        System.out.println(lista2.size());
        System.out.println(lista2.get(0) + "\n");



        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i) + " na posição " + i);
        }
    }
}