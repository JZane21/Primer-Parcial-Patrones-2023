package EjerciciosExamen_Fila_A.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        TelevisorPrototype o1 = new TelevisorPrototype();

        // sistema operativo
        // (android), 
        // versión del sistema operativo (11.0), 
        // pulgadas (80), 
        // resolución (50), 
        // puerto hdmi
        // (true), 
        // puertos usb (4), 
        // control remoto (true), 
        // bluetooth (true), 
        // serial del televisor (10 dígitos),

        o1.setBluetooth(true);
        o1.setControlRemoto(true);
        o1.setPuertoHDMI(true);
        o1.setPuertosUSB(4);
        o1.setResolucion(50);
        o1.setSerial(10);
        o1.setSistemaOperativo("android");
        o1.setTamano(80);
        o1.setVersionOS("11.0");

        System.out.println("SERIAL TV 1 - ORIGINAL: "+o1.getSerial());

        TelevisorPrototype o2 = o1.clone();
        o2.setSerial(2000);
        TelevisorPrototype o3 = o1.clone();
        o3.setSerial(3000);
        TelevisorPrototype o4 = o1.clone();
        o4.setSerial(4000);
        TelevisorPrototype o5 = o1.clone();
        o5.setSerial(5000);
        TelevisorPrototype o6 = o1.clone();
        o6.setSerial(6000);

        System.out.println("SERIAL TV 2: "+o2.getSerial());
        System.out.println("SERIAL TV 3: "+o3.getSerial());
        System.out.println("SERIAL TV 4: "+o4.getSerial());
        System.out.println("SERIAL TV 5: "+o5.getSerial());
        System.out.println("SERIAL TV 6: "+o6.getSerial());

    }
}
