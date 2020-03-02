package aula4agregacao2;
import java.util.ArrayList;
public class Aula4Agregacao2 {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoa = new ArrayList();
        ArrayList<Jogo> jogoDama = new ArrayList();
        pessoa.add(new Pessoa("Rafael"));
        pessoa.add(new Pessoa("Janaina"));
        pessoa.add(new Pessoa("Flávia"));
        pessoa.add(new Pessoa("Ronie"));
     
        jogoDama.add(new Jogo("Dama",pessoa.get(0), pessoa.get(1)));
        System.out.println(jogoDama.get(0));
    }    
}
