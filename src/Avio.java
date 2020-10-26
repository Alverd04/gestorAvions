public class Avio {
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

    public Avio(String matricula, String marca, String model, int capacitat_passatgers, int tripulants, String origen, String destí, Coordenada coordenades, int autonomia, int rumb) {
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
        this.capacitat_passatgers = capacitat_passatgers;
        this.tripulants = tripulants;
        this.origen = origen;
        this.destí = destí;
        this.coordenades = coordenades;
        this.autonomia = autonomia;
        this.rumb = rumb;
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
