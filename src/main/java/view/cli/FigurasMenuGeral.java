package view.cli;

import model.FiguraGeometrica;
import model.enums.SUBMENUS;

public class FigurasMenuGeral extends UserIO{

    //Utilidade

    public FiguraGeometrica selecionaFigura(int tipo, FiguraGeometrica[] vetor, SUBMENUS s) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null) {
                if (tipo == vetor[i].getTipo()) {
                    System.out.println(i + " - " + vetor[i] + "{AREA: " + vetor[i].mostrarArea() + "{PERIMETRO: " + vetor[i].mostrarPerimetro());
                }
            }
        }
        int op = pedeInteiro("QUAL FIGURA VOCE QUER " + s + "?");
        return vetor[op];
    }

    public FiguraGeometrica[] apagarFigura(int tipo, FiguraGeometrica[] vetor, SUBMENUS s) {
        FiguraGeometrica fig = selecionaFigura(tipo, vetor, s);
        int indice = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == fig) {
                indice = i;
                break;
            }
        }
        vetor[indice] = null;
        return vetor;
    }

    public void mostrarFigura(int tipo, FiguraGeometrica[] vetor, SUBMENUS s) {
        FiguraGeometrica fig = selecionaFigura(tipo, vetor, s);
        System.out.println("______________________________");
        System.out.println(fig);
    }

    public void listarFigura(FiguraGeometrica fig, FiguraGeometrica[] figs) {
        System.out.println("______________________________");
        for (int i = 0; i < figs.length; i++) {
            if (figs[i] != null) {
                if (figs[i].getTipo() == fig.getTipo()) {
                    System.out.println(i + " - " + figs[i] + "{AREA: " + figs[i].mostrarArea() + " - PERIMETRO: " + figs[i].mostrarPerimetro() + "}");
                }
            }
        }
    }
}
