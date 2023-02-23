package EjerciciosExamen_Fila_A.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        TelevisorPrototype o1 = new TelevisorPrototype();
        o1.setBluetooth(this.isBluetooth());
        o1.setControlRemoto(this.isControlRemoto());
        o1.setPuertoHDMI(this.isPuertoHDMI());
        o1.setPuertosUSB(this.getPuertosUSB());
        o1.setResolucion(this.getResolucion());
        o1.setSerial(this.getSerial());
        o1.setSistemaOperativo(this.getSistemaOperativo());
        o1.setTamano(this.getTamano());
        o1.setVersionOS(this.getVersionOS());
    }
}
