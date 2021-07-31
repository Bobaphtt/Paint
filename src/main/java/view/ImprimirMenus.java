package view;

import java.util.Scanner;

public class ImprimirMenus {
    public void MenuPrincipal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("______________________________");
        for (int i = 0; i < VetoresMenu.Menu.length; i++){
            System.out.println(VetoresMenu.MenuLetra[i]+" - "+VetoresMenu.Menu[i]);
        }
        System.out.println("______________________________");
        System.out.print("ESCOLHA UMA OPÇÃO: ");
    }
}
