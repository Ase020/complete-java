class Lion{
    private int age;
    private String name;

    // Constructor
    public Lion(){ // Default constructor
        age= 7;
        name= "Mapumba";
    }

    public Lion (String name, int age){  // Parameterized Constructor
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age= age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }
}

public class Constructors {
    public static void main(String[] args){
        Lion lion1 = new Lion();
//        lion1.setAge(6);
//        lion1.setName("Matata");
        System.out.println(lion1.getName() + ": " + lion1.getAge());

        Lion lion2 = new Lion("Simba", 4);
        System.out.println(lion2.getName() + ": " + lion2.getAge());

    }
}
