package controller;

import model.FiguraGeometrica;
import model.enums.MENUPRINCIPAL;
import model.enums.TIPOS;
import view.UserIO;


public class Paint {

    private FiguraGeometrica[] vetor;
    private UserIO interacaoComUser = new UserIO();

    public Paint() {
        vetor = new FiguraGeometrica[10];
        interacaoComUser = new UserIO();
    }

    public boolean insereFiguraGeometrica(FiguraGeometrica fig) {
        boolean acheiVazio = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == null) {
                vetor[i] = fig;
                acheiVazio = true;
                break;
            }
        }
        return acheiVazio;
    }

    public void inicio() {

        MENUPRINCIPAL op = interacaoComUser.MenuPrincipal();

        do {
            FiguraGeometrica fig;
            interacaoComUser.ImprimeOpcaoMenu("" + op);


            switch (op) {
                case CRIAR:
                    TIPOS op2 = interacaoComUser.MenuCriar();
                    switch (op2) {
                        case REGULAR:
                            fig = interacaoComUser.criaRegular();
                            insereFiguraGeometrica(fig);
                        case RETANGULO:
                            fig = interacaoComUser.criaRetangulo();
                            insereFiguraGeometrica(fig);
                        case SAIR:

                            break;
                        default:
                            break;
                    }
                case APAGAR:

                case LISTAR:
                case DESENHAR:
                    interacaoComUser.triste();
                case SAIR:
                    break;
            }
        } while (op != MENUPRINCIPAL.SAIR);
    }
}
