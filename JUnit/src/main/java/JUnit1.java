class JUnit1Calc{
    public int divide(int num1, int num2){
        return num1/num2;
    }
    public int multiply(int num1, int num2){
        return num1*num2;
    }
}

public class JUnit1 {
    public static void main(String[] args){
        JUnit1Calc calc = new JUnit1Calc();
        int result = calc.divide(100, 8);
        System.out.println(result);


    }
}
