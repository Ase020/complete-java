interface Comp{
     void code();
}

class Laptop implements Comp{
    public void code(){
        System.out.println("Code, compile, run");
    }
}

class Desktop implements Comp{
    public void code(){
        System.out.println("Code, compile, run: Faster");
    }
}

class Developer{
    public void  developApp(Comp lap){
        lap.code();
    }
}


public class Typing {
    public static void main(String[] args){
        Comp desktop = new Desktop();
        Comp laptop = new Laptop();
        Developer developer = new Developer();
        developer.developApp(laptop);
        developer.developApp(desktop);

    }
}
