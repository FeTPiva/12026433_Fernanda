
package exerciciointerfaces;


public class Diretor extends Funcionario implements IAutenticavel{
    private String psw;
    
    
    public Diretor(String nome, String reg, String s, double sal){
        this.nome = nome;
        super.registro = reg;
        this.psw = s;
        super.salario = sal;
    }
    
    
    public boolean darAumento(Funcionario f, String senha, double aumento){
        if(this.autenticar(senha)){
            f.setSalarioBase(f.getSalarioBase()+ aumento);
            return true;
        }
            
        return false;
    }
    
    
    @Override
    public boolean autenticar(String x){
        return this.psw.equals(x);
    }
   public boolean alterarSenha(String nova, String velha) {
        boolean retorno = false;
        if (autenticar(velha)) {
            this.psw = nova;
            retorno = true;
        }
        return retorno;
    }
}

