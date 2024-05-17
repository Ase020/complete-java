class Calculator{
    public int add(int num1, int num2){
        return num1 + num2;
    }
}

public class Objects {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        int result = calculator.add(4,5);

        System.out.println(result);
    }
}

