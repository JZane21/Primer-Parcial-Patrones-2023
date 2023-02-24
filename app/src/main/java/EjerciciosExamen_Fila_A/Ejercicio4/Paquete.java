package EjerciciosExamen_Fila_A.Ejercicio4;

public class Paquete {
    private String tipoPaquete;
    public String getTipoPaquete() {
        return tipoPaquete;
    }
    public Paquete setTipoPaquete(String tipoPaquete) {
        this.tipoPaquete = tipoPaquete;
        return this;
    }

    private String pipocas;
    public String getPipocas() {
        return pipocas;
    }
    public Paquete setPipocas(String pipocas) {
        this.pipocas = pipocas;
        return this;
    }

    private String gaseosas;
    public String getGaseosas() {
        return gaseosas;
    }
    public Paquete setGaseosas(String gaseosas) {
        this.gaseosas = gaseosas;
        return this;
    }

    private String chocolates;
    public String getChocolates() {
        return chocolates;
    }
    public Paquete setChocolates(String chocolates) {
        this.chocolates = chocolates;
        return this;
    }

    public void showInfo(){
        System.out.println("\nTipo combo: "+tipoPaquete);
        System.out.println("Pipocas: "+pipocas);
        System.out.println("Gaseosas: "+gaseosas);
        System.out.println("Chocolates: "+chocolates);
    }
}
