package model;

public class Pentagono extends PoligonosRegulares{
    private Reta um;
    private Reta dois;
    private Reta tres;
    private Reta quatro;
    private Reta cinco;

    public Pentagono(double tamanhoDoLado){
        super(5, tamanhoDoLado);
        this.um = new Reta(new Ponto(0, 0), new Ponto(tamanhoDoLado, 0));
        this.dois = new Reta(new Ponto(tamanhoDoLado, 0), new Ponto(tamanhoDoLado, tamanhoDoLado));
        this.tres = new Reta(new Ponto(tamanhoDoLado, tamanhoDoLado), new Ponto(0, tamanhoDoLado));
        this.quatro = new Reta(new Ponto(0, tamanhoDoLado), new Ponto(0, 0));
        this.cinco = new Reta(new Ponto(0, tamanhoDoLado), new Ponto(0, 0));
        this.area = tamanhoDoLado*tamanhoDoLado;
        this.tipo = 5;
    }

    @Override
    public void calcularArea(){
        this.area = this.tamanhoDoLado*this.tamanhoDoLado;
    }

    @Override
    public double mostrarPerimetro(){
        return this.perimetro;
    }

    @Override
    public double mostrarArea(){
        return this.area;
    }

    @Override
    public String toString() {
        return "PENTAGONO";
    }
}
