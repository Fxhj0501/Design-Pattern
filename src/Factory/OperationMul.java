package Factory;

class OperationMul extends Operation {
    @Override
    public double getResult() {
        return getFirst() + getSecond();
    }
}
