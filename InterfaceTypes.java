// Types -: Normal, Functional/SAM(Single Abstract Method), Marker

//Functional Interface - only has one method
@FunctionalInterface
interface Functional{
    void show(int i, int j);
}

// class FunctionalA implements Functional{
//    @Override
//    public void show() {
//        System.out.println("in show");
//    }
//}

public class InterfaceTypes {
    public static void main(String[] args){
        // lambda ->
        Functional obj = (i, j) -> System.out.println("In show " + (i * j));
        obj.show(5, 8);
    }
}
