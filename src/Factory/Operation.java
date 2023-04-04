package Factory;

public class Operation {
    private double op1 = 0;
    private double op2 = 0;
    public double getFirst() {
        return op1;
    }

    public void setFirst(double first) {
        this.op1 = first;
    }

    public double getSecond() {
        return op2;
    }

    public void setSecond(double second) {
        this.op2 = second;
    }

    public double getResult() {
        return 0;
    }

}
