package testeheranca;

public class Gerente extends Vendedor {

    private double horaExtra;
    private double senha;
    private double numeroVendedores;

    //é isso da zoado mesmo do contrutor
    public Gerente(String nome, String cpf, String registro, double salario, double ttlv, double senha) {

        this.nomeCompleto = nome;
        this.cpf = cpf;
        this.salarioBase = salario;
        this.totalVendas = ttlv;

        this.registro = registro;
        this.senha = senha;
    }

    public boolean darAumento(Vendedor v, double taxa, double senha) {
        //comparar se é embaixo do gerente, senha, e ai jogar a taxa.... 
        if (v.getRegistro() =) {
            ,-,
        }
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
}
