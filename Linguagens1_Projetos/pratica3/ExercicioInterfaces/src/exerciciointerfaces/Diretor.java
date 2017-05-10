
package exerciciointerfaces;


public class Diretor extends Funcionario implements IAutenticavel{
    
    public boolean autenticar(Integer x){
        return true;
    }
    
    
}
