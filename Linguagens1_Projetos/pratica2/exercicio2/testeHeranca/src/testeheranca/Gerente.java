package testeheranca;

public class Gerente {

    private double senha;
    private double numeroVendedores;
    private String nome;
    private String cpf;
    private String registro;
    private double salarioBase;
    double totalVendas;
    double horaExtra;

    public void Gerente(String nome, String cpf, String registro, double salario, double ttlv,
            double hextra) {
        this.nome = nome;
        this.cpf = cpf;
        this.registro = registro;
        this.salarioBase = salario;
        this.totalVendas = ttlv;
        this.horaExtra = hextra;
     
    }

    //sett
    public void setNomeCompleto(String nome) {
        nome = this.nome;

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
        return this.nome;
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
        return this.salarioBase + this.horaExtra ;
    }

    public void exibirResumo() {
        System.out.println(this.nome + "\n" + this.salarioDoMes());
    }

    public void contabilizarVenda(double venda, Gerente nsei) {
        this.totalVendas = this.totalVendas + venda;
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
