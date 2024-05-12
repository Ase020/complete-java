abstract class Anon {
    public abstract void show();
}

class AnonB extends Anon{

    public void show() {
        System.out.println("In B show");
    }
}

public class AnonymousClass {
    public static void main(String[] args){
        Anon obj = new AnonB();
        obj.show();
    }
}
