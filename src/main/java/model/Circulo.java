package model;

public class Circulo extends FiguraGeometrica{

    private double raio;

    public void calcularArea(){
        this.area = 3.14*raio*raio;
    }

    public void calcularPerimetro(){
        this.area = 3.14*raio*2;
    }

    public double mostrarArea(){
        return this.area;
    }

    public double mostrarPerimetro(){
        return this.perimetro;
    }

}
