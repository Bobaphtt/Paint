package model;

public class Hexagono extends PoligonosRegulares{
    private Reta um;
    private Reta dois;
    private Reta tres;
    private Reta quatro;
    private Reta cinco;
    private Reta seis;

    public Hexagono(double tamanhoDoLado){
        super(6, tamanhoDoLado);
        this.um = new Reta(new Ponto(0, 0), new Ponto(tamanhoDoLado, 0));
        this.dois = new Reta(new Ponto(tamanhoDoLado, 0), new Ponto(tamanhoDoLado, tamanhoDoLado));
        this.tres = new Reta(new Ponto(tamanhoDoLado, tamanhoDoLado), new Ponto(0, tamanhoDoLado));
        this.quatro = new Reta(new Ponto(0, 0), new Ponto(tamanhoDoLado, 0));
        this.cinco = new Reta(new Ponto(tamanhoDoLado, 0), new Ponto(tamanhoDoLado, tamanhoDoLado));
        this.seis = new Reta(new Ponto(tamanhoDoLado, tamanhoDoLado), new Ponto(0, tamanhoDoLado));
        this.area = tamanhoDoLado*tamanhoDoLado;
        this.tipo = 6;
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
        return "HEXAGONO";
    }
}
