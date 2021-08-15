package view;

import model.FiguraGeometrica;

public interface CRUD {
    public FiguraGeometrica criarFigura();
    public void mostrarFigura(FiguraGeometrica fig);
    public void listarFigura(FiguraGeometrica fig,FiguraGeometrica[] figs);
    public FiguraGeometrica atualizarFigura(FiguraGeometrica fig);
    public void apagarFigura(FiguraGeometrica fig,   FiguraGeometrica[] figs);
}
