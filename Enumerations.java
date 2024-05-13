import java.util.Arrays;

enum Status{
    Running, Failed, Pending, Success
}


public class Enumerations {
    public static void main(String[] args){
        Status s = Status.Running;
        Status[] status = Status.values ();
        System.out.println(Arrays.toString(status));  // [Running, Failed, Pending, Success]
        System.out.println(s);  // Success
        System.out.println(s.ordinal());  // 3 (index)

        if (s == Status.Pending) {
            System.out.println("Pending!");
        } else if (s == Status.Failed) {
            System.out.println("Failed!");
        } else if (s == Status.Running) {
            System.out.println("Running");
        }else
            System.out.println("All good!");

        System.out.println(s.getClass().getSuperclass());
    }
}
