package view;

import java.util.Scanner;

public class UserInput {

    public char leOpcaoMenuPrincipal(){
        Scanner sc = new Scanner(System.in);
        char result = sc.next().charAt(0);
        return result;
    }

}
