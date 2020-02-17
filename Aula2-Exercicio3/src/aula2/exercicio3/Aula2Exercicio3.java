package aula2.exercicio3;
import java.util.ArrayList;
public class Aula2Exercicio3 {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList();
        clientes.add(new Cliente("Rafael"));
        clientes.add(new Cliente("Ricardo"));
        clientes.add(new Cliente("Samuel"));
        
        ArrayList<Compra> compras = new ArrayList();
        
        compras.add(new Compra(clientes.get(0),789.58));
        compras.add(new Compra(clientes.get(1),1789.58));
        compras.add(new Compra(clientes.get(0),500.58));
        
        for(int i=0; i<compras.size(); i++){
            System.out.println(compras.get(i));
        }
    }    
}
