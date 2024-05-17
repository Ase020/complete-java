public class Inheritance {
    public static void main(String[] args){
        Calc calc1 = new Calc();
        int addResult = calc1.add(10, 4); //14
        int subResult = calc1.subtract(10, 4); //6

        Calc2 calc2 = new Calc2();
        int addResult2 = calc2.add(10, 4); //14
        int subResult2 = calc2.subtract(10, 4); //6
        int multiplyResult2 = calc2.multiply(10, 4); //40
        int divideResult2 = calc2.divide(10, 4); //2

        Calc3 calc3 = new Calc3();
        int addResult3 = calc3.add(10, 4); //14
        int subResult3 = calc3.subtract(10, 4); //6
        int multiplyResult3 = calc3.multiply(10, 4); //40
        int divideResult3 = calc3.divide(10, 4); //2
        double powerResult3 = calc3.power(4,2); // 16.0

        System.out.println(powerResult3);
    }
}
