package view;

import model.*;

public class RetaMenu extends UserIO implements CRUD{

    public FiguraGeometrica criarFigura(){
        System.out.println("______________________________");
        System.out.println("O QUE? SÓ UMA RETA?");
        double tamanhoLado = pedeDouble("QUAL O TAMANHO DA RETA? ");
        System.out.println("SUA RETA FOI FEITA! OLHA, ELA É TÃO BONITA HEHE :)");
        return new Reta(tamanhoLado);
    }

    public void mostrarFigura(FiguraGeometrica fig){
        System.out.println("______________________________");
        System.out.println(fig);
    }

    public FiguraGeometrica atualizarFigura(FiguraGeometrica fig){
        System.out.println("______________________________");
        System.out.println("AH, É AQUELA RETA QUE EU TE DEI! ");
        System.out.println("VOCÊ QUER TROCA-LA? SÓ ME DIZER COMO QUER OUTRA");
        double tamanhoLado = pedeDouble("QUAL O TAMANHO DA RETA? ");
        System.out.println("______________________________");
        System.out.println("SUA OUTRA RETA FOI FEITA!");
        return new Reta(tamanhoLado);
    }

    public void apagarFigura(FiguraGeometrica fig,  FiguraGeometrica[] figs){
        listarFigura(fig,figs);
        System.out.println("______________________________");
        int indice = pedeInteiro("QUAL VOCÊ DESEJE APAGAR? ");
        figs[indice] = null;
    }

    public void listarFigura(FiguraGeometrica fig, FiguraGeometrica[] figs){
        System.out.println("______________________________");
        for (int i = 0; i < figs.length; i++){
            if (figs[i].getTipo() == fig.getTipo()){
                System.out.println(i +" - "+ figs[i]);
            }
        }
    }
}
