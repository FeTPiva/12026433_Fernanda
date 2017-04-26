package testeheranca2;

public class Gerente extends Funcionario {

    private String senha;
    private double numeroVendedores;
    private double vendasGerente;
    protected static double taxaComissao = 0.05;
    protected static double taxaExtra = 0.25;

    public Gerente(String nome, String cpf, String registro, double salario) {
        super(nome, cpf, registro, salario);
        this.senha = senha;
        

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

    @Override
    public double calcularBonus(double bi) {
        return this.vendasGerente * Gerente.taxaComissao + bi + this.salarioBase * this.taxaExtra;

    }

    public double remuneracaoFinal(double bI) {
        return this.calcularBonus(bI)+ this.salarioBase;
    }

    public void realizarVenda(double valor, double reg) {
        if (valor > 0) {
            this.vendasGerente += valor;
        }
    }
    
    }
