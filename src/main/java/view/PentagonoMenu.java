package view;

import model.*;
import model.enums.SUBMENUS;

public class PentagonoMenu extends UserIO implements CRUD{

    public FiguraGeometrica criarFigura(){
        double tamanhoLado = pedeDouble("QUAL O TAMANHO DOS LADOS DO PENTAGONO? ");
        System.out.println("SEU PENTAGONO FOI FEITO! ");
        return new Pentagono(tamanhoLado);
    }

    public FiguraGeometrica[] atualizarFigura(FiguraGeometrica[] vetor, SUBMENUS s){
        FiguraGeometrica fig = selecionaFigura(vetor, s);
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
