package aula03;

public class Aula03 {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();

        c1.criarCliente("seila", "auisedhif", "16615658");
        c1.exibirInfo(c1);

        
      
       c1.saldo = 1000;
       c1.visualizarSaldo();
       c1.sacar(200);
       c1.visualizarSaldo();
       c1.transferirPara(c2, 100);
       c1.visualizarSaldo();
       
         
    }

}
