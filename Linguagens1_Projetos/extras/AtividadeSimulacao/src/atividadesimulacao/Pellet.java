package atividadesimulacao;

public abstract class Pellet {

    protected boolean carregado;
    protected ICarregavel produto;

    public boolean getCarregado() {
        return this.carregado;
    }

    public void esvaziarPallet() {
        this.carregado = false;
    }

}
