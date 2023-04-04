package Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimplyFactory {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("请输入第一个数字：");
            double first = Double.parseDouble(br.readLine());
            System.out.println("请输入操作符（+、-、*、/）；");
            Operation operation = OperationFactory.Calculate(br.readLine());
            System.out.println("请输入第二个数字：");
            double second = Double.parseDouble(br.readLine());
            operation.setFirst(first);
            operation.setSecond(second);
            System.out.println("结果是：" + operation.getResult());
        }
        catch (ArithmeticException | IOException e) {
            e.printStackTrace();
        }

    }
}
