
package testeheranca2;


public class Gerente extends Funcionario {
    
    private double senha;
    private double numeroVendedores;

    public void Gerente(String nome, String cpf, String registro, double salario, double ttlv,
            double hextra) {
       super(nome, cpf, registro, salarioBase, ttlv, hextra)   

    }

    public boolean darAumento(Vendedor v, double taxa, double senha) {
        //comparar se é embaixo do gerente, senha, e ai jogar a taxa.... 
        if (this.senha == senha) {
            v.salarioBase = v.salarioBase * taxa;
            return true;
        }
        return false;
    }

    public double acrescentarVendedores() {
        return this.numeroVendedores = this.numeroVendedores + 1;
    }

    public double diminuirVendedores() {
        return this.numeroVendedores = this.numeroVendedores - 1;
    }

    public boolean autentica(double senha) {
        if (this.senha == senha) {
            System.out.println("ok");
            return true;
        } else {
            System.out.println("não");
            return false;

        }
    }
    
}
