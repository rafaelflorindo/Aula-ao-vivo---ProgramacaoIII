package aula2.exercicio4;
import java.util.ArrayList;
public class Pedido {
    private ArrayList<Produto> produto = new ArrayList();
    
    public void addProduto(Produto produto1) {
        produto.add(produto1);       
    }

    @Override
    public String toString() {
        return "Pedido{" + "produto=" + produto + '}';
    }
    public void imprimir(){
        for (int i = 0; i< produto.size(); i++){
            System.out.println(produto.get(i));
        }
    } 
}
