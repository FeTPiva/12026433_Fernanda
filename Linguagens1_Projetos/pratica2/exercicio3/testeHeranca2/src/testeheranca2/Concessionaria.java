package testeheranca2;

public class Concessionaria {

    static double taxaBonus = 0.05;
    static double totalVendas;
    static double totalFuncionarios;
    double bonusIndividual;

    public Concessionaria(double bonus) {
        this.bonusIndividual = bonus;

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

        return this.bonusIndividual = (this.totalVendas / this.totalFuncionarios) * taxaBonus;

    }

}
