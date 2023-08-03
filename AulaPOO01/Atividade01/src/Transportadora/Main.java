package Transportadora;

public class Main {
    public static void main(String[] args){
        TransporteTerrestre transporteTerrestre = new TransporteTerrestre(20,10);
        TransporteNautico transporteNautico = new TransporteNautico(20,10);

        System.out.println(transporteNautico.calculaFrete());
        System.out.println(transporteTerrestre.calculaFrete());
    }
}