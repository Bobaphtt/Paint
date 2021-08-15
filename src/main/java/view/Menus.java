package view;

import model.FiguraGeometrica;
import model.PoligonosRegulares;
import model.Quadrilatero;
import model.enums.MENUPRINCIPAL;
import model.enums.SUBMENUS;

public class Menus extends UserIO {


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


    //MENUS
    public MENUPRINCIPAL MenuPrincipal() {
        System.out.println("______________________________");
        for (int i = 0; i < VetoresMenu.MenuObj.length; i++) {
            System.out.println(VetoresMenu.MenuObjIndice[i] + " - " + VetoresMenu.Menu[i]);
        }
        for (int i = 0; i < VetoresMenu.Menu.length; i++) {
            System.out.println(VetoresMenu.MenuIndice[i] + " - " + VetoresMenu.Menu[i]);
        }
        System.out.println("______________________________");
        System.out.print("ESCOLHA UMA OPÇÃO: ");
        char op = pedeChar();

        switch (op) {
            case '1':
                ImprimeOpcaoMenu("PONTO");
                return MENUPRINCIPAL.PONTO;
            case '2':
                ImprimeOpcaoMenu("RETA");
                return MENUPRINCIPAL.RETA;
            case '3':
                ImprimeOpcaoMenu("QUADRADO");
                return MENUPRINCIPAL.QUADRADO;
            case '4':
                ImprimeOpcaoMenu("RETANGULO");
                return MENUPRINCIPAL.RETANGULO;
            case '5':
                ImprimeOpcaoMenu("PENTAGONO");
                return MENUPRINCIPAL.PENTAGONO;
            case '6':
                ImprimeOpcaoMenu("HEXAGONO");
                return MENUPRINCIPAL.HEXAGONO;
            case '7':
                ImprimeOpcaoMenu("CIRCULO");
                return MENUPRINCIPAL.CIRCULO;
            case 'D':
                ImprimeOpcaoMenu("DESENHAR");
                return MENUPRINCIPAL.DESENHAR;
            case 'L':
                ImprimeOpcaoMenu("LISTAR");
                return MENUPRINCIPAL.LISTAR;
            case 'S':
                ImprimeOpcaoMenu("SALVAR");
                return MENUPRINCIPAL.SALVAR;
            case 'R':
                ImprimeOpcaoMenu("RECARREGAR");
                return MENUPRINCIPAL.RECARREGAR;
            default:
                ImprimeOpcaoMenu("SAIR");
                return MENUPRINCIPAL.SAIR;

        }

    }

    public SUBMENUS MenuDaFiguraGeometrica(FiguraGeometrica f){
        System.out.println("MENU: "+ f);
        System.out.println("______________________________");
        for (int i = 0; i < VetoresMenu.MenuCadaFigura.length; i++) {
            System.out.println(VetoresMenu.MenuCadaFiguraIndice[i] + " - " + VetoresMenu.Menu[i]);
        }
        System.out.println("______________________________");
        System.out.print("ESCOLHA UMA OPÇÃO: ");
        char op = pedeChar();

        switch (op) {
            case '1' -> {
                ImprimeOpcaoMenu("NOVO");
                return SUBMENUS.NOVO;
            }
            case '2' -> {
                ImprimeOpcaoMenu("EDITAR");
                return SUBMENUS.EDITAR;
            }
            case '3' -> {
                ImprimeOpcaoMenu("LISTAR");
                return SUBMENUS.LISTAR;
            }
            case '4' -> {
                ImprimeOpcaoMenu("MOSTRAR");
                return SUBMENUS.MOSTRAR;
            }
            case '5' -> {
                ImprimeOpcaoMenu("EXCLUIR");
                return SUBMENUS.EXCLUIR;
            }
            default -> {
                ImprimeOpcaoMenu("VOLTAR");
                return SUBMENUS.VOLTAR;
            }
        }
    }

    public void ImprimeOpcaoMenu(String m) {
        System.out.println("______________________________");
        System.out.println("ESCOLHI: " + m);
        System.out.println("______________________________");
    }

    public void desenhar() {
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
        int lados = pedeInteiro("");
        switch (lados) {
            case 3:

            case 4:

            case 5:
                System.out.println("______________________________");
                System.out.println("CERTO, UM PENTAGONO! VOU PREPARAR ELE! ");
                System.out.print("QUAL O TAMANHO DOS LADOS DO PENTAGONO? ");
                tamanhoLado = pedeDouble("");
                System.out.println("______________________________");
                System.out.println("SEU PENTAGONO FOI FEITO! ELE ESTÁ ALI NA LISTA.");
                return new PoligonosRegulares(lados, tamanhoLado);
            case 6:
                System.out.println("______________________________");
                System.out.println("QUE LEGAL, UM HEXAGONO! PARECE UM FAVO DE MEL! ");
                System.out.println("VOCE TAMBEM GOSTA DE ABELHAS?! QUER DIZER... ");
                System.out.print("QUAL O TAMANHO DOS LADOS DO HEXAGONO? ");
                tamanhoLado = pedeDouble("");
                System.out.println("______________________________");
                System.out.println("ME DESCULPE, SEU HEXAGONO FOI FEITO! ABELHAAAAS!!!!");
                return new PoligonosRegulares(lados, tamanhoLado);
            case 10:
                System.out.println("______________________________");
                System.out.println("QUE LEGAL, UM DECAGONO! AINDA BEM QUE CONSIGO CONTAR OS LADOS NOS DEDOS! ");
                System.out.print("QUAL O TAMANHO DOS LADOS DO DECAGONO? ");
                tamanhoLado = pedeDouble("");
                System.out.println("______________________________");
                System.out.println("UFA, ACABEI, SEU DECAGONO FOI FEITO!");
                return new PoligonosRegulares(lados, tamanhoLado);
            case 12:
                System.out.println("______________________________");
                System.out.println("UM DODECAGONO? NÃO CONSIGO NEM CONTAR OS LADOS NOS DEDOS! ");
                System.out.print("QUAL O TAMANHO DOS LADOS DO DODECAGONO? ");
                tamanhoLado = pedeDouble("");
                System.out.println("______________________________");
                System.out.println("NOSSA, ESSE FOI DIFICIL MAS SEU DODECAGONO FOI FEITO!");
                return new PoligonosRegulares(lados, tamanhoLado);
            case 20:
                System.out.println("______________________________");
                System.out.println("VOCE ESTÁ LOUCO? UM ICOSAGONO TEM LADOS DEMAIS! MAS VOU TENTAR.");
                System.out.print("QUAL O TAMANHO DOS LADOS DO ICOSAGONO? ");
                tamanhoLado = pedeDouble("");
                System.out.println("______________________________");
                System.out.println("NOSSA, NUNCA MAIS FAÇO UM ICOSAGONO, MAS ESSE FOI FEITO!");
                return new PoligonosRegulares(lados, tamanhoLado);
            default:
                System.out.println("______________________________");
                System.out.println("ME DESCULPA, MAS EU NÃO CONSIGO CRIAR COM ESSA QUANTIDADE DE LADOS");
                System.out.println("ENTÃO VOU TE FAZER UM CIRCULO E NÓS VAMOS BRINCAR DE FUTEBOL!! ");
                System.out.print("QUAL O TAMANHO VOCÊ QUER QUE A BOLA TENHA? O RAIO DELA: ");
                lados = -1;
                tamanhoLado = pedeDouble("");
                System.out.println("______________________________");
                System.out.println("UM CIRCULO SEMPRE DESCE REDONDO! ELE FOI CRIADO");
                return new PoligonosRegulares(lados, tamanhoLado);
        }
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

}
