package model;

public class Circulo extends FiguraGeometrica{

    private double raio;

    public Circulo(double raio){
        this.raio = raio;
        this.area = 3.14*raio*raio;
        this.perimetro  = 3.14*raio*2;
    }

    public double getRaio() {
        return raio;
    }

    public void calcularArea(){
        this.area = 3.14*raio*raio;
    }

    public void calcularPerimetro(){
        this.perimetro = 3.14*raio*2;
    }

    public double mostrarArea(){
        return this.area;
    }

    public double mostrarPerimetro(){
        return this.perimetro;
    }

    @Override
    public String toString(){
        return "CIRCULO";
    }
}
