class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name = "Phone";
        System.out.println("in static block");
    }
    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class StaticVariables {
    public static void main(String[] args) throws ClassNotFoundException {
//        Mobile mobile1 = new Mobile();
//        mobile1.brand = "Apple";
//        mobile1.price = 1500;
//        Mobile.name = "Smartphone";

//        Mobile mobile2 = new Mobile();
//        mobile2.brand = "Samsung";
//        mobile2.price = 1200;
//        Mobile.name = "Smartphone";

//        mobile1.show(); // Smartphone
//        mobile2.show(); // Smartphone

//        Mobile mobile3 = new Mobile();

        Class.forName("Mobile");
    }
}
