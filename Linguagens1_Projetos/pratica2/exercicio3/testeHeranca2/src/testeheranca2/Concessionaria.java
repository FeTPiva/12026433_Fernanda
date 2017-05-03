package testeheranca2;

public class Concessionaria {

    private double taxaBonus = 0.05;
    private int totalFuncionarios;
    private Vendedor[] vendedor;
    private Gerente[] gerente;
    private int nVendedor = 0;
    private int nGerente = 0;
    
    
    //contrutorzaum
    public Concessionaria(int nV, int nG) {
        vendedor = new Vendedor[nV];
        
        gerente = new Gerente[nG];

    }
//sett

    public void setTaxaBonus(double taxa) {
        this.taxaBonus = taxa;
    }

    //gets
    //public double getTotalVendas() {
   //     return this.totalVendas;
   // }

   

    //resto
    public boolean novoVendedor(String nome, String cpf, String registro, double salario) {
        boolean result;
        if (nVendedor < this.vendedor.length) {
            this.vendedor[nVendedor] = new Vendedor(nome, cpf, registro, salario);
            this.nVendedor++;
            this.totalFuncionarios++;
            result = true;
            
        } else {
            result = false;
        }
        return result;

    }

    public boolean novoGerente(String nome, String cpf, String registro, double salario) {
        boolean result;
        if (nGerente < this.gerente.length) {

            this.gerente[nGerente] = new Gerente(nome, cpf, registro, salario);
            this.nGerente++;
            this.totalFuncionarios++;
            result = true;
        } else {
            result = false;
        }
        return result;

    }

    public double calcularBonificacaoVendas() {
        return (this.calcularBonificacaoVendas() / this.totalFuncionarios) * this.taxaBonus;
    }

    private double calcularTotalVendas() {
        
        for (int i = 0; i < this.nVendedor; i++) {
            double totalVendas;
            totalVendas =+ this.vendedor[i].getVendas();
        }

        for (int i = 0; i < this.nGerente; i++) {
            double totalVendas;
            totalVendas =+ this.vendedor[i].getVendas();
        }
        return 0;
    }

    
    
}
