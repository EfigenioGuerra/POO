package Transportadora;

public class Main {
    public static void main(String[] args){
        TransporteTerrestre transporteTerrestre = new TransporteTerrestre(10,10);
        TransporteNautico transporteNautico = new TransporteNautico(10,10);

        System.out.println(transporteNautico.calculaFrete());
        System.out.println(transporteTerrestre.calculaFrete());
    }
}