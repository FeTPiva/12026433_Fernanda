package exerciciointerfaces;

public class Gerente extends Funcionario implements IAutenticavel {
private String psw;
  

    public Gerente(String nome, String reg, double sal,String s) {
        this.nome = nome;
        this.registro = reg;
        this.salario = sal;
        this.psw = s;
    }

    public String setSenha(String s){
        return this.psw = s;
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
