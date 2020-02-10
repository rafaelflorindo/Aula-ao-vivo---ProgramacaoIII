package aula1.estudocaso2;

import java.util.ArrayList;

public class Aula1EstudoCaso2 {
    public static void main(String[] args) {
        ArrayList<Abastecimento> abastecimento = new ArrayList();
        
        abastecimento.add(new Abastecimento("12/12/2019", 10, 4.63, 45621));
        abastecimento.add(new Abastecimento("18/12/2019", 20, 4.63, 45832));
        abastecimento.add(new Abastecimento("12/12/2019", 40, 4.63, 45945));
        
        for(int i = 0; i<abastecimento.size(); i++){
            System.out.println(abastecimento.get(i));
        }
        
    }
    
}
