package EjerciciosExamen_Fila_A.Ejercicio3;

public class ArtefactoFactory {
    public static IArtefacto make(String objectType){
        IArtefacto product;
        switch (objectType.toLowerCase()){
            case "television":
                product = new Television("Television", 0);
                break;
            case "radio":
                product = new Radio("Radio", 0);
                break;
            case "batidora":
                product = new Batidora("Batidora", 0);
                break;
            case "refrigerador":
                product = new Refrigerador("Refrigerador", 0);
                break;
            default:
                product = new Microondas("Microondas", 0);
                break;
        }
        return product;
    }

}
