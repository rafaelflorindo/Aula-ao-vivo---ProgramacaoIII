package aula3interface1;
public class Gerente implements InterfaceAutenticar{
    private String usuario, senha;

    public Gerente(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    @Override
    public Boolean logar(String usuario, String senha) {
        if(usuario == this.usuario && senha == this.senha){
            return true;
        }else{
            return false;
        }
    }
}