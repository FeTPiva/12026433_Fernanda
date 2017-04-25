package testeheranca2;



public class Funcionario {
    

    protected String cpf;
    protected String registro;
    protected double salarioBase;
    protected String nomeCompleto;

    //creator
    public Funcionario(String nome, String cpf, String registro, double salario) {
        this.nomeCompleto = nome;
        this.cpf = cpf;
        this.salarioBase = salario;
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

    public double salarioDoMes() {
        return this.salarioBase;
    }

    public void exibirResumo() {
        System.out.println(nomeCompleto + "\n" + this.salarioDoMes());
    }

    public double calcularBonus(Concessionaria bonus) {
        return bonus.getBonusIndividual();
    }
}
//se colocar final antes dos public etc  herda e n sobrescreve ^-^. overrride deixa sobrescreve e tal
