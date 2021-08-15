package view;

import model.*;

public class PentagonoMenu extends UserIO implements CRUD{

    public FiguraGeometrica criarFigura(){
        System.out.println("______________________________");
        System.out.println("ÓTIMO, UM PENTAGONO! ADORO PENTAGONOS!");
        double tamanhoLado = pedeDouble("QUAL O TAMANHO DOS LADOS DO PENTAGONO? ");
        System.out.println("______________________________");
        System.out.println("SEU PENTAGONO FOI FEITO! OLHA, ELE É TÃO BONITO HEHE :)");
        return new Pentagono(tamanhoLado);
    }

    public void mostrarFigura(FiguraGeometrica fig){
        System.out.println("______________________________");
        System.out.println(fig);
    }

    public FiguraGeometrica atualizarFigura(FiguraGeometrica fig){
        System.out.println("______________________________");
        System.out.println("AH, É AQUELE PENTAGONO QUE EU TE DEI! ");
        System.out.println("VOCÊ QUER TROCA-LO? SÓ ME DIZER COMO QUER OUTRO");
        double tamanhoLado = pedeDouble("QUAL O TAMANHO DOS LADOS DO PENTAGONO? ");
        System.out.println("______________________________");
        System.out.println("SEU OUTRO PENTAGONO FOI FEITO!");
        return new Pentagono(tamanhoLado);
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
