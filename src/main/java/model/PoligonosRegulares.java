package model;

/**
 * PoligonosRegulares é uma classe que cria poligonos regulares, ou seja, poligonos que tem todos lados iguais.
 * @
 */
public class PoligonosRegulares extends FiguraGeometrica {

    protected double tamanhoDoLado;
    protected int numeroDeLados;

    public PoligonosRegulares(int lados, double tamanhoDoLado) {
        this.numeroDeLados = lados;
        this.tamanhoDoLado = tamanhoDoLado;
        this.perimetro = lados*tamanhoDoLado;
    }

    public PoligonosRegulares(){}

    public void calcularPerimetro(){
        this.perimetro = this.tamanhoDoLado*this.numeroDeLados;
    }

    public void calcularArea(){
        this.area = -1;
    }

    public double mostrarPerimetro(){
        return this.perimetro;
    }

    public double mostrarArea(){
        return this.area;
    }

}
