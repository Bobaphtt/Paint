package model;

public abstract class FiguraGeometrica {
    int numeroDeLados;
    double area;
    double perimetro;

    public abstract double getArea();

    public abstract double getPerimetro();
}
