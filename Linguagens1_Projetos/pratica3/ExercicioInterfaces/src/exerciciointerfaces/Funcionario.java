
package exerciciointerfaces;


public abstract class Funcionario {
    protected String nome;
    protected String registro;
    protected double salario;
    static double taxa;
    
    public double salarioMes(){
        return this.salario + this.bonusMes();
    }
    
    public double bonusMes(){
        return this.salario*this.taxa;
    }
    
    public double setTaxa(double taxa){
        return this.taxa = taxa;
    }
    
    public double setSalarioBase(double s){
        return this.salario =s;
    }
     public double getSalarioBase(){
         return this.salario;
     }
}
