
package testeheranca2;


public class Vendedor extends Funcionario{
    
    public static double taxaComissao = 0.03;
    public static double totalVendas;
   

    //creator
    public  Vendedor(String nome, String cpf, String registro, double salario, double ttlv, Gerente g) {
        this.nomeCompleto = nome;
        this.cpf = cpf;
        this.salarioBase = salario;
        this.totalVendas = ttlv;
       
        this.registro = registro;
        
    }

//sets

    public double setTaxaComissao(double taxa) {
        return taxa = this.taxaComissao;

    }

    public void setHoraExtra(double hora) {
        hora = this.horaExtra;

    }

    
    //gets
    
    public double getTaxaComissao() {
        return this.taxaComissao;
    }

  
    public double calcularComissao() {
        return taxaComissao * totalVendas + totalVendas;
    }

   
    public double salarioDoMes() {
        return this.salarioBase + this.calcularComissao();
    }

    public void exibirResumo() {
        System.out.println(nomeCompleto + "\n"  +this.calcularComissao() + this.salarioDoMes());
    }

    public void contabilizarVenda(double venda, Gerente nsei) {
        this.totalVendas = this.totalVendas + venda;
    }
    
    @Override
    public void calcularBonus(double bInd, Concessionaria bonus){
      return this.vendas*0.25 + bonus;
    }
}
