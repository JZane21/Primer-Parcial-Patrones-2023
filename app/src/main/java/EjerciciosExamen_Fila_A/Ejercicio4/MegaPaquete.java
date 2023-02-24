package EjerciciosExamen_Fila_A.Ejercicio4;

public class MegaPaquete extends Builder{

    @Override
    public void buildPipocas() {
        // TODO Auto-generated method stub
        paquete.setPipocas("extragrandes");
    }

    @Override
    public void buildGaseosas() {
        // TODO Auto-generated method stub
        paquete
        .setGaseosas("3 vasos de gaseosas extragrandes con recarga ilimitada");
    }

    @Override
    public void buildChocolates() {
        // TODO Auto-generated method stub
        paquete.setChocolates("2 chocolates grandes");
    }

    @Override
    public void nombrarse() {
        // TODO Auto-generated method stub
        paquete.setTipoPaquete("Mega Paquete");
    }
    
}
