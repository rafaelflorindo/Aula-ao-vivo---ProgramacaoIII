package aula2.exercicio2;

import java.util.ArrayList;

public class Aula2Exercicio2 {
    public static void main(String[] args) {
        ArrayList<Paciente> paciente = new ArrayList();
        ArrayList<Medico> medico = new ArrayList();
        ArrayList<Consulta> consulta1 = new ArrayList();
        
        paciente.add(new Paciente("Rafael"));
        paciente.add(new Paciente("Ricardo"));
        paciente.add(new Paciente("Rogerio"));
        
        medico.add(new Medico("Sandra"));
        medico.add(new Medico("Tania"));
        medico.add(new Medico("Vania"));
        
        consulta1.add(new Consulta(medico.get(0), paciente.get(0), "10/02/2020"));
        consulta1.add(new Consulta(medico.get(0), paciente.get(1), "10/02/2020"));
        consulta1.add(new Consulta(medico.get(1), paciente.get(0), "10/02/2020"));
        
        for(int i=0; i< consulta1.size(); i++){
            System.out.println(consulta1.get(i));
        }
    }    
}
