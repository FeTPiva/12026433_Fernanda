

package exerciciointerfaces;



public class ExercicioInterfaces {

    
    
    
    public static void main(String[] args) {
        
        Secretario sec = new Secretario("asidfua", 1000, "jsdhfas156");
        Gerente ge = new Gerente("asdgfa", "ausdgif", 500000, "abcd");
        Cliente cl = new Cliente("hdsfuio", "usdghfias", "sdgftzs");
        Diretor di = new Diretor("asdhf", "gdsuiçf", "asuid", 50006465);
        cl.imprimirResumo();
        
       Sistema s = new Sistema();
       String steste = "abcd";
       if(s.login(ge, steste)){
           
           
           System.out.println("foi");
           
       }
    }
    
}
