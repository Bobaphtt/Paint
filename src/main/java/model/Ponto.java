package model;

public class Ponto extends FiguraGeometrica{

    private double x;
    private double y;

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Ponto(){
        this.x = 0;
        this.y = 0;
    }

    @Override
    public void calcularArea() {

    }

    @Override
    public void calcularPerimetro() {

    }

    @Override
    public double mostrarArea() {
        return 0;
    }

    @Override
    public double mostrarPerimetro() {
        return 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "PONTO";
    }
}
