package model.irregulares;

import model.FiguraGeometrica;
import model.Reta;

public class Quadrilatero extends FiguraGeometrica {

    private Reta um;
    private Reta dois;
    private Reta tres;
    private Reta quatro;

    public Quadrilatero(Reta um, Reta dois, Reta tres, Reta quatro) {
        this.um = um;
        this.dois = dois;
        this.tres = tres;
        this.quatro = quatro;
    }

    public Quadrilatero() {
    }

    public boolean verificaQuadrilatero(){
        if (this.um.getB() == this.dois.getA()){
            if (this.dois.getB() == this.tres.getA()){
                if (this.tres.getB() == this.quatro.getA()){
                    if (this.quatro.getB() == this.um.getA()){
                        return true;
                    }else{
                        return false;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Quadrilatero{" +
                "um=" + um +
                ", dois=" + dois +
                ", tres=" + tres +
                ", quatro=" + quatro +
                '}';
    }

    public Reta getUm() {
        return um;
    }

    public void setUm(Reta um) {
        this.um = um;
    }

    public Reta getDois() {
        return dois;
    }

    public void setDois(Reta dois) {
        this.dois = dois;
    }

    public Reta getTres() {
        return tres;
    }

    public void setTres(Reta tres) {
        this.tres = tres;
    }

    public Reta getQuatro() {
        return quatro;
    }

    public void setQuatro(Reta quatro) {
        this.quatro = quatro;
    }
}
