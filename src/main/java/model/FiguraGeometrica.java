package model;

public abstract class FiguraGeometrica {

    protected int tipo;
    protected double area;
    protected double perimetro;

    public abstract void calcularArea();

    public abstract void calcularPerimetro();

    public abstract double mostrarArea();

    public abstract double mostrarPerimetro();

    public int getTipo(){
        return this.tipo;
    }

    public String toString(){
        return "FiguraGeometrica";
    }
}
