interface InterfaceA {
    int age = 10; // final and static
    String name = "Felix"; // final and static
    void show();
    void config();
}

interface  InterfaceB{
    void run();
}

interface InterfaceC extends InterfaceB{}

class ClassIntB implements InterfaceA, InterfaceC{
    public void show() {
        System.out.println("Show in ClassB");
    }

    public void config() {
        System.out.println("Config in ClassB");
    }

    public void run(){
        System.out.println("Running...");
    }

}


public class Interface {
    public static void main(String[] args){
        InterfaceA obj;
         obj = new ClassIntB();
         InterfaceC obj1 = new ClassIntB();
         obj.show();
         obj.config();
         obj1.run();

        System.out.println(InterfaceA.name);
        System.out.println(InterfaceA.age);
    }
}
