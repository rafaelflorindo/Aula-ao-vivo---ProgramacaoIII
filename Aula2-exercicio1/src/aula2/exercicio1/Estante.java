package aula2.exercicio1;

import java.util.ArrayList;

public class Estante {
    private ArrayList<Livro> livro = new ArrayList();
    
    public void addLivro(Livro livro1) {
        livro.add(livro1);       
    }

    @Override
    public String toString() {
        return "Estante{" + "livro=" + livro + '}';
    }
    public void imprimir(){
        for (int i = 0; i< livro.size(); i++){
            System.out.println(livro.get(i));
            
        }
    }   
}
