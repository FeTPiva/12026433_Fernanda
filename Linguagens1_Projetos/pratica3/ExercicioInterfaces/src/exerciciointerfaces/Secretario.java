
package exerciciointerfaces;


public class Secretario extends Funcionario implements IExibicao{
    
    public boolean atenderTelefone(boolean ocupado){
        return !ocupado;

        
}
    
    @Override
    public void exibirResumo(){
        System.out.println("alou vou pegar café");
    }
    public Secretario(String nome, double sal, String reg){
         super.nome = nome;
         super.salario = sal;
         super.registro = reg;
    }
           
}
