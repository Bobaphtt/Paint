package model;

import java.text.DecimalFormat;

public class Reta {

    private Ponto a;
    private Ponto b;
    private double coeficienteAngular;

    public double tamanhoReta(){
        double tamanho;
        double deltaX = b.getX() - a.getX();
        double deltaY = b.getY() - a.getY();
        tamanho = Math.sqrt((deltaX*deltaX)+(deltaY*deltaY));
        return tamanho;
    }

    public Ponto getA() {
        return a;
    }

    public void setA(Ponto a) {
        this.a = a;
    }

    public Ponto getB() {
        return b;
    }

    public void setB(Ponto b) {
        this.b = b;
    }

    public double getCoeficienteAngular() {
        return coeficienteAngular;
    }

    public void setCoeficienteAngular(double coeficienteAngular) {
        this.coeficienteAngular = coeficienteAngular;
    }

    @Override
    public String toString() {
        return "Reta{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
