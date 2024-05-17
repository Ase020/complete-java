enum Laptops{
    Dell(1200), HP(1400), Macbook(2400), Lenovo(1500), Toshiba;

    private int price;

    private Laptops(){
        price = 500;
    }

    Laptops(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Enumerations2 {
    public static void main(String[] args){
        Laptops laptops = Laptops.Toshiba;
        System.out.println(laptops);  // HP
        System.out.println(laptops.getPrice());  // 1400
    }
}
