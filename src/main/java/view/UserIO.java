package view;


import model.FiguraGeometrica;
import model.PoligonosRegulares;
import model.Quadrilatero;
import model.enums.MENUPRINCIPAL;
import model.enums.TIPOS;

import java.util.Scanner;

public class UserIO {

    protected Scanner in;

    public void bemVindo() {
        System.out.println("             _       _   ");
        System.out.println("            (_)     | |  ");
        System.out.println(" _ __   __ _ _ _ __ | |_ ");
        System.out.println("| '_ \\ / _` | | '_ \\| __|");
        System.out.println("| |_) | (_| | | | | | |_ ");
        System.out.println("| .__/ \\__,_|_|_| |_|\\__|");
        System.out.println("| |                      ");
        System.out.println("|_|                      ");
    }

    //INPUT OUTPUT
    public UserIO() {
        in = new Scanner(System.in);
    }

    public void ImprimeUmNegocioQualquer(String m) {
        System.out.println(m);
    }

    public char pedeChar() {
        return in.next().charAt(0);
    }

    public int pedeInt() {
        return in.nextInt();
    }

    public double pedeMedida() {
        return in.nextDouble();
    }


    //MENUS
    public MENUPRINCIPAL MenuPrincipal() {
        System.out.println("______________________________");
        for (int i = 0; i < VetoresMenu.Menu.length; i++) {
            System.out.println(VetoresMenu.MenuLetra[i] + " - " + VetoresMenu.Menu[i]);
        }
        System.out.println("______________________________");
        System.out.print("ESCOLHA UMA OPÇÃO: ");
        char op = pedeChar();

        switch (op) {
            case '1':
                return MENUPRINCIPAL.CRIAR;
            case '2':
                return MENUPRINCIPAL.APAGAR;
            case '3':
                return MENUPRINCIPAL.DESENHAR;
            case '4':
                return MENUPRINCIPAL.LISTAR;
            default:
                return MENUPRINCIPAL.SAIR;
        }

    }

    public TIPOS MenuCriar() {
        System.out.println("1 - POLIGONO REGULAR");
        System.out.println("2 - RETANGULO");
        System.out.println("______________________________");
        System.out.print("ESCOLHA UMA OPÇÃO: ");
        char op = pedeChar();

        switch (op) {
            case '1':
                return TIPOS.REGULAR;
            case '2':
                return TIPOS.RETANGULO;
            default:
                return TIPOS.SAIR;
        }
    }

    public void ImprimeOpcaoMenu(String m) {
        System.out.println("______________________________");
        System.out.println("ESCOLHI: " + m);
        System.out.println("______________________________");
    }

    public void triste() {
        System.out.println("OLHA, EU AINDA NÃO TENHO LÁPIS PRA DESENHAR :(");
        System.out.println("MAS O LUAN DISSE QUE IA CONSTRUIR UM PARA MIM! ");
    }

