package view.gui;

import javax.swing.*;
import java.awt.*;

import model.*;
import dao.FiguraGeometrica;
import view.*;

public class DesenhoGrafico {

    private void criarEMostrarBoard(model.FiguraGeometrica[] figs) {
        System.out.println("TELA FOI CRIADA? " + SwingUtilities.isEventDispatchThread());
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
                    g.drawString("*Apenas uma representação, os desenhos dessa figura podem não corresponder as medidas inseridas por você.", molduraX, molduraY + 290);
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
                        int pontosx[] = new int[5];
                        int pontosy[] = new int[5];
                        double multiplicador = 1;

                        if (((Pentagono) f).getTamanhoDoLado() < 25) {
                            multiplicador = 0.1;
                        } else if (((Pentagono) f).getTamanhoDoLado() < 54) {
                            multiplicador = 0.2;
                        } else if (((Pentagono) f).getTamanhoDoLado() < 108){
                            multiplicador = 0.5;
                        }

                        pontosx[0] = -50;
                        pontosx[1] = 50;
                        pontosx[2] = 90;
                        pontosx[3] = 0;
                        pontosx[4] = -90;

                        pontosy[0] = 70;
                        pontosy[1] = 70;
                        pontosy[2] = -10;
                        pontosy[3] = -80;
                        pontosy[4] = -10;

                        for (int k = 0; k < 5; k++) {
                            pontosx[k] = (int) (pontosx[k] * multiplicador);
                            pontosy[k] = (int) (pontosy[k] * multiplicador);
                            pontosx[k] += molduraX + 108;
                            pontosy[k] += molduraY + 108;
                        }


                        g.drawPolygon(pontosx, pontosy, 5);
                        g.drawString("NOME: " + f.toString() + "*", molduraX, molduraY + 230);
                        g.drawString("AREA: " + f.mostrarArea(), molduraX, molduraY + 245);
                        g.drawString("PERIMETRO: " + f.mostrarPerimetro(), molduraX, molduraY + 260);
                    }

                    if (f instanceof Hexagono) {
                        int pontosx[] = new int[6];
                        int pontosy[] = new int[6];
                        double multiplicador = 1;


                        if (((Hexagono) f).getTamanhoDoLado() < 27) {
                            multiplicador = 0.1;
                        } else if (((Hexagono) f).getTamanhoDoLado() < 54) {
                            multiplicador = 0.2;
                        } else if (((Hexagono) f).getTamanhoDoLado() < 108){
                            multiplicador = 0.5;
                        }

                        pontosx[0] = -90;
                        pontosx[1] = -50;
                        pontosx[2] = 50;
                        pontosx[3] = 90;
                        pontosx[4] = 50;
                        pontosx[5] = -50;

                        pontosy[0] = 0;
                        pontosy[1] = 80;
                        pontosy[2] = 80;
                        pontosy[3] = 0;
                        pontosy[4] = -80;
                        pontosy[5] = -80;

                        for(int k = 0; k <6; k++){
                            pontosx[k] = (int)(pontosx[k]*multiplicador);
                            pontosy[k] = (int)(pontosy[k]*multiplicador);
                            pontosx[k] += molduraX+108;
                            pontosy[k] += molduraY+108;
                        }

                        g.drawPolygon(pontosx, pontosy, 6);
                        g.drawString("NOME: " + f.toString() + "*", molduraX, molduraY + 230);
                        g.drawString("AREA: " + f.mostrarArea(), molduraX, molduraY + 245);
                        g.drawString("PERIMETRO: " + f.mostrarPerimetro(), molduraX, molduraY + 260);
                    }

                }

                molduraX += 240;

            }
        }
    }
}
