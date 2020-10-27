import classes.ControladorAeri;

import java.util.Scanner;

public class MainClass {

    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MainClass m = new MainClass();
        m.mainApp();
    }

    private void mainApp(){
        ControladorAeri ca = new ControladorAeri();
        int seleccio;
        System.out.println("Selecciona que vols fer: ");
        System.out.println("1. Controlador aeri");
        System.out.println("2. Sortir");
        seleccio = sc.nextInt();

        while(seleccio != 2){
            switch(seleccio) {
                case 1:
                    ca.mainMenu();
                    break;
            }
        }
    }
}
