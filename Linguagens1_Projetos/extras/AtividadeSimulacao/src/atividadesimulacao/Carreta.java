package atividadesimulacao;

public class Carreta {

    private Dimensoes dim;
    private boolean seguro;
    private Pellet pallets; //arrray
    private int qtdPalletsQ;
    private int qtdPalletsR;

    public Carreta(boolean seguro, Dimensoes dim) {
        this.seguro = seguro;
        this.dim = new Dimensoes();
        this.dim.altura = 250;
        this.dim.comprimento = dim.comprimento;
        this.dim.largura = dim.largura;
    }

    public void melhorDistribuicao() {

        int nComprimento = (int) this.dim.comprimento / 100;

        if (this.dim.largura == 300) {
            this.qtdPalletsQ = nComprimento * 3;
            this.qtdPalletsR = 0;

        } else if (this.dim.largura >= 280) {
            this.qtdPalletsQ = 0;
            this.qtdPalletsR = nComprimento * 2;

        } else if (this.dim.largura >= 240) {
            this.qtdPalletsQ = nComprimento;
            this.qtdPalletsR = nComprimento;
        } else {
            this.qtdPalletsQ = nComprimento * 2;
            this.qtdPalletsR = 0;
        }

        this.pallets = new Pellet[this.qtdPalletsQ + this.qtdPalletsR];
        

    }

    public Dimensoes getDim() {
        return dim;
    }

    public void setDim(Dimensoes dim) {
        this.dim = dim;
    }

    public boolean getSeguro() {
        return seguro;
    }

    public Pellet getPallets() {
        return pallets;
    }

    public void setPallets(Pellet pallets) {
        this.pallets = pallets;
    }

    public int getQtdPallets() {
        return qtdPallets;
    }

    public void setQtdPallets(int qtdPallets) {
        this.qtdPallets = qtdPallets;
    }

}
