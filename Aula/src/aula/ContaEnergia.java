package aula;
import java.util.ArrayList;
public class ContaEnergia {
    private String dataLeitura;
    private int numeroLeitura;
    private int qtdKwGasto;
    private double valorPagar;
    private String dataPagamento;
    private double mediaConsumo;

    public int getQtdKwGasto() {
        return qtdKwGasto;
    }
    
    public ContaEnergia(){}
    public ContaEnergia(String dataLeitura, int numeroLeitura, int qtdKwGasto, 
            double valorPagar, String dataPagamento, double mediaConsumo) {
        this.dataLeitura = dataLeitura;
        this.numeroLeitura = numeroLeitura;
        this.qtdKwGasto = qtdKwGasto;
        this.valorPagar = valorPagar;
        this.dataPagamento = dataPagamento;
        this.mediaConsumo = mediaConsumo;
    }
    
    public double verificarMaiorConsumo(ArrayList<ContaEnergia> ce){
        int maior = 0;
        for(int i = 0; i< ce.size(); i++){
            if (ce.get(i).getQtdKwGasto() > maior){
                maior = ce.get(i).getQtdKwGasto();
            }
        }    
        return maior;
    }
    public double verificarMenorConsumo(ArrayList<ContaEnergia> ce){
        int menor = 100000;
        for(int i = 0; i< ce.size(); i++){
            if (ce.get(i).getQtdKwGasto() < menor){
                menor = ce.get(i).getQtdKwGasto();
            }
        }    
        return menor;
    }
}