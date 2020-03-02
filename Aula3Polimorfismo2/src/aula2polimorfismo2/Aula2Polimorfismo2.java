package aula2polimorfismo2;
public class Aula2Polimorfismo2 {
    private static void desenhar(Forma[] f){
        for(int i = 0; i < f.length; i++){
            f[i].desenhar();
        }
    }
   public static void main(String[] args) {
        Forma[] formas = new Forma[]{
                            new Forma(), 
                            new Quadrado(), 
                            new Retangulo()
                        };
        desenhar(formas);
   }
}
