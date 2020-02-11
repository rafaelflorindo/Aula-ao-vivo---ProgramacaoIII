package aula1.estudocaso2;
import java.util.ArrayList;

public class Abastecimento {
    private String dataAbastecimento;
    private double qtdLitro,precoLitro;
    private int kmAtual;

    public Abastecimento() { }
        
    public Abastecimento(String dataAbastecimento, double qtdLitro, 
            double precoLitro, int kmAtual) {
        this.dataAbastecimento = dataAbastecimento;
        this.qtdLitro = qtdLitro;
        this.precoLitro = precoLitro;
        this.kmAtual = kmAtual;
    }

    public double getQtdLitro() {
        return qtdLitro;
    }
    public double getPrecoLitro() {
        return precoLitro;
    }  

    public int quantidadeLitrosGastos (ArrayList<Abastecimento> base){
        int totalLitro=0;
        for(int i = 0; i<base.size(); i++){
            totalLitro+=base.get(i).getQtdLitro();
        }
        return totalLitro;
    }
        
    public double custoTotalPago (ArrayList<Abastecimento> base){
        double totalValorPago=0;
        for(int i=0; i<base.size(); i++){
            totalValorPago+=base.get(i).getQtdLitro()*base.get(i).getPrecoLitro();
        }
        
        return totalValorPago;
    }
}
