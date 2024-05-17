class A {
public void show(){
    System.out.println("In A show");
}
}

class B extends A {
    public void show(){
        System.out.println("In B show");
    }
}

class C extends A{

}

public class PolyMorphism {
    public static void main(String[] args){
        A obj1 = new B();
        obj1.show();
    }
}
