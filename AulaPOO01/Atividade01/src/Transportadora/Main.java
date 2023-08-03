package Transportadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);

        System.out.println("Calcule o frete.\n");
        System.out.println("Qual a altura da sua encomenda?");
        int altura = scan.nextInt();
        while(altura == 0) {
            System.out.println("'0' não é uma altura válida, digite o valor correto:");
            altura = scan.nextInt();
        }
        System.out.println("Qual a largura da sua encomenda?");
        int largura = scan.nextInt();
        while(largura == 0){
            System.out.println("'0' não é uma largura válida, digite o valor correto:");
            largura = scan.nextInt();
        }

        TransporteTerrestre transporteTerrestre = new TransporteTerrestre(altura, largura);
        TransporteNautico transporteNautico = new TransporteNautico(altura, largura);

        System.out.println("Valor do frete náutico: " + transporteNautico.calculaFrete());
        System.out.println("Valor do frete terrestre: " + transporteTerrestre.calculaFrete());
    }
}