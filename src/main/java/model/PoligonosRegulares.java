package model;

/**
 * PoligonosRegulares é uma classe que cria poligonos regulares, ou seja, poligonos que tem todos lados iguais.
 * @
 */
public class PoligonosRegulares extends FiguraGeometrica {

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

    /**
     * Para criar um poligono relular você deve passar dois parametros:
     * @param lados a quantidade de lados que o poligono tem, no caso de se querer criar um circulo, qualquer valor é aceito.
     * @param tamanhoDoLado a medida de cada lado do poligono.
     */

    public PoligonosRegulares(int lados, double tamanhoDoLado) {
        this.numeroDeLados = lados;
        this.tamanhoDoLado = tamanhoDoLado;
        if (lados == 3) {
            calculaTriangulo(tamanhoDoLado);
        } else if (lados == 4) {
            calculaQuadrado(tamanhoDoLado);
        } else if (lados == -1) {
            calculaCircilo(tamanhoDoLado);
        } else {
            calculaGenerico(lados, tamanhoDoLado);
        }
    }

    /**
     * Esse método calcula a area, perimetro e apótema de qualquer poligono regular que não seja um triangulo, um quadrado ou circulo.
     * @param numeroDeLados o numero de lados que o poligono tem.
     * @param tamanhoDoLado a medida do lado do poligono.
     */
    public void calculaGenerico(int numeroDeLados, double tamanhoDoLado) {
        this.valorAngulo = (int)360/numeroDeLados;
        this.apotema = (tamanhoDoLado / 2) / TANGENTES[this.valorAngulo];
        this.perimetro = numeroDeLados * tamanhoDoLado;
        this.area = (this.perimetro / 2) * this.apotema;
    }

    /**
     * Esse método calcula a area e o perimetro do quadrado. Neste metodo não é necessario passar a quantidade de lados.
     * @param tamanhoDoLado é o tamanho do lado do quadrado.
     */
    public void calculaQuadrado(double tamanhoDoLado) {
        this.apotema = -1;
        this.area = tamanhoDoLado * tamanhoDoLado;
        this.perimetro = numeroDeLados * tamanhoDoLado;
    }

    /**
     * Esse método calcula a area e o perimetro do triangulo. Neste metodo não é necessario passar a quantidade de lados.
     * @param tamanhoDoLado é o tamanho do lado do triangulo.
     */
    public void calculaTriangulo(double tamanhoDoLado) {
        this.apotema = -1;
        this.area = ((tamanhoDoLado * tamanhoDoLado) * Math.sqrt(3)) / 4;
        this.perimetro = numeroDeLados * tamanhoDoLado;
    }

    /**
     * Esse método calcula a area e o perimetro do circulo. Como o circulo não tem lados, o necessário para calcular é o raio.
     * @param raio é o tamanho do lado do circulo.
     */
    public void calculaCircilo(double raio) {
        this.apotema = -1;
        this.area = (raio * raio) * 3.14;
        this.perimetro = 6.28 * raio;
    }

    /**
     * Retorna a AREA deste Objeto.
     * @return AREA;
     */
    public double getArea() {
        return this.area;
    }

    /**
     * Retorna o PERIMETRO deste Objeto.
     * @return PERIMETRO;
     */
    public double getPerimetro() {
        return this.perimetro;
    }


    /**
     * Retorna uma String com o tipo de poligono regular, em seguida a area e o perimetro.
     * @return POLIGONO {AREA: " + area + " PERIMETRO: " + perimetro + "};
     */
    @Override
    public String toString() {
        switch (this.numeroDeLados) {
            case 3:
                return "TRIANGULO {AREA: " + area + " PERIMETRO: " + perimetro + "}";
            case 4:
                return "QUADRADO {AREA: " + area + " PERIMETRO: " + perimetro + "}";
            case 5:
                return "PENTAGONO {AREA: " + area + " PERIMETRO: " + perimetro + "}";
            case 6:
                return "HEXAGONO {AREA: " + area + " PERIMETRO: " + perimetro + "}";
            case 10:
                return "DECAGONO {AREA: " + area + " PERIMETRO: " + perimetro + "}";
            case 12:
                return "DODECAGONO {AREA: " + area + " PERIMETRO: " + perimetro + "}";
            case 20:
                return "ICOSAGONO {AREA: " + area + " PERIMETRO: " + perimetro + "}";
            default:
                return "CIRCULO {AREA: " + area + " PERIMETRO: " + perimetro + "}";
        }
    }
}
