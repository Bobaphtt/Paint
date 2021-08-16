package dao;

import java.io.*;

public class FiguraGeometrica {

    public void salvarArquivo(model.FiguraGeometrica[] figs) {
        FileOutputStream arquivo = null;
        try {
            arquivo = new FileOutputStream("figurasGeometricas.dat");
            ObjectOutputStream out = new ObjectOutputStream(arquivo);
            out.writeObject(figs);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Figuras Salvas");
    }

    public model.FiguraGeometrica[] carregarArquivo() { //throws IOException, ClassNotFoundException{
        model.FiguraGeometrica[] figs;

        try {
            FileInputStream arq = new FileInputStream("figurasGeometricas.dat");
            ObjectInputStream in = new ObjectInputStream(arq);
            figs = (model.FiguraGeometrica[]) in.readObject();
        } catch (IOException ex) {
            System.out.println("Ferrou IOExpection");
            ex.printStackTrace();
            return null;
        } catch (ClassNotFoundException ex) {
            System.out.println("Ferrou Class");
            ex.printStackTrace();
            return null;
        } catch (Exception ex) {
            System.out.println("Ferrou Tudo");
            ex.printStackTrace();
            return null;
        }
        return figs;
    }

}
