import java.util.Objects;

//class Alien {
//    private final int id;
//    private  final String name;
//
//    public Alien(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Alien alien = (Alien) o;
//        return id == alien.id && Objects.equals(name, alien.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
//
//    @Override
//    public String toString() {
//        return "Alien{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}

//instead of the Class Alien, we'll create a reacord class
record Alien(int id, String name){}


public class RecordClass {
    public static void main(String[] args){
        Alien alien1 = new Alien(1, "Felix");
        Alien alien2 = new Alien(1, "Felix");
        Alien alien3 = new Alien(1, "Felix");

        System.out.println(alien1);
        System.out.println(alien1.equals(alien2));
    }
}
