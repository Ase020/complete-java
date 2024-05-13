public class TryCatchFinally {
    public static void main(String[] args){
        int i = 2;
        int j = 18;

        try {
            j = 18/i;
            System.out.println(j );
        } catch (Exception e){
            System.out.println("Something went wrong!");
        } finally {
            System.out.println("Bye");
        }
    }
}
