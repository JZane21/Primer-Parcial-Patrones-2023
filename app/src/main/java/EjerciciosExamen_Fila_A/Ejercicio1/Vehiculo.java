package EjerciciosExamen_Fila_A.Ejercicio1;

public class Vehiculo {
    private String placa;
    private String modelo;
    private String color;
    private Conductor conductor;

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Vehiculo(String placa, String modelo, String color, Conductor conductor) {
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.conductor = conductor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void realizarPago(int dinero, Administrador administrador){
        administrador.cobrarPeaje(this, dinero, administrador);
    }
}
