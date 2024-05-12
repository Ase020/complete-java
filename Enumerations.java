import java.util.Arrays;

enum Status{
    Running, Failed, Pending, Success
}


public class Enumerations {
    public static void main(String[] args){
        Status s = Status.Success;
        Status[] status = Status.values ();
        System.out.println(Arrays.toString(status));  // [Running, Failed, Pending, Success]
        System.out.println(s);  // Success
        System.out.println(s.ordinal());  // 3 (index)
    }
}
