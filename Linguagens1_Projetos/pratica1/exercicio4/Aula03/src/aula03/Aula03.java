
package aula03;


public class Aula03 { 
    
    
    public static void main(String[] args) {
       Conta c1 = new Conta();
       Conta c2 = new Conta();
              
       c1.titular.nome = "Felomena";
       c1.titular.sobrenome = "Silva";
       c1.titular.cpf = "123456789";
       c1.exibirInfo(c1);
       c1.saldo = 1000;
       c1.visualizarSaldo();
       c1.sacar(200);
       c1.visualizarSaldo();
       c1.transferirPara(c2, 100);
       c1.visualizarSaldo();
       
     
       
       
               
    }
    
}
