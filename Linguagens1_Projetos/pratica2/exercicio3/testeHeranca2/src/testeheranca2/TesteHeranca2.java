package testeheranca2;

import java.util.Scanner;

public class TesteHeranca2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next(); //armazena string até o espaço

        String f = scan.nextLine(); //pega tudo até os espaços
        // Scanner scan =  new Scanner(System.in);
        //char c = scan.

        //fazer um for pra testa as coisas
        Concessionaria c = new Concessionaria(0, 0);
        for (int j = 0; j < 10; j++) {

        }

        int i = scan.nextInt();

        do {
            System.out.println("1 - Inserir Funcionario, 2 -Gerir Funcionarios, 3- Realizar venda, 4- exibir resumo, 5 - sair ");
            int h = scan.nextInt();
            switch (h) {
                case 1:
                   inserirFuncionario();

                    break;

                case 2:
                    gerirFuncionario();
                    break;
                case 3:
                    realizarVenda();
                    break;
                case 4:
                    exibirResumoo();
                    break;

            }

        } while (i != 5);

    }

      
    
    
    static void inserirFuncionario(){
        Concessionaria c = new Concessionaria(0, 0);
        Scanner scan = new Scanner(System.in);
         System.out.println("1- inserir gerente, 2- inserir vendedor, 3- voltar menu anterior");
                    int a = scan.nextInt();
                    do {
                        switch (a) {
                            case 1:
                                System.out.println("digite o tiozao");
                                String nom = scan.next();
                                String sob = scan.next();
                                String cpf = scan.next();
                                double sal = scan.nextDouble();
                                c.novoGerente(nom, sob, cpf, sal);
                                break;
                            case 2:
                                System.out.println("digite o tiozao");
                                String nomm = scan.next();
                                String sobb = scan.next();
                                String cpff = scan.next();
                                double sall = scan.nextDouble();
                                c.novoVendedor(nomm, sobb, cpff, sall);
                                break;
                        }

                    } while (a != 3);
        
                     
            }
    
    static void gerirFuncionario(){
        
        
    }
    static void realizarVenda(){
       // Vendedor getVendedor(int i){      logica do treco
       // return this.vendedores[i];
    
    }
    
    
   static void exibirResumoo(){
       Concessionaria c = new Concessionaria(0, 0);
       System.out.println("1 - vendedor, 2- gerente, 3- sair");
       
       
   }
}
