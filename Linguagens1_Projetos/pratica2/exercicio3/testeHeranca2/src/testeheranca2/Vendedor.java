package testeheranca2;

import static testeheranca2.Concessionaria.taxaBonus;
import static testeheranca2.Concessionaria.totalFuncionarios;



public class Vendedor extends Funcionario {

    public static double taxaComissao = 0.03;
    public static double vendasVendedor;

    //creator
    public Vendedor(String nome, String cpf, String registro, double salario, double vendas) {
        super(nome, cpf, registro, salario);
        this.vendasVendedor = vendas;
    }

//sets
    public double setTaxaComissao(double taxa) {
        return taxa = this.taxaComissao;

    }

    //gets
    public double getTaxaComissao() {
        return this.taxaComissao;
    }

    public double calcularComissao() {
        return taxaComissao * this.vendasVendedor;
        
    }
 

    public double salarioDoMes() {
        return this.salarioBase + this.calcularComissao;
               
            }

    public void exibirResumo(Funcionario x, Concessionaria y) {
        System.out.println(this.nomeCompleto + "\n" + this.calcularComissao(x) + this.salarioDoMes(y));
    }

    public void contabilizarVenda(double venda, Gerente nsei) {
        this.totalVendas = this.totalVendas + venda;
    }

    @Override
    public void calcularBonus(double bInd, Concessionaria bonus) {
        return this.vendas * 0.25 + bonus;
    }
}
