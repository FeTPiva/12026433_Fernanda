
package exerciciointerfaces;


public class Cliente implements IAutenticavel, IImprimivel{
private String cpf;

public boolean autenticar(Integer x){
    return true;
}

public void imprimirResumo(){
    
}

}
