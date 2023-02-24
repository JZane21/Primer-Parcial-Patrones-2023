package EjerciciosExamen_Fila_A.Ejercicio5;

public class Operacion extends AbstractExpression{

    @Override
    public void interpreter(Context context) {
        // TODO Auto-generated method stub
        if(context.input.substring(0).equals("/")){
            // context.output = context.output + context.input
            context.input = context.input.substring(1);
        }else{

        }
    }
    
}
