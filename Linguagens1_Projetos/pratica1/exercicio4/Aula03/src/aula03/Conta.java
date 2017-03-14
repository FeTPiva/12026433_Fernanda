package aula03;

public class Conta {

    int numero;
    double saldo;
    Cliente titular = new Cliente();

    void exibirInfo(Conta c1) {
        System.out.println(c1.titular.nome + " " + c1.titular.sobrenome + "\n cpf:" + c1.titular.cpf + "\n");
    }

    void visualizarSaldo() {
        System.out.println("Saldo : \n" + this.saldo);

    }

    void depositar(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
        }

    }

    boolean sacar(double valorr) {

        if (this.saldo < valorr) {

            return false;

        } else {
            System.out.println("saque de : " + valorr);
            this.saldo = this.saldo - valorr;
            return true;

        }

    }

    boolean transferirPara(Conta c1, double valor) {
        
        if (this.saldo >=valor) {
        System.out.println("transferencia de: " + valor);
        return true;
        } 
        
        
       /* if (this.sacar(valor)) {
            c1.depositar(valor);
            System.out.println("blz transferiu valor de: " + valor);
            return true;

        } else {
            System.out.println("errm não rola a transferencia'-' ");
            return false;
        }
*/
    }

}
