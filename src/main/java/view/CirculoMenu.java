package view;

import model.*;
import model.enums.SUBMENUS;

public class CirculoMenu extends UserIO implements CRUD{

    public FiguraGeometrica criarFigura(){
        double raio = pedeDouble("QUAL O RAIO DO CIRCULO? ");
        System.out.println("SEU CIRCULO FOI FEITO! ");
        return new Circulo(raio);
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
        double raio = pedeDouble("QUAL O RAIO DO NOVO CIRCULO? ? ");
        System.out.println("______________________________");
        System.out.println("SEU OUTRO CIRCULO FOI FEITO! ");
        vetor[indice] = new Circulo(raio);
        return vetor;
    }

}