package controller;

import model.FiguraGeometrica;
import model.enums.MENUPRINCIPAL;
import model.enums.TIPOS;
import view.UserIO;


public class Paint {

    private FiguraGeometrica[] vetor;
    private UserIO interacaoComUser = new UserIO();

    public Paint() {
        vetor = new FiguraGeometrica[]{null, null, null, null, null, null, null, null, null, null};
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

        interacaoComUser.bemVindo();

        MENUPRINCIPAL op;
        do {
            op = interacaoComUser.MenuPrincipal();
            FiguraGeometrica fig;
            interacaoComUser.ImprimeOpcaoMenu("" + op);

            switch (op) {
                case CRIAR:
                    TIPOS op2 = interacaoComUser.MenuCriar();
                    switch (op2) {
                        case REGULAR:
                            fig = interacaoComUser.criaRegular();
                            insereFiguraGeometrica(fig);
                            fig = null;
                            break;
                        case RETANGULO:
                            fig = interacaoComUser.criaRetangulo();
                            insereFiguraGeometrica(fig);
                            fig = null;
                            break;
                        case SAIR:
                            break;
                        default:
                            break;
                    }
                    break;
                case LISTAR:
                    interacaoComUser.listar(vetor);
                    break;
                case APAGAR:
                    interacaoComUser.listar(vetor);
                    vetor = interacaoComUser.apagar(vetor);
                    break;
                case DESENHAR:
                    interacaoComUser.triste();
                    break;
                case SAIR:
                    break;
            }
        } while (op != MENUPRINCIPAL.SAIR);
    }
}
