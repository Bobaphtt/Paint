package model;

public class Quadrilatero extends FiguraGeometrica {

    private Reta um;
    private Reta dois;
    private Reta tres;
    private Reta quatro;
    private double comprimento;
    private double altura;

    public Quadrilatero(double comprimento, double altura) {
        Reta um = new Reta(new Ponto(0, 0), new Ponto(0.0, comprimento));
        Reta dois = new Reta(new Ponto(0.0, comprimento), new Ponto(comprimento, altura));
        Reta tres = new Reta(new Ponto(comprimento, altura), new Ponto(0, altura));
        Reta quatro = new Reta(new Ponto(0, altura), new Ponto(0, 0));
        this.um = um;
        this.dois = dois;
        this.tres = tres;
        this.quatro = quatro;
        this.altura = altura;
        this.comprimento = comprimento;
        this.area = this.comprimento*this.altura;
        this.perimetro = (2*comprimento) + (2*altura);
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public double getPerimetro() {
        return this.perimetro;
    }

    @Override
    public String toString() {
        return "QUADRILATERO {" +  "AREA: "+ this.area +" PERIMETRO: "+this.perimetro+"}";
    }

}
