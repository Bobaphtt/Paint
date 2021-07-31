package view;


import model.FiguraGeometrica;
import model.enums.MENUPRINCIPAL;
import model.enums.TIPOS;

import java.util.Scanner;

public class UserIO {

    protected Scanner in;

    public UserIO() {
        in = new Scanner(System.in);
    }

    public void ImprimeONegocio(String m) {
        System.out.println(m);
    }

    public void ImprimeOpcaoMenu(String m) {
        System.out.println("______________________________");
        System.out.println("ESCOLHI: " + m);
        System.out.println("______________________________");
    }

    public char pedeChar() {
        return in.next().charAt(0);
    }


    public TIPOS MenuCriar() {
        System.out.println("______________________________");
        System.out.println("1 - POLIGONO REGULAR");
        System.out.println("2 - POLIGONO IRREGULAR");
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

    public void triste() {
        System.out.println("AINDA NAO IMPLEMENTADO!");
    }

    public FiguraGeometrica criaRegular() {
        FiguraGeometrica fig = null;
        return fig;
    }

    public FiguraGeometrica criaRetangulo() {
        FiguraGeometrica fig = null;
        return fig;
    }

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
}
