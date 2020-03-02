package aula3heranca1;
public class Aula3Heranca1 {
    public static void main(String[] args) {
        Casa casaAmarela = new Casa();
        casaAmarela.setCidade("Maringá");
        casaAmarela.setEndereco("Rua José Nabuco, 234");
        casaAmarela.setTamCasa(160);
        casaAmarela.setTamQuintal(300);
        System.out.println("Endereço: "+ casaAmarela.getEndereco());
        System.out.println("Cidade: "+ casaAmarela.getCidade());
        System.out.println("Tamanho Quintal: "+ casaAmarela.getTamQuintal());
        System.out.println("Tamanho Casa: "+ casaAmarela.getTamCasa());
    }
}
