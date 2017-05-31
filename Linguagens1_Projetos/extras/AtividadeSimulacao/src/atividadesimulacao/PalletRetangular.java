/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadesimulacao;

/**
 *
 * @author Tiago-note
 */
public class PalletRetangular extends Pellet {
    static private Dimensoes dim;
    public PalletRetangular (  ){
       PalletRetangular.dim = new Dimensoes();
        PalletRetangular.dim.altura = 10;
        PalletRetangular.dim.comprimento = 100;
        PalletRetangular.dim.largura = 140;
        this.carregado = false;
    }

   public int qtdProdutos(ICarregavel produto) { //static teoricamente
        Dimensoes a = produto.getDimensoes();

        int nLargura = (int) (PalletRetangular.dim.largura / a.largura);
        int nComprimento = Math.floorDiv(PalletRetangular.dim.comprimento, a.comprimento);
        
        int nAltura = (250- PalletRetangular.dim.altura)/a.altura;

        
        
        return nAltura* nLargura * nComprimento;
    }
    
}
