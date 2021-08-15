package model;

public class Reta extends FiguraGeometrica{

    private Ponto a;
    private Ponto b;
    private double tamanho;
    private double coeficienteAngular;

    public Reta(Ponto a, Ponto b){
        this.a = a;
        this.b = b;
        double tamanho;
        double deltaX = b.getX() - a.getX();
        double deltaY = b.getY() - a.getY();
        tamanho = Math.sqrt((deltaX*deltaX)+(deltaY*deltaY));
        this.tamanho = tamanho;
    }

    public Reta(double tamanho){
        this.a = new Ponto(0, 0);
        this.b = new Ponto(tamanho,0);
        this.tipo = 2;
        this.tamanho = tamanho;
    }

    public void calcularArea(){}

    public void calcularPerimetro(){}

    public double mostrarArea(){return 0;}

    public double mostrarPerimetro(){return tamanho;}

    public int getTipo(){
        return this.tipo;
    }

    @Override
    public String toString() {
        return "Reta{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
