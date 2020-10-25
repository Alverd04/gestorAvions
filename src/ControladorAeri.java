import java.util.ArrayList;
import java.util.Scanner;

public class ControladorAeri {

    private ArrayList<Avio> espai_aeri;
    private Scanner sc = new Scanner(System.in);

    //Done
    public void afegirAvio(){
        Avio avio;
        avio = generarAvio();
        espai_aeri.add(avio);
    }

    public void gestionarAvio(String matricula){
        Avio avio = trobarAvio(matricula);
        int opcio;
        System.out.println("Selecciona que vols gestionar: ");
        System.out.println("1. Encendre o apagar motor ");
        System.out.println("2. Accelerar o frenar ");
        System.out.println("3. Pujar tren d'aterratge o baixar-lo");
        System.out.println("4. Establir rumb ");
        System.out.println("5. Obtenir l'estat de l'avió");
        opcio = sc.nextInt();

        switch (opcio){
            case 1:
                cambiarEstatMotors(avio);
                break;
            case 2:
                accelerarFrenar(avio);
                break;
            case 3:
                cambiarEstatTrenAterratge(avio);
                break;
            case 4:
                establirRumb(avio);
                break;
            case 5:
                System.out.println("L'estat de l'avió és bo");
                break;
        }
    }

    public void mostrarAvions(){
        for(int i = 0; i < espai_aeri.size(); i++){

        }
    }

    public void xifrarAvioCombat(String nom){

    }

    public void desxifrarAvioCombat(String nom){

    }

    private Avio generarAvio(){
        String matricula;
        String marca;
        String model;
        int capacitat_passatgers;
        int tripulants;
        String origen;
        String desti;
        int coordenada_x;
        int coordenada_y;
        int coordenada_z;
        Coordenada coordenades;
        int autonomia;
        int rumb;

        System.out.println("Introdueix la matricula de l'avió:");
        matricula = sc.next();
        System.out.println("Introdueix la marca de l'avió:");
        marca = sc.next();
        System.out.println("Introdueix el model de l'avió:");
        model = sc.next();
        System.out.println("Introdueix la capacitat de passatgers de l'avió:");
        capacitat_passatgers = sc.nextInt();
        System.out.println("Introdueix els tripulants de l'avió:");
        tripulants= sc.nextInt();
        System.out.println("Introdueix l'origen' de l'avió:");
        origen = sc.next();
        System.out.println("Introdueix el destií de l'avió:");
        desti = sc.next();
        System.out.println("Introdueix les coordenades de l'avió:");
        System.out.println("Coordenada x: ");
        coordenada_x = sc.nextInt();
        System.out.println("Coordenada y: ");
        coordenada_y = sc.nextInt();
        System.out.println("Coordenada z: ");
        coordenada_z = sc.nextInt();
        coordenades = new Coordenada(coordenada_x, coordenada_y, coordenada_z);
        System.out.println("Introdueix l'autonomia de l'avió:");
        autonomia = sc.nextInt();
        System.out.println("Introdueix el rumb de l'avió:");
        rumb = sc.nextInt();
        Avio avio_nou = new Avio(matricula, marca, model, capacitat_passatgers, tripulants, origen, desti, coordenades, autonomia, rumb);

        return avio_nou;
    }

    private Avio trobarAvio(String matricula){
        for(int i = 0; i < espai_aeri.size(); i++){
            if(espai_aeri.get(i).getMatricula() == matricula){
                return espai_aeri.get(i);
            }
            else{
                continue;
            }
        }
        return null;
    }

    private void accelerarFrenar(Avio avio){
        int variació;
        int seleccio;
        System.out.println("La velocitat actual és " + avio.getVelocitat() + "km/h");
        System.out.println("1. Accelerar");
        System.out.println("2. Frenar");
        seleccio = sc.nextInt();
        switch(seleccio){
            case 1:
                System.out.println("Quant vols augmentar?");
                variació = sc.nextInt();
                avio.setVelocitat(avio.getVelocitat()+variació);
                System.out.println("La velocitat actual és " + avio.getVelocitat() + "km/h");
                break;
            case 2:
                System.out.println("Quant vols reduir?");
                variació = sc.nextInt();
                avio.setVelocitat(avio.getVelocitat()+variació);
                System.out.println("La velocitat actual és " + avio.getVelocitat() + "km/h");
                break;
        }
    }

    private void cambiarEstatMotors(Avio avio){
        if(avio.isEstat_motors() == true){
            avio.setEstat_motors(false);
            System.out.println("Els motors ara estan apagats");
        }
        else{
            avio.setEstat_motors(true);
            System.out.println("Els motors ara estan encesos");
        }
    }

    private void cambiarEstatTrenAterratge(Avio avio){
        if(avio.isTren_aterratge() == true){
            avio.setTren_aterratge(false);
            System.out.println("El tren d'aterratge ara esta baixat");
        }
        else{
            avio.setTren_aterratge(true);
            System.out.println("El tren d'aterratge ara esta pujat");
        }
    }

    private void establirRumb(Avio avio){
        int rumb;
        System.out.println("Quin rumb vols definir?");
        rumb = sc.nextInt();
        avio.setRumb(rumb);
    }
}
