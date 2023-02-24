package EjerciciosExamen_Fila_A.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();

        MegaPaquete megaPaquete = new MegaPaquete();
        vendedor.setBuilder(megaPaquete);
        vendedor.buildProduct();
        Paquete p1 = vendedor.getProduct();
        p1.showInfo();

        PaqueteMediano paqueteMediano = new PaqueteMediano();
        vendedor.setBuilder(paqueteMediano);
        vendedor.buildProduct();
        Paquete p2 = vendedor.getProduct();
        p2.showInfo();

        PaqueteNormal paqueteNormal = new PaqueteNormal();
        vendedor.setBuilder(paqueteNormal);
        vendedor.buildProduct();
        Paquete p3 = vendedor.getProduct();
        p3.showInfo();
    }
}
