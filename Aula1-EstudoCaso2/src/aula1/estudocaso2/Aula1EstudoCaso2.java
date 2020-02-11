package aula1.estudocaso2;

import java.util.ArrayList;

public class Aula1EstudoCaso2 {
    public static void main(String[] args) {
        ArrayList<Abastecimento> abastecimento = new ArrayList();
        
        abastecimento.add(new Abastecimento("12/12/2019", 10, 4.63, 45621));
        abastecimento.add(new Abastecimento("18/12/2019", 20, 4.50, 45832));
        abastecimento.add(new Abastecimento("12/12/2019", 40, 4.65, 45945));
        
        Abastecimento abs = new Abastecimento();
        
        System.out.println("Foram Gastos "+abs.quantidadeLitrosGastos(abastecimento)+" litros");
        System.out.println("Foram Gastos R$ "+abs.custoTotalPago(abastecimento));   
    }  
}
