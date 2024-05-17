public class RelationalOperators {
    public static void main(String[] args){
        int num1 = 7;
        int num2 = 10;

        boolean is_equal = num1 == num2; // false
        boolean is_not_equal = num1 != num2; // true
        boolean is_greater = num1 > num2; // false
        boolean is_less = num1 < num2; // true
        boolean is_equal_greater = num1 >= num2; // false
        boolean is_equal_less = num1 <= num2; // true


        System.out.println(is_equal_less);
    }
}
