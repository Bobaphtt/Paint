package view;

import model.*;
import model.enums.SUBMENUS;

public class RetaMenu extends UserIO implements CRUD{

    private Reta generic;

    public RetaMenu(){
        generic = new Reta(0);
    }


    public FiguraGeometrica criarFigura(){
        double tamanhoLado = pedeDouble("QUAL O TAMANHO DA RETA? ");
        System.out.println("SUA RETA FOI FEITA! ");
        return new Reta(tamanhoLado);
    }

    public FiguraGeometrica[] atualizarFigura(FiguraGeometrica[] vetor, SUBMENUS s){
        FiguraGeometrica fig = selecionaFigura(generic.getTipo(), vetor, s);
        int indice=0;
        for (int i = 0; i <vetor.length;i++){
            if(vetor[i] == fig){
                indice = i;
                break;
            }
        }
        double tamanhoLado = pedeDouble("QUAL O TAMANHO DA NOVA RETA? ");
        System.out.println("______________________________");
        System.out.println("SUA OUTRA RETA FOI FEITA! ");
        vetor[indice] = new Reta(tamanhoLado);
        return vetor;
    }

}
