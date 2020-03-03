package aula4composicao1;
public class Aula4Composicao1 {
    public static void main(String[] args) {
       Hotel ht = new Hotel(new Quarto(8));
       
        System.out.println(ht);
        ht.matarQuarto();
        System.out.println(ht);
    }
    
}
