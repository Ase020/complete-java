class ClassA{
    public ClassA(){
        super();
        System.out.println("In ClassA");
    }
    public ClassA(int n){
        super();
        System.out.println("In ClassA int");
    }
}
class ClassB extends ClassA{
    public ClassB(){
        super();
        System.out.println("In ClassB");
    }

    public ClassB(int n){
        super(n);
        System.out.println("In ClassB int");
    }
}

public class ThisAnSuper {
    public static void main(String[] args){
        ClassB classB1 = new ClassB(5);
    }
}
