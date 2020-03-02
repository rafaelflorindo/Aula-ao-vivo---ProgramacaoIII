package aula3interface1;
import java.util.ArrayList;
public class Aula3Interface1 {
    public static void main(String[] args) {
        ArrayList<Gerente> gerente = new ArrayList();
        gerente.add(new Gerente("rafael", "123"));
        if(gerente.get(0).logar("rafael", "123"))
            System.out.println("Autenticado");
        else
            System.out.println("Não autenticado");
    }    
}
