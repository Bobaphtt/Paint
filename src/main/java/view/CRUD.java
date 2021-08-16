package view;

import model.FiguraGeometrica;
import model.enums.SUBMENUS;

public interface CRUD {
    public FiguraGeometrica criarFigura();
    public void mostrarFigura(FiguraGeometrica[] vetor, SUBMENUS s);
    public void listarFigura(FiguraGeometrica fig,FiguraGeometrica[] figs);
    public FiguraGeometrica[] atualizarFigura(FiguraGeometrica[] vetor, SUBMENUS s);
    public FiguraGeometrica[] apagarFigura(FiguraGeometrica[] vetor, SUBMENUS s);
}
