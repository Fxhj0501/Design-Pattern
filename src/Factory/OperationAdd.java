package Factory;

class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return getFirst() + getSecond();
    }
}
