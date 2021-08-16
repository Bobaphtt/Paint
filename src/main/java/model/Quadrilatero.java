package model;

public class Quadrilatero extends FiguraGeometrica {

    private Reta um;
    private Reta dois;
    private Reta tres;
    private Reta quatro;
    private double comprimento;
    private double altura;

    public Quadrilatero(double comprimento, double altura) {
        this.um = new Reta(new Ponto(0, 0), new Ponto(comprimento,0.0));
        this.dois = new Reta(new Ponto(comprimento,0.0), new Ponto(comprimento, altura));
        this.tres = new Reta(new Ponto(comprimento, altura), new Ponto(0, altura));
        this.quatro = new Reta(new Ponto(0, altura), new Ponto(0, 0));
        this.altura = altura;
        this.comprimento = comprimento;
        this.area = this.comprimento*this.altura;
        this.perimetro = (2*comprimento) + (2*altura);
        this.tipo = 4;
    }


    //PERIMETROS
    public double calcularPerimetro(double comprimento, int altura){
        return (comprimento*2) + (altura*2);
    }

    public void calcularPerimetro(){
        this.perimetro = (this.comprimento*2) + (this.altura*2);
    }

    public double mostrarPerimetro(){
        return this.perimetro;
    }



    //AREA
    public double calcularArea(double comprimento, int altura){
        return (comprimento*altura);
    }

    public void calcularArea(){
        this.area = this.comprimento*this.altura;
    }

    public double mostrarArea(){
        return this.area;
    }

    @Override
    public String toString() {
        return "RETANGULO";
    }
}
