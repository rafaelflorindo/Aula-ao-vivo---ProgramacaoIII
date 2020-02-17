package aula2.exercicio4;
import java.util.ArrayList;
public class Aula2Exercicio4 {
    public static void main(String[] args) {
        ArrayList<Produto> produto = new ArrayList();
    
        produto.add(new Produto("Belina"));
        produto.add(new Produto("Corsel"));
        produto.add(new Produto("Parati"));
        
        Pedido pedido1 = new Pedido();
        pedido1.addProduto(produto.get(0));
        pedido1.addProduto(produto.get(1));
        pedido1.addProduto(produto.get(2));
        
        pedido1.imprimir();
        
        Pedido pedido2 = new Pedido();
        pedido2.addProduto(produto.get(0));
        pedido2.addProduto(produto.get(1));
        pedido2.addProduto(produto.get(2));
        
        pedido2.imprimir();
    }
}