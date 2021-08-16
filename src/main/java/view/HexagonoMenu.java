package view;

import model.*;
import model.enums.SUBMENUS;

public class HexagonoMenu extends UserIO implements CRUD{

    private Hexagono generic;

    public HexagonoMenu(){
        generic = new Hexagono(0);
    }

    public FiguraGeometrica criarFigura(){
        double tamanhoLado = pedeDouble("QUAL O TAMANHO DOS LADOS DO HEXAGONO? ");
        System.out.println("SEU HEXAGONO FOI FEITO! ");
        return new Hexagono(tamanhoLado);
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
        double tamanhoLado = pedeDouble("QUAL O TAMANHO DO NOVO HEXAGONO? ");
        System.out.println("______________________________");
        System.out.println("SEU OUTRO HEXAGONO FOI FEITO! ");
        vetor[indice] = new Hexagono(tamanhoLado);
        return vetor;
    }
}
