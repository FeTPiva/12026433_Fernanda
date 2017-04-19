package testeheranca2;

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

    public double calcularComissao(Concessionaria x) {
        return this.taxaComissao * this.vendasVendedor + this.calcularBonusVendedor(x);

    }

    public double salarioDoMes(Concessionaria x) {
        return this.salarioBase + this.calcularComissao(x);

    }

    public void exibirResumo( Concessionaria y) {
        System.out.println(super.nomeCompleto + "\n" + this.calcularComissao(y) + this.salarioDoMes(y));
    }

    public void contabilizarVenda(double venda, Gerente nsei) {
        this.vendasVendedor = this.vendasVendedor + venda;
    }

    public double calcularBonusVendedor(Concessionaria bonus) {
       return this.vendasVendedor * 0.25 + bonus.getBonusIndividual();
        
    }
}
