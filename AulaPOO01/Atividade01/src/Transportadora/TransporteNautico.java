package Transportadora;

public class TransporteNautico extends Transportadora {

    public TransporteNautico(int altura, int largura){
        super(altura, largura);
    }

    @Override
    public double calculaFrete() {
        return (altura + largura) * 0.1;
    }
}
