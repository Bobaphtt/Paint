package view;

import model.FiguraGeometrica;
import model.Quadrilatero;

public class QuadrilateroMenu extends UserIO implements CRUD {

    public FiguraGeometrica criarFigura() {
        System.out.println("______________________________");
        System.out.println("OK, VOCE ESCOLHEU CRIAR UM RETANGULO!");
        System.out.println("AGORA EU PRECISO QUE VOCÊ PASSE AS MEDIDAS DO RETANGULO");
        double comprimento = pedeDouble("QUAL O COMPRIMENTO DO RETANGULO? ");
        double altura = pedeDouble("ÓTIMO! AGORA QUAL A ALTURA DO RETANGULO?");
        FiguraGeometrica fig = new Quadrilatero(comprimento, altura);
        System.out.println("PRONTO, SEU RETANGULO FOI CRIADO! VOCÊ PODE VER ELE NA OPÇÃO LISTAR :)");
        return fig;
    }

    public void mostrarFigura(FiguraGeometrica fig) {
        System.out.println("______________________________");
        System.out.println(fig);
    }

    public FiguraGeometrica atualizarFigura(FiguraGeometrica fig) {
        System.out.println("______________________________");
        System.out.println("AH, É AQUELE QUADRILATERO QUE EU TE DEI! ");
        System.out.println("VOCÊ QUER TROCA-LO? SÓ ME DIZER COMO QUER OUTRO");
        double altura = pedeDouble("QUAL O TAMANHO DA ALTURA DO QUADRILATERO? ");
        double comprimento = pedeDouble("QUAL O TAMANHO DO COMPRIMENTO DO QUADRILATERO? ");
        System.out.println("______________________________");
        System.out.println("SEU OUTRO QUADRILATERO FOI FEITO!");
        return new Quadrilatero(comprimento, altura);
    }

    public void apagarFigura(FiguraGeometrica fig, FiguraGeometrica[] figs) {
        listarFigura(fig, figs);
        System.out.println("______________________________");
        int indice = pedeInteiro("QUAL VOCÊ DESEJE APAGAR? ");
        figs[indice] = null;
    }

    public void listarFigura(FiguraGeometrica fig, FiguraGeometrica[] figs) {
        System.out.println("______________________________");
        for (int i = 0; i < figs.length; i++) {
            if (figs[i].getTipo() == fig.getTipo()) {
                System.out.println(i + " - " + figs[i]);
            }
        }
    }
}
