package view;


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

    public char pedeChar() {
        return in.next().charAt(0);
    }

    public int pedeInteiro(String question) {
        return in.nextInt();
    }

    public double pedeDouble(String question) {
        return in.nextDouble();
    }

    public String pedeStrings(String question) {
        return in.nextLine();
    }

    public boolean verificaProximoInt() {
        return in.hasNextInt();
    }

}
