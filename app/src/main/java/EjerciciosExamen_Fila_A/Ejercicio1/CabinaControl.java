package EjerciciosExamen_Fila_A.Ejercicio1;

import java.util.Vector;

public class CabinaControl {
    private static Vector<Vehiculo> vehiculos;
    private static CabinaControl instance = null;
    private static int monto;

    private CabinaControl(){
        vehiculos = new Vector<Vehiculo>();
        monto = 0;
    }

    private synchronized static void multiThreadManage(){
        if (instance == null){
            instance = new CabinaControl();
        }
    }


    // global access
    public static CabinaControl getInstance(){
        if (instance == null){
            multiThreadManage();
        }
        return instance;
    }

    public void controlVehicular(Vehiculo vehiculo, int pago, Administrador administrador){
        if(vehiculo.getModelo().equals("familiar")){
            if(pago>=20){
                monto+=pago;
                pagoExitoso(vehiculo,administrador);
            }else{
                System.out.println("DINERO INSUFICIENTE");
            }
        }else if(vehiculo.getModelo().equals("economico")){
            if(pago>=15){
                monto+=pago;
                pagoExitoso(vehiculo,administrador);
            }else{
                System.out.println("DINERO INSUFICIENTE");
            }
        }else{
            if(pago>=30){
                monto+=pago;
                pagoExitoso(vehiculo,administrador);
            }else{
                System.out.println("DINERO INSUFICIENTE");
            }
        }
    }

    public static void pagoExitoso(Vehiculo vehiculo, Administrador administrador){
        System.out.println("\nPAGO EXITOSO:");
        System.out.println("Administrador Encargado: "+administrador.getNombre());
        System.out.println("Codigo Administrador: "+administrador.getCodigo());
        System.out.println("A nombre de: "+vehiculo.getConductor().getName());
        System.out.println("Placa: "+vehiculo.getPlaca());
        vehiculos.add(vehiculo);
    }

    public void estadoCabina(){
        if(vehiculos.size()==0){
            System.out.println("NO SE HAN REGISTRADO VEHICULOS");
        }else{
            System.out.println("\nMONTO ACUMULADO: "+monto);
            System.out.println("ADMINISTRADOR: ");
            System.out.println("VEHICULOS REGISTRADOS:");
            System.out.println("-------------");
            for(int i=0;i<vehiculos.size();i++){
                System.out.println("Conductor: "
                +vehiculos.get(i).getConductor().getName());
                System.out.println("Placa: "
                +vehiculos.get(i).getPlaca());
                System.out.println("Modelo: "
                +vehiculos.get(i).getModelo());
                System.out.println("Color: "
                +vehiculos.get(i).getColor());
                System.out.println("-------------");
            }
        }
    }

}
