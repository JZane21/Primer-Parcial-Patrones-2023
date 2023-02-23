package EjerciciosExamen_Fila_A.Ejercicio4;

public abstract class Builder {
    protected Paquete paquete;

    public Paquete getPaquete() {
        return paquete;
    }

    public void createPaquete() {
        paquete = new Paquete();
    }

    public abstract void buildPipocas();
    public abstract void buildGaseosas();
    public abstract void buildChocolates();

}
