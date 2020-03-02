package aula3classeabstrata;
import java.util.ArrayList;
public class Aula3ClasseAbstrata {
    public static void main(String[] args) {
        ArrayList<Livro> livro = new ArrayList();
        ArrayList<CD> cd = new ArrayList();
        ArrayList<DVD> dvd = new ArrayList();
        
        livro.add(new Livro("Rafael", 180, "Java", 140.50));
        cd.add(new CD("Sergio Reis", 10, "Sertanejo 1", 20.50));
        dvd.add(new DVD("Sergio Reis", 10, "Sertanejo 1", 20.50));
        System.out.println(livro);
        System.out.println(cd);
        System.out.println(dvd);
    }
}
