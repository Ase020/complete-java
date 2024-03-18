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
    }
}
