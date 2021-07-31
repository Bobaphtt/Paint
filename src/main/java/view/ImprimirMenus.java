package view;

import java.util.Scanner;

public class ImprimirMenus {
    public static void MenuPrincipal(){

    }


    public static void MenuRegular(){
        System.out.println("______________________________");
        for (int i = 0; i < VetoresMenu.Regulares.length; i++){
            System.out.println(i+" - "+VetoresMenu.Regulares[i]+"");
        }
        System.out.println("______________________________");
        System.out.print("ESCOLHA UMA OPÇÃO: ");
    }

}
