package EjerciciosExamen_Fila_A.Ejercicio2;

public class TelevisorPrototype  implements IPrototype {
    private String sistemaOperativo;
    private String versionOS;
    private int tamano;
    private int resolucion;
    private boolean puertoHDMI;
    private int puertosUSB;
    private boolean controlRemoto;
    private boolean bluetooth;
    private int serial;

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public boolean isControlRemoto() {
        return controlRemoto;
    }

    public void setControlRemoto(boolean controlRemoto) {
        this.controlRemoto = controlRemoto;
    }

    public int getPuertosUSB() {
        return puertosUSB;
    }

    public void setPuertosUSB(int puertosUSB) {
        this.puertosUSB = puertosUSB;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getVersionOS() {
        return versionOS;
    }

    public void setVersionOS(String versionOS) {
        this.versionOS = versionOS;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public TelevisorPrototype clone() {
        TelevisorPrototype clone =  new TelevisorPrototype();
        clone.setBluetooth(this.isBluetooth());
        clone.setControlRemoto(this.isControlRemoto());
        clone.setPuertoHDMI(this.isPuertoHDMI());
        clone.setPuertosUSB(this.getPuertosUSB());
        clone.setResolucion(this.getResolucion());
        clone.setSerial(this.getSerial());
        clone.setSistemaOperativo(this.getSistemaOperativo());
        clone.setTamano(this.getTamano());
        clone.setVersionOS(this.getVersionOS());
        return clone;
    }
}
