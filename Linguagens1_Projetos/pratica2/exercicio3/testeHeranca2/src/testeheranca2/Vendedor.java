package testeheranca2;

public class Vendedor extends Funcionario {

    protected static double taxaComissao = 0.03;
    private double vendasVendedor = 0;

    //creator
    public Vendedor(String nome, String cpf, String registro, double salario) {
        super(nome, cpf, registro, salario);
    }

//sets
    public double setTaxaComissao(double taxa) {
        return taxa = this.taxaComissao;

    }

    //gets
    public double getTaxaComissao() {
        return this.taxaComissao;
    }

    public void realizarVenda(double valor, double reg) {
        if (valor > 0) {
            this.vendasVendedor += valor;
        }
        

    }
    public double getVendas(){
        return this.vendasVendedor;
    }

    @Override
    public double calcularBonus(double bInd) {
        return this.vendasVendedor * Vendedor.taxaComissao + bInd;
    }

    public double calcularComissao(double a) {
        
        return this.taxaComissao * this.vendasVendedor + this.calcularBonus(a);

    }

   @Override
    public void exibirResumo() {
        super.exibirResumo();
        System.out.println(this.vendasVendedor);
    }

   public double remuneracaoFinal(double bI) {
        return this.calcularBonus(bI)+ this.salarioBase;
    }
}
