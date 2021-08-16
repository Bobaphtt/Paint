package view;

import model.*;
import model.enums.SUBMENUS;

public class QuadradoMenu extends UserIO implements CRUD{


    private Quadrado generic;

    public QuadradoMenu(){
        generic = new Quadrado(0);
    }


    public FiguraGeometrica criarFigura(){
        double tamanhoLado = pedeDouble("QUAL O TAMANHO DOS LADOS DO QUADRADO? ");
        System.out.println("SEU QUADRADO FOI FEITO! ");
        return new Quadrado(tamanhoLado);
    }

    public FiguraGeometrica[] atualizarFigura(FiguraGeometrica[] vetor, SUBMENUS s){
        FiguraGeometrica fig = selecionaFigura(generic.getTipo(),vetor, s);
        int indice=0;
        for (int i = 0; i <vetor.length;i++){
            if(vetor[i] == fig){
                indice = i;
                break;
            }
        }
        double tamanhoLado = pedeDouble("QUAL O TAMANHO DO NOVO QUADRADO? ");
        System.out.println("______________________________");
        System.out.println("SEU OUTRO QUADRADO FOI FEITO! ");
        vetor[indice] = new Quadrado(tamanhoLado);
        return vetor;
    }

}
