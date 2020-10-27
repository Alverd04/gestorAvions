package classes;

import java.util.Scanner;

public class Avio {

    private Scanner sc = new Scanner(System.in);
    private String matricula;
    private String marca;
    private String model;
    private int capacitat_passatgers;
    private int tripulants;
    private String origen;
    private String destí;
    private Coordenada coordenades;
    private int autonomia;
    private int rumb;
    private boolean tren_aterratge = true;
    private int velocitat = 0;
    private boolean estat_motors = false;


    //Constructors

    public Avio(){}

    public Avio(String matricula, String marca, String model, int capacitat_passatgers) {
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
        this.capacitat_passatgers = capacitat_passatgers;
        this.coordenades = new Coordenada(100,100,0);
    }

    // Mètodes de manipulació de l'avió


    public void variarVelocitat(){
        int variació;
        int seleccio;
        System.out.println("La velocitat actual és " + this.getVelocitat() + "km/h");
        System.out.println("1. Accelerar");
        System.out.println("2. Frenar");
        seleccio = sc.nextInt();
        switch(seleccio){
            case 1:
                System.out.println("Quant vols augmentar?");
                variació = sc.nextInt();
                this.setVelocitat(this.getVelocitat()+variació);
                System.out.println("La velocitat actual és " + this.getVelocitat() + "km/h");
                break;
            case 2:
                System.out.println("Quant vols reduir?");
                variació = sc.nextInt();
                this.setVelocitat(this.getVelocitat()+variació);
                System.out.println("La velocitat actual és " + this.getVelocitat() + "km/h");
                break;
        }
    }

    public void cambiarEstatMotor(){
        if(this.isEstat_motors() == true){
            this.setEstat_motors(false);
            System.out.println("Els motors ara estan apagats");
        }
        else{
            this.setEstat_motors(true);
            System.out.println("Els motors ara estan encesos");
        }
    }

    public void cambiarEstatTrenAterratge(){
        if(this.isTren_aterratge() == true){
            this.setTren_aterratge(false);
            System.out.println("El tren d'aterratge ara esta baixat");
        }
        else{
            this.setTren_aterratge(true);
            System.out.println("El tren d'aterratge ara esta pujat");
        }
    }

    public void establirRumb(){
        int rumb;
        System.out.println("Quin rumb vols definir?");
        rumb = sc.nextInt();
        this.setRumb(rumb);
    }

    // Getters i setters

    public boolean isTren_aterratge() {
        return tren_aterratge;
    }

    public void setTren_aterratge(boolean tren_aterratge) {
        this.tren_aterratge = tren_aterratge;
    }

    public boolean isEstat_motors() {
        return estat_motors;
    }

    public void setEstat_motors(boolean estat_motors) {
        this.estat_motors = estat_motors;
    }

    public int getVelocitat() {
        return velocitat;
    }

    public void setVelocitat(int velocitat) {
        this.velocitat = velocitat;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacitat_passatgers() {
        return capacitat_passatgers;
    }

    public void setCapacitat_passatgers(int capacitat_passatgers) {
        this.capacitat_passatgers = capacitat_passatgers;
    }

    public int getTripulants() {
        return tripulants;
    }

    public void setTripulants(int tripulants) {
        this.tripulants = tripulants;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestí() {
        return destí;
    }

    public void setDestí(String destí) {
        this.destí = destí;
    }

    public Coordenada getCoordenades() {
        return coordenades;
    }

    public void setCoordenades(Coordenada coordenades) {
        this.coordenades = coordenades;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getRumb() {
        return rumb;
    }

    public void setRumb(int rumb) {
        this.rumb = rumb;
    }
}
