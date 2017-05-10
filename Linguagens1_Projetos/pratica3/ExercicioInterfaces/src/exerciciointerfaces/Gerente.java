package exerciciointerfaces;

public class Gerente extends Funcionario implements IAutenticavel {

   private Integer senha;

    public Gerente(String nome, String reg, double sal, Integer s) {
        this.nome = nome;
        this.registro = reg;
        this.salario = sal;
        this.senha = s;
    }

    public double setSenha(Integer s){
        return this.senha = s;
    }
            
    public boolean autenticar(Integer x) {

        if (x == this.senha) {
            return true;

        } else {
            return false;
        }
    }

    
    
    
    
}
