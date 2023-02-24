package EjerciciosExamen_Fila_A.Ejercicio4;

public class Vendedor {
    private Builder builder;
    public Paquete getProduct(){
        return builder.getPaquete();
    }

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public void buildProduct(){
        this.builder.createPaquete();
        this.builder.buildChocolates();
        this.builder.buildGaseosas();
        this.builder.buildPipocas();
        this.builder.nombrarse();
    }
}
