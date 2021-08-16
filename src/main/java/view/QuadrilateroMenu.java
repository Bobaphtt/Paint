package view;

import model.*;
import model.enums.SUBMENUS;

public class QuadrilateroMenu extends UserIO implements CRUD{

    public FiguraGeometrica criarFigura(){
        double comprimento = pedeDouble("QUAL O COMPRIMENTO DO QUADRILATERO? ");
        double altura = pedeDouble("QUAL A ALTURA DO QUADRILATERO? ");

        return new Quadrilatero(comprimento, altura);
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
        double comprimento = pedeDouble("QUAL O COMPRIMENTO DO QUADRILATERO? ");
        double altura = pedeDouble("QUAL A ALTURA DO QUADRILATERO? ");
        vetor[indice] = new Quadrilatero(comprimento, altura);
        return vetor;
    }
}
