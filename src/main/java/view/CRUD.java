package view;

import model.FiguraGeometrica;
import model.enums.SUBMENUS;

public interface CRUD {
    public FiguraGeometrica criarFigura();
    public void mostrarFigura(int tipo, FiguraGeometrica[] vetor, SUBMENUS s);
    public void listarFigura(FiguraGeometrica fig,FiguraGeometrica[] figs);
    public FiguraGeometrica[] atualizarFigura(FiguraGeometrica[] vetor, SUBMENUS s);
    public FiguraGeometrica[] apagarFigura(int tipo, FiguraGeometrica[] vetor, SUBMENUS s);
}
