package aula03;

public class Conta {

    private int numero;
    private double saldo;
    private Cliente titular = new Cliente();

   public void exibirInfo(Conta c1) {
        System.out.println(c1.titular.nome + " " + c1.titular.sobrenome + "\n cpf:" + c1.titular.cpf + "\n");
    }

   public void visualizarSaldo() {
        System.out.println("Saldo : \n" + this.saldo);

    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
        }

    }

    public boolean sacar(double valorr) {

        if (this.saldo < valorr) {

            return false;

        } else {
            System.out.println("saque de : " + valorr);
            this.saldo = this.saldo - valorr;
            return true;

        }

    }

    public boolean transferirPara(Conta c1, double valor) {

        if (this.saldo >= valor) {
            System.out.println("transferencia de: " + valor);
            return true;
        } else {
            System.out.println("não da pra transferir");
            return false;
        }

        /* if (this.sacar(valor)) {
            c1.depositar(valor);
            System.out.println("blz transferiu valor de: " + valor);
            return true;

        } else {
            System.out.println("errm não rola a transferencia'-' ");
            return false;
        }
(não quero q fique mostrando mensagenzinha do sacar '-' )*/
    }


}
