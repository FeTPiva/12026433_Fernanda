package testeheranca2;

public class Concessionaria {

    static double taxaBonus = 0.05;
    double totalVendas;
    static double totalFuncionarios;
    double bonusIndividual;

    public Concessionaria(double bonus, double totalVendas) {
        this.bonusIndividual = bonus;
        this.totalVendas = totalVendas;

    }

    //gets
    public double getTotalVendas() {
        return this.totalVendas;
    }

    public double getBonusIndividual() {
        return this.bonusIndividual;
    }

    //resto
    
    public double bonificacao() {
double a;
        return a =this.bonusIndividual = (this.totalVendas / this.totalFuncionarios) * taxaBonus;

    }

    
    
    
    
}
