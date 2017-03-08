package aula03;

public class Conta {

    int numero;
    String titular;
    String cpf;
    double saldo;

    void visualizarSaldo() {
        System.out.println("Saldo : \n" + this.saldo);
        

    }

    void depositar (double valor) {
        if(valor > 0){
        this.saldo = this.saldo + valor;
        }

    }

    void sacar (double valorr) {
       
 
        if(valorr <= this.saldo){
            
        this.saldo = this.saldo - valorr;
        } else {
            System.out.println("vá juntar mais cash ok?");
        }

    }

    void transferirDinheiro () {

    }

}
