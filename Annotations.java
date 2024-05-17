class AnnonA{
    public void show(){
        System.out.println("In A show");
    }
}

class AnnonB extends AnnonA{

    @Override
    public void show(){
        System.out.println("In B show");
    }
}

public class Annotations {
    public static void main(String[] args){ }
}
