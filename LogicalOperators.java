public class LogicalOperators {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        int num3 = 4;
        int num4 = 5;

        boolean and_operator = num2 > num1 && num3 < num4; //true
        boolean or_operator = num2 > num1 || num3 < num4; //true

        /* Itenary Operation */
        boolean itenary = num2%2 == 0 ? true : false;

        System.out.println(itenary);

    }
}
