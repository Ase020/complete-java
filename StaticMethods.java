class Phone{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Phone phone){
        System.out.println("in static method");
        System.out.println(phone.brand + " : " + phone.price + " : " + name);
    }
}

public class StaticMethods {
    public static void main(String[] args){
        Phone phone1 = new Phone();
        phone1.brand = "Apple";
        phone1.price = 850;
        Phone.name = "Smartphone";
        Phone.show1(phone1);
    }
}
