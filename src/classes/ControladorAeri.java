package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class ControladorAeri {

    private ArrayList<Avio> espai_aeri = new ArrayList<Avio>();
    private Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        int seleccio = 0;
        String matricula;
        while(seleccio!=6){
            System.out.println("Selecciona que vols fer: ");
            System.out.println("1. Afegir un avió a l'espai Aeri");
            System.out.println("2. Gestionar un avió de l'espai Aeri");
            System.out.println("3. Mostrar l'espai aeri actual");
            System.out.println("4. Xifrar els avions de combat");
            System.out.println("5. Desxifrar els avions de combat");
            System.out.println("6. Sortir");
            seleccio = sc.nextInt();
            switch(seleccio){
                case 1:
                    afegirAvio();
                    break;
                case 2:
                    System.out.println("Introdueix la matricula de l'avió que vols analitzar: ");
                    matricula = sc.next();
                    gestionarAvio(matricula);
                    break;
                case 3:
                    mostrarAvions();
                    break;
                case 4:
                    System.out.println("Introdueix la matricula de l'avió que vols xifrar: ");
                    matricula = sc.next();
                    xifrarAvioCombat(matricula);
                    break;
                case 5:
                    System.out.println("Introdueix la matricula de l'avió que vols desxifrar: ");
                    matricula = sc.next();
                    desxifrarAvioCombat(matricula);
                    break;
            }
        }


    }

    //Done
    public void afegirAvio(){
        Avio avio;
        avio = generarAvio();
        this.espai_aeri.add(avio);
    }

    public void gestionarAvio(String matricula){
        try{
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
                    avio.cambiarEstatMotor();
                    break;
                case 2:
                    avio.variarVelocitat();
                    break;
                case 3:
                    avio.cambiarEstatTrenAterratge();
                    break;
                case 4:
                    avio.establirRumb();
                    break;
                case 5:
                    System.out.println("L'estat de l'avió és bo");
                    break;
            }
        }catch(Exception e){
            System.out.println("No existeix l'avió");
        }

    }

    public void mostrarAvions(){
        for(int i = 0; i < espai_aeri.size(); i++){
            if(i == 0){
                System.out.print("Avió" + "          " + "Posició x" + "          " + "Posició Y" + "          " + "Posició Z");
                System.out.println();
            }
            System.out.print(this.espai_aeri.get(i).getMatricula());
            System.out.print("          ");
            System.out.print(this.espai_aeri.get(i).getCoordenades().getX());
            System.out.print("          ");
            System.out.print(this.espai_aeri.get(i).getCoordenades().getY());
            System.out.print("                    ");
            System.out.print(this.espai_aeri.get(i).getCoordenades().getZ());
            System.out.println();

        }
    }

    public void xifrarAvioCombat(String matricula){

    }

    public void desxifrarAvioCombat(String matricula){

    }

    private Avio generarAvio(){
        String matricula;
        String marca;
        String model;
        int capacitat_passatgers;

        System.out.println("Introdueix la matricula de l'avió:");
        matricula = sc.next();
        System.out.println("Introdueix la marca de l'avió:");
        marca = sc.next();
        System.out.println("Introdueix el model de l'avió:");
        model = sc.next();
        System.out.println("Introdueix la capacitat de passatgers de l'avió:");
        capacitat_passatgers = sc.nextInt();

        Avio avio_nou = new Avio(matricula, marca, model, capacitat_passatgers);

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

}
