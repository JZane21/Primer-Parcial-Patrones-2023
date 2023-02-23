package EjerciciosExamen_Fila_A.Ejercicio1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Administrador administrador = new Administrador("Jhon Snow", 1234);

        Thread user1 = new Thread(new Runnable() {
            @Override
            public void run() {
                CabinaControl c1 = CabinaControl.getInstance();
                Vehiculo v1 = 
                new Vehiculo("A11"
                , "familiar", "rojo"
                , new Conductor("conductor 1"));
                v1.realizarPago(123, administrador);
            }
        });

        Thread user2 = new Thread(new Runnable() {
            @Override
            public void run() {
                CabinaControl c1 = CabinaControl.getInstance();
                Vehiculo v1 = 
                new Vehiculo("B11"
                , "familiar", "verde"
                , new Conductor("conductor 2"));
                v1.realizarPago(29, administrador);
            }
        });

        Thread user3 = new Thread(new Runnable() {
            @Override
            public void run() {
                CabinaControl c1 = CabinaControl.getInstance();
                Vehiculo v1 = 
                new Vehiculo("C11"
                , "economico", "amarillo"
                , new Conductor("conductor 3"));
                v1.realizarPago(324, administrador);
            }
        });

        Thread user4 = new Thread(new Runnable() {
            @Override
            public void run() {
                CabinaControl c1 = CabinaControl.getInstance();
                Vehiculo v1 = 
                new Vehiculo("D11"
                , "economico", "azul"
                , new Conductor("conductor 4"));
                v1.realizarPago(1000, administrador);
            }
        });

        Thread user5 = new Thread(new Runnable() {
            @Override
            public void run() {
                CabinaControl c1 = CabinaControl.getInstance();
                Vehiculo v1 = 
                new Vehiculo("E11"
                , "todo terreno", "rojo"
                , new Conductor("conductor 5"));
                v1.realizarPago(462, administrador);
            }
        });

        Thread user6 = new Thread(new Runnable() {
            @Override
            public void run() {
                CabinaControl c1 = CabinaControl.getInstance();
                Vehiculo v1 = 
                new Vehiculo("F11"
                , "todo terreno", "violeta"
                , new Conductor("conductor 6"));
                v1.realizarPago(200, administrador);
            }
        });

        user1.start();
        Thread.sleep(0500);
        user2.start();
        Thread.sleep(0500);
        user3.start();
        Thread.sleep(0500);
        user4.start();
        Thread.sleep(0500);
        user5.start();
        Thread.sleep(0500);
        user6.start();
        Thread.sleep(0500);

        CabinaControl.getInstance().estadoCabina();

    }

    
}
