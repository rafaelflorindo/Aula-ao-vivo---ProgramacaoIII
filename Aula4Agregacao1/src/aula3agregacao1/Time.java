package aula3agregacao1;
import java.util.ArrayList;
public class Time {
    private String nome;
    private ArrayList<Pessoa> pessoa = new ArrayList();

    public String getNome() {
        return nome;
    }
  
    public Time(String nome) {
        this.nome = nome;
    }

    public void addPessoa(Pessoa pes) {
        pessoa.add(pes);
    }

    public void imprimir(){
        System.out.println("Time: "+getNome());
        for(int i = 0; i < pessoa.size(); i++){
            System.out.println("Participante [" + i + "] = " + pessoa.get(i).getNome());
        }
    }    
}