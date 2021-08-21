package view;

import model.FiguraGeometrica;
import model.enums.MENUPRINCIPAL;
import model.enums.SUBMENUS;
import view.cli.UserIO;
import view.gui.DesenhoGrafico;

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
            System.out.println(VetoresMenu.MenuObjIndice[i] + " - " + VetoresMenu.MenuObj[i]);
        }
        for (int i = 0; i < VetoresMenu.Menu.length; i++) {
            System.out.println(VetoresMenu.MenuIndice[i] + " - " + VetoresMenu.Menu[i]);
        }
        System.out.println("______________________________");
        char op = pedeChar("ESCOLHA UMA OPÇÃO: ");

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
            System.out.println(VetoresMenu.MenuCadaFiguraIndice[i] + " - " + VetoresMenu.MenuCadaFigura[i]);
        }
        System.out.println("______________________________");
        char op = pedeChar("ESCOLHA UMA OPÇÃO: ");

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

    public void desenhar(FiguraGeometrica[] f) {
        System.out.println("OLHA, EU AINDA NÃO TENHO LÁPIS PRA DESENHAR :(");
        System.out.println("MAS O LUAN DISSE QUE IA CONSTRUIR UM PARA MIM! ");
        DesenhoGrafico dg = new DesenhoGrafico();
        dg.desenhar(f);
    }

   public void listar(FiguraGeometrica[] vetor) {
        boolean vazio = true;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null) {
                System.out.println(i +" - "+ vetor[i]+ "{AREA: "+vetor[i].mostrarArea() + "- PERIMETRO: "+vetor[i].mostrarPerimetro()+"}");
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
