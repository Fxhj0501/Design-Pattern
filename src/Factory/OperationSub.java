package Factory;

class OperationSub extends Operation {
    @Override
    public double getResult() {
        return getFirst() - getSecond();
    }
}
