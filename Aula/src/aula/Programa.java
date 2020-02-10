package aula;
import java.util.ArrayList;
public class Programa {
    public static void main(String[] args) {
        ArrayList<ContaEnergia> conta = new ArrayList();
       
        conta.add(new ContaEnergia("12/08/2019", 24512, 380, 457.45, "18/08/2019", 20));
        conta.add(new ContaEnergia("11/09/2019", 24812, 300, 457.45, "18/09/2019", 25));
        conta.add(new ContaEnergia("13/10/2019", 24832, 320, 457.45, "18/10/2019", 30));
        conta.add(new ContaEnergia("14/11/2019", 25152, 330, 457.45, "18/11/2019", 25));
        
        ContaEnergia ce = new ContaEnergia();
 
        System.out.println("Maior Consumo = R$ "+ce.verificarMaiorConsumo(conta));
        System.out.println("Menor Consumo = R$ "+ce.verificarMenorConsumo(conta));   
    }    
}