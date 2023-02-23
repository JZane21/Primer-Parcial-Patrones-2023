package EjerciciosExamen_Fila_A.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        String o1="television";
        String o2="radio";
        String o3="refrigerador";
        String o4="batidora";
        String o5="microondas";

        Television television = (Television) ArtefactoFactory.make(o1);
        television.setPrecio(5000);
        Radio radio = (Radio) ArtefactoFactory.make(o2);
        radio.setPrecio(4000);
        Refrigerador refrigerador = (Refrigerador) ArtefactoFactory.make(o3);
        refrigerador.setPrecio(3000);
        Batidora batidora = (Batidora) ArtefactoFactory.make(o4);
        batidora.setPrecio(2000);
        Microondas microondas = (Microondas) ArtefactoFactory.make(o5);
        microondas.setPrecio(1000);

        television.mostrarInformacion();
        radio.mostrarInformacion();
        refrigerador.mostrarInformacion();
        batidora.mostrarInformacion();
        microondas.mostrarInformacion();
    }
}
