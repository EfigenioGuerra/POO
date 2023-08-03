package Transportadora;

public class TransporteTerrestre extends Transportadora {

    public TransporteTerrestre (int altura, int largura){
        super(altura, largura);
    }

    @Override
    public double calculaFrete() {
        return (altura + largura) * 0.2;
    }
}
