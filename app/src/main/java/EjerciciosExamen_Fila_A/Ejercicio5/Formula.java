package EjerciciosExamen_Fila_A.Ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Formula extends AbstractExpression{
    private List<AbstractExpression> formula = new ArrayList<>();
    private Context context;

    public Formula (String input){
        context = new Context(input.replace(" ",""));
        for (String charInput :input.split(" ")){
            switch (charInput.toUpperCase()){
                case "A":
                    // grammar.add(new TerminalExpressionA());
                    break;
                case "B":
                    // grammar.add(new TerminalExpressionB());
                    break;
                case "C":
                    // grammar.add(new TerminalExpressionC());
                    break;
                case "D":
                    // grammar.add(new TerminalExpressionD());
                    break;
                default:
                    break;
            }

        }
    }

    public String outputMessage(){
        for (AbstractExpression expression:formula){
            expression.interpreter(context);
        }
        return context.output;
    }

    @Override
    public void interpreter(Context context) {

    }
}
