package view.cli;


import model.FiguraGeometrica;
import model.enums.SUBMENUS;
import view.PaiInterface;

import java.util.Scanner;

public class UserIO implements PaiInterface {

    protected Scanner in;

    //INPUT OUTPUT
    public UserIO() {
        in = new Scanner(System.in);
    }

    public void imprimeMensagem(String m) {
        System.out.println(m);
    }

    public char pedeChar(String question) {
        System.out.print(question);
        return in.next().charAt(0);
    }

    public int pedeInteiro(String question) {
        System.out.print(question);
        int x;
        try{
            x = in.nextInt();
        }catch (Exception e){
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("ERRO: "+e);
            System.out.println("INSIRA O VALOR CORRETO DA PROXIMA VEZ! ");
            System.out.println("O VALOR RETORNADO FOI 0! (MAS VOCE PODE EDITA-LO)");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            x = 0;
        }
        return x;
    }

    public double pedeDouble(String question) {
        System.out.print(question);
        double x;
        try{
            x = in.nextDouble();
        }catch (Exception e){
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("ERRO: "+e);
            System.out.println("INSIRA O VALOR CORRETO DA PROXIMA VEZ! ");
            System.out.println("O VALOR RETORNADO FOI 0! (MAS VOCE PODE EDITA-LO)");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            x = 0;
        }
        return x;
    }

    public String pedeStrings(String question) {
        System.out.print(question);
        return in.nextLine();
    }

    public boolean verificaProximoInt() {
        return in.hasNextInt();
    }

}
