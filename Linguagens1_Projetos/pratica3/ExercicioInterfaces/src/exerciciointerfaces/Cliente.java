package exerciciointerfaces;

public class Cliente implements IAutenticavel, IImprimivel {

    private String cpf;
    private String psw;
    private String nome;

    public Cliente(String nome, String cpf, String s) {
        this.cpf = cpf;
        this.psw = s;
        this.nome = nome;
    }

    @Override
    public boolean autenticar(String x) {
        return this.psw.equals(x);
    }

    
    public String getCpf() {
        return this.cpf;
    }

    public boolean alterarSenha(String nova, String velha) {
        boolean retorno = false;
        if (autenticar(velha)) {
            this.psw = nova;
            retorno = true;
        }
        return retorno;
    }
    @Override
    public void imprimirResumo(){
        System.out.println("alou vou pegar café");
    }
    

}
