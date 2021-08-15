package view;

import model.FiguraGeometrica;
import model.Quadrado;

public class QuadradoMenu extends UserIO implements CRUD{

    public FiguraGeometrica criarFigura(){
        System.out.println("______________________________");
        System.out.println("OK, UM QUADRADO! PARECE SER DEMAIS! ");
        System.out.print("QUAL O TAMANHO DOS LADOS DO QUADRADO? ");
        double tamanhoLado = pedeDouble("");
        System.out.println("______________________________");
        System.out.println("SEU QUADRADO FOI FEITO! OLHA, ELE TEM AS QUINAS PONTIAGUDAS CUIDADO O_O");
        return new Quadrado(tamanhoLado);
    }

    public void mostrarFigura(FiguraGeometrica fig){
        System.out.println("______________________________");
        System.out.println(fig);
    }

    public FiguraGeometrica atualizarFigura(FiguraGeometrica fig){
        System.out.println("______________________________");
        System.out.println("AH, É AQUELE QUADRADO QUE EU TE DEI! ");
        System.out.println("VOCÊ QUER TROCA-LO? SÓ ME DIZER COMO QUER OUTRO");
        System.out.print("QUAL O TAMANHO DOS LADOS DO QUADRADO? ");
        double tamanhoLado = pedeDouble("");
        System.out.println("______________________________");
        System.out.println("SEU QUADRADO FOI FEITO! ESPERO QUE GOSTE DELE DESSA VEZ");
        return new Quadrado(tamanhoLado);
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
