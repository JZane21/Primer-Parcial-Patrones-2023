package EjerciciosExamen_Fila_A.Ejercicio4;

public class PaqueteNormal extends Builder{

    @Override
    public void buildPipocas() {
        // TODO Auto-generated method stub
        paquete.setPipocas("en envase normal");
    }

    @Override
    public void buildGaseosas() {
        // TODO Auto-generated method stub
        paquete.setGaseosas("1 refresco");    
    }

    @Override
    public void buildChocolates() {
        // TODO Auto-generated method stub
        paquete.setChocolates("no cuenta con chocolates");
    }

    @Override
    public void nombrarse() {
        // TODO Auto-generated method stub
        paquete.setTipoPaquete("Paquete Normal");
    }
    
}
