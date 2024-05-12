 class InnerClassA {
    int age;

    public  void  show(){
        System.out.println("Show");
    }

     static class InnerClassB {
        public void config(){
            System.out.println("In config");
        }
    }

}

public class InnerClass {
    public static void main(String[] args){
        InnerClassA obj = new InnerClassA();
        obj.show();

        InnerClassA.InnerClassB obj2 = new InnerClassA.InnerClassB();
        obj2.config();


    }
}

