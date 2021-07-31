package model;

public class PoligonosRegulares extends FiguraGeometrica{

    static final double[] TANGENTES = {0,
            0.0175,
            0.0349,
            0.0524,
            0.0699,
            0.0875,
            0.1051,
            0.1228,
            0.1405,
            0.1584,
            0.1763,
            0.1944,
            0.2126,
            0.2309,
            0.2493,
            0.2679,
            0.2867,
            0.3057,
            0.3249,
            0.3443,
            0.364,
            0.3839,
            0.404,
            0.4245,
            0.4452,
            0.4663,
            0.4877,
            0.5095,
            0.5317,
            0.5543,
            0.5774,
            0.6009,
            0.6249,
            0.6494,
            0.6745,
            0.7002,
            0.7265,
            0.7536,
            0.7813,
            0.8098,
            0.8391,
            0.8693,
            0.9004,
            0.9325,
            0.9657,
            1,
            1.0355,
            1.0724,
            1.1106,
            1.1504,
            1.1918,
            1.2349,
            1.2799,
            1.327,
            1.3764,
            1.4281,
            1.4826,
            1.5399,
            1.6003,
            1.6643,
            1.7321,
            1.804,
            1.8807,
            1.9626,
            2.0503,
            2.1445,
            2.246,
            2.3559,
            2.4751,
            2.6051,
            2.7475,
            2.9042,
            3.0777,
            3.2709,
            3.4874,
            3.7321,
            4.0108,
            4.3315,
            4.7046,
            5.1446,
            5.6713,
            6.3138,
            7.1154,
            8.1443,
            9.5144,
            11.4301,
            14.3007,
            19.0811,
            28.6363,
            57.29
    };

    double tamanhoDoLado;
    int valorAngulo;
    double apotema;

    public PoligonosRegulares(int numeroDeLados, double tamanhoDoLado){
        this.numeroDeLados = numeroDeLados;
        this.tamanhoDoLado = tamanhoDoLado;
        this.perimetro = numeroDeLados * tamanhoDoLado;
    }

    public void calculaGenerico(int numeroDeLados, double tamanhoDoLado){

        this.valorAngulo = (int)360/numeroDeLados;
        this.apotema = (tamanhoDoLado/2) / TANGENTES[this.valorAngulo];
        this.area = (this.perimetro/2) * this.apotema;
    }

    public void calculaQuadrado(double tamanhoDoLado){
        this.apotema = -1;
        this.area = tamanhoDoLado*tamanhoDoLado;
    }

    public void calculaTriangulo(double tamanhoDoLado){
        this.apotema = -1;
        this.area = ((tamanhoDoLado*tamanhoDoLado)*Math.sqrt(3))/4;
    }

    public double getArea(){
        return this.area;
    }

    public double getPerimetro(){
        return this.perimetro;
    }

}
