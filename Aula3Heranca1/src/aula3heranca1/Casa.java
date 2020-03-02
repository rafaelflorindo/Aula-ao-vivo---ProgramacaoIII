package aula3heranca1;
public class Casa extends Imovel{
    private int tamQuintal, tamCasa;
    public int getTamQuintal() {
        return tamQuintal;
    }
    public void setTamQuintal(int tamQuintal) {
        this.tamQuintal = tamQuintal;
    }
    public int getTamCasa() {
        return tamCasa;
    }
    public void setTamCasa(int tamCasa) {
        this.tamCasa = tamCasa;
    }
    @Override
    public String toString() {
        super.toString();
        return "Casa{" + "tamQuintal=" + tamQuintal + ", tamCasa=" + tamCasa + '}';
    }
}
