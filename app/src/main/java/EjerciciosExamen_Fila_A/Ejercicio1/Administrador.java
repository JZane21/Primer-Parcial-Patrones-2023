package EjerciciosExamen_Fila_A.Ejercicio1;

public class Administrador {
    private String nombre;
    private int codigo;
    
    public Administrador(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void cobrarPeaje(Vehiculo vehiculo, int monto, Administrador administrador){
        CabinaControl.getInstance().controlVehicular(vehiculo, monto, administrador);
    }
}
