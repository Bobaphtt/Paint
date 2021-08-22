package view.gui;

import javax.swing.*;
import java.awt.*;

import model.*;
import dao.FiguraGeometrica;
import view.*;

public class DesenhoGrafico {

    private void criarEMostrarBoard(model.FiguraGeometrica[] figs) {
        System.out.println("Log que Criou a tela? " +
                SwingUtilities.isEventDispatchThread());
        JFrame f = new JFrame("Paintex 5000 Pro Ultra");
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.add(new PainelDeDesenho(figs));
        f.setSize(1230, 720);
        f.setVisible(true);
    }

    public void desenhar(model.FiguraGeometrica[] figs) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                criarEMostrarBoard(figs);
            }
        });


        return;
    }

    class PainelDeDesenho extends JPanel {

        private model.FiguraGeometrica[] figs;

        public PainelDeDesenho(model.FiguraGeometrica[] figs) {
            this.figs = figs;
            setBorder(BorderFactory.createLineBorder(Color.black));
        }

        public Dimension getPreferredSize() {
            return new Dimension(1230, 720);
        }


        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            int molduraX = 20;
            int molduraY = 20;
            boolean jarodouisso = true;
            int j = 0;

            for (int i = 0; i < figs.length; i++) {

                if (i > 4 && jarodouisso) {
                    jarodouisso = false;
                    molduraY += 360;
                    molduraX = 20;
                }

                if (figs[i] != null) {

                    model.FiguraGeometrica f = figs[i];

                    g.setColor(new Color(245, 10, 10));
                    g.drawRect(molduraX, molduraY, 216, 216);
                    g.setColor(new Color(0, 0, 0));

                    if (f instanceof Ponto) {
                        g.drawRect(molduraX + 10, molduraY + 10, 0, 0);
                        g.drawString("NOME: " + f.toString(), molduraX, molduraY + 230);
                        g.drawString("AREA: " + f.mostrarArea(), molduraX, molduraY + 245);
                        g.drawString("PERIMETRO: " + f.mostrarPerimetro(), molduraX, molduraY + 260);
                    }

                    if (f instanceof Reta) {
                        g.drawRect(molduraX + 10, molduraY + 10, (int) ((Reta) f).getTamanho(), 0);
                        g.drawString("NOME: " + f.toString(), molduraX, molduraY + 230);
                        g.drawString("AREA: " + f.mostrarArea(), molduraX, molduraY + 245);
                        g.drawString("PERIMETRO: " + f.mostrarPerimetro(), molduraX, molduraY + 260);
                    }

                    if (f instanceof Quadrado) {
                        g.drawRect(molduraX + 10, molduraY + 10, (int) ((Quadrado) f).getTamanhoDoLado(), (int) ((Quadrado) f).getTamanhoDoLado());
                        g.drawString("NOME: " + f.toString(), molduraX, molduraY + 230);
                        g.drawString("AREA: " + f.mostrarArea(), molduraX, molduraY + 245);
                        g.drawString("PERIMETRO: " + f.mostrarPerimetro(), molduraX, molduraY + 260);
                    }

                    if (f instanceof Circulo) {
                        g.drawArc(molduraX + 10, molduraY + 10, (int) ((Circulo) f).getRaio() * 2, (int) ((Circulo) f).getRaio() * 2, 0, 360);
                        g.drawString("NOME: " + f.toString(), molduraX, molduraY + 230);
                        g.drawString("AREA: " + f.mostrarArea(), molduraX, molduraY + 245);
                        g.drawString("PERIMETRO: " + f.mostrarPerimetro(), molduraX, molduraY + 260);
                    }

                    if (f instanceof Quadrilatero) {
                        g.drawRect(molduraX + 10, molduraY + 10, (int) ((Quadrilatero) f).getAltura(), (int) ((Quadrilatero) f).getComprimento());
                        g.drawString("NOME: " + f.toString(), molduraX, molduraY + 230);
                        g.drawString("AREA: " + f.mostrarArea(), molduraX, molduraY + 245);
                        g.drawString("PERIMETRO: " + f.mostrarPerimetro(), molduraX, molduraY + 260);
                    }


                        //os que ainda não funcionam

                    if (f instanceof Pentagono) {
                        g.drawRect(molduraX + 10, molduraY + 10, 0, 0);
                        g.drawString("NOME: " + f.toString(), molduraX, molduraY + 230);
                        g.drawString("AREA: " + f.mostrarArea(), molduraX, molduraY + 245);
                        g.drawString("PERIMETRO: " + f.mostrarPerimetro(), molduraX, molduraY + 260);
                    }

                    if (f instanceof Hexagono) {
                        g.drawRect(molduraX + 10, molduraY + 10, 0, 0);
                        g.drawString("NOME: " + f.toString(), molduraX, molduraY + 230);
                        g.drawString("AREA: " + f.mostrarArea(), molduraX, molduraY + 245);
                        g.drawString("PERIMETRO: " + f.mostrarPerimetro(), molduraX, molduraY + 260);
                    }

                }

                molduraX += 240;

            }
        }
    }
}
