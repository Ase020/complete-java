//Errors
//1) Compile-time error
//2) Runtime error - Exceptions
//3) Logical error


public class Exceptions {
    public static void main(String[] args){
        int i = 0 ;
        int j = 0;
        try{
            j=18/i;
        } catch (Exception e) {
            System.out.println("Error");
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
