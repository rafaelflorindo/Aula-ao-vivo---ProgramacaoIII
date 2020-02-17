package aula2.exercicio1;

import java.util.ArrayList;
public class Aula2Exercicio1 {
    public static void main(String[] args) {  
        ArrayList<Livro> livro = new ArrayList();
        livro.add(new Livro("Programação III", "André Noel"));
        livro.add(new Livro("Programação II", "Danillo"));
                
        Estante estante = new Estante();
        estante.addLivro(livro.get(0));
        estante.addLivro(livro.get(1));
        
        estante.imprimir();
    }  
}
