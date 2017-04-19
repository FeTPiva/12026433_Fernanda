package testeheranca2;

public class Gerente extends Funcionario {

    private String senha;
    private double numeroVendedores;
    private double vendasGerente;

   

    public Gerente(String nome, String cpf, String registro, double salario, String senha, double vends) {
        super(nome, cpf, registro, salario);
        this.senha = senha;
        this.numeroVendedores = vends;
        
    }

    public double bonusGerente(Concessionaria x) {
        return this.salarioBase * 0.25 + this.vendasGerente * 0.05 + x.getBonusIndividual();

    }

    public double salarioDoMes(Concessionaria x) {
        return this.salarioBase + this.bonusGerente(x);

    }

    public boolean darAumento(Vendedor v, double taxa, String senha) {
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

    public boolean autentica(String senha) {
        if (this.senha == senha) {
            System.out.println("ok");
            return true;
        } else {
            System.out.println("noob");
            return false;

        }
    }

}
