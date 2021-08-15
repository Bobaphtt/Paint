package model;

public abstract class FiguraGeometrica {

    protected double area;
    protected double perimetro;

    public abstract void calcularArea();

    public abstract void calcularPerimetro();

    public abstract double mostrarArea();

    public abstract double mostrarPerimetro();
}