    public FiguraGeometrica criaRegular() {
        double tamanhoLado;
        System.out.println("______________________________");
        System.out.println("YEY! VOCE ESCOLHEU CRIAR UMA FIGURA REGULAR! EU POSSO CRIAR ESSAS: ");
        System.out.println("TRIANGULO [3 LADOS]");
        System.out.println("QUADRADO [4 LADOS]");
        System.out.println("PENTAGONO [5 LADOS]");
        System.out.println("HEXAGONO [6 LADOS]");
        System.out.println("DECAGONO [10 LADOS]");
        System.out.println("DODECAGONO [12 LADOS]");
        System.out.println("ICOSAGONO [20 LADOS]");
        System.out.println("CIRCULO [INFINITOS LADOS!]");
        System.out.println("______________________________");
        System.out.println("AGORA EU PRECISO QUE VOCÊ ME DÊ INFORMAÇÕES DESSA FIGURA");
        System.out.print("QUANTOS LADOS VOCÊ QUER QUE ELA TENHA? ");
        int lados = pedeInt();
        switch (lados) {
            case 3:
                System.out.println("______________________________");
                System.out.println("ÓTIMO, UM TRIANGULO! ADORO TRIANGULOS!");
                System.out.print("QUAL O TAMANHO DOS LADOS DO TRIANGULO? ");
                tamanhoLado = pedeMedida();
                System.out.println("______________________________");
                System.out.println("SEU TRIANGULO FOI FEITO! OLHA, ELE É TÃO BONITO HEHE :)");
                return new PoligonosRegulares(lados, tamanhoLado);
            case 4:
                System.out.println("______________________________");
                System.out.println("OK, UM QUADRADO! PARECE SER DEMAIS! ");
                System.out.print("QUAL O TAMANHO DOS LADOS DO QUADRADO? ");
                tamanhoLado = pedeMedida();
                System.out.println("______________________________");
                System.out.println("SEU QUADRADO FOI FEITO! OLHA, ELE TEM AS QUINAS PONTIAGUDAS CUIDADO O_O");
                return new PoligonosRegulares(lados, tamanhoLado);
            case 5:
                System.out.println("______________________________");
                System.out.println("CERTO, UM PENTAGONO! VOU PREPARAR ELE! ");
                System.out.print("QUAL O TAMANHO DOS LADOS DO PENTAGONO? ");
                tamanhoLado = pedeMedida();
                System.out.println("______________________________");
                System.out.println("SEU PENTAGONO FOI FEITO! ELE ESTÁ ALI NA LISTA.");
                return new PoligonosRegulares(lados, tamanhoLado);
            case 6:
                System.out.println("______________________________");
                System.out.println("QUE LEGAL, UM HEXAGONO! PARECE UM FAVO DE MEL! ");
                System.out.println("VOCE TAMBEM GOSTA DE ABELHAS?! QUER DIZER... ");
                System.out.print("QUAL O TAMANHO DOS LADOS DO HEXAGONO? ");
                tamanhoLado = pedeMedida();
                System.out.println("______________________________");
                System.out.println("ME DESCULPE, SEU HEXAGONO FOI FEITO! ABELHAAAAS!!!!");
                return new PoligonosRegulares(lados, tamanhoLado);
            case 10:
                System.out.println("______________________________");
                System.out.println("QUE LEGAL, UM DECAGONO! AINDA BEM QUE CONSIGO CONTAR OS LADOS NOS DEDOS! ");
                System.out.print("QUAL O TAMANHO DOS LADOS DO DECAGONO? ");
                tamanhoLado = pedeMedida();
                System.out.println("______________________________");
                System.out.println("UFA, ACABEI, SEU DECAGONO FOI FEITO!");
                return new PoligonosRegulares(lados, tamanhoLado);
            case 12:
                System.out.println("______________________________");
                System.out.println("UM DODECAGONO? NÃO CONSIGO NEM CONTAR OS LADOS NOS DEDOS! ");
                System.out.print("QUAL O TAMANHO DOS LADOS DO DODECAGONO? ");
                tamanhoLado = pedeMedida();
                System.out.println("______________________________");
                System.out.println("NOSSA, ESSE FOI DIFICIL MAS SEU DODECAGONO FOI FEITO!");
                return new PoligonosRegulares(lados, tamanhoLado);
            case 20:
                System.out.println("______________________________");
                System.out.println("VOCE ESTÁ LOUCO? UM ICOSAGONO TEM LADOS DEMAIS! MAS VOU TENTAR.");
                System.out.print("QUAL O TAMANHO DOS LADOS DO ICOSAGONO? ");
                tamanhoLado = pedeMedida();
                System.out.println("______________________________");
                System.out.println("NOSSA, NUNCA MAIS FAÇO UM ICOSAGONO, MAS ESSE FOI FEITO!");
                return new PoligonosRegulares(lados, tamanhoLado);
            default:
                System.out.println("______________________________");
                System.out.println("ME DESCULPA, MAS EU NÃO CONSIGO CRIAR COM ESSA QUANTIDADE DE LADOS");
                System.out.println("ENTÃO VOU TE FAZER UM CIRCULO E NÓS VAMOS BRINCAR DE FUTEBOL!! ");
                System.out.print("QUAL O TAMANHO VOCÊ QUER QUE A BOLA TENHA? O RAIO DELA: ");
                lados = -1;
                tamanhoLado = pedeMedida();
                System.out.println("______________________________");
                System.out.println("UM CIRCULO SEMPRE DESCE REDONDO! ELE FOI CRIADO");
                return new PoligonosRegulares(lados, tamanhoLado);
        }
    }

    public FiguraGeometrica criaRetangulo() {
        System.out.println("______________________________");
        System.out.println("OK, VOCE ESCOLHEU CRIAR UM RETANGULO!");
        System.out.println("AGORA EU PRECISO QUE VOCÊ PASSE AS MEDIDAS DO RETANGULO");
        System.out.print("QUAL O COMPRIMENTO DO RETANGULO? ");
        double comprimento = pedeMedida();
        System.out.print("ÓTIMO! AGORA QUAL A ALTURA DO RETANGULO?");
        double altura = pedeMedida();
        FiguraGeometrica fig = new Quadrilatero(comprimento, altura);
        System.out.println("PRONTO, SEU RETANGULO FOI CRIADO! VOCÊ PODE VER ELE NA OPÇÃO LISTAR :)");
        System.out.print("OK?! ");
        pedeChar();
        return fig;
    }

    public void listar(FiguraGeometrica[] vetor) {
        boolean vazio = true;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null) {
                System.out.println(i + " - " + vetor[i]);
                vazio = false;
            }
        }
        if (vazio) {
            System.out.println("TUDO VAZIO POR AQUI :( MAS NÃO FIQUE TRISTE,");
            System.out.println("TENTE CRIAR UMA FIGURA GEOMETRICA :)");
        }
        System.out.println("______________________________");
    }

    public FiguraGeometrica[] apagar(FiguraGeometrica[] vetor) {
        System.out.print("QUAL FIGURA VOCÊ DESEJA APAGAR? ");
        int op = pedeInt();
        if ((op >= 0 && op < vetor.length) && vetor[op] != null) {
            vetor[op] = null;
            return vetor;
        } else {
            System.out.println("______________________________");
            System.out.println("NADA FOI ALTERADO! ");
            return vetor;
        }
    }
}
