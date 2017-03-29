package testeheranca;

public class Gerente {

    private String cpf;
    private String registro;
    private double salarioBase;
    private String nomeCompleto;
    private double horaExtra;
    private double totalVendas;
    private double senha;
    private double numeroVendedores;

    
    public Gerente(String nome, String cpf,String registro, double salario, double ttlv, double hextra, double senha) {
        this.nomeCompleto = nome;
        this.cpf = cpf;
        this.salarioBase = salario;
        this.totalVendas = ttlv;
        this.horaExtra = hextra;
        this.registro = registro;
        this.senha = senha;
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

    public double getHoraExtra() {
        return this.horaExtra;
    }

    public double calcularDecimoTerceiro() {
        return this.salarioBase;
    }

    public double calcularFerias() {
        return this.salarioBase + (1 / 3) * this.salarioBase;
    }

    public double salarioDoMes() {
        return this.salarioBase + this.horaExtra;
    }

    public void exibirResumo() {
        System.out.println(nomeCompleto + "\n" + this.salarioDoMes());
    }

    public void contabilizarVenda(double venda) {
        this.totalVendas = this.totalVendas + venda;
    }
    
    
    public double alterarSalarioVendedor(Vendedor x,double senha){
      // if(this.senha = senha){
           
    }
    
    public double acrescentarVendedores(){
        return this.numeroVendedores = this.numeroVendedores +1;
    }
    public double diminuirVendedores(){
        return this.numeroVendedores = this.numeroVendedores -1;
    }

}

