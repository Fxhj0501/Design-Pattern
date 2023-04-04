package Factory;

class OperationDiv extends Operation {
    @Override
    public double getResult() {
        if(getSecond()==0)
            throw new ArithmeticException("除数不能为0");
        return getFirst() / getSecond();
    }
}
