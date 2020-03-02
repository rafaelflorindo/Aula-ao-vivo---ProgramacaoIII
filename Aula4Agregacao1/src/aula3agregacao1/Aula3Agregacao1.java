package aula3agregacao1;
import java.util.ArrayList;
public class Aula3Agregacao1 {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoa = new ArrayList();

        pessoa.add(new Pessoa("Rafael"));
        pessoa.add(new Pessoa("Janaina"));
        pessoa.add(new Pessoa("Flávia"));
        pessoa.add(new Pessoa("Ronie"));
     
        Time time1 = new Time("Guerreiros do EAD");
        time1.addPessoa(pessoa.get(0));
        time1.addPessoa(pessoa.get(3));
        time1.addPessoa(pessoa.get(2));
        
        time1.imprimir();         
    }
}
