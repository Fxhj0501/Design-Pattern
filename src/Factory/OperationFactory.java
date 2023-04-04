package Factory;

public class OperationFactory {
    public static Operation Calculate(String operation){
        Operation result = null;
        switch (operation){
            case "+":
                result = new OperationAdd();
                break;
            case "-":
                result = new OperationSub();
                break;
            case "*":
                result = new OperationMul();
                break;
            case "/":
                result = new OperationDiv();
                break;
        }
        return result;
    }
}
