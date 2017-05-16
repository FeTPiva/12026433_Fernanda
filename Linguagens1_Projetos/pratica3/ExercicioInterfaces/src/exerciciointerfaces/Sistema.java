
package exerciciointerfaces;


public class Sistema {
    
    public boolean login(IAutenticavel obj , String senha){
        
      return  obj.autenticar(senha);
                
    }
    
}
