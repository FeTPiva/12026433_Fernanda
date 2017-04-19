package testeheranca2;

public class Concessionaria {

    static double taxaBonus = 0.05;
    private double totalVendas;
    static double totalFuncionarios;
    private double bonusIndividual;

    
    //contrutorzaum
    public Concessionaria(double bonus, double totalVendas) {
        this.bonusIndividual = bonus;
        this.totalVendas = totalVendas;

    }

    //gets
    public double getTotalVendas() {
        return this.totalVendas;
    }

    public double getBonusIndividual() {
        return this.bonusIndividual = this.bonusIndividual*this.taxaBonus;
    }

    //resto
    
    public double bonificacao() {

        return this.bonusIndividual = (this.totalVendas / this.totalFuncionarios) * taxaBonus;

    }

    
    
    
    
}
