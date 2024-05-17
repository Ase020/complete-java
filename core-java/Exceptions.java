//Errors
//1) Compile-time error
//2) Runtime error - Exceptions
//3) Logical error

// Custom Exception
class CustomException extends  Exception{
    public CustomException(String string){
        super(string);
    }
}

public class Exceptions {
    public static void main(String[] args){
        int i = 0 ;
        int j = 0;
        try{
            if (j == 0) {
                throw new CustomException("Custom Exception");
            }
        }catch (ArithmeticException e) {
            j= 18/1;
        }catch (Exception e) {
            System.out.println("Error");
            System.out.println(e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
