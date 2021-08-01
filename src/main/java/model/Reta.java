package model;

import model.Ponto;

public class Reta {

    private Ponto a;
    private Ponto b;
    private double coeficienteAngular;

    public Reta(Ponto a, Ponto b){
        this.a = a;
        this.b = b;
    }

    public double tamanhoReta(){
        double tamanho;
        double deltaX = b.getX() - a.getX();
        double deltaY = b.getY() - a.getY();
        tamanho = Math.sqrt((deltaX*deltaX)+(deltaY*deltaY));
        return tamanho;
    }

    @Override
    public String toString() {
        return "Reta{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
