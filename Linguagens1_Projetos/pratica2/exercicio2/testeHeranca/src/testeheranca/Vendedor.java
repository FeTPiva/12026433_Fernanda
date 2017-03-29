/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeheranca;


public class Vendedor {
    
    private String cpf;
    private String registro;
    private double salarioBase;
    private String nomeCompleto;
    public static double taxaComissao = 0.03;
    private double horaExtra;
    private double totalVendas;
    
   

    //creator
    public  Vendedor(String nome, String cpf, String registro, double salario, double ttlv, double hextra, Gerente g) {
        this.nomeCompleto = nome;
        this.cpf = cpf;
        this.salarioBase = salario;
        this.totalVendas = ttlv;
        this.horaExtra = hextra;
        this.registro = registro;
        
    }

//sett
    public void setNomeCompleto(String nome) {
        nome = this.nomeCompleto;

    }

    public void setSalarioBase(double salario) {
        salario = this.salarioBase;

    }

    public void setCpf(String cpf) {
        cpf = this.cpf;

    }

    public void setRegistro(String registro) {
        registro = this.registro;

    }

    public double setTaxaComissao(double taxa) {
        return taxa = this.taxaComissao;

    }

    public void setHoraExtra(double hora) {
        hora = this.horaExtra;

    }

    //gets
    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    public double getSalarioBase() {
        return this.salarioBase;

    }

    public String getCpf() {
        return this.cpf;
    }

    public String getRegistro() {
        return this.registro;
    }

    public double getTaxaComissao() {
        return this.taxaComissao;
    }

    public double getHoraExtra() {
        return this.horaExtra;
    }

    public double calcularComissao() {
        return taxaComissao * totalVendas;
    }

    public double calcularDecimoTerceiro() {
        return this.salarioBase;
    }

    public double calcularFerias() {
        return this.salarioBase + (1 / 3) * this.salarioBase;
    }

    public double salarioDoMes() {
        return this.salarioBase + this.horaExtra + this.calcularComissao();
    }

    public void exibirResumo() {
        System.out.println(nomeCompleto + "\n"  +this.calcularComissao() + this.salarioDoMes());
    }

    public void contabilizarVenda(double venda, Gerente nsei) {
        this.totalVendas = this.totalVendas + venda;
    }
    
}
