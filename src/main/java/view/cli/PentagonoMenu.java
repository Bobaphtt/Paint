package view.cli;

import model.*;
import model.enums.SUBMENUS;
import view.CRUD;

public class PentagonoMenu extends FigurasMenuGeral implements CRUD {


    private Pentagono generic;

    public PentagonoMenu(){
        generic = new Pentagono(0);
    }


    public FiguraGeometrica criarFigura(){
        double tamanhoLado = pedeDouble("QUAL O TAMANHO DOS LADOS DO PENTAGONO? ");
        System.out.println("SEU PENTAGONO FOI FEITO! ");
        return new Pentagono(tamanhoLado);
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
        double tamanhoLado = pedeDouble("QUAL O TAMANHO DO NOVO PENTAGONO? ");
        System.out.println("______________________________");
        System.out.println("SEU OUTRO PENTAGONO FOI FEITO! ");
        vetor[indice] = new Pentagono(tamanhoLado);
        return vetor;
    }

}
