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
        System.out.println("2. Avió");
        System.out.println("3. Sortir");
        seleccio = sc.nextInt();

        while(seleccio != 3){
            switch(seleccio){
                case 1:
                    break;
                case 2:
                    String matricula;
                    System.out.println("Introdueix la matricula de l'avió que vols analitzar: ");
                    matricula = sc.next();
                    ca.gestionarAvio(matricula);
                    break;
            }
        }


    }
}
