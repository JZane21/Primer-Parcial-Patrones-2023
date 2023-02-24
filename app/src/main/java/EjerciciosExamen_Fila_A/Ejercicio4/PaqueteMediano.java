package EjerciciosExamen_Fila_A.Ejercicio4;

public class PaqueteMediano extends Builder{

    @Override
    public void buildPipocas() {
        // TODO Auto-generated method stub
        paquete.setPipocas("grandes");
    }

    @Override
    public void buildGaseosas() {
        // TODO Auto-generated method stub
        paquete.setGaseosas("2 vasos de refrescos");
    }

    @Override
    public void buildChocolates() {
        // TODO Auto-generated method stub
        paquete.setChocolates("1 chocolate");
    }

    @Override
    public void nombrarse() {
        // TODO Auto-generated method stub
        paquete.setTipoPaquete("Paquete Mediano");
    }
    
}
